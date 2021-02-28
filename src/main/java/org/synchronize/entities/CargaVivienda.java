/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.synchronize.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 57315
 */
@Entity
@Table(name = "CARGA_VIVIENDA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CargaVivienda.findAll", query = "SELECT c FROM CargaVivienda c"),
    @NamedQuery(name = "CargaVivienda.findByIdCargaVivienda", query = "SELECT c FROM CargaVivienda c WHERE c.idCargaVivienda = :idCargaVivienda"),
    @NamedQuery(name = "CargaVivienda.findByNucleoFamiliar", query = "SELECT c FROM CargaVivienda c WHERE c.nucleoFamiliar = :nucleoFamiliar"),
    @NamedQuery(name = "CargaVivienda.findByCodigoVivienda", query = "SELECT c FROM CargaVivienda c WHERE c.codigoVivienda = :codigoVivienda"),
    @NamedQuery(name = "CargaVivienda.findByCodigoMaterialTecho", query = "SELECT c FROM CargaVivienda c WHERE c.codigoMaterialTecho = :codigoMaterialTecho"),
    @NamedQuery(name = "CargaVivienda.findByCodigoMaterialPiso", query = "SELECT c FROM CargaVivienda c WHERE c.codigoMaterialPiso = :codigoMaterialPiso"),
    @NamedQuery(name = "CargaVivienda.findByCodigoMaterialPared", query = "SELECT c FROM CargaVivienda c WHERE c.codigoMaterialPared = :codigoMaterialPared"),
    @NamedQuery(name = "CargaVivienda.findByCodigoTenenciaVivienda", query = "SELECT c FROM CargaVivienda c WHERE c.codigoTenenciaVivienda = :codigoTenenciaVivienda"),
    @NamedQuery(name = "CargaVivienda.findByCodigoLugarCocina", query = "SELECT c FROM CargaVivienda c WHERE c.codigoLugarCocina = :codigoLugarCocina"),
    @NamedQuery(name = "CargaVivienda.findByHumoDentroCasa", query = "SELECT c FROM CargaVivienda c WHERE c.humoDentroCasa = :humoDentroCasa"),
    @NamedQuery(name = "CargaVivienda.findByCodigoCocina1", query = "SELECT c FROM CargaVivienda c WHERE c.codigoCocina1 = :codigoCocina1"),
    @NamedQuery(name = "CargaVivienda.findByCodigoCocina2", query = "SELECT c FROM CargaVivienda c WHERE c.codigoCocina2 = :codigoCocina2"),
    @NamedQuery(name = "CargaVivienda.findByCodigoPersonasDormitorio", query = "SELECT c FROM CargaVivienda c WHERE c.codigoPersonasDormitorio = :codigoPersonasDormitorio"),
    @NamedQuery(name = "CargaVivienda.findByCodigoHabitaciones", query = "SELECT c FROM CargaVivienda c WHERE c.codigoHabitaciones = :codigoHabitaciones"),
    @NamedQuery(name = "CargaVivienda.findByCodigoTipoAlumbrado", query = "SELECT c FROM CargaVivienda c WHERE c.codigoTipoAlumbrado = :codigoTipoAlumbrado"),
    @NamedQuery(name = "CargaVivienda.findByCodigoAccesoInternet", query = "SELECT c FROM CargaVivienda c WHERE c.codigoAccesoInternet = :codigoAccesoInternet"),
    @NamedQuery(name = "CargaVivienda.findByCodigoTecho", query = "SELECT c FROM CargaVivienda c WHERE c.codigoTecho = :codigoTecho"),
    @NamedQuery(name = "CargaVivienda.findByCodigoPiso", query = "SELECT c FROM CargaVivienda c WHERE c.codigoPiso = :codigoPiso"),
    @NamedQuery(name = "CargaVivienda.findByCodigoPared", query = "SELECT c FROM CargaVivienda c WHERE c.codigoPared = :codigoPared"),
    @NamedQuery(name = "CargaVivienda.findByCodigoIluminacion", query = "SELECT c FROM CargaVivienda c WHERE c.codigoIluminacion = :codigoIluminacion"),
    @NamedQuery(name = "CargaVivienda.findByCodigoVentilacion", query = "SELECT c FROM CargaVivienda c WHERE c.codigoVentilacion = :codigoVentilacion"),
    @NamedQuery(name = "CargaVivienda.findByFuenteAguaConsumo1", query = "SELECT c FROM CargaVivienda c WHERE c.fuenteAguaConsumo1 = :fuenteAguaConsumo1"),
    @NamedQuery(name = "CargaVivienda.findByFuenteAguaConsumo2", query = "SELECT c FROM CargaVivienda c WHERE c.fuenteAguaConsumo2 = :fuenteAguaConsumo2"),
    @NamedQuery(name = "CargaVivienda.findByFuenteAguaConsumo3", query = "SELECT c FROM CargaVivienda c WHERE c.fuenteAguaConsumo3 = :fuenteAguaConsumo3"),
    @NamedQuery(name = "CargaVivienda.findByFuenteAguaConsumo4", query = "SELECT c FROM CargaVivienda c WHERE c.fuenteAguaConsumo4 = :fuenteAguaConsumo4"),
    @NamedQuery(name = "CargaVivienda.findByFuenteAguaConsumo5", query = "SELECT c FROM CargaVivienda c WHERE c.fuenteAguaConsumo5 = :fuenteAguaConsumo5"),
    @NamedQuery(name = "CargaVivienda.findByTratamientoAguaConsumo1", query = "SELECT c FROM CargaVivienda c WHERE c.tratamientoAguaConsumo1 = :tratamientoAguaConsumo1"),
    @NamedQuery(name = "CargaVivienda.findByTratamientoAguaConsumo2", query = "SELECT c FROM CargaVivienda c WHERE c.tratamientoAguaConsumo2 = :tratamientoAguaConsumo2"),
    @NamedQuery(name = "CargaVivienda.findByTratamientoAguaConsumo3", query = "SELECT c FROM CargaVivienda c WHERE c.tratamientoAguaConsumo3 = :tratamientoAguaConsumo3"),
    @NamedQuery(name = "CargaVivienda.findByTratamientoAguaConsumo4", query = "SELECT c FROM CargaVivienda c WHERE c.tratamientoAguaConsumo4 = :tratamientoAguaConsumo4"),
    @NamedQuery(name = "CargaVivienda.findByTratamientoAguaConsumo5", query = "SELECT c FROM CargaVivienda c WHERE c.tratamientoAguaConsumo5 = :tratamientoAguaConsumo5"),
    @NamedQuery(name = "CargaVivienda.findByAlmacenamientoAguaConsumo1", query = "SELECT c FROM CargaVivienda c WHERE c.almacenamientoAguaConsumo1 = :almacenamientoAguaConsumo1"),
    @NamedQuery(name = "CargaVivienda.findByAlmacenamientoAguaConsumo2", query = "SELECT c FROM CargaVivienda c WHERE c.almacenamientoAguaConsumo2 = :almacenamientoAguaConsumo2"),
    @NamedQuery(name = "CargaVivienda.findByAlmacenamientoAguaConsumo3", query = "SELECT c FROM CargaVivienda c WHERE c.almacenamientoAguaConsumo3 = :almacenamientoAguaConsumo3"),
    @NamedQuery(name = "CargaVivienda.findByAlmacenamientoAguaConsumo4", query = "SELECT c FROM CargaVivienda c WHERE c.almacenamientoAguaConsumo4 = :almacenamientoAguaConsumo4"),
    @NamedQuery(name = "CargaVivienda.findByAlmacenamientoAguaConsumo5", query = "SELECT c FROM CargaVivienda c WHERE c.almacenamientoAguaConsumo5 = :almacenamientoAguaConsumo5"),
    @NamedQuery(name = "CargaVivienda.findByCodigoEstadoRecipiente", query = "SELECT c FROM CargaVivienda c WHERE c.codigoEstadoRecipiente = :codigoEstadoRecipiente"),
    @NamedQuery(name = "CargaVivienda.findByResiduosVivendaBor", query = "SELECT c FROM CargaVivienda c WHERE c.residuosVivendaBor = :residuosVivendaBor"),
    @NamedQuery(name = "CargaVivienda.findByResiduosViviendaPeligrosos", query = "SELECT c FROM CargaVivienda c WHERE c.residuosViviendaPeligrosos = :residuosViviendaPeligrosos"),
    @NamedQuery(name = "CargaVivienda.findByResiduosBiodegradables", query = "SELECT c FROM CargaVivienda c WHERE c.residuosBiodegradables = :residuosBiodegradables"),
    @NamedQuery(name = "CargaVivienda.findByResiduosOrdinariosNr", query = "SELECT c FROM CargaVivienda c WHERE c.residuosOrdinariosNr = :residuosOrdinariosNr"),
    @NamedQuery(name = "CargaVivienda.findByResiduosRecicables", query = "SELECT c FROM CargaVivienda c WHERE c.residuosRecicables = :residuosRecicables"),
    @NamedQuery(name = "CargaVivienda.findByResiduosPeligrosos", query = "SELECT c FROM CargaVivienda c WHERE c.residuosPeligrosos = :residuosPeligrosos"),
    @NamedQuery(name = "CargaVivienda.findByEliminacionExcretas", query = "SELECT c FROM CargaVivienda c WHERE c.eliminacionExcretas = :eliminacionExcretas"),
    @NamedQuery(name = "CargaVivienda.findByAguasResidualesDomesticas", query = "SELECT c FROM CargaVivienda c WHERE c.aguasResidualesDomesticas = :aguasResidualesDomesticas"),
    @NamedQuery(name = "CargaVivienda.findByAnimalesDentroCasa", query = "SELECT c FROM CargaVivienda c WHERE c.animalesDentroCasa = :animalesDentroCasa"),
    @NamedQuery(name = "CargaVivienda.findByAnimalesVacunados", query = "SELECT c FROM CargaVivienda c WHERE c.animalesVacunados = :animalesVacunados"),
    @NamedQuery(name = "CargaVivienda.findByAnimalesNoVacunados", query = "SELECT c FROM CargaVivienda c WHERE c.animalesNoVacunados = :animalesNoVacunados"),
    @NamedQuery(name = "CargaVivienda.findByTotalAnimales", query = "SELECT c FROM CargaVivienda c WHERE c.totalAnimales = :totalAnimales"),
    @NamedQuery(name = "CargaVivienda.findByPresenciaVectoresRoedores", query = "SELECT c FROM CargaVivienda c WHERE c.presenciaVectoresRoedores = :presenciaVectoresRoedores"),
    @NamedQuery(name = "CargaVivienda.findByRiesgoVivienda", query = "SELECT c FROM CargaVivienda c WHERE c.riesgoVivienda = :riesgoVivienda"),
    @NamedQuery(name = "CargaVivienda.findByTipoRiesgoVivienda1", query = "SELECT c FROM CargaVivienda c WHERE c.tipoRiesgoVivienda1 = :tipoRiesgoVivienda1"),
    @NamedQuery(name = "CargaVivienda.findByTipoRiesgoVivienda2", query = "SELECT c FROM CargaVivienda c WHERE c.tipoRiesgoVivienda2 = :tipoRiesgoVivienda2"),
    @NamedQuery(name = "CargaVivienda.findByTipoRiesgoVivienda3", query = "SELECT c FROM CargaVivienda c WHERE c.tipoRiesgoVivienda3 = :tipoRiesgoVivienda3"),
    @NamedQuery(name = "CargaVivienda.findByTipoRiesgoVivienda4", query = "SELECT c FROM CargaVivienda c WHERE c.tipoRiesgoVivienda4 = :tipoRiesgoVivienda4"),
    @NamedQuery(name = "CargaVivienda.findByTipoRiesgoVivienda5", query = "SELECT c FROM CargaVivienda c WHERE c.tipoRiesgoVivienda5 = :tipoRiesgoVivienda5"),
    @NamedQuery(name = "CargaVivienda.findByTipoEspacioProductivo", query = "SELECT c FROM CargaVivienda c WHERE c.tipoEspacioProductivo = :tipoEspacioProductivo"),
    @NamedQuery(name = "CargaVivienda.findByDestinoProductos1", query = "SELECT c FROM CargaVivienda c WHERE c.destinoProductos1 = :destinoProductos1"),
    @NamedQuery(name = "CargaVivienda.findByDestinoProductos2", query = "SELECT c FROM CargaVivienda c WHERE c.destinoProductos2 = :destinoProductos2"),
    @NamedQuery(name = "CargaVivienda.findByDestinoProductos3", query = "SELECT c FROM CargaVivienda c WHERE c.destinoProductos3 = :destinoProductos3"),
    @NamedQuery(name = "CargaVivienda.findByDestinoProductos4", query = "SELECT c FROM CargaVivienda c WHERE c.destinoProductos4 = :destinoProductos4"),
    @NamedQuery(name = "CargaVivienda.findByDestinoProductos5", query = "SELECT c FROM CargaVivienda c WHERE c.destinoProductos5 = :destinoProductos5"),
    @NamedQuery(name = "CargaVivienda.findByPracticasCulturalesEspacio1", query = "SELECT c FROM CargaVivienda c WHERE c.practicasCulturalesEspacio1 = :practicasCulturalesEspacio1"),
    @NamedQuery(name = "CargaVivienda.findByPracticasCulturalesEspacio2", query = "SELECT c FROM CargaVivienda c WHERE c.practicasCulturalesEspacio2 = :practicasCulturalesEspacio2"),
    @NamedQuery(name = "CargaVivienda.findByPracticasCulturalesEspacio3", query = "SELECT c FROM CargaVivienda c WHERE c.practicasCulturalesEspacio3 = :practicasCulturalesEspacio3"),
    @NamedQuery(name = "CargaVivienda.findByPracticasCulturalesEspacio4", query = "SELECT c FROM CargaVivienda c WHERE c.practicasCulturalesEspacio4 = :practicasCulturalesEspacio4"),
    @NamedQuery(name = "CargaVivienda.findByPracticasCulturalesEspacio5", query = "SELECT c FROM CargaVivienda c WHERE c.practicasCulturalesEspacio5 = :practicasCulturalesEspacio5"),
    @NamedQuery(name = "CargaVivienda.findByActividadesProductivasVivienda1", query = "SELECT c FROM CargaVivienda c WHERE c.actividadesProductivasVivienda1 = :actividadesProductivasVivienda1"),
    @NamedQuery(name = "CargaVivienda.findByActividadesProductivasVivienda2", query = "SELECT c FROM CargaVivienda c WHERE c.actividadesProductivasVivienda2 = :actividadesProductivasVivienda2"),
    @NamedQuery(name = "CargaVivienda.findByActividadesProductivasVivienda3", query = "SELECT c FROM CargaVivienda c WHERE c.actividadesProductivasVivienda3 = :actividadesProductivasVivienda3"),
    @NamedQuery(name = "CargaVivienda.findByActividadesProductivasVivienda4", query = "SELECT c FROM CargaVivienda c WHERE c.actividadesProductivasVivienda4 = :actividadesProductivasVivienda4"),
    @NamedQuery(name = "CargaVivienda.findByActividadesProductivasVivienda5", query = "SELECT c FROM CargaVivienda c WHERE c.actividadesProductivasVivienda5 = :actividadesProductivasVivienda5"),
    @NamedQuery(name = "CargaVivienda.findByPracticasCulturalesColectivas1", query = "SELECT c FROM CargaVivienda c WHERE c.practicasCulturalesColectivas1 = :practicasCulturalesColectivas1"),
    @NamedQuery(name = "CargaVivienda.findByPracticasCulturalesColectivas2", query = "SELECT c FROM CargaVivienda c WHERE c.practicasCulturalesColectivas2 = :practicasCulturalesColectivas2"),
    @NamedQuery(name = "CargaVivienda.findByPracticasCulturalesColectivas3", query = "SELECT c FROM CargaVivienda c WHERE c.practicasCulturalesColectivas3 = :practicasCulturalesColectivas3"),
    @NamedQuery(name = "CargaVivienda.findByPracticasCulturalesColectivas4", query = "SELECT c FROM CargaVivienda c WHERE c.practicasCulturalesColectivas4 = :practicasCulturalesColectivas4"),
    @NamedQuery(name = "CargaVivienda.findByPracticasCulturalesColectivas5", query = "SELECT c FROM CargaVivienda c WHERE c.practicasCulturalesColectivas5 = :practicasCulturalesColectivas5"),
    @NamedQuery(name = "CargaVivienda.findByObservaciones", query = "SELECT c FROM CargaVivienda c WHERE c.observaciones = :observaciones"),
    @NamedQuery(name = "CargaVivienda.findByFechaRegistro", query = "SELECT c FROM CargaVivienda c WHERE c.fechaRegistro = :fechaRegistro"),
    @NamedQuery(name = "CargaVivienda.findByIdentificacionAgente", query = "SELECT c FROM CargaVivienda c WHERE c.identificacionAgente = :identificacionAgente"),
    @NamedQuery(name = "CargaVivienda.findByIdUsuarioCarga", query = "SELECT c FROM CargaVivienda c WHERE c.idUsuarioCarga = :idUsuarioCarga"),
    @NamedQuery(name = "CargaVivienda.findByFechaCreacion", query = "SELECT c FROM CargaVivienda c WHERE c.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "CargaVivienda.findByMensaje", query = "SELECT c FROM CargaVivienda c WHERE c.mensaje = :mensaje")})
public class CargaVivienda implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CARGA_VIVIENDA")
    private BigDecimal idCargaVivienda;
    @Column(name = "NUCLEO_FAMILIAR")
    private BigInteger nucleoFamiliar;
    @Column(name = "CODIGO_VIVIENDA")
    private BigInteger codigoVivienda;
    @Column(name = "CODIGO_MATERIAL_TECHO")
    private BigInteger codigoMaterialTecho;
    @Column(name = "CODIGO_MATERIAL_PISO")
    private BigInteger codigoMaterialPiso;
    @Column(name = "CODIGO_MATERIAL_PARED")
    private BigInteger codigoMaterialPared;
    @Column(name = "CODIGO_TENENCIA_VIVIENDA")
    private BigInteger codigoTenenciaVivienda;
    @Column(name = "CODIGO_LUGAR_COCINA")
    private BigInteger codigoLugarCocina;
    @Column(name = "HUMO_DENTRO_CASA")
    private BigInteger humoDentroCasa;
    @Column(name = "CODIGO_COCINA_1")
    private BigInteger codigoCocina1;
    @Column(name = "CODIGO_COCINA_2")
    private BigInteger codigoCocina2;
    @Column(name = "CODIGO_PERSONAS_DORMITORIO")
    private BigInteger codigoPersonasDormitorio;
    @Column(name = "CODIGO_HABITACIONES")
    private BigInteger codigoHabitaciones;
    @Column(name = "CODIGO_TIPO_ALUMBRADO")
    private BigInteger codigoTipoAlumbrado;
    @Column(name = "CODIGO_ACCESO_INTERNET")
    private BigInteger codigoAccesoInternet;
    @Column(name = "CODIGO_TECHO")
    private BigInteger codigoTecho;
    @Column(name = "CODIGO_PISO")
    private BigInteger codigoPiso;
    @Column(name = "CODIGO_PARED")
    private BigInteger codigoPared;
    @Column(name = "CODIGO_ILUMINACION")
    private BigInteger codigoIluminacion;
    @Column(name = "CODIGO_VENTILACION")
    private BigInteger codigoVentilacion;
    @Column(name = "FUENTE_AGUA_CONSUMO_1")
    private BigInteger fuenteAguaConsumo1;
    @Column(name = "FUENTE_AGUA_CONSUMO_2")
    private BigInteger fuenteAguaConsumo2;
    @Column(name = "FUENTE_AGUA_CONSUMO_3")
    private BigInteger fuenteAguaConsumo3;
    @Column(name = "FUENTE_AGUA_CONSUMO_4")
    private BigInteger fuenteAguaConsumo4;
    @Column(name = "FUENTE_AGUA_CONSUMO_5")
    private BigInteger fuenteAguaConsumo5;
    @Column(name = "TRATAMIENTO_AGUA_CONSUMO_1")
    private BigInteger tratamientoAguaConsumo1;
    @Column(name = "TRATAMIENTO_AGUA_CONSUMO_2")
    private BigInteger tratamientoAguaConsumo2;
    @Column(name = "TRATAMIENTO_AGUA_CONSUMO_3")
    private BigInteger tratamientoAguaConsumo3;
    @Column(name = "TRATAMIENTO_AGUA_CONSUMO_4")
    private BigInteger tratamientoAguaConsumo4;
    @Column(name = "TRATAMIENTO_AGUA_CONSUMO_5")
    private BigInteger tratamientoAguaConsumo5;
    @Column(name = "ALMACENAMIENTO_AGUA_CONSUMO_1")
    private BigInteger almacenamientoAguaConsumo1;
    @Column(name = "ALMACENAMIENTO_AGUA_CONSUMO_2")
    private BigInteger almacenamientoAguaConsumo2;
    @Column(name = "ALMACENAMIENTO_AGUA_CONSUMO_3")
    private BigInteger almacenamientoAguaConsumo3;
    @Column(name = "ALMACENAMIENTO_AGUA_CONSUMO_4")
    private BigInteger almacenamientoAguaConsumo4;
    @Column(name = "ALMACENAMIENTO_AGUA_CONSUMO_5")
    private BigInteger almacenamientoAguaConsumo5;
    @Column(name = "CODIGO_ESTADO_RECIPIENTE")
    private BigInteger codigoEstadoRecipiente;
    @Column(name = "RESIDUOS_VIVENDA_BOR")
    private BigInteger residuosVivendaBor;
    @Column(name = "RESIDUOS_VIVIENDA_PELIGROSOS")
    private BigInteger residuosViviendaPeligrosos;
    @Column(name = "RESIDUOS_BIODEGRADABLES")
    private BigInteger residuosBiodegradables;
    @Column(name = "RESIDUOS_ORDINARIOS_NR")
    private BigInteger residuosOrdinariosNr;
    @Column(name = "RESIDUOS_RECICABLES")
    private BigInteger residuosRecicables;
    @Column(name = "RESIDUOS_PELIGROSOS")
    private BigInteger residuosPeligrosos;
    @Column(name = "ELIMINACION_EXCRETAS")
    private BigInteger eliminacionExcretas;
    @Column(name = "AGUAS_RESIDUALES_DOMESTICAS")
    private BigInteger aguasResidualesDomesticas;
    @Column(name = "ANIMALES_DENTRO_CASA")
    private BigInteger animalesDentroCasa;
    @Column(name = "ANIMALES_VACUNADOS")
    private BigInteger animalesVacunados;
    @Column(name = "ANIMALES_NO_VACUNADOS")
    private BigInteger animalesNoVacunados;
    @Column(name = "TOTAL_ANIMALES")
    private BigInteger totalAnimales;
    @Column(name = "PRESENCIA_VECTORES_ROEDORES")
    private BigInteger presenciaVectoresRoedores;
    @Column(name = "RIESGO_VIVIENDA")
    private BigInteger riesgoVivienda;
    @Column(name = "TIPO_RIESGO_VIVIENDA_1")
    private BigInteger tipoRiesgoVivienda1;
    @Column(name = "TIPO_RIESGO_VIVIENDA_2")
    private BigInteger tipoRiesgoVivienda2;
    @Column(name = "TIPO_RIESGO_VIVIENDA_3")
    private BigInteger tipoRiesgoVivienda3;
    @Column(name = "TIPO_RIESGO_VIVIENDA_4")
    private BigInteger tipoRiesgoVivienda4;
    @Column(name = "TIPO_RIESGO_VIVIENDA_5")
    private BigInteger tipoRiesgoVivienda5;
    @Column(name = "TIPO_ESPACIO_PRODUCTIVO")
    private BigInteger tipoEspacioProductivo;
    @Column(name = "DESTINO_PRODUCTOS_1")
    private BigInteger destinoProductos1;
    @Column(name = "DESTINO_PRODUCTOS_2")
    private BigInteger destinoProductos2;
    @Column(name = "DESTINO_PRODUCTOS_3")
    private BigInteger destinoProductos3;
    @Column(name = "DESTINO_PRODUCTOS_4")
    private BigInteger destinoProductos4;
    @Column(name = "DESTINO_PRODUCTOS_5")
    private BigInteger destinoProductos5;
    @Column(name = "PRACTICAS_CULTURALES_ESPACIO_1")
    private BigInteger practicasCulturalesEspacio1;
    @Column(name = "PRACTICAS_CULTURALES_ESPACIO_2")
    private BigInteger practicasCulturalesEspacio2;
    @Column(name = "PRACTICAS_CULTURALES_ESPACIO_3")
    private BigInteger practicasCulturalesEspacio3;
    @Column(name = "PRACTICAS_CULTURALES_ESPACIO_4")
    private BigInteger practicasCulturalesEspacio4;
    @Column(name = "PRACTICAS_CULTURALES_ESPACIO_5")
    private BigInteger practicasCulturalesEspacio5;
    @Column(name = "ACTIVIDADES_PRODUCTIVAS_VIVIENDA_1")
    private BigInteger actividadesProductivasVivienda1;
    @Column(name = "ACTIVIDADES_PRODUCTIVAS_VIVIENDA_2")
    private BigInteger actividadesProductivasVivienda2;
    @Column(name = "ACTIVIDADES_PRODUCTIVAS_VIVIENDA_3")
    private BigInteger actividadesProductivasVivienda3;
    @Column(name = "ACTIVIDADES_PRODUCTIVAS_VIVIENDA_4")
    private BigInteger actividadesProductivasVivienda4;
    @Column(name = "ACTIVIDADES_PRODUCTIVAS_VIVIENDA_5")
    private BigInteger actividadesProductivasVivienda5;
    @Column(name = "PRACTICAS_CULTURALES_COLECTIVAS_1")
    private BigInteger practicasCulturalesColectivas1;
    @Column(name = "PRACTICAS_CULTURALES_COLECTIVAS_2")
    private BigInteger practicasCulturalesColectivas2;
    @Column(name = "PRACTICAS_CULTURALES_COLECTIVAS_3")
    private BigInteger practicasCulturalesColectivas3;
    @Column(name = "PRACTICAS_CULTURALES_COLECTIVAS_4")
    private BigInteger practicasCulturalesColectivas4;
    @Column(name = "PRACTICAS_CULTURALES_COLECTIVAS_5")
    private BigInteger practicasCulturalesColectivas5;
    @Size(max = 4000)
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "FECHA_REGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Size(max = 30)
    @Column(name = "IDENTIFICACION_AGENTE")
    private String identificacionAgente;
    @Column(name = "ID_USUARIO_CARGA")
    private BigInteger idUsuarioCarga;
    @Column(name = "FECHA_CREACION")
    private Date fechaCreacion;
    @Size(max = 4000)
    @Column(name = "MENSAJE")
    private String mensaje;

    public CargaVivienda() {
    }

    public CargaVivienda(BigDecimal idCargaVivienda) {
        this.idCargaVivienda = idCargaVivienda;
    }

    public BigDecimal getIdCargaVivienda() {
        return idCargaVivienda;
    }

    public void setIdCargaVivienda(BigDecimal idCargaVivienda) {
        this.idCargaVivienda = idCargaVivienda;
    }

    public BigInteger getNucleoFamiliar() {
        return nucleoFamiliar;
    }

    public void setNucleoFamiliar(BigInteger nucleoFamiliar) {
        this.nucleoFamiliar = nucleoFamiliar;
    }

    public BigInteger getCodigoVivienda() {
        return codigoVivienda;
    }

    public void setCodigoVivienda(BigInteger codigoVivienda) {
        this.codigoVivienda = codigoVivienda;
    }

    public BigInteger getCodigoMaterialTecho() {
        return codigoMaterialTecho;
    }

    public void setCodigoMaterialTecho(BigInteger codigoMaterialTecho) {
        this.codigoMaterialTecho = codigoMaterialTecho;
    }

    public BigInteger getCodigoMaterialPiso() {
        return codigoMaterialPiso;
    }

    public void setCodigoMaterialPiso(BigInteger codigoMaterialPiso) {
        this.codigoMaterialPiso = codigoMaterialPiso;
    }

    public BigInteger getCodigoMaterialPared() {
        return codigoMaterialPared;
    }

    public void setCodigoMaterialPared(BigInteger codigoMaterialPared) {
        this.codigoMaterialPared = codigoMaterialPared;
    }

    public BigInteger getCodigoTenenciaVivienda() {
        return codigoTenenciaVivienda;
    }

    public void setCodigoTenenciaVivienda(BigInteger codigoTenenciaVivienda) {
        this.codigoTenenciaVivienda = codigoTenenciaVivienda;
    }

    public BigInteger getCodigoLugarCocina() {
        return codigoLugarCocina;
    }

    public void setCodigoLugarCocina(BigInteger codigoLugarCocina) {
        this.codigoLugarCocina = codigoLugarCocina;
    }

    public BigInteger getHumoDentroCasa() {
        return humoDentroCasa;
    }

    public void setHumoDentroCasa(BigInteger humoDentroCasa) {
        this.humoDentroCasa = humoDentroCasa;
    }

    public BigInteger getCodigoCocina1() {
        return codigoCocina1;
    }

    public void setCodigoCocina1(BigInteger codigoCocina1) {
        this.codigoCocina1 = codigoCocina1;
    }

    public BigInteger getCodigoCocina2() {
        return codigoCocina2;
    }

    public void setCodigoCocina2(BigInteger codigoCocina2) {
        this.codigoCocina2 = codigoCocina2;
    }

    public BigInteger getCodigoPersonasDormitorio() {
        return codigoPersonasDormitorio;
    }

    public void setCodigoPersonasDormitorio(BigInteger codigoPersonasDormitorio) {
        this.codigoPersonasDormitorio = codigoPersonasDormitorio;
    }

    public BigInteger getCodigoHabitaciones() {
        return codigoHabitaciones;
    }

    public void setCodigoHabitaciones(BigInteger codigoHabitaciones) {
        this.codigoHabitaciones = codigoHabitaciones;
    }

    public BigInteger getCodigoTipoAlumbrado() {
        return codigoTipoAlumbrado;
    }

    public void setCodigoTipoAlumbrado(BigInteger codigoTipoAlumbrado) {
        this.codigoTipoAlumbrado = codigoTipoAlumbrado;
    }

    public BigInteger getCodigoAccesoInternet() {
        return codigoAccesoInternet;
    }

    public void setCodigoAccesoInternet(BigInteger codigoAccesoInternet) {
        this.codigoAccesoInternet = codigoAccesoInternet;
    }

    public BigInteger getCodigoTecho() {
        return codigoTecho;
    }

    public void setCodigoTecho(BigInteger codigoTecho) {
        this.codigoTecho = codigoTecho;
    }

    public BigInteger getCodigoPiso() {
        return codigoPiso;
    }

    public void setCodigoPiso(BigInteger codigoPiso) {
        this.codigoPiso = codigoPiso;
    }

    public BigInteger getCodigoPared() {
        return codigoPared;
    }

    public void setCodigoPared(BigInteger codigoPared) {
        this.codigoPared = codigoPared;
    }

    public BigInteger getCodigoIluminacion() {
        return codigoIluminacion;
    }

    public void setCodigoIluminacion(BigInteger codigoIluminacion) {
        this.codigoIluminacion = codigoIluminacion;
    }

    public BigInteger getCodigoVentilacion() {
        return codigoVentilacion;
    }

    public void setCodigoVentilacion(BigInteger codigoVentilacion) {
        this.codigoVentilacion = codigoVentilacion;
    }

    public BigInteger getFuenteAguaConsumo1() {
        return fuenteAguaConsumo1;
    }

    public void setFuenteAguaConsumo1(BigInteger fuenteAguaConsumo1) {
        this.fuenteAguaConsumo1 = fuenteAguaConsumo1;
    }

    public BigInteger getFuenteAguaConsumo2() {
        return fuenteAguaConsumo2;
    }

    public void setFuenteAguaConsumo2(BigInteger fuenteAguaConsumo2) {
        this.fuenteAguaConsumo2 = fuenteAguaConsumo2;
    }

    public BigInteger getFuenteAguaConsumo3() {
        return fuenteAguaConsumo3;
    }

    public void setFuenteAguaConsumo3(BigInteger fuenteAguaConsumo3) {
        this.fuenteAguaConsumo3 = fuenteAguaConsumo3;
    }

    public BigInteger getFuenteAguaConsumo4() {
        return fuenteAguaConsumo4;
    }

    public void setFuenteAguaConsumo4(BigInteger fuenteAguaConsumo4) {
        this.fuenteAguaConsumo4 = fuenteAguaConsumo4;
    }

    public BigInteger getFuenteAguaConsumo5() {
        return fuenteAguaConsumo5;
    }

    public void setFuenteAguaConsumo5(BigInteger fuenteAguaConsumo5) {
        this.fuenteAguaConsumo5 = fuenteAguaConsumo5;
    }

    public BigInteger getTratamientoAguaConsumo1() {
        return tratamientoAguaConsumo1;
    }

    public void setTratamientoAguaConsumo1(BigInteger tratamientoAguaConsumo1) {
        this.tratamientoAguaConsumo1 = tratamientoAguaConsumo1;
    }

    public BigInteger getTratamientoAguaConsumo2() {
        return tratamientoAguaConsumo2;
    }

    public void setTratamientoAguaConsumo2(BigInteger tratamientoAguaConsumo2) {
        this.tratamientoAguaConsumo2 = tratamientoAguaConsumo2;
    }

    public BigInteger getTratamientoAguaConsumo3() {
        return tratamientoAguaConsumo3;
    }

    public void setTratamientoAguaConsumo3(BigInteger tratamientoAguaConsumo3) {
        this.tratamientoAguaConsumo3 = tratamientoAguaConsumo3;
    }

    public BigInteger getTratamientoAguaConsumo4() {
        return tratamientoAguaConsumo4;
    }

    public void setTratamientoAguaConsumo4(BigInteger tratamientoAguaConsumo4) {
        this.tratamientoAguaConsumo4 = tratamientoAguaConsumo4;
    }

    public BigInteger getTratamientoAguaConsumo5() {
        return tratamientoAguaConsumo5;
    }

    public void setTratamientoAguaConsumo5(BigInteger tratamientoAguaConsumo5) {
        this.tratamientoAguaConsumo5 = tratamientoAguaConsumo5;
    }

    public BigInteger getAlmacenamientoAguaConsumo1() {
        return almacenamientoAguaConsumo1;
    }

    public void setAlmacenamientoAguaConsumo1(BigInteger almacenamientoAguaConsumo1) {
        this.almacenamientoAguaConsumo1 = almacenamientoAguaConsumo1;
    }

    public BigInteger getAlmacenamientoAguaConsumo2() {
        return almacenamientoAguaConsumo2;
    }

    public void setAlmacenamientoAguaConsumo2(BigInteger almacenamientoAguaConsumo2) {
        this.almacenamientoAguaConsumo2 = almacenamientoAguaConsumo2;
    }

    public BigInteger getAlmacenamientoAguaConsumo3() {
        return almacenamientoAguaConsumo3;
    }

    public void setAlmacenamientoAguaConsumo3(BigInteger almacenamientoAguaConsumo3) {
        this.almacenamientoAguaConsumo3 = almacenamientoAguaConsumo3;
    }

    public BigInteger getAlmacenamientoAguaConsumo4() {
        return almacenamientoAguaConsumo4;
    }

    public void setAlmacenamientoAguaConsumo4(BigInteger almacenamientoAguaConsumo4) {
        this.almacenamientoAguaConsumo4 = almacenamientoAguaConsumo4;
    }

    public BigInteger getAlmacenamientoAguaConsumo5() {
        return almacenamientoAguaConsumo5;
    }

    public void setAlmacenamientoAguaConsumo5(BigInteger almacenamientoAguaConsumo5) {
        this.almacenamientoAguaConsumo5 = almacenamientoAguaConsumo5;
    }

    public BigInteger getCodigoEstadoRecipiente() {
        return codigoEstadoRecipiente;
    }

    public void setCodigoEstadoRecipiente(BigInteger codigoEstadoRecipiente) {
        this.codigoEstadoRecipiente = codigoEstadoRecipiente;
    }

    public BigInteger getResiduosVivendaBor() {
        return residuosVivendaBor;
    }

    public void setResiduosVivendaBor(BigInteger residuosVivendaBor) {
        this.residuosVivendaBor = residuosVivendaBor;
    }

    public BigInteger getResiduosViviendaPeligrosos() {
        return residuosViviendaPeligrosos;
    }

    public void setResiduosViviendaPeligrosos(BigInteger residuosViviendaPeligrosos) {
        this.residuosViviendaPeligrosos = residuosViviendaPeligrosos;
    }

    public BigInteger getResiduosBiodegradables() {
        return residuosBiodegradables;
    }

    public void setResiduosBiodegradables(BigInteger residuosBiodegradables) {
        this.residuosBiodegradables = residuosBiodegradables;
    }

    public BigInteger getResiduosOrdinariosNr() {
        return residuosOrdinariosNr;
    }

    public void setResiduosOrdinariosNr(BigInteger residuosOrdinariosNr) {
        this.residuosOrdinariosNr = residuosOrdinariosNr;
    }

    public BigInteger getResiduosRecicables() {
        return residuosRecicables;
    }

    public void setResiduosRecicables(BigInteger residuosRecicables) {
        this.residuosRecicables = residuosRecicables;
    }

    public BigInteger getResiduosPeligrosos() {
        return residuosPeligrosos;
    }

    public void setResiduosPeligrosos(BigInteger residuosPeligrosos) {
        this.residuosPeligrosos = residuosPeligrosos;
    }

    public BigInteger getEliminacionExcretas() {
        return eliminacionExcretas;
    }

    public void setEliminacionExcretas(BigInteger eliminacionExcretas) {
        this.eliminacionExcretas = eliminacionExcretas;
    }

    public BigInteger getAguasResidualesDomesticas() {
        return aguasResidualesDomesticas;
    }

    public void setAguasResidualesDomesticas(BigInteger aguasResidualesDomesticas) {
        this.aguasResidualesDomesticas = aguasResidualesDomesticas;
    }

    public BigInteger getAnimalesDentroCasa() {
        return animalesDentroCasa;
    }

    public void setAnimalesDentroCasa(BigInteger animalesDentroCasa) {
        this.animalesDentroCasa = animalesDentroCasa;
    }

    public BigInteger getAnimalesVacunados() {
        return animalesVacunados;
    }

    public void setAnimalesVacunados(BigInteger animalesVacunados) {
        this.animalesVacunados = animalesVacunados;
    }

    public BigInteger getAnimalesNoVacunados() {
        return animalesNoVacunados;
    }

    public void setAnimalesNoVacunados(BigInteger animalesNoVacunados) {
        this.animalesNoVacunados = animalesNoVacunados;
    }

    public BigInteger getTotalAnimales() {
        return totalAnimales;
    }

    public void setTotalAnimales(BigInteger totalAnimales) {
        this.totalAnimales = totalAnimales;
    }

    public BigInteger getPresenciaVectoresRoedores() {
        return presenciaVectoresRoedores;
    }

    public void setPresenciaVectoresRoedores(BigInteger presenciaVectoresRoedores) {
        this.presenciaVectoresRoedores = presenciaVectoresRoedores;
    }

    public BigInteger getRiesgoVivienda() {
        return riesgoVivienda;
    }

    public void setRiesgoVivienda(BigInteger riesgoVivienda) {
        this.riesgoVivienda = riesgoVivienda;
    }

    public BigInteger getTipoRiesgoVivienda1() {
        return tipoRiesgoVivienda1;
    }

    public void setTipoRiesgoVivienda1(BigInteger tipoRiesgoVivienda1) {
        this.tipoRiesgoVivienda1 = tipoRiesgoVivienda1;
    }

    public BigInteger getTipoRiesgoVivienda2() {
        return tipoRiesgoVivienda2;
    }

    public void setTipoRiesgoVivienda2(BigInteger tipoRiesgoVivienda2) {
        this.tipoRiesgoVivienda2 = tipoRiesgoVivienda2;
    }

    public BigInteger getTipoRiesgoVivienda3() {
        return tipoRiesgoVivienda3;
    }

    public void setTipoRiesgoVivienda3(BigInteger tipoRiesgoVivienda3) {
        this.tipoRiesgoVivienda3 = tipoRiesgoVivienda3;
    }

    public BigInteger getTipoRiesgoVivienda4() {
        return tipoRiesgoVivienda4;
    }

    public void setTipoRiesgoVivienda4(BigInteger tipoRiesgoVivienda4) {
        this.tipoRiesgoVivienda4 = tipoRiesgoVivienda4;
    }

    public BigInteger getTipoRiesgoVivienda5() {
        return tipoRiesgoVivienda5;
    }

    public void setTipoRiesgoVivienda5(BigInteger tipoRiesgoVivienda5) {
        this.tipoRiesgoVivienda5 = tipoRiesgoVivienda5;
    }

    public BigInteger getTipoEspacioProductivo() {
        return tipoEspacioProductivo;
    }

    public void setTipoEspacioProductivo(BigInteger tipoEspacioProductivo) {
        this.tipoEspacioProductivo = tipoEspacioProductivo;
    }

    public BigInteger getDestinoProductos1() {
        return destinoProductos1;
    }

    public void setDestinoProductos1(BigInteger destinoProductos1) {
        this.destinoProductos1 = destinoProductos1;
    }

    public BigInteger getDestinoProductos2() {
        return destinoProductos2;
    }

    public void setDestinoProductos2(BigInteger destinoProductos2) {
        this.destinoProductos2 = destinoProductos2;
    }

    public BigInteger getDestinoProductos3() {
        return destinoProductos3;
    }

    public void setDestinoProductos3(BigInteger destinoProductos3) {
        this.destinoProductos3 = destinoProductos3;
    }

    public BigInteger getDestinoProductos4() {
        return destinoProductos4;
    }

    public void setDestinoProductos4(BigInteger destinoProductos4) {
        this.destinoProductos4 = destinoProductos4;
    }

    public BigInteger getDestinoProductos5() {
        return destinoProductos5;
    }

    public void setDestinoProductos5(BigInteger destinoProductos5) {
        this.destinoProductos5 = destinoProductos5;
    }

    public BigInteger getPracticasCulturalesEspacio1() {
        return practicasCulturalesEspacio1;
    }

    public void setPracticasCulturalesEspacio1(BigInteger practicasCulturalesEspacio1) {
        this.practicasCulturalesEspacio1 = practicasCulturalesEspacio1;
    }

    public BigInteger getPracticasCulturalesEspacio2() {
        return practicasCulturalesEspacio2;
    }

    public void setPracticasCulturalesEspacio2(BigInteger practicasCulturalesEspacio2) {
        this.practicasCulturalesEspacio2 = practicasCulturalesEspacio2;
    }

    public BigInteger getPracticasCulturalesEspacio3() {
        return practicasCulturalesEspacio3;
    }

    public void setPracticasCulturalesEspacio3(BigInteger practicasCulturalesEspacio3) {
        this.practicasCulturalesEspacio3 = practicasCulturalesEspacio3;
    }

    public BigInteger getPracticasCulturalesEspacio4() {
        return practicasCulturalesEspacio4;
    }

    public void setPracticasCulturalesEspacio4(BigInteger practicasCulturalesEspacio4) {
        this.practicasCulturalesEspacio4 = practicasCulturalesEspacio4;
    }

    public BigInteger getPracticasCulturalesEspacio5() {
        return practicasCulturalesEspacio5;
    }

    public void setPracticasCulturalesEspacio5(BigInteger practicasCulturalesEspacio5) {
        this.practicasCulturalesEspacio5 = practicasCulturalesEspacio5;
    }

    public BigInteger getActividadesProductivasVivienda1() {
        return actividadesProductivasVivienda1;
    }

    public void setActividadesProductivasVivienda1(BigInteger actividadesProductivasVivienda1) {
        this.actividadesProductivasVivienda1 = actividadesProductivasVivienda1;
    }

    public BigInteger getActividadesProductivasVivienda2() {
        return actividadesProductivasVivienda2;
    }

    public void setActividadesProductivasVivienda2(BigInteger actividadesProductivasVivienda2) {
        this.actividadesProductivasVivienda2 = actividadesProductivasVivienda2;
    }

    public BigInteger getActividadesProductivasVivienda3() {
        return actividadesProductivasVivienda3;
    }

    public void setActividadesProductivasVivienda3(BigInteger actividadesProductivasVivienda3) {
        this.actividadesProductivasVivienda3 = actividadesProductivasVivienda3;
    }

    public BigInteger getActividadesProductivasVivienda4() {
        return actividadesProductivasVivienda4;
    }

    public void setActividadesProductivasVivienda4(BigInteger actividadesProductivasVivienda4) {
        this.actividadesProductivasVivienda4 = actividadesProductivasVivienda4;
    }

    public BigInteger getActividadesProductivasVivienda5() {
        return actividadesProductivasVivienda5;
    }

    public void setActividadesProductivasVivienda5(BigInteger actividadesProductivasVivienda5) {
        this.actividadesProductivasVivienda5 = actividadesProductivasVivienda5;
    }

    public BigInteger getPracticasCulturalesColectivas1() {
        return practicasCulturalesColectivas1;
    }

    public void setPracticasCulturalesColectivas1(BigInteger practicasCulturalesColectivas1) {
        this.practicasCulturalesColectivas1 = practicasCulturalesColectivas1;
    }

    public BigInteger getPracticasCulturalesColectivas2() {
        return practicasCulturalesColectivas2;
    }

    public void setPracticasCulturalesColectivas2(BigInteger practicasCulturalesColectivas2) {
        this.practicasCulturalesColectivas2 = practicasCulturalesColectivas2;
    }

    public BigInteger getPracticasCulturalesColectivas3() {
        return practicasCulturalesColectivas3;
    }

    public void setPracticasCulturalesColectivas3(BigInteger practicasCulturalesColectivas3) {
        this.practicasCulturalesColectivas3 = practicasCulturalesColectivas3;
    }

    public BigInteger getPracticasCulturalesColectivas4() {
        return practicasCulturalesColectivas4;
    }

    public void setPracticasCulturalesColectivas4(BigInteger practicasCulturalesColectivas4) {
        this.practicasCulturalesColectivas4 = practicasCulturalesColectivas4;
    }

    public BigInteger getPracticasCulturalesColectivas5() {
        return practicasCulturalesColectivas5;
    }

    public void setPracticasCulturalesColectivas5(BigInteger practicasCulturalesColectivas5) {
        this.practicasCulturalesColectivas5 = practicasCulturalesColectivas5;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getIdentificacionAgente() {
        return identificacionAgente;
    }

    public void setIdentificacionAgente(String identificacionAgente) {
        this.identificacionAgente = identificacionAgente;
    }

    public BigInteger getIdUsuarioCarga() {
        return idUsuarioCarga;
    }

    public void setIdUsuarioCarga(BigInteger idUsuarioCarga) {
        this.idUsuarioCarga = idUsuarioCarga;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCargaVivienda != null ? idCargaVivienda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CargaVivienda)) {
            return false;
        }
        CargaVivienda other = (CargaVivienda) object;
        if ((this.idCargaVivienda == null && other.idCargaVivienda != null) || (this.idCargaVivienda != null && !this.idCargaVivienda.equals(other.idCargaVivienda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sinchronize.entities.CargaVivienda[ idCargaVivienda=" + idCargaVivienda + " ]";
    }
    
}
