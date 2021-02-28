/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.synchronize.vo;

import lombok.Data;

/**
 *
 * @author 57315
 */
//@Data
public class ResponsePersonaVO {
    private Long webId;
    private Long movilId;
    private ResponseInformacionSaludVO responseInformacionSaludVO;

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

    public ResponseInformacionSaludVO getResponseInformacionSaludVO() {
        return responseInformacionSaludVO;
    }

    public void setResponseInformacionSaludVO(ResponseInformacionSaludVO responseInformacionSaludVO) {
        this.responseInformacionSaludVO = responseInformacionSaludVO;
    }
    
    
}
