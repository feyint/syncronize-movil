/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.synchronize.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.synchronize.entities.FnbnucvivFncperson;

/**
 *
 * @author 57315
 */
public interface FnbnucvivFncpersonRepository extends JpaRepository<FnbnucvivFncperson, Long> {
    
    @Query("select np from FnbnucvivFncperson np where np.fnbnucvivId.id = :idNucleo and np.fncpersonId.id = :idPersona")
    public FnbnucvivFncperson validarPersonaNucleo(Long idNucleo, Long idPersona);
}
