/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.synchronize.dao;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityGraph;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Subgraph;
import javax.persistence.Tuple;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Selection;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.hibernate.exception.ConstraintViolationException;

import org.synchronize.repositories.ComunRepository;
import org.synchronize.vo.BusquedaGenerica;
import org.synchronize.utils.Check;
import org.synchronize.vo.EntidadValidator;

 /*
 * @author comfa
 */
@Repository
@Transactional
public class JpaComunRepository implements ComunRepository {

    // Campos que aplican a todas las entidades
    private static final String ID = "id";
    private static final String CODIGO = "codigo";
    private static final String DESCRIPCION = "descripcion";
    private static final String ACTIVO = "activo";
    private static final String ORG = "org";

    // Variables para validaciones de formato
    private static final String FORMATO_FECHA = "dd/MM/yyyy";
    private static final String CADENA_VACIA = "";
    private static final String CARACTER_PUNTO = "\\.";

    // Variables dependientes de la estructura del proyecto
    private static final String PAQUETE_ENTIDAD = "org.synchronize.entities.";

    // Siempre se asocia a las consultas que hacen fetch
    private static final String LOAD_GRAPH = "javax.persistence.loadgraph";

    @PersistenceContext
    private EntityManager em;

    @Override
    public <T> List<T> buscar(final BusquedaGenerica bg) {
        final Class<T> entityClass = obtenerEntidad(bg.getNombreEntidad());

        if (entityClass == null) {
            return new ArrayList<>();
        }

        // Crea la raiz de la consulta
        final CriteriaBuilder cb = em.getCriteriaBuilder();
        final EntityGraph<T> graphGenerico = em.createEntityGraph(entityClass);

        if (Check.listaVacia(bg.getCamposSeleccionados())) {
            final CriteriaQuery<T> cq = cb.createQuery(entityClass);
            final Root<T> root = cq.from(entityClass);
            if (esConsultaValida(root, bg)) {
                return selectAsterisco(bg, cb, cq, root, graphGenerico);
            } else {
                return new ArrayList<>();
            }
        } else {
            final CriteriaQuery<Tuple> cq = cb.createTupleQuery();
            final Root<T> root = cq.from(entityClass);
            if (esConsultaValida(root, bg)) {
                return multiselect(bg, cb, cq, root, graphGenerico);
            } else {
                return new ArrayList<>();
            }
        }
    }

    @SuppressWarnings("unchecked")
    private <T> List<T> multiselect(final BusquedaGenerica bg, final CriteriaBuilder cb, final CriteriaQuery<Tuple> cq,
            final Root<T> root, final EntityGraph<T> graphGenerico) {

        // Crea el Map<k,v> de filtros que se usará en la formación de la
        // clausula Where
        asociarFiltros(bg);

        // Crea los joins a partir de los campos relacionados en la consulta
        crearRelaciones(bg, root, graphGenerico);

        // Agrega los campos que se van a obtener en el ViewObject
        final List<Selection<?>> camposSeleccionados = new ArrayList<>();
        bg.getCamposSeleccionados().forEach(campo -> camposSeleccionados.add(obtenerRutaCompleta(root, campo)));
        cq.multiselect(camposSeleccionados);

        // Crea la condicion a partir de los filtros en bg
        final List<Predicate> filtros = crearClausulaWhere(bg, cb, root);
        if (!Check.listaVacia(filtros)) {
            cq.where(filtros.toArray(new Predicate[]{}));
        }

        // Ordena por un campo
        final List<Order> orderBy = new ArrayList<>();
        if (bg.getAplicaOrdenamiento() != null && bg.getCampoOrdenamiento() != null
                && tieneCampo(root, bg.getCampoOrdenamiento())) {
            orderBy.add(bg.getAplicaOrdenamiento() ? cb.asc(root.get(bg.getCampoOrdenamiento()))
                    : cb.desc(root.get(bg.getCampoOrdenamiento())));
            cq.orderBy(orderBy);
        }

        final TypedQuery<Tuple> query = em.createQuery(cq);

        // Obtiene los registros de acuerdo a la paginación de la consulta
        crearPaginacion(bg, query);

        query.setHint(LOAD_GRAPH, graphGenerico);

        // Mapea la tupla a un formato de VO para su tratamiento en capas
        // superiores
        final List<HashMap<String, Object>> camposResultantes = new ArrayList<>();
        final List<Tuple> resultado = em.createQuery(cq).getResultList();
        for (final Tuple t : resultado) {
            int index = 0;
            final HashMap<String, Object> map = new LinkedHashMap<>();
            for (final String s : bg.getCamposSeleccionados()) {
                map.put(s, t.get(index).toString());
                index += 1;
            }
            camposResultantes.add(map);
        }
        return (List<T>) camposResultantes;
    }

