/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.synchronize.services;

import com.google.gson.Gson;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.synchronize.entities.CargaMovil;
import org.synchronize.entities.CargaMovilDetalle;
import org.synchronize.entities.Fnbinfsal;
import org.synchronize.entities.FnbinfsalFncdesarm;
import org.synchronize.entities.Fnbnucviv;
import org.synchronize.entities.FnbnucvivFncperson;
import org.synchronize.entities.FnbnucvivFvcconviv;
import org.synchronize.entities.Fncconrep;
import org.synchronize.entities.Fncdesarm;
import org.synchronize.entities.Fncgenero;
import org.synchronize.entities.Fncintimc;
import org.synchronize.entities.Fncinttea;
import org.synchronize.entities.Fnclunind;
import org.synchronize.entities.Fncocupac;
import org.synchronize.entities.Fncorgani;
import org.synchronize.entities.Fncparen;
import org.synchronize.entities.Fncperson;
import org.synchronize.entities.Fncpueind;
import org.synchronize.entities.Fncsalrep;
import org.synchronize.entities.FncsalrepFncconrep;
import org.synchronize.entities.Fnctipide;
import org.synchronize.entities.Fububiviv;
import org.synchronize.entities.Fucmunici;
import org.synchronize.entities.Fucresgua;
import org.synchronize.entities.Fuctipter;
import org.synchronize.entities.FuczoncuiFucbarver;
import org.synchronize.entities.Fvbencues;
import org.synchronize.entities.Fvcconviv;
import org.synchronize.repositories.CargaMovilDetalleRepository;
import org.synchronize.repositories.CargaMovilRepository;
import org.synchronize.repositories.ComunRepository;
import org.synchronize.repositories.FnbnucvivFncpersonRepository;
import org.synchronize.repositories.FububivivRepository;
import org.synchronize.repositories.FuczoncuiFucbarverRepository;
import org.synchronize.repositories.FvbencuesRepository;
import org.synchronize.utils.Convertidor;
import org.synchronize.vo.InformacionSaludDesarmoniaVO;
import org.synchronize.vo.InformacionSaludVO;
import org.synchronize.vo.InitSyncroDetalleVO;
import org.synchronize.vo.InitSyncroVO;
import org.synchronize.vo.NucleoViviendaCondicionViviendaVO;
import org.synchronize.vo.NucleoViviendaVO;
import org.synchronize.vo.PersonaVO;
import org.synchronize.vo.ResponseInformacionSaludVO;
import org.synchronize.vo.SyncDataVO;
import org.synchronize.vo.ResponseVO;
import org.synchronize.vo.ResponseNucleoVO;
import org.synchronize.vo.ResponsePersonaVO;
import org.synchronize.vo.InformacionSaludReproductivaVO;
import org.synchronize.vo.SaludReproductivaCondicionVO;

/**
 *
 * @author EDUAR OROZCO
 */
@Service
public class SyncServiceImpl implements SyncService {

    @Autowired
    private ComunRepository comunRepository;

    @Autowired
    private CargaMovilRepository cargaMovilRepository;

    @Autowired
    private CargaMovilDetalleRepository cargaMovilDetalleRepository;

    @Autowired
    private CargaMovilService cargaMovilService;

    @Autowired
    private FububivivRepository fububivivRepository;

    @Autowired
    private FuczoncuiFucbarverRepository fuczoncuiFucbarverRepository;

    @Autowired
    private FvbencuesRepository fvbencuesRepository;
    
    @Autowired
    private FnbnucvivFncpersonRepository fnbnucvivFncpersonRepository;

