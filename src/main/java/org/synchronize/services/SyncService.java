/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.synchronize.services;

import org.synchronize.entities.CargaMovil;
import org.synchronize.entities.Fububiviv;
import org.synchronize.entities.FuczoncuiFucbarver;
import org.synchronize.entities.Fvbencues;
import org.synchronize.vo.InitSyncroVO;
import org.synchronize.vo.ResponseVO;


/**
 *
 * @author EDUAR OROZCO
 */

public interface SyncService{
    public ResponseVO syncFicha(String data);
    
    public CargaMovil inicializarCarga(String user);

    public CargaMovil inicializarCarga(InitSyncroVO initSyncroVO);

    public Fububiviv traerFububiviv(Long id);

    public FuczoncuiFucbarver traerFuczoncuiFucbarver(Long id);

    public Fvbencues traerFvbencues(Long id);

   // public String codigoUbicacionVivienda();

    
}
