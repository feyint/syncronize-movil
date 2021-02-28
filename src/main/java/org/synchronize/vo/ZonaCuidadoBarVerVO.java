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
public class ZonaCuidadoBarVerVO implements Serializable{
    private Long id;
    private Long idZonaCuidadado;
    private Long idBarVer;

    public Long getId() {
        return id;
    }
    
    @JsonProperty("ID")
    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdZonaCuidadado() {
        return idZonaCuidadado;
    }

    @JsonProperty("FUCZONCUI_ID")
    public void setIdZonaCuidadado(Long idZonaCuidadado) {
        this.idZonaCuidadado = idZonaCuidadado;
    }

    public Long getIdBarVer() {
        return idBarVer;
    }

    @JsonProperty("FUCBARVER_ID")
    public void setIdBarVer(Long idBarVer) {
        this.idBarVer = idBarVer;
    }
    
    
    
    
}
