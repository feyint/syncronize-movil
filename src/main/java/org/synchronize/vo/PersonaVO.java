/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.synchronize.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author 57315
 */
public class PersonaVO implements Serializable{
    
    private Long id;
    private Long web_id;
    private String codigo;
    private String identificacion;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private Date fechaNacimiento;
    private String telCelular;
    private String telAlterno;
    private String correoElectronico;
    private Long tipoIde;
    private Long organizacion;
    private Long lunaIndigena;
    private Long ocupacion;
    private Long municipio;
    private Long parentesco;
    private Long genero;
    private Long puebloIndigena;
    private Long encuestador;    
    private List<InformacionSaludVO> informacionSalud;
    private List<InformacionSaludReproductivaVO> saludReproductiva;
    private Integer estado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    @JsonProperty("")
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    @JsonProperty("")
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    @JsonProperty("")
    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    @JsonProperty("")
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    @JsonProperty("")
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    @JsonProperty("")
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelCelular() {
        return telCelular;
    }

    @JsonProperty("")
    public void setTelCelular(String telCelular) {
        this.telCelular = telCelular;
    }

    public String getTelAlterno() {
        return telAlterno;
    }

    @JsonProperty("")
    public void setTelAlterno(String telAlterno) {
        this.telAlterno = telAlterno;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    @JsonProperty("")
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Long getTipoIde() {
        return tipoIde;
    }

    @JsonProperty("")
    public void setTipoIde(Long tipoIde) {
        this.tipoIde = tipoIde;
    }

    public Long getOrganizacion() {
        return organizacion;
    }

    @JsonProperty("")
    public void setOrganizacion(Long organizacion) {
        this.organizacion = organizacion;
    }

    public Long getLunaIndigena() {
        return lunaIndigena;
    }

    @JsonProperty("")
    public void setLunaIndigena(Long lunaIndigena) {
        this.lunaIndigena = lunaIndigena;
    }

    public Long getOcupacion() {
        return ocupacion;
    }

    @JsonProperty("")
    public void setOcupacion(Long ocupacion) {
        this.ocupacion = ocupacion;
    }

    public Long getMunicipio() {
        return municipio;
    }

    @JsonProperty("")
    public void setMunicipio(Long municipio) {
        this.municipio = municipio;
    }

    public Long getParentesco() {
        return parentesco;
    }

    @JsonProperty("")
    public void setParentesco(Long parentesco) {
        this.parentesco = parentesco;
    }

    public Long getGenero() {
        return genero;
    }

    @JsonProperty("")
    public void setGenero(Long genero) {
        this.genero = genero;
    }

    public Long getPuebloIndigena() {
        return puebloIndigena;
    }

    @JsonProperty("")
    public void setPuebloIndigena(Long puebloIndigena) {
        this.puebloIndigena = puebloIndigena;
    }

    public Long getEncuestador() {
        return encuestador;
    }

    @JsonProperty("")
    public void setEncuestador(Long encuestador) {
        this.encuestador = encuestador;
    }

    public List<InformacionSaludVO> getInformacionSalud() {
        return informacionSalud;
    }

    @JsonProperty("")
    public void setInformacionSalud(List<InformacionSaludVO> informacionSalud) {
        this.informacionSalud = informacionSalud;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    @JsonProperty("")
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }    

    public List<InformacionSaludReproductivaVO> getSaludReproductiva() {
        return saludReproductiva;
    }

    public void setSaludReproductiva(List<InformacionSaludReproductivaVO> saludReproductiva) {
        this.saludReproductiva = saludReproductiva;
    }

    public Long getWeb_id() {
        return web_id;
    }

    public void setWeb_id(Long web_id) {
        this.web_id = web_id;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    
    
}
