/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.synchronize.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.synchronize.entities.CargaMovil;

/**
 *
 * @author 57315
 */
public interface CargaMovilRepository extends JpaRepository<CargaMovil, Long> {
    
}
