/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.synchronize.vo;

import java.io.Serializable;
import java.util.List;
import lombok.Data;

/**
 *
 * @author 57315
 */
//@Data
public class ResponseNucleoVO implements Serializable{
    private Long webId;
    private Long movilId;
    private List<ResponsePersonaVO> responsePersonaVO;

    public Long getWebId() {
        return webId;
    }

    public void setWebId(Long webId) {
        this.webId = webId;
    }

    public Long getMovilId() {
        return movilId;
    }

    public void setMovilId(Long movilId) {
        this.movilId = movilId;
    }

    public List<ResponsePersonaVO> getResponsePersonaVO() {
        return responsePersonaVO;
    }

    public void setResponsePersonaVO(List<ResponsePersonaVO> responsePersonaVO) {
        this.responsePersonaVO = responsePersonaVO;
    }
    
    
}
