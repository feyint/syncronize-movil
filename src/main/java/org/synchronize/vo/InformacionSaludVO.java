/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.synchronize.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author 57315
 */
public class InformacionSaludVO implements Serializable{
    
    private Long id;
    private Long idPersona;
    private Float peso;
    private Float talla;
    private Integer TaSistolica;
    private Integer TaDiastolica;
    private Integer usoProtesis;
    private Integer tiempoProtesis;
    private Date ultimaVisita;
    private Date fechaMuerte;
    private Long interpretacionImc;
    private Long interpretacionTa;
    private Integer estado;
    private List<InformacionSaludDesarmoniaVO> informacionSaludDesarmonia;
    private Long web_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Float getTalla() {
        return talla;
    }

    public void setTalla(Float talla) {
        this.talla = talla;
    }

    public Integer getTaSistolica() {
        return TaSistolica;
    }

    public void setTaSistolica(Integer TaSistolica) {
        this.TaSistolica = TaSistolica;
    }

    public Integer getTaDiastolica() {
        return TaDiastolica;
    }

    public void setTaDiastolica(Integer TaDiastolica) {
        this.TaDiastolica = TaDiastolica;
    }

    public Integer getUsoProtesis() {
        return usoProtesis;
    }

    public void setUsoProtesis(Integer usoProtesis) {
        this.usoProtesis = usoProtesis;
    }

    public Integer getTiempoProtesis() {
        return tiempoProtesis;
    }

    public void setTiempoProtesis(Integer tiempoProtesis) {
        this.tiempoProtesis = tiempoProtesis;
    }

    public Date getUltimaVisita() {
        return ultimaVisita;
    }

    public void setUltimaVisita(Date ultimaVisita) {
        this.ultimaVisita = ultimaVisita;
    }

    public Date getFechaMuerte() {
        return fechaMuerte;
    }

    public void setFechaMuerte(Date fechaMuerte) {
        this.fechaMuerte = fechaMuerte;
    }

    public Long getInterpretacionImc() {
        return interpretacionImc;
    }

    public void setInterpretacionImc(Long interpretacionImc) {
        this.interpretacionImc = interpretacionImc;
    }

    public Long getInterpretacionTa() {
        return interpretacionTa;
    }

    public void setInterpretacionTa(Long interpretacionTa) {
        this.interpretacionTa = interpretacionTa;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public List<InformacionSaludDesarmoniaVO> getInformacionSaludDesarmonia() {
        return informacionSaludDesarmonia;
    }

    public void setInformacionSaludDesarmonia(List<InformacionSaludDesarmoniaVO> informacionSaludDesarmonia) {
        this.informacionSaludDesarmonia = informacionSaludDesarmonia;
    }

    public Long getWeb_id() {
        return web_id;
    }

    public void setWeb_id(Long web_id) {
        this.web_id = web_id;
    }
    
    
    
}
