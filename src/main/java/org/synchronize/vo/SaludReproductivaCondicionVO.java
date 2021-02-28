/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.synchronize.vo;

import java.io.Serializable;

/**
 *
 * @author 57315
 */
public class SaludReproductivaCondicionVO implements Serializable{
    
    private Integer id;
    private Long fncsalrepId;
    private Long fncconrepId;
    private Long fncelerepId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getFncsalrepId() {
        return fncsalrepId;
    }

    public void setFncsalrepId(Long fncsalrepId) {
        this.fncsalrepId = fncsalrepId;
    }

    public Long getFncconrepId() {
        return fncconrepId;
    }

    public void setFncconrepId(Long fncconrepId) {
        this.fncconrepId = fncconrepId;
    }

    public Long getFncelerepId() {
        return fncelerepId;
    }

    public void setFncelerepId(Long fncelerepId) {
        this.fncelerepId = fncelerepId;
    }
    
    
    
}