    private <T> List<T> selectAsterisco(final BusquedaGenerica bg, final CriteriaBuilder cb, final CriteriaQuery<T> cq,
            final Root<T> root, final EntityGraph<T> graphGenerico) {
        // Crea el Map<k,v> de filtros que se usará en la formación de la
        // clausula Where
        asociarFiltros(bg);

        // Crea los joins a partir de los campos relacionados en la consulta
        crearRelaciones(bg, root, graphGenerico);

        // Crea la condicion a partir de los filtros en bg
        final List<Predicate> filtros = crearClausulaWhere(bg, cb, root);
        if (!Check.listaVacia(filtros)) {
            cq.where(filtros.toArray(new Predicate[]{}));
        }

        // Ordena por un campo
        final List<Order> orderBy = new ArrayList<>();
        if (bg.getAplicaOrdenamiento() != null && bg.getCampoOrdenamiento() != null
                && tieneCampo(root, bg.getCampoOrdenamiento())) {
            orderBy.add(bg.getAplicaOrdenamiento() ? cb.asc(root.get(bg.getCampoOrdenamiento()))
                    : cb.desc(root.get(bg.getCampoOrdenamiento())));
            cq.orderBy(orderBy);
        }

        final TypedQuery<T> query = em.createQuery(cq);

        // Obtiene los registros de acuerdo a la paginación de la consulta
        crearPaginacion(bg, query);

        query.setHint(LOAD_GRAPH, graphGenerico);
        return query.getResultList();
    }

    private <T> void crearPaginacion(final BusquedaGenerica bg, final TypedQuery<T> query) {
        if (Check.isNotNull(bg.getPage()) && Check.isNotNull(bg.getMaxResults())) {
            final int page = bg.getPage().intValue() - 1;
            query.setFirstResult(page * bg.getMaxResults().intValue());
            query.setMaxResults(bg.getMaxResults().intValue());
        }
    }

    private <T> List<Predicate> crearClausulaWhere(final BusquedaGenerica bg, final CriteriaBuilder cb,
            final Root<T> root) {

        // Agrega filtros asociados previamente
        final List<Predicate> filtros = new ArrayList<>();
        for (final Map.Entry<String, Object> entry : bg.getFiltros().entrySet()) {
            final Path<Object> rutaCampo = obtenerRutaCompleta(root, entry.getKey());
            final Predicate filtro = obtenerOperador(cb, rutaCampo, entry.getKey(), entry.getValue());
            if (filtro != null) {
                filtros.add(filtro);
            }
        }

        // Valida si aplica solo para registros marcados como activos
        if (tieneCampo(root, ACTIVO) && root.get(ACTIVO).getJavaType().isAssignableFrom(Boolean.class)
                && Check.isTrue(bg.getSoloActivos())) {
            filtros.add(cb.equal(root.<Boolean>get(ACTIVO), true));
        }

        return filtros;
    }

    private <T> void crearRelaciones(final BusquedaGenerica bg, final Root<T> root,
            final EntityGraph<T> graphGenerico) {
        if (!Check.listaVacia(bg.getEntidadesRelacionadas())) {
            Subgraph<T> sgGenerico = null;
            for (int i = 0; i < bg.getEntidadesRelacionadas().size(); i++) {
                crearSubGrafos(bg, graphGenerico, sgGenerico, i);
            }
        }
    }

