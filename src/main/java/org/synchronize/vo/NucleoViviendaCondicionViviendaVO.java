/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.synchronize.vo;

import java.io.Serializable;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author 57315
 */
public class NucleoViviendaCondicionViviendaVO implements Serializable{
    
    private Integer id;
    private Long idNucleoVivienda;
    private Long idEmementoVivienda;
    private Long idCondicionVivienda;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getIdNucleoVivienda() {
        return idNucleoVivienda;
    }

    @JsonProperty("FNBNUCVIV_ID")
    public void setIdNucleoVivienda(Long idNucleoVivienda) {
        this.idNucleoVivienda = idNucleoVivienda;
    }

    public Long getIdEmementoVivienda() {
        return idEmementoVivienda;
    }

    @JsonProperty("FVCELEVIV_ID")
    public void setIdEmementoVivienda(Long idEmementoVivienda) {
        this.idEmementoVivienda = idEmementoVivienda;
    }

    public Long getIdCondicionVivienda() {
        return idCondicionVivienda;
    }

    @JsonProperty("FVCCONVIV_ID")
    public void setIdCondicionVivienda(Long idCondicionVivienda) {
        this.idCondicionVivienda = idCondicionVivienda;
    }
    
    
    
}