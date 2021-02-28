/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.synchronize.services;

import java.util.List;
import org.synchronize.entities.CargaMovil;

/**
 *
 * @author 57315
 */
public interface CargaMovilService {
    public CargaMovil save(CargaMovil cargaMovil);

    public List<CargaMovil> testpwa();
}