    /**
     * Contrala el guardado de datos en la sincronización
     * @param data
     * @return 
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public ResponseVO syncFicha(String data) {
        Gson g = new Gson();
        SyncDataVO syncDataVO = g.fromJson(data, SyncDataVO.class);
        ResponseVO response = new ResponseVO();
        response.setMovilId(syncDataVO.getId());
        
        Fububiviv fububivivNew = null;
        try {      
        fububivivNew = SyncUbicacion(syncDataVO);
        }catch(org.hibernate.exception.ConstraintViolationException dev){           
            response.setMessage("Ya existe una ficha con el mismo código de vivienda");            
            response.setError(true);
            response.setMessage("Sincronzación correcta");
            return response;
        }

        if (fububivivNew != null) {
            //actualziar codigo
            fububivivRepository.asignarCodigo(codigoUbicacionVivienda(fububivivNew.getFuczoncuiFucbarverId().getId(), fububivivNew.getId()),fububivivNew.getId());
            List<ResponseNucleoVO> responseNucleoVOs = new ArrayList<>();
            for (NucleoViviendaVO nv : syncDataVO.getNucleoVivienda()) {
                Fnbnucviv fnbnucvivNew = SyncNucleoVivienda(fububivivNew, nv, new Fvbencues(syncDataVO.getEncuestador()));
                ResponseNucleoVO nucleoVO = new ResponseNucleoVO();
                nucleoVO.setMovilId(nv.getId());
                nucleoVO.setWebId(fnbnucvivNew.getId());

                nv.getNucleoViviendaCondicionVivienda().forEach(nvcv -> {                    
                    FnbnucvivFvcconviv fnbnucvivFvcconvivNew = SyncNucleoCondicion( fnbnucvivNew, nvcv);
                });

                List<ResponsePersonaVO> responsePersonaVOs = new ArrayList<>();
                for (PersonaVO personaVO : nv.getPersonaVO()) {
                    Fncperson fncperson = SyncPersona(personaVO, fnbnucvivNew.getFvbencuesId());
                    if (fncperson != null) {
                        ResponsePersonaVO responsePersonaVO = new ResponsePersonaVO();
                        responsePersonaVO.setMovilId(personaVO.getId());
                        responsePersonaVO.setWebId(fncperson.getId());    
                         //validar nucleo
                        FnbnucvivFncperson fnbnucvivFncperson = fnbnucvivFncpersonRepository.validarPersonaNucleo(fnbnucvivNew.getId(), fncperson.getId());
                        if(fnbnucvivFncperson==null){
                            SyncNucleoViviendaPersona(fnbnucvivNew, fncperson);
                        }
                        ////////---------/////////
                        List<ResponseInformacionSaludVO> responseInformacionSaludVOs = new ArrayList<>();
                        personaVO.getInformacionSalud().stream().map(is -> {
                            Fnbinfsal fnbinfsalNew = SyncInformacionSalud(fncperson, is );
                            is.getInformacionSaludDesarmonia().forEach(isd -> {                                
                                FnbinfsalFncdesarm fnbinfsalFncdesarmNew = SyncInformacionSaludDesarmonia(isd, fnbinfsalNew);
                            }); 
                            ResponseInformacionSaludVO responseInformacionSaludVO = new ResponseInformacionSaludVO();
                            responseInformacionSaludVO.setMovilId(is.getId());
                            responseInformacionSaludVO.setWebId(fnbinfsalNew.getId());
                            return responseInformacionSaludVO;
                        }).forEachOrdered(responseInformacionSaludVO -> {
                            responseInformacionSaludVOs.add(responseInformacionSaludVO);
                        });
                        
                        personaVO.getSaludReproductiva().forEach(isr -> {
                            Fncsalrep fncsalrepNew = SyncSaludReproductiva(isr, fncperson);
                            if (fncsalrepNew != null) {
                                if(isr.getSaludReproductivaCondicion()!=null)
                                isr.getSaludReproductivaCondicion().forEach(srcvo -> {
                                    FncsalrepFncconrep fncsalrepFncconrepNew = SyncSaludReproductivaCondicion(srcvo, fncsalrepNew);
                                });
                            }
                        });                       
                        if(responseInformacionSaludVOs.size()>0){
                            responsePersonaVO.setResponseInformacionSaludVO(responseInformacionSaludVOs.get(0));
                        }
                        responsePersonaVOs.add(responsePersonaVO);
                        nucleoVO.setResponsePersonaVO(responsePersonaVOs);
                    }
                }
                responseNucleoVOs.add(nucleoVO);
            }
            response.setResponseNucleoVO(responseNucleoVOs);
            response.setError(false);
            response.setWebId(fububivivNew.getId());
            response.setMessage("Sincronzación correcta");
            return response;
        } else {
            //ERROR NOT FOUND DEVOLVER CODIGO ERR AL MOVIL
            Exception exception = new Exception("Error en los datos");
        }

        return response;
    }

    /**
     * Guarda las personas del movil
     * @param personaVO
     * @param fvbencuesId
     * @return 
     */
    public Fncperson SyncPersona(PersonaVO personaVO, Fvbencues fvbencuesId) {
        Fncperson fncperson = new Fncperson();
        if(personaVO.getEstado()==1){fncperson.setId(personaVO.getWeb_id());}
        fncperson.setCodigo(personaVO.getCodigo());
        fncperson.setIdentificacion(personaVO.getIdentificacion());
        fncperson.setPrimerNombre(personaVO.getPrimerNombre());
        fncperson.setSegundoNombre(personaVO.getSegundoNombre());
        fncperson.setPrimerApellido(personaVO.getPrimerApellido());
        fncperson.setSegundoApellido(personaVO.getSegundoApellido());
        fncperson.setFechaNacimiento(personaVO.getFechaNacimiento());
        fncperson.setTelCelular(personaVO.getTelCelular());
        fncperson.setTelAlterno(personaVO.getTelAlterno());
        fncperson.setCorreoElectronico(personaVO.getCorreoElectronico());
        fncperson.setFnctipideId(new Fnctipide(personaVO.getTipoIde()));
        fncperson.setFncorganiId(new Fncorgani(personaVO.getOrganizacion()));
        fncperson.setFnclunindId(new Fnclunind(personaVO.getLunaIndigena()));
        fncperson.setFncocupacId(new Fncocupac(personaVO.getOcupacion()));
        fncperson.setFucmuniciId(new Fucmunici(personaVO.getMunicipio()));
        fncperson.setFncparenId(new Fncparen(personaVO.getParentesco()));
        fncperson.setFncgeneroId(new Fncgenero(personaVO.getGenero()));
        //fncperson.setFncpueindId(new Fncpueind(personaVO.getPuebloIndigena()));
        fncperson.setUsuarioData("ENCUESTADOR");
        fncperson.setOrigenData("MOVIL");
        fncperson.setFechaActividad(new Date());
        fncperson.setFechaCreacion(new Date());
        fncperson.setFvbencuesId(fvbencuesId);
        Fncperson fncpersonNew = null;
        fncpersonNew = comunRepository.merge("Fncperson", fncperson);
        return fncpersonNew;
    }
    
