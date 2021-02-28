/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.synchronize.repositories;
import java.util.List;
import org.synchronize.vo.BusquedaGenerica;
import org.synchronize.vo.EntidadValidator;




/**
 *
 * @author comfa
 */
public interface ComunRepository {

	<T> List<T> buscar(BusquedaGenerica bg);

	<T> List<T> obtenerCatalogo(String nombreCatalogo);

	<T> Long getCantidadRegistros(final String nombreEntidad);

	<T> T merge(final String nombreEntidad, final T entidad);

	<T> T guardarPorCampoUnico(final String nombreEntidad, final EntidadValidator<T> entidadValidator);

	<T> List<T> getAll(final String entidad);

	<T> List<T> getActivos(final String entidad);

	<T> T getById(final String entidad, final Long id);
        
        <T> T getByCodigo(final String entidad, final String codigo);

	<T> T getByCampo(final String entidad, final String campo, final Object valor);

	<T> void delete(final String entidad, final Long id);

	<T> void activar(final String entidad, final Long id);

	<T> void inactivar(final String entidad, final Long id);
        
        <T> List<T> buscarConFiltrosCruce(BusquedaGenerica bg);

        public <T> T validarPorCampoUnico(String nombreEntidad, EntidadValidator<T> entidadValidator);

}
