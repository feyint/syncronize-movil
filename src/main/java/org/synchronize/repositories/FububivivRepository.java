/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.synchronize.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.synchronize.entities.Fububiviv;

/**
 *
 * @author 57315
 */
public interface FububivivRepository extends JpaRepository<Fububiviv, Long> {

    @Modifying
    @Query("update Fububiviv f set f.codigo= :codigo where f.id = :id")
    public void asignarCodigo(String codigo, Long id);
    
}