    /**
     * Guarda los nucleos familiares
     * @param fububiviv
     * @param nv
     * @param fvbencuesId
     * @return 
     */
    public Fnbnucviv SyncNucleoVivienda(Fububiviv fububiviv, NucleoViviendaVO nv, Fvbencues fvbencuesId){
        Fnbnucviv fnbnucviv = new Fnbnucviv();
        if(nv.getEstado()==1){fnbnucviv.setId(nv.getWeb_id());}
        fnbnucviv.setCodigo(nv.getCodigo());
        fnbnucviv.setHumoDentro(nv.getHumo_dentro());
        fnbnucviv.setResiduoBor(nv.getResiduo_bor());
        fnbnucviv.setResiduoPeligroso(nv.getResiduo_peligroso());
        fnbnucviv.setAnimalVacunado(nv.getAnimal_vacunado());
        fnbnucviv.setAnimalNovacunado(nv.getAnimal_novacunado());
        fnbnucviv.setRiesgo(nv.getRiesgo());
        fnbnucviv.setObservacion(nv.getObservacion());
        fnbnucviv.setFububivivId(fububiviv);
        fnbnucviv.setUsuarioData("ENCUESTADOR");
        fnbnucviv.setOrigenData("MOVIL");
        fnbnucviv.setFechaActividad(new Date());
        fnbnucviv.setFechaCreacion(new Date());
        fnbnucviv.setAccesoInternet(nv.getAcceso_internet());
        fnbnucviv.setFvbencuesId(fvbencuesId);
        return comunRepository.merge("Fnbnucviv", fnbnucviv);
    }
   
