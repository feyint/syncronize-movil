package org.synchronize.vo;

import org.codehaus.jackson.annotate.JsonProperty;

public class EntidadValidator<T> {

	private String campoValidacion;
	private Object valor;
	private T entidad;

	public String getCampoValidacion() {
		return campoValidacion;
	}

	@JsonProperty("campoValidacion")
	public void setCampoValidacion(final String campoValidacion) {
		this.campoValidacion = campoValidacion;
	}

	public Object getValor() {
		return valor;
	}

	@JsonProperty("valor")
	public void setValor(final Object valor) {
		this.valor = valor;
	}

	public T getEntidad() {
		return entidad;
	}

	@JsonProperty("entidad")
	public void setEntidad(final T entidad) {
		this.entidad = entidad;
	}
}
