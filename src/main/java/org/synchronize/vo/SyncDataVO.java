/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.synchronize.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;


/**
 *
 * @author 57315
 */
public class SyncDataVO implements Serializable{
    
    private Long id;
    
    private Long web_id;

    private String codigo;    
   
    private String direccion;
    
    private String coordenada;
    
    private Long encuestador;
    
    private Double coordenada_x;
    
    private Double coordenada_y;
    
    private Integer estado;
    
    private Long idZonaCuidadoBarVer;
    
    private List<ZonaCuidadoBarVerVO> zonaCuidadoBarVer;
    
    private List<NucleoViviendaVO> nucleoVivienda;
    
    private List<PersonaVO> personas;
    
    private String fechaActividad;
    
    private String fechaCreacion;
    
    
    

    public String getCodigo() {
        return codigo;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public String getCoordenada() {
        return coordenada;
    }

    
    public void setCoordenada(String coordenada) {
        this.coordenada = coordenada;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getEncuestador() {
        return encuestador;
    }

    
    public void setEncuestador(Long encuestador) {
        this.encuestador = encuestador;
    }


    public Double getCoordenada_x() {
        return coordenada_x;
    }

    
    public void setCoordenada_x(Double coordenada_x) {
        this.coordenada_x = coordenada_x;
    }

    public Double getCoordenada_y() {
        return coordenada_y;
    }

    
    public void setCoordenada_y(Double coordenada_y) {
        this.coordenada_y = coordenada_y;
    }


    public List<ZonaCuidadoBarVerVO> getZonaCuidadoBarVer() {
        return zonaCuidadoBarVer;
    }

    
    public void setZonaCuidadoBarVer(List<ZonaCuidadoBarVerVO> zonaCuidadoBarVer) {
        this.zonaCuidadoBarVer = zonaCuidadoBarVer;
    }

    public List<NucleoViviendaVO> getNucleoVivienda() {
        return nucleoVivienda;
    }

    
    public void setNucleoVivienda(List<NucleoViviendaVO> nucleoVivienda) {
        this.nucleoVivienda = nucleoVivienda;
    }

    
    public Long getIdZonaCuidadoBarVerVO() {
        return idZonaCuidadoBarVer;
    }

    
    public void setIdZonaCuidadoBarVerVO(Long idZonaCuidadoBarVerVO) {
        this.idZonaCuidadoBarVer = idZonaCuidadoBarVerVO;
    }

   
    public Integer getEstado() {
        return estado;
    }

    
    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Long getIdZonaCuidadoBarVer() {
        return idZonaCuidadoBarVer;
    }

    public void setIdZonaCuidadoBarVer(Long idZonaCuidadoBarVer) {
        this.idZonaCuidadoBarVer = idZonaCuidadoBarVer;
    }

    public String getFechaActividad() {
        return fechaActividad;
    }

    public void setFechaActividad(String fechaActividad) {
        this.fechaActividad = fechaActividad;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public List<PersonaVO> getPersonas() {
        return personas;
    }

    public void setPersonas(List<PersonaVO> personas) {
        this.personas = personas;
    }  

    public Long getWeb_id() {
        return web_id;
    }

    public void setWeb_id(Long web_id) {
        this.web_id = web_id;
    }
    
    
}