    /**
     * 
     * @param syncDataVO
     * @return 
     */
    public Fububiviv SyncUbicacion(SyncDataVO syncDataVO){
        Fububiviv fububiviv = new Fububiviv();
        if(syncDataVO.getEstado()==1){fububiviv.setId(syncDataVO.getWeb_id());}
        fububiviv.setCodigo(syncDataVO.getCodigo());
        fububiviv.setCoordenadaX(syncDataVO.getCoordenada_x());
        fububiviv.setCoordenadaY(syncDataVO.getCoordenada_y());
        fububiviv.setDireccion(syncDataVO.getDireccion());
        fububiviv.setUsuarioData("ENCUESTADOR");
        fububiviv.setFechaActividad(new Date());
        fububiviv.setFechaCreacion(new Date());
        fububiviv.setOrigenData("MOVIL");
        fububiviv.setFvbencuesId(new Fvbencues(syncDataVO.getEncuestador()));      
        fububiviv.setFuczoncuiFucbarverId(new FuczoncuiFucbarver(syncDataVO.getIdZonaCuidadoBarVerVO()));
        fububiviv.setStatus(syncDataVO.getEstado());        
        return comunRepository.merge("Fububiviv", fububiviv);
    }
    
    /**
     * 
     * @param fnbnucvivNew
     * @param nvcv
     * @return 
     */
    public FnbnucvivFvcconviv SyncNucleoCondicion( Fnbnucviv fnbnucvivNew, NucleoViviendaCondicionViviendaVO nvcv){
        FnbnucvivFvcconviv fnbnucvivFvcconviv = new FnbnucvivFvcconviv();
        fnbnucvivFvcconviv.setFnbnucvivId(fnbnucvivNew);
        fnbnucvivFvcconviv.setFvcconvivId(new Fvcconviv(nvcv.getIdCondicionVivienda()));
        fnbnucvivFvcconviv.setFvcelevivId(nvcv.getIdEmementoVivienda());
        fnbnucvivFvcconviv.setUsuarioData("ENCUESTADOR");
        fnbnucvivFvcconviv.setOrigenData("MOVIL");
        fnbnucvivFvcconviv.setFechaActividad(new Date());
        fnbnucvivFvcconviv.setFechaCreacion(new Date());
        fnbnucvivFvcconviv.setSeleccion("PENDIENTE ORIGEN");
        return comunRepository.merge("FnbnucvivFvcconviv", fnbnucvivFvcconviv);
    }
    
    /**
     * 
     * @param fnbnucvivNew
     * @param fncperson
     * @return 
     */
    public FnbnucvivFncperson SyncNucleoViviendaPersona(Fnbnucviv fnbnucvivNew, Fncperson fncperson){        
        FnbnucvivFncperson fnbnucvivFncperson = new FnbnucvivFncperson();
        fnbnucvivFncperson.setFnbnucvivId(fnbnucvivNew);
        fnbnucvivFncperson.setFncpersonId(fncperson);
        fnbnucvivFncperson.setUsuarioData("ENCUESTADOR");
        fnbnucvivFncperson.setOrigenData("MOVIL");
        fnbnucvivFncperson.setFechaActividad(new Date());
        fnbnucvivFncperson.setFechaCreacion(new Date());
        fnbnucvivFncperson.setSeleccion("PENDIENTE ORIGEN");
        return comunRepository.merge("FnbnucvivFncperson", fnbnucvivFncperson);    
    }
    
    /**
     * 
     * @param fncperson
     * @param is
     * @return 
     */
    public Fnbinfsal SyncInformacionSalud(Fncperson fncperson, InformacionSaludVO is ){            
        Fnbinfsal fnbinfsal = new Fnbinfsal();
        if(is.getEstado()==1){fnbinfsal.setId(is.getWeb_id());}
        fnbinfsal.setFncpersonId(fncperson);
        fnbinfsal.setPeso(is.getPeso());
        fnbinfsal.setTalla(is.getTalla());
        fnbinfsal.setTaSistolica(is.getTaSistolica());
        fnbinfsal.setTaDiastolica(is.getTaDiastolica());
        fnbinfsal.setUsoProtesis(is.getUsoProtesis());
        
        if(is.getUltimaVisita()!=null)
            fnbinfsal.setUltimaVisita(is.getUltimaVisita());//fecha
        
        if(is.getFechaMuerte()!=null)
            fnbinfsal.setFechaMuerte(is.getFechaMuerte());//fecha
               
        if(is.getInterpretacionImc()!=null)
            fnbinfsal.setFncintimcId(new Fncintimc(is.getInterpretacionImc()));
        if(is.getInterpretacionTa() !=null)
            fnbinfsal.setFncintteaId(new Fncinttea(is.getInterpretacionTa()));
        fnbinfsal.setStatus(is.getEstado());
        fnbinfsal.setUsuarioData("ENCUESTADOR");
        fnbinfsal.setOrigenData("MOVIL");
        fnbinfsal.setFechaActividad(new Date());
        fnbinfsal.setFechaCreacion(new Date());
        return  comunRepository.merge("Fnbinfsal", fnbinfsal);    
    }
    
