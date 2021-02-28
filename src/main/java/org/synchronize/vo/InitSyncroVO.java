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
 * @author EDUAR OROZCO
 */
@Data
public class InitSyncroVO implements Serializable{
    private String user;
    private List<InitSyncroDetalleVO> detalle;       
}
