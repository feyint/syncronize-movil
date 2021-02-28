/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.synchronize.vo;

import java.io.Serializable;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author 57315
 */
public class NucleoViviendaVO implements Serializable{
    
    private Long id;
    private String codigo;
    private Integer humo_casa;
    private Integer residuo_bor;
    private Integer residuo_peligroso;
    private Integer animal_vacunado;
    private Integer animal_novacunado;
    private Integer riesgo;
    private String observacion;
    private Integer lugar_cocina;
    private Integer humo_dentro;
    private Integer acceso_internet;
    private Long idNucleoVivienda;
    private Long web_id;
    private Integer estado;
        
    private List<NucleoViviendaCondicionViviendaVO> nucleoViviendaCondicionVivienda;
    private List<NucleoViviendaPersonaVO> nucleoViviendaPersona;
    private List<PersonaVO> persona;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getHumo_casa() {
        return humo_casa;
    }


    public void setHumo_casa(Integer humo_casa) {
        this.humo_casa = humo_casa;
    }

    public Integer getResiduo_bor() {
        return residuo_bor;
    }


    public void setResiduo_bor(Integer residuo_bor) {
        this.residuo_bor = residuo_bor;
    }

    public Integer getResiduo_peligroso() {
        return residuo_peligroso;
    }


    public void setResiduo_peligroso(Integer residuo_peligroso) {
        this.residuo_peligroso = residuo_peligroso;
    }

    public Integer getAnimal_vacunado() {
        return animal_vacunado;
    }


    public void setAnimal_vacunado(Integer animal_vacunado) {
        this.animal_vacunado = animal_vacunado;
    }

    public Integer getAnimal_novacunado() {
        return animal_novacunado;
    }


    public void setAnimal_novacunado(Integer animal_novacunado) {
        this.animal_novacunado = animal_novacunado;
    }

    public Integer getRiesgo() {
        return riesgo;
    }


    public void setRiesgo(Integer riesgo) {
        this.riesgo = riesgo;
    }

    public String getObservacion() {
        return observacion;
    }


    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Integer getLugar_cocina() {
        return lugar_cocina;
    }


    public void setLugar_cocina(Integer lugar_cocina) {
        this.lugar_cocina = lugar_cocina;
    }

    public Integer getHumo_dentro() {
        return humo_dentro;
    }


    public void setHumo_dentro(Integer humo_dentro) {
        this.humo_dentro = humo_dentro;
    }

    public Integer getAcceso_internet() {
        return acceso_internet;
    }


    public void setAcceso_internet(Integer acceso_internet) {
        this.acceso_internet = acceso_internet;
    }

    public List<NucleoViviendaCondicionViviendaVO> getNucleoViviendaCondicionVivienda() {
        return nucleoViviendaCondicionVivienda;
    }


    public void setNucleoViviendaCondicionVivienda(List<NucleoViviendaCondicionViviendaVO> nucleoViviendaCondicionVivienda) {
        this.nucleoViviendaCondicionVivienda = nucleoViviendaCondicionVivienda;
    }

    public List<NucleoViviendaPersonaVO> getNucleoViviendaPersona() {
        return nucleoViviendaPersona;
    }


    public void setNucleoViviendaPersona(List<NucleoViviendaPersonaVO> nucleoViviendaPersona) {
        this.nucleoViviendaPersona = nucleoViviendaPersona;
    }

    public List<PersonaVO> getPersonaVO() {
        return persona;
    }

    public void setPersonaVO(List<PersonaVO> persona) {
        this.persona = persona;
    }

    public Long getIdNucleoVivienda() {
        return idNucleoVivienda;
    }

    public void setIdNucleoVivienda(Long idNucleoVivienda) {
        this.idNucleoVivienda = idNucleoVivienda;
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
