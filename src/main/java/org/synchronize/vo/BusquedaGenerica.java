package org.synchronize.vo;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonProperty;

public class BusquedaGenerica implements Serializable {

	private static final long serialVersionUID = 1L;

	// Atributos para validaciones relacionadas al comportamiento de la consulta
	private Map<String, Object> filtros;
	private List<String> camposSeleccionados;
	private List<String> camposBusqueda;
	private List<String> camposResultado;
	private List<Object> infoCampos;

	// Banderas para validaciones de forma
	private String campoOrdenamiento;
	private Boolean aplicaOrdenamiento;
	private Boolean soloActivos;
        
	private Boolean buscaTodos;

	// Parámetros de paginaciósn
	private Long page;
	private Long maxResults;

	// Parametros para busqueda de catalogos
	private String nombreEntidad;

	// Parametros para busqueda en relaciones intermedias
	private List<String> entidadesRelacionadas;

	public BusquedaGenerica() {
		// Constructor por defecto
	}

	public BusquedaGenerica(final List<String> camposSeleccionados, final List<String> camposBusqueda,
			final List<Object> infoCampos, final String nombreEntidad) {
		this.camposSeleccionados = camposSeleccionados;
		this.camposBusqueda = camposBusqueda;
		this.infoCampos = infoCampos;
		this.nombreEntidad = nombreEntidad;
	}

	public Map<String, Object> getFiltros() {
		return filtros;
	}

	public void setFiltros(final Map<String, Object> filtros) {
		this.filtros = filtros;
	}

	@JsonProperty("camposSeleccionados")
	public List<String> getCamposSeleccionados() {
		return camposSeleccionados;
	}

	public void setCamposSeleccionados(List<String> camposSeleccionados) {
		this.camposSeleccionados = camposSeleccionados;
	}

	@JsonProperty("camposBusqueda")
	public List<String> getCamposBusqueda() {
		return camposBusqueda;
	}

	public void setCamposBusqueda(final List<String> camposBusqueda) {
		this.camposBusqueda = camposBusqueda;
	}

	@JsonProperty("camposResultado")
	public List<String> getCamposResultado() {
		return camposResultado;
	}

	public void setCamposResultado(final List<String> camposResultado) {
		this.camposResultado = camposResultado;
	}

	@JsonProperty("infoCampos")
	public List<Object> getInfoCampos() {
		return infoCampos;
	}

	public void setInfoCampos(final List<Object> infoCampos) {
		this.infoCampos = infoCampos;
	}

	@JsonProperty("campoOrdenamiento")
	public String getCampoOrdenamiento() {
		return campoOrdenamiento;
	}

	public void setCampoOrdenamiento(final String campoOrdenamiento) {
		this.campoOrdenamiento = campoOrdenamiento;
	}

	@JsonProperty("aplicaOrdenamiento")
	public Boolean getAplicaOrdenamiento() {
		return aplicaOrdenamiento;
	}

	public void setAplicaOrdenamiento(final Boolean aplicaOrdenamiento) {
		this.aplicaOrdenamiento = aplicaOrdenamiento;
	}

	@JsonProperty("soloActivos")
	public Boolean getSoloActivos() {
		return soloActivos;
	}

	public void setSoloActivos(final Boolean soloActivos) {
		this.soloActivos = soloActivos;
	}

	@JsonProperty("page")
	public Long getPage() {
		return page;
	}

	public void setPage(final Long page) {
		this.page = page;
	}

	@JsonProperty("maxResults")
	public Long getMaxResults() {
		return maxResults;
	}

	public void setMaxResults(final Long maxResults) {
		this.maxResults = maxResults;
	}

	@JsonProperty("nombreEntidad")
	public String getNombreEntidad() {
		return nombreEntidad;
	}

	public void setNombreEntidad(final String nombreEntidad) {
		this.nombreEntidad = nombreEntidad;
	}

	public List<String> getEntidadesRelacionadas() {
		return entidadesRelacionadas;
	}

	@JsonProperty("entidadesRelacionadas")
	public void setEntidadesRelacionadas(final List<String> entidadesRelacionadas) {
		this.entidadesRelacionadas = entidadesRelacionadas;
	}
        
        @JsonProperty("buscaTodos")
	public Boolean getBuscaTodos() {
		return buscaTodos;
	}

	public void setBuscaTodos(final Boolean buscaTodos) {
		this.buscaTodos = buscaTodos;
	}
}