    private <T> void crearSubGrafos(final BusquedaGenerica bg, final EntityGraph<T> graphGenerico,
            Subgraph<T> sgGenerico, int i) {
        final String[] campoSeparado = bg.getEntidadesRelacionadas().get(i).split(CARACTER_PUNTO);
        for (int j = 0; j < campoSeparado.length; j++) {
            if (j == 0) {
                sgGenerico = graphGenerico.addSubgraph(campoSeparado[j]);
            } else {
                sgGenerico.addSubgraph(campoSeparado[j]);
            }
        }
    }

    private void asociarFiltros(final BusquedaGenerica bg) {
        bg.setFiltros(new HashMap<>());
        if (!Check.listaVacia(bg.getCamposBusqueda()) && !Check.listaVacia(bg.getInfoCampos())) {
            for (int i = 0; i < bg.getCamposBusqueda().size(); i++) {
                if (bg.getInfoCampos().get(i) != null && !bg.getInfoCampos().get(i).equals(CADENA_VACIA)) {
                    bg.getFiltros().put(bg.getCamposBusqueda().get(i), bg.getInfoCampos().get(i));
                }
            }
        }
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    private <T> Predicate obtenerOperador(final CriteriaBuilder cb, final Path<Object> ruta, final String atributo,
            final Object valor) {

        if (valor != null && !valor.equals(CADENA_VACIA)) {
            if (ruta.getJavaType().isAssignableFrom(Date.class)) {
                final DateFormat format = new SimpleDateFormat(FORMATO_FECHA);
                try {
                    return cb.equal(ruta, format.parse((String) valor));
                } catch (ParseException e) {
                    return null;
                }
            } else if (ruta.getJavaType().isAssignableFrom(String.class)) {
                return cb.like((Path) ruta, "%" + valor.toString().toUpperCase() + "%");
            } else if (ruta.getJavaType().isAssignableFrom(Boolean.class)) {
                return cb.equal(ruta, valor);
            }
            return valor.equals(0) ? null : cb.equal((Expression<?>) ruta, valor);
        } else {
            return null;
        }
    }

    /**
     * Valida si el campo envíacomo parametro existe en el arbol de rutas
     * asociadas a la entidad de la consulta. Se pueden dar dos casos: (i) El
     * campo puede llevar con un nombre atómico (ej: id) o (ii) puede ser un
     * campo compuesto (ej: estado.codigo). En el caso (ii) se debe validar que
     * todos los campos intermedios también existan (ej: estado.codigo; se debe
     * validar que el campo estado existe en la entidad principal y que el campo
     * estado también contenga un campo llamado código)
     *
     * @param entityClass Entidad principal de la consulta
     * @param campo asociado a la consulta
     * @return true si el campo relacionado existe
     */
    private <T> boolean tieneCampo(final Root<T> entityClass, final String campo) {
        try {
            final String[] campoSeparado = campo.split(CARACTER_PUNTO);

            if (campoSeparado.length == 0) {
                return entityClass.get(campo) != null;
            } else {
                Path<T> ruta = entityClass.get(campoSeparado[0]);
                existeCampo(ruta);
                for (int i = 1; i < campoSeparado.length; i++) {
                    ruta = ruta.get(campoSeparado[i]);
                    existeCampo(ruta);
                }
                return true;
            }
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Obtiene la ruta completa del campo envíado como parámetro. Se pueden dar
     * dos casos: (i) El campo puede llevar con un nombre atómico (ej: id) o
     * (ii) puede ser un campo compuesto (ej: estado.codigo)
     *
     * @param entityClass Entidad principal de la consulta
     * @param campo asociado a la consulta
     * @return true si el campo relacionado existe
     */
    private <T> Path<Object> obtenerRutaCompleta(final Root<T> entityClass, final String campo) {
        try {
            final String[] campoSeparado = campo.split(CARACTER_PUNTO);

            if (campoSeparado.length == 0) {
                return entityClass.get(campo);
            } else {
                Path<Object> ruta = entityClass.get(campoSeparado[0]);
                for (int i = 1; i < campoSeparado.length; i++) {
                    ruta = ruta.get(campoSeparado[i]);
                }
                return ruta;
            }
        } catch (Exception e) {
            return null;
        }
    }

    private <T> boolean existeCampo(final Path<T> expression) {
        try {
            return expression != null;
        } catch (Exception e) {
            return false;
        }
    }

    private <T> boolean campoEsEntidadRelacionada(final Root<T> entityClass, final String campo) {
        try {
            final String[] campoSeparado = campo.split(CARACTER_PUNTO);

            if (campoSeparado.length == 0) {
                return entityClass.get(campo).getJavaType().getName().startsWith(PAQUETE_ENTIDAD);
            } else {
                Path<Object> ruta = entityClass.get(campoSeparado[0]);
                for (int i = 0; i < campoSeparado.length; i++) {
                    ruta = i == 0 ? entityClass.get(campoSeparado[i]) : ruta.get(campoSeparado[i]);
                    if (!ruta.getJavaType().getName().startsWith(PAQUETE_ENTIDAD)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    @Override
    public <T> List<T> obtenerCatalogo(final String nombreCatalogo) {
        final Class<T> entityClass = obtenerEntidad(nombreCatalogo);
        if (entityClass != null) {
            final CriteriaBuilder cb = this.em.getCriteriaBuilder();
            final CriteriaQuery<T> cq = cb.createQuery(entityClass);
            final Root<T> root = cq.from(entityClass);

            cq.select(root);
            cq.orderBy(cb.asc(root.get(DESCRIPCION)));

            return em.createQuery(cq).getResultList();
        } else {
            return new ArrayList<>();
        }
    }
    
    @Override
    public <T> List<T> getActivos(final String nombreEntidad) {
        final Class<T> entidad = obtenerEntidad(nombreEntidad);
        if (entidad != null) {
            final CriteriaBuilder cb = this.em.getCriteriaBuilder();
            final CriteriaQuery<T> cq = cb.createQuery(entidad);
            final Root<T> root = cq.from(entidad);
            cq.select(root).where(cb.equal(root.get(ACTIVO), true)).orderBy(cb.asc(root.get(ID)));
            return em.createQuery(cq).getResultList();
        } else {
            return new ArrayList<T>();
        }
    }

    @SuppressWarnings("unchecked")
    private <T> Class<T> obtenerEntidad(final String nombreEntidad) {
        final StringBuilder sb = new StringBuilder();
        sb.append(PAQUETE_ENTIDAD).append(nombreEntidad);
        try {
            return (Class<T>) Class.forName(sb.toString());
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    final <T> boolean esConsultaValida(final Root<T> root, final BusquedaGenerica bg) {
        // La entidad principal de la consulta existe
        final boolean tieneEntidad = bg.getNombreEntidad() != null;

        // Los campos que quiere obtener el usuario existen
        boolean camposSeleccionadosValidos = true;
        if (!Check.listaVacia(bg.getCamposSeleccionados())) {
            for (String s : bg.getCamposSeleccionados()) {
                camposSeleccionadosValidos = camposSeleccionadosValidos && tieneCampo(root, s);
            }
        }

        // Los filtros existen y son validos
        final boolean tieneFiltros = !Check.listaVacia(bg.getCamposBusqueda()) && !Check.listaVacia(bg.getInfoCampos());
        final boolean cantidadFiltrosCorrecta = tieneFiltros
                && bg.getCamposBusqueda().size() == bg.getInfoCampos().size();

        // Los campos que quiere filtrar el usuario existen
        boolean camposBusquedaValidos = true;
        if (!Check.listaVacia(bg.getCamposBusqueda())) {
            for (String s : bg.getCamposBusqueda()) {
                camposBusquedaValidos = camposBusquedaValidos && tieneCampo(root, s);
            }
        }

        // Las relaciones que se quieren agregar existen
        boolean sonRelaciones = true;
        if (!Check.listaVacia(bg.getEntidadesRelacionadas())) {
            for (String s : bg.getEntidadesRelacionadas()) {
                sonRelaciones = sonRelaciones && campoEsEntidadRelacionada(root, s);
            }
        }

        return tieneEntidad && camposSeleccionadosValidos && (!tieneFiltros || cantidadFiltrosCorrecta)
                && camposBusquedaValidos && sonRelaciones;
    }

    @Override
    public <T> Long getCantidadRegistros(final String entidad) {
        final Class<T> entityClass = obtenerEntidad(entidad);
        if (entityClass == null) {
            return 0L;
        }
        final CriteriaBuilder cb = em.getCriteriaBuilder();
        final CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        cq.select(cb.count(cq.from(entityClass)));
        return em.createQuery(cq).getSingleResult();
    }

    @Override
    public <T> T merge(final String nombreEntidad, final T entidad) {
        final Class<T> clase = obtenerEntidad(nombreEntidad);
        if (clase != null) {
            final ObjectMapper mapper = new ObjectMapper();
            final T entidadGuardar = mapper.convertValue(entidad, clase);
            return em.merge(entidadGuardar);
        }
        return null;
    }

    @Override
    public <T> T guardarPorCampoUnico(final String nombreEntidad, final EntidadValidator<T> entidadValidator) {
        final Class<T> clase = obtenerEntidad(nombreEntidad);
        if (clase != null && getByCampo(nombreEntidad, entidadValidator.getCampoValidacion(),
                entidadValidator.getValor()) == null) {
            final ObjectMapper mapper = new ObjectMapper();
            final T entidadGuardar = mapper.convertValue(entidadValidator.getEntidad(), clase);
            return em.merge(entidadGuardar);
        }
        return null;

    }

    @Override
    public <T> List<T> getAll(final String nombreEntidad) {
        final Class<T> entidad = obtenerEntidad(nombreEntidad);
        if (entidad != null) {
            final CriteriaBuilder cb = this.em.getCriteriaBuilder();
            final CriteriaQuery<T> cq = cb.createQuery(entidad);
            final Root<T> root = cq.from(entidad);
            cq.select(root);
            return em.createQuery(cq).getResultList();
        } else {
            return new ArrayList<T>();
        }

    }

    

    @Override
    public <T> T getById(final String nombreEntidad, final Long id) {
        final Class<T> entidad = obtenerEntidad(nombreEntidad);
        if (entidad != null) {
            try {
                final CriteriaBuilder cb = this.em.getCriteriaBuilder();
                final CriteriaQuery<T> cq = cb.createQuery(entidad);
                final Root<T> root = cq.from(entidad);

                final Predicate[] condiciones = {cb.equal(root.get(ID), id)};
                cq.select(root).where(cb.and(condiciones));
                return em.createQuery(cq).getSingleResult();
            } catch (NoResultException e) {
                return null;
            }
        } else {
            return null;
        }
    }

    @Override
    public <T> T getByCodigo(final String nombreEntidad, final String codigo) {
        final Class<T> entidad = obtenerEntidad(nombreEntidad);
        if (entidad != null) {
            try {
                final CriteriaBuilder cb = this.em.getCriteriaBuilder();
                final CriteriaQuery<T> cq = cb.createQuery(entidad);
                final Root<T> root = cq.from(entidad);

                final Predicate[] condiciones = {cb.equal(root.get(CODIGO), codigo)};
                cq.select(root).where(cb.and(condiciones));
                return em.createQuery(cq).getSingleResult();
            } catch (NoResultException e) {
                return null;
            }
        } else {
            return null;
        }
    }

    @Override
    public <T> T getByCampo(final String nombreEntidad, final String campo, final Object valor) {
        final Class<T> entidad = obtenerEntidad(nombreEntidad);
        if (entidad != null) {
            try {
                final CriteriaBuilder cb = this.em.getCriteriaBuilder();
                final CriteriaQuery<T> cq = cb.createQuery(entidad);
                final Root<T> root = cq.from(entidad);
                if (tieneCampo(root, campo)) {
                    final Predicate[] condiciones = {cb.equal(root.get(campo), valor)};
                    cq.select(root).where(cb.and(condiciones));
                    return em.createQuery(cq).getSingleResult();
                } else {
                    return null;
                }
            } catch (NoResultException e) {
                return null;
            }
        } else {
            return null;
        }
    }

    @Override
    public <T> void delete(final String nombreEntidad, final Long id) {
        final T entidadEliminar = this.getById(nombreEntidad, id);
        if (entidadEliminar != null) {
            try {
                em.remove(entidadEliminar);

            } catch (ConstraintViolationException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public <T> void activar(final String nombreEntidad, final Long id) {
        final Class<T> clase = obtenerEntidad(nombreEntidad);
        if (clase != null) {
            cambiarEstado(clase, id, true);
        }
    }

    @Override
    public <T> void inactivar(final String nombreEntidad, final Long id) {
        final Class<T> clase = obtenerEntidad(nombreEntidad);
        if (clase != null) {
            cambiarEstado(clase, id, false);
        }
    }

    private <T> void cambiarEstado(final Class<T> entidad, final Long id, final boolean activo) {
        final CriteriaBuilder cb = em.getCriteriaBuilder();
        final CriteriaUpdate<T> update = cb.createCriteriaUpdate(entidad);
        final Root<T> root = update.from(entidad);
        update.set(ACTIVO, activo).where(cb.equal(root.get(ID), id));
        em.createQuery(update).executeUpdate();
    }

    @Override
    public <T> List<T> buscarConFiltrosCruce(BusquedaGenerica bg) {
        final Class<T> entityClass = obtenerEntidad(bg.getNombreEntidad());
        if (entityClass == null) {
            return new ArrayList<>();
        }
        final CriteriaBuilder cb = em.getCriteriaBuilder();
        final CriteriaQuery<T> cq = cb.createQuery(entityClass);

        final Root<T> root = cq.from(entityClass);

        if (Check.isTrue(bg.getBuscaTodos())) {
            return em.createQuery(cq).getResultList();
        }

        // Agrega subgrafos a las relaciones directas
        final EntityGraph<T> graphGenerico = em.createEntityGraph(entityClass);
        // Crea relaciones de primer nivel
        for (String entry : bg.getEntidadesRelacionadas()) {
            if (tieneCampo(root, entry)) {
                final Path<Object> atributo = root.get(entry);
                if (atributo != null) {
                    crearJoin(atributo, root, entry, graphGenerico, entityClass);
                }
            } else {
                return new ArrayList<>();
            }
        }

        // Crea la condicion a partir de los filtros en bg
        final List<Predicate> filtros = new ArrayList<>();
        int index = 0;
        for (String entry : bg.getCamposBusqueda()) {
            if (bg.getEntidadesRelacionadas().get(index) != null && bg.getEntidadesRelacionadas().get(index) != "NA") {
                if (tieneCampo(root, bg.getEntidadesRelacionadas().get(index))
                        && relacionTieneCampo(root.get(bg.getEntidadesRelacionadas().get(index)), entry)) {
                    final Predicate filtro = obtenerOperador(cb, root, entry, bg.getInfoCampos().get(index),
                            bg.getEntidadesRelacionadas().get(index));
                    if (filtro != null) {
                        filtros.add(filtro);
                    }
                } else {
                    return new ArrayList<>();
                }
            } else {
                if (tieneCampo(root, entry)) {
                    final Predicate filtro = obtenerOperador(cb, root, entry, bg.getInfoCampos().get(index), "NA");
                    if (filtro != null) {
                        filtros.add(filtro);
                    }
                } else {
                    return new ArrayList<>();
                }
            }
            index += 1;
        }
        
        
        // Valida si aplica solo para registros marcados como activos
        if (tieneCampo(root, ACTIVO) && root.get(ACTIVO).getJavaType().isAssignableFrom(Boolean.class)
                && Check.isTrue(bg.getSoloActivos())) {
            filtros.add(cb.equal(root.<Boolean>get(ACTIVO), true));
        }
        

        cq.where(filtros.toArray(new Predicate[]{}));
        
        
        // Ordena por un campo
        final List<Order> orderBy = new ArrayList<>();
        if (bg.getAplicaOrdenamiento() != null && bg.getCampoOrdenamiento() != null
                && tieneCampo(root, bg.getCampoOrdenamiento())) {
            orderBy.add(bg.getAplicaOrdenamiento() ? cb.asc(root.get(bg.getCampoOrdenamiento()))
                    : cb.desc(root.get(bg.getCampoOrdenamiento())));
            cq.orderBy(orderBy);
        }
        
        
        
        
        
        
        final TypedQuery<T> query = em.createQuery(cq);
        // Filtros de paginacion
        if (Check.isNotNull(bg.getPage()) && Check.isNotNull(bg.getMaxResults())) {
            final int page = bg.getPage().intValue() - 1;
            query.setFirstResult(page * bg.getMaxResults().intValue());
            query.setMaxResults(bg.getMaxResults().intValue());
        }
        query.setHint(LOAD_GRAPH, graphGenerico);
        return query.getResultList();
    }

    /**
     * Crea las relaciones V a una entidad T. Si V es una clase que fue creada
     * se agrega la asociación de primer nivel
     *
     * @param rutaAtributo Ruta del atributo que pertenece a la entidad T
     * @param root Entidad que se va a obtener de la consulta
     * @param atributo nombre del atributo que pertenece a la entidad T
     * @param graphGenerico EntityGraph de tipo T que contiene las relaciones de
     * T a cualquier otra entidad
     */
    private <T> void crearJoin(final Path<Object> rutaAtributo, final Root<T> root, final String atributo,
            final EntityGraph<T> graphGenerico, final Class<T> entityClass) {
        if (rutaAtributo.getJavaType().getName().startsWith(ORG)) {
            graphGenerico.addSubgraph(atributo);
        }
    }

    private <T> boolean relacionTieneCampo(final Path<T> expression, final String campo) {
        try {
            return expression.get(campo) != null;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Obtiene la condición a partir del atributo y su valor asociado.
     *
     * @param cb CriteriaBuilder
     * @param root Entidad que se va a obtener de la consulta
     * @param atributo nombre del atributo asociado a la entidad T
     * @param valor valor que se va a buscar
     * @return Condición que depende del tipo de dato que tenga valor
     */
    @SuppressWarnings({"rawtypes", "unchecked"})
    private <T> Predicate obtenerOperador(final CriteriaBuilder cb, final Root<T> root, final String atributo,
            final Object valor, final String llaveRelacionada) {

        final Path<Object> ruta = !llaveRelacionada.equals("NA") ? root.<Object>get(llaveRelacionada).get(atributo)
                : root.<Object>get(atributo);

        if (valor != null && !valor.equals(CADENA_VACIA)) {
            if (ruta.getJavaType().isAssignableFrom(Date.class)) {
                final DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                try {
                    return cb.equal(ruta, format.parse((String) valor));
                } catch (ParseException e) {
                    return null;
                }
            } else if (ruta.getJavaType().isAssignableFrom(String.class)) {
                return cb.like((Path) ruta, "%" + valor.toString().toUpperCase() + "%");
            } else if (ruta.getJavaType().isAssignableFrom(Boolean.class)) {
                return cb.equal(ruta, valor);
            }
            return valor.equals(0) ? null : cb.equal((Expression<?>) ruta, valor);
        } else {
            return null;
        }
    }

 
    @Override
    public <T> T validarPorCampoUnico(final String nombreEntidad, final EntidadValidator<T> entidadValidator) {
        final Class<T> clase = obtenerEntidad(nombreEntidad);
        
        final Object result = getByCampo(nombreEntidad, entidadValidator.getCampoValidacion(), entidadValidator.getValor());
        
        if( result != null) {
            return (T) result;
        } else{
            return null;
        }
        
        
        
    }

}
