package org.synchronize.controllers;

import java.util.List;
import org.synchronize.repositories.ComunRepository;
import org.synchronize.vo.BusquedaGenerica;
import org.synchronize.vo.EntidadValidator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMethod;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/common")
public class CommonController {

              
       
        @Autowired
	private ComunRepository comunRepository;
        
	@RequestMapping(value = "/buscar", method = RequestMethod.POST)
	public ResponseEntity<? extends List<?>> buscar(@RequestBody BusquedaGenerica bg) {          
            
		if (bg != null) {
			final List<?> lista;
                        lista = comunRepository.buscar(bg);
			return new ResponseEntity(lista, HttpStatus.OK);
		} else {
			//return ResponseEntity.notFound().build();
                        return ResponseEntity.notFound().build();
		}
	}
        
        
         @RequestMapping(value = "/buscar_rel", method = RequestMethod.POST)
        public ResponseEntity<? extends List<?>> buscarRel(@RequestBody BusquedaGenerica bg) {
            if (bg != null) {
                final List<?> lista;
                lista = comunRepository.buscarConFiltrosCruce(bg);
                return ResponseEntity.ok(lista);
            } else {
                return ResponseEntity.notFound().build();
            }
        }

	@RequestMapping(value = "/get/{nombreCatalogo}", method = RequestMethod.GET)
	public ResponseEntity<? extends List<?>> buscarCatalogo(
			@PathVariable(name = "nombreCatalogo") final String nombreCatalogo) {
		final List<?> lista;
		lista = comunRepository.obtenerCatalogo(nombreCatalogo);
		return ResponseEntity.ok(lista);
	}


	@RequestMapping(value = "/{entidad}/guardar", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public <T> ResponseEntity<?> save(@PathVariable(name = "entidad") final String nombreEntidad, @RequestBody final T entidad) {
		final Object respuesta = comunRepository.merge(nombreEntidad, entidad);
		if (respuesta != null) {
			return ResponseEntity.ok(respuesta);
		} else {
			final StringBuilder sb = new StringBuilder("Ocurrió un error al guardar la entidad: ").append(nombreEntidad);
			return new ResponseEntity<>(sb.toString(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "/{entidad}/guardarPorCampo", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public <T> ResponseEntity<?> savePorCampoUnico(@PathVariable(name = "entidad") final String nombreEntidad,
			@RequestBody final EntidadValidator<T> entidadValidator) {
		final Object respuesta = comunRepository.guardarPorCampoUnico(nombreEntidad, entidadValidator);
		if (respuesta != null) {
			return ResponseEntity.ok(respuesta);
		} else {
			final StringBuilder sb = new StringBuilder("Ya existe un").append(" ").append(nombreEntidad).append(" ")
					.append("con el mismo").append(" ").append(entidadValidator.getCampoValidacion());
			return new ResponseEntity<String>(sb.toString(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
        
        @RequestMapping(value = "/{entidad}/validarPorCampo", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public <T> ResponseEntity<?> validarPorCampoUnico(@PathVariable(name = "entidad") final String nombreEntidad,
			@RequestBody final EntidadValidator<T> entidadValidator) {
		final Object respuesta = comunRepository.validarPorCampoUnico(nombreEntidad, entidadValidator);
		if (respuesta != null) {
			
                    return ResponseEntity.ok(respuesta);
                        /*final StringBuilder sb = new StringBuilder("Ya existe un").append(" ").append(nombreEntidad).append(" ")
					.append("con el mismo").append(" ").append(entidadValidator.getCampoValidacion()).append(respuesta);
			return new ResponseEntity<String>(sb.toString(), HttpStatus.INTERNAL_SERVER_ERROR);*/
		} else {
			return null;
		}
	}

	@RequestMapping(value = "/{entidad}/actualizar", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public <T> ResponseEntity<?> update(@PathVariable(name = "entidad") final String nombreEntidad, @RequestBody final T entidad) {
		final Object respuesta = comunRepository.merge(nombreEntidad, entidad);
		if (respuesta != null) {
			return ResponseEntity.ok(respuesta);
		} else {
			final StringBuilder sb = new StringBuilder("Ocurrió un error al actualizar la entidad: ").append(nombreEntidad);
			return new ResponseEntity<String>(sb.toString(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "{entidad}/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public <T> ResponseEntity<List<T>> getAll(@PathVariable(name = "entidad") final String nombreEntidad) {
		final List<T> lista = comunRepository.getAll(nombreEntidad);
		return ResponseEntity.ok(lista);
	}

	@RequestMapping(value = "{entidad}/activos", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<? extends List<?>> getActivos(@PathVariable(name = "entidad") final String nombreEntidad) {
		final List<?> lista = comunRepository.getActivos(nombreEntidad);
		return ResponseEntity.ok(lista);
	}

	@RequestMapping(value = "/{entidad}/get/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public <T> T getById(@PathVariable(name = "entidad") final String nombreEntidad,
			@PathVariable(name = "id") final Long id) {
		return comunRepository.getById(nombreEntidad, id);
	}
        
        @RequestMapping(value = "/{entidad}/validac/{codigo}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public <T> T getByCodigo(@PathVariable(name = "entidad") final String nombreEntidad,
			@PathVariable(name = "codigo") final String codigo) {
		return comunRepository.getByCodigo(nombreEntidad, codigo);
	}

	@RequestMapping(value = "{entidad}/eliminar/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(name = "entidad") final String nombreEntidad,
			@PathVariable(name = "id") final Long id) {
		comunRepository.delete(nombreEntidad, id);
	}

	@RequestMapping(value = "{entidad}/activar/{id}", method = RequestMethod.PUT)
	public void activar(@PathVariable(name = "entidad") final String nombreEntidad,
			@PathVariable(name = "id") final Long id) {
		comunRepository.activar(nombreEntidad, id);
	}

	@RequestMapping(value = "{entidad}/inactivar/{id}", method = RequestMethod.PUT)
	public void inactivar(@PathVariable(name = "entidad") final String nombreEntidad,
			@PathVariable(name = "id") final Long id) {
		comunRepository.inactivar(nombreEntidad, id);
	}
        
        @RequestMapping(value = "/contar/{entidad}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Long contar(@PathVariable(name = "entidad") final String nombreEntidad
			) {
		return comunRepository.getCantidadRegistros(nombreEntidad);
	}
        


}
