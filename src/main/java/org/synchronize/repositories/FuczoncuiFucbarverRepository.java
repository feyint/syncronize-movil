/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.synchronize.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.synchronize.entities.FuczoncuiFucbarver;
import org.synchronize.entities.Fucresgua;
import org.synchronize.entities.Fuctipter;

/**
 *
 * @author 57315
 */
public interface FuczoncuiFucbarverRepository extends JpaRepository<FuczoncuiFucbarver, Long> {
    
    /*
    @Query("SELECT r FROM FuczoncuiFucbarver z INNER JOIN z.fucbarverId fbv INNER JOIN fbv.fucresguaId r WHERE z.id = :id")
    public Fucresgua findFuczoncuiFucbarver(Long id);
    
   
    */
    
    @Query("SELECT tt FROM FuctipterFucresgua z INNER JOIN z.fuctipterId tt WHERE z.fucresguaId.id = :id")
    public Fuctipter findFuctipter(Long id);
    
    @Query(value="SELECT FUCTIPTER.CODIGO FROM FUCTIPTER" +
        " INNER JOIN FUCTIPTER_FUCRESGUA ON FUCTIPTER.ID = FUCTIPTER_FUCRESGUA.FUCTIPTER_ID" +
        " WHERE FUCTIPTER_FUCRESGUA.FUCRESGUA_ID =  :id", nativeQuery = true)
    public String findTipoTerritorio(Long id);
    
    
    @Query(value="select fucresgua.CODIGO from fucresgua where fucresgua.id = :id", nativeQuery = true)
    public String findResguardoCodigo(Long id);
    
    
    @Query(value=" SELECT FUCRESGUA.ID FROM FUCRESGUA" +
        " INNER JOIN FUCBARVER ON FUCRESGUA.ID = FUCBARVER.FUCRESGUA_ID" +
        " INNER JOIN FUCZONCUI_FUCBARVER  ON FUCBARVER.ID = FUCZONCUI_FUCBARVER.FUCBARVER_ID" +
        " WHERE FUCZONCUI_FUCBARVER.ID = :id", nativeQuery = true)
    public Long findResguardoId(Long id);
    
    @Query("select f from Fucresgua f where f.id=:id")
    public Fucresgua findResguardo(Long id);
    
}
