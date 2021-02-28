/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.synchronize.vo;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author 57315
 */
public class InformacionSaludReproductivaVO implements Serializable {

    private Long id;
    private Integer edadPrimeraRegla;
    private Integer gravidez;
    private Integer paridez;
    private Integer aborto;
    private String cesarea;
    private Integer nacidosVivos;
    private Integer nacidosMuertos;
    private String partoUltimo;
    private String ultimaRegla;
    private String edadGestacion;
    private String partoEstimado;
    private Integer presenciaFam;
    private Integer serologia;
    private Integer vih;
    private String resulCitologia;
    private Integer accionCitologia;
    private String resulProstata;
    private String accionProstata;

    private List<SaludReproductivaCondicionVO> saludReproductivaCondicion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getEdadPrimeraRegla() {
        return edadPrimeraRegla;
    }

    public void setEdadPrimeraRegla(Integer edadPrimeraRegla) {
        this.edadPrimeraRegla = edadPrimeraRegla;
    }

    public Integer getGravidez() {
        return gravidez;
    }

    public void setGravidez(Integer gravidez) {
        this.gravidez = gravidez;
    }

    public Integer getParidez() {
        return paridez;
    }

    public void setParidez(Integer paridez) {
        this.paridez = paridez;
    }

    public Integer getAborto() {
        return aborto;
    }

    public void setAborto(Integer aborto) {
        this.aborto = aborto;
    }

    public String getCesarea() {
        return cesarea;
    }

    public void setCesarea(String cesarea) {
        this.cesarea = cesarea;
    }

    public Integer getNacidosVivos() {
        return nacidosVivos;
    }

    public void setNacidosVivos(Integer nacidosVivos) {
        this.nacidosVivos = nacidosVivos;
    }

    public Integer getNacidosMuertos() {
        return nacidosMuertos;
    }

    public void setNacidosMuertos(Integer nacidosMuertos) {
        this.nacidosMuertos = nacidosMuertos;
    }

    public String getPartoUltimo() {
        return partoUltimo;
    }

    public void setPartoUltimo(String partoUltimo) {
        this.partoUltimo = partoUltimo;
    }

    public String getUltimaRegla() {
        return ultimaRegla;
    }

    public void setUltimaRegla(String ultimaRegla) {
        this.ultimaRegla = ultimaRegla;
    }

    public String getEdadGestacion() {
        return edadGestacion;
    }

    public void setEdadGestacion(String edadGestacion) {
        this.edadGestacion = edadGestacion;
    }

    public String getPartoEstimado() {
        return partoEstimado;
    }

    public void setPartoEstimado(String partoEstimado) {
        this.partoEstimado = partoEstimado;
    }

    public Integer getPresenciaFam() {
        return presenciaFam;
    }

    public void setPresenciaFam(Integer presenciaFam) {
        this.presenciaFam = presenciaFam;
    }

    public Integer getSerologia() {
        return serologia;
    }

    public void setSerologia(Integer serologia) {
        this.serologia = serologia;
    }

    public Integer getVih() {
        return vih;
    }

    public void setVih(Integer vih) {
        this.vih = vih;
    }

    public String getResulCitologia() {
        return resulCitologia;
    }

    public void setResulCitologia(String resulCitologia) {
        this.resulCitologia = resulCitologia;
    }

    public Integer getAccionCitologia() {
        return accionCitologia;
    }

    public void setAccionCitologia(Integer accionCitologia) {
        this.accionCitologia = accionCitologia;
    }

    public String getResulProstata() {
        return resulProstata;
    }

    public void setResulProstata(String resulProstata) {
        this.resulProstata = resulProstata;
    }

    public String getAccionProstata() {
        return accionProstata;
    }

    public void setAccionProstata(String accionProstata) {
        this.accionProstata = accionProstata;
    }

    public List<SaludReproductivaCondicionVO> getSaludReproductivaCondicion() {
        return saludReproductivaCondicion;
    }

    public void setSaludReproductivaCondicion(List<SaludReproductivaCondicionVO> saludReproductivaCondicion) {
        this.saludReproductivaCondicion = saludReproductivaCondicion;
    }

}
