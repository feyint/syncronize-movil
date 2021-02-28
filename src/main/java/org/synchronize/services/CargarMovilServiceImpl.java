/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.synchronize.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.synchronize.entities.CargaMovil;
import org.synchronize.repositories.CargaMovilRepository;

/**
 *
 * @author 57315
 */
@Service
public class CargarMovilServiceImpl implements CargaMovilService{

    @Autowired
    private CargaMovilRepository cargaMovilRepository;
    
    @Override
    @Transactional
    (propagation=Propagation.REQUIRES_NEW)
    public CargaMovil save(CargaMovil cargaMovil) {
        return cargaMovilRepository.save(cargaMovil);
    }

    @Override
    public List<CargaMovil> testpwa() {
        return cargaMovilRepository.findAll();
    }
    
}
