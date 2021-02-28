/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.synchronize.controllers;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.synchronize.entities.CargaMovil;
import org.synchronize.services.SyncService;
import org.synchronize.vo.InitSyncroVO;
import org.synchronize.vo.ResponseVO;
import org.synchronize.entities.Fububiviv;
import org.synchronize.entities.FuczoncuiFucbarver;
import org.synchronize.entities.Fvbencues;
import org.synchronize.services.CargaMovilService;

/**
 *
 * @author Eduar Orozco
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/syncro")
public class SyncController {

    @Autowired
    private SyncService syncService;

    @Autowired
    private CargaMovilService cargaMovilService;
    
    /**
     *
     * @param datos
     * @return
     * @throws IOException
     */
    @PostMapping("/todo")
    public ResponseVO syncFicha(
            //@RequestParam("indice") MultipartFile[] indice, 
            @RequestParam(value = "datos") String datos
    ) throws IOException {

        ResponseVO result = syncService.syncFicha(datos);

        return result;
    }


    @GetMapping("/test")
    public String test() {
        return "Test";
    }
    
    
    /**
     * 
     * @param initSyncroVO
     * @return
     * @throws ParseException 
     */
    @RequestMapping(value = "/init", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public CargaMovil initSincro(
            @RequestBody InitSyncroVO initSyncroVO
    )  throws ParseException {
        return syncService.inicializarCarga(initSyncroVO);
    }
    
    /**
     * 
     * @param id
     * @return 
     */
    @GetMapping("/testUbi/{id}")
    public Fububiviv testUbi( @PathVariable(name = "id") final Long id) {
        return syncService.traerFububiviv(id);
    }
    
    /**
     * 
     * @param id
     * @return 
     */
    @GetMapping("/testUbi1/{id}")
    public FuczoncuiFucbarver testUbi1( @PathVariable(name = "id") final Long id) {
        return syncService.traerFuczoncuiFucbarver(id);
    }
    
    /**
     * 
     * @param id
     * @return 
     */
    @GetMapping("/testUbi2/{id}")
    public Fvbencues testUbi2( @PathVariable(name = "id") final Long id) {
        return syncService.traerFvbencues(id);
    }
    
    
    @GetMapping("/testpwa")
    public List<CargaMovil> testpwa() {
        return cargaMovilService.testpwa();
    }
 
    @GetMapping("/codigo")
    public String codigoUbicacionVivienda(){        
        //return syncService.codigoUbicacionVivienda();
        return "test";
    }
}