    /**
     * 
     * @param isd
     * @param fnbinfsalNew
     * @return 
     */
    public FnbinfsalFncdesarm SyncInformacionSaludDesarmonia(InformacionSaludDesarmoniaVO isd, Fnbinfsal fnbinfsalNew){    
        FnbinfsalFncdesarm fnbinfsalFncdesarm = new FnbinfsalFncdesarm();
        fnbinfsalFncdesarm.setFnbinfsalId(fnbinfsalNew);
        fnbinfsalFncdesarm.setFncdesarmId(new Fncdesarm(isd.getFncdesarmId()));
        fnbinfsalFncdesarm.setUsuarioData("ENCUESTADOR");
        fnbinfsalFncdesarm.setOrigenData("MOVIL");
        fnbinfsalFncdesarm.setFechaActividad(new Date());
        fnbinfsalFncdesarm.setFechaCreacion(new Date());
        fnbinfsalFncdesarm.setSeleccion("PENDIENTE ORIGEN");
        return comunRepository.merge("FnbinfsalFncdesarm", fnbinfsalFncdesarm);
    }
    
    /**
     * 
     * @param isr
     * @param fncperson
     * @return 
     */
    public Fncsalrep SyncSaludReproductiva(InformacionSaludReproductivaVO isr, Fncperson fncperson){        
        Fncsalrep fncsalrep = new Fncsalrep();
        fncsalrep.setFncpersonId(fncperson);
        fncsalrep.setEdadPrimeraRegla(isr.getEdadPrimeraRegla());
        fncsalrep.setGravidez(isr.getGravidez());
        fncsalrep.setParidez(isr.getParidez());
        fncsalrep.setAborto(isr.getAborto());
        fncsalrep.setCesarea(isr.getCesarea());
        fncsalrep.setNacidosVivos(isr.getNacidosVivos());
        fncsalrep.setNacidosMuertos(isr.getNacidosMuertos());                                
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");             
        try {
            if(isr.getPartoUltimo()!=null)
                fncsalrep.setPartoUltimo(format.parse(isr.getPartoUltimo()));//convertir fecha        
            
            if(isr.getUltimaRegla()!=null)
                fncsalrep.setUltimaRegla(format.parse(isr.getUltimaRegla()));//convertir fecha        
            
            if(isr.getPartoEstimado()!=null)
                fncsalrep.setPartoEstimado(format.parse(isr.getPartoEstimado()));        
        } catch (ParseException ex) {
            Logger.getLogger(SyncServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        fncsalrep.setEdadGestacion(isr.getEdadGestacion());
        fncsalrep.setPresenciaFam(isr.getPresenciaFam());
        fncsalrep.setSerologia(isr.getSerologia());
        fncsalrep.setVih(isr.getVih());
        fncsalrep.setResulCitologia(isr.getResulCitologia());
        fncsalrep.setResulProstata(isr.getResulProstata());
        fncsalrep.setAccionCitologia(isr.getAccionCitologia());
        fncsalrep.setUsuarioData("ENCUESTADOR");
        fncsalrep.setOrigenData("MOVIL");
        fncsalrep.setFechaActividad(new Date());
        fncsalrep.setFechaCreacion(new Date());
        return comunRepository.merge("Fncsalrep", fncsalrep);
    }
    
    /**
     * 
     * @param srcvo
     * @param fncsalrepNew
     * @return 
     */
    public FncsalrepFncconrep SyncSaludReproductivaCondicion(SaludReproductivaCondicionVO srcvo, Fncsalrep fncsalrepNew){
        FncsalrepFncconrep fncsalrepFncconrep = new FncsalrepFncconrep();
        fncsalrepFncconrep.setFncsalrepId(fncsalrepNew);
        fncsalrepFncconrep.setFncelerepId(srcvo.getFncelerepId());
        fncsalrepFncconrep.setFncconrepId(new Fncconrep(srcvo.getFncconrepId()));
        fncsalrepFncconrep.setUsuarioData("ENCUESTADOR");
        fncsalrepFncconrep.setOrigenData("MOVIL");
        fncsalrepFncconrep.setFechaActividad(new Date());
        fncsalrepFncconrep.setFechaCreacion(new Date());
        return comunRepository.merge("FncsalrepFncconrep", fncsalrepFncconrep);
    }
                        
    /**
     * 
     * @param user
     * @return 
     */
    @Override
    @Transactional
    public CargaMovil inicializarCarga(String user) {
        CargaMovil cargaMovil = new CargaMovil();
        cargaMovil.setFecha(new Date());
        cargaMovil.setRegistros(new Long(0));
        cargaMovil.setUsuario(user);
        CargaMovil cargaMovilNew = comunRepository.merge("CargaMovil", cargaMovil);
        return cargaMovilNew;
    }

    /**
     * 
     * @param initSyncroVO
     * @return 
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public CargaMovil inicializarCarga(InitSyncroVO initSyncroVO) {
        CargaMovil cargaMovilNew = guardarCargaMovil(initSyncroVO.getUser());
        if (cargaMovilNew != null) {
            for (InitSyncroDetalleVO isd : initSyncroVO.getDetalle()) {
                CargaMovilDetalle cargaMovilDetalle = new CargaMovilDetalle();
                cargaMovilDetalle.setIdCargaMovil(cargaMovilNew);
                cargaMovilDetalle.setEntidad(isd.getEntidad());
                cargaMovilDetalle.setRegistros(isd.getRegistros());
                CargaMovilDetalle cargaMovilDetalleNew = cargaMovilDetalleRepository.save(cargaMovilDetalle);
            }
        } else {
            ///retorna error
        }
        return cargaMovilNew;
    }

    /**
     * 
     * @param user
     * @return 
     */
    @Transactional
    public CargaMovil guardarCargaMovil(String user) {
        CargaMovil cargaMovil = new CargaMovil();
        cargaMovil.setFecha(new Date());
        cargaMovil.setRegistros(new Long(0));
        cargaMovil.setUsuario(user);
        return cargaMovilService.save(cargaMovil);
    }

    /**
     * 
     * @param id
     * @return 
     */
    @Override
    public Fububiviv traerFububiviv(Long id) {
        
        
        
        
        return fububivivRepository.findById(id).orElse(null);
    }

    /**
     * 
     * @param id
     * @return 
     */
    @Override
    public FuczoncuiFucbarver traerFuczoncuiFucbarver(Long id) {
        return fuczoncuiFucbarverRepository.findById(id).orElse(null);
    }

    /**
     * 
     * @param id
     * @return 
     */
    @Override
    public Fvbencues traerFvbencues(Long id) {
        return fvbencuesRepository.findById(id).orElse(null);
    }
    
    /**
     * 
     * @param fucbarver
     * @param id
     * @return 
     */
   // @Override
    public String codigoUbicacionVivienda(Long fucbarver, Long id){      
        String codigo = "";        
        //Fucresgua fucresgua = fuczoncuiFucbarverRepository.findFuczoncuiFucbarver(fucbarver);        
        //Fuctipter fuctipter = fuczoncuiFucbarverRepository.findFuctipter(fucresgua.getId());   
        //Long fucbarver = new Long(10);
        //Long id = new Long(33);        
        Long resguardoId = fuczoncuiFucbarverRepository.findResguardoId(fucbarver);
        Fuctipter fuctipter = fuczoncuiFucbarverRepository.findFuctipter(resguardoId);
        Fucresgua fucresgua = fuczoncuiFucbarverRepository.findResguardo(resguardoId);        
        if("1".equals(fuctipter.getCodigo())){
            //es indigena
            String consec = Convertidor.padLeftZeros(id.toString(), 4);
            codigo = fucresgua.getCodigo() + consec;     
        }else {
            String consec = Convertidor.padLeftZeros(id.toString(), 8);
            codigo = fucresgua.getFucmuniciId().getCodigo() + consec;
        }        
        return codigo;
    }

}
