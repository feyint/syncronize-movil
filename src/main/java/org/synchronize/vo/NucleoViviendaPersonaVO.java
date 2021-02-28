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
public class NucleoViviendaPersonaVO implements Serializable{
    
    private Integer idNucleoVivienda;
    private Long idPersona;
    
    private List<PersonaVO> persona;
    

    public Integer getIdNucleoVivienda() {
        return idNucleoVivienda;
    }

    @JsonProperty("FNBNUCVIV_ID")
    public void setIdNucleoVivienda(Integer idNucleoVivienda) {
        this.idNucleoVivienda = idNucleoVivienda;
    }
  

    public Long getIdPersona() {
        return idPersona;
    }

    @JsonProperty("FNCPERSON_ID")
    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }  
    
    
}