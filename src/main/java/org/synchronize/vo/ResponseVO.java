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
public class ResponseVO implements Serializable{    
    private Long webId;
    private Boolean error;
    private String message;    
    private Long movilId;
    private List<ResponseNucleoVO> responseNucleoVO;

    public Long getWebId() {
        return webId;
    }

    public void setWebId(Long webId) {
        this.webId = webId;
    }

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getMovilId() {
        return movilId;
    }

    public void setMovilId(Long movilId) {
        this.movilId = movilId;
    }

    public List<ResponseNucleoVO> getResponseNucleoVO() {
        return responseNucleoVO;
    }

    public void setResponseNucleoVO(List<ResponseNucleoVO> responseNucleoVO) {
        this.responseNucleoVO = responseNucleoVO;
    }
    
    
    
}
