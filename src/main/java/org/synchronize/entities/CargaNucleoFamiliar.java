/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.synchronize.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 57315
 */
@Entity
@Table(name = "CARGA_NUCLEO_FAMILIAR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CargaNucleoFamiliar.findAll", query = "SELECT c FROM CargaNucleoFamiliar c"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByIdCargaNucleoFamiliar", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.idCargaNucleoFamiliar = :idCargaNucleoFamiliar"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByNucleoFamiliar", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.nucleoFamiliar = :nucleoFamiliar"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByConsecutivo", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.consecutivo = :consecutivo"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByTipoIdentificacion", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.tipoIdentificacion = :tipoIdentificacion"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByNumeroIdentificacion", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.numeroIdentificacion = :numeroIdentificacion"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByGenero", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.genero = :genero"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByPrimerNombre", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.primerNombre = :primerNombre"),
    @NamedQuery(name = "CargaNucleoFamiliar.findBySegundoNombre", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.segundoNombre = :segundoNombre"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByPrimerApellido", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.primerApellido = :primerApellido"),
    @NamedQuery(name = "CargaNucleoFamiliar.findBySegundoApellido", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.segundoApellido = :segundoApellido"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByFechaNacimiento", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByEdad", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.edad = :edad"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByDepartamento", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.departamento = :departamento"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByMunicipio", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.municipio = :municipio"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByLunaOccidental", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.lunaOccidental = :lunaOccidental"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByLunaIndigena", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.lunaIndigena = :lunaIndigena"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByLactanciaMaterna", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.lactanciaMaterna = :lactanciaMaterna"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByTipoSeguridadSocial", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.tipoSeguridadSocial = :tipoSeguridadSocial"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByEmpresaAfiliado", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.empresaAfiliado = :empresaAfiliado"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByProgramaSalud1", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.programaSalud1 = :programaSalud1"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByProgramaSalud2", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.programaSalud2 = :programaSalud2"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByProgramaSalud3", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.programaSalud3 = :programaSalud3"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByProgramaSalud4", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.programaSalud4 = :programaSalud4"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByProgramaSalud5", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.programaSalud5 = :programaSalud5"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByNumeroTelefonico1", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.numeroTelefonico1 = :numeroTelefonico1"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByNumeroTelefonico2", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.numeroTelefonico2 = :numeroTelefonico2"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByCorreoElectronico", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.correoElectronico = :correoElectronico"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByParentezcoGrupoFamiliar", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.parentezcoGrupoFamiliar = :parentezcoGrupoFamiliar"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByEstadoCivil", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.estadoCivil = :estadoCivil"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByGrupoEtnico", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.grupoEtnico = :grupoEtnico"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByPueblo", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.pueblo = :pueblo"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByCasta", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.casta = :casta"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByLenguaMaterna", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.lenguaMaterna = :lenguaMaterna"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByDominioLenguaMaterna", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.dominioLenguaMaterna = :dominioLenguaMaterna"),
    @NamedQuery(name = "CargaNucleoFamiliar.findBySegundaLengua", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.segundaLengua = :segundaLengua"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByDominioSegundaLengua", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.dominioSegundaLengua = :dominioSegundaLengua"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByOrganizacion", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.organizacion = :organizacion"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByCapacidadDiversa1", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.capacidadDiversa1 = :capacidadDiversa1"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByCapacidadDiversa2", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.capacidadDiversa2 = :capacidadDiversa2"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByCapacidadDiversa3", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.capacidadDiversa3 = :capacidadDiversa3"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByCapacidadDiversa4", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.capacidadDiversa4 = :capacidadDiversa4"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByCapacidadDiversa5", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.capacidadDiversa5 = :capacidadDiversa5"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByNivelEstudio", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.nivelEstudio = :nivelEstudio"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByOcupacionPrincipal", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.ocupacionPrincipal = :ocupacionPrincipal"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByTipoTrabajo", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.tipoTrabajo = :tipoTrabajo"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByPoblacionPensional", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.poblacionPensional = :poblacionPensional"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByOtroSaberAncestral1", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.otroSaberAncestral1 = :otroSaberAncestral1"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByOtroSaberAncestral2", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.otroSaberAncestral2 = :otroSaberAncestral2"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByOtroSaberAncestral3", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.otroSaberAncestral3 = :otroSaberAncestral3"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByOtroSaberAncestral4", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.otroSaberAncestral4 = :otroSaberAncestral4"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByOtroSaberAncestral5", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.otroSaberAncestral5 = :otroSaberAncestral5"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByCodigoReligion", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.codigoReligion = :codigoReligion"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByTipoCuidadoPersonal1", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.tipoCuidadoPersonal1 = :tipoCuidadoPersonal1"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByTipoCuidadoPersonal2", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.tipoCuidadoPersonal2 = :tipoCuidadoPersonal2"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByTipoCuidadoPersonal3", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.tipoCuidadoPersonal3 = :tipoCuidadoPersonal3"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByTipoCuidadoPersonal4", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.tipoCuidadoPersonal4 = :tipoCuidadoPersonal4"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByTipoCuidadoPersonal5", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.tipoCuidadoPersonal5 = :tipoCuidadoPersonal5"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByPeso", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.peso = :peso"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByTalla", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.talla = :talla"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByImc", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.imc = :imc"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByClasificacionNutricional", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.clasificacionNutricional = :clasificacionNutricional"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByFactorRiesgo", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.factorRiesgo = :factorRiesgo"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByTensionArterialSistolica", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.tensionArterialSistolica = :tensionArterialSistolica"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByTensionArterialDiastolica", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.tensionArterialDiastolica = :tensionArterialDiastolica"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByInterpretacionTensionArterial", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.interpretacionTensionArterial = :interpretacionTensionArterial"),
    @NamedQuery(name = "CargaNucleoFamiliar.findBySaludVisual", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.saludVisual = :saludVisual"),
    @NamedQuery(name = "CargaNucleoFamiliar.findBySaludAuditivaComunicativa", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.saludAuditivaComunicativa = :saludAuditivaComunicativa"),
    @NamedQuery(name = "CargaNucleoFamiliar.findBySaludBucal1", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.saludBucal1 = :saludBucal1"),
    @NamedQuery(name = "CargaNucleoFamiliar.findBySaludBucal2", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.saludBucal2 = :saludBucal2"),
    @NamedQuery(name = "CargaNucleoFamiliar.findBySaludBucal3", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.saludBucal3 = :saludBucal3"),
    @NamedQuery(name = "CargaNucleoFamiliar.findBySaludBucal4", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.saludBucal4 = :saludBucal4"),
    @NamedQuery(name = "CargaNucleoFamiliar.findBySaludBucal5", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.saludBucal5 = :saludBucal5"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByProtesis", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.protesis = :protesis"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByTiempoProtesis", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.tiempoProtesis = :tiempoProtesis"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByRiesgoDiabetes", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.riesgoDiabetes = :riesgoDiabetes"),
    @NamedQuery(name = "CargaNucleoFamiliar.findBySintomaticoRespiratorio", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.sintomaticoRespiratorio = :sintomaticoRespiratorio"),
    @NamedQuery(name = "CargaNucleoFamiliar.findBySintomaticoMalaria", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.sintomaticoMalaria = :sintomaticoMalaria"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByDesparacitacionInterna1", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.desparacitacionInterna1 = :desparacitacionInterna1"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByDesparacitacionInterna2", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.desparacitacionInterna2 = :desparacitacionInterna2"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByDesparacitacionInterna3", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.desparacitacionInterna3 = :desparacitacionInterna3"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByDesparacitacionInterna4", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.desparacitacionInterna4 = :desparacitacionInterna4"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByDesparacitacionInterna5", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.desparacitacionInterna5 = :desparacitacionInterna5"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByDesparacitacionExterna", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.desparacitacionExterna = :desparacitacionExterna"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByDesarmoniaPropia1", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.desarmoniaPropia1 = :desarmoniaPropia1"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByDesarmoniaPropia2", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.desarmoniaPropia2 = :desarmoniaPropia2"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByDesarmoniaPropia3", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.desarmoniaPropia3 = :desarmoniaPropia3"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByDesarmoniaPropia4", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.desarmoniaPropia4 = :desarmoniaPropia4"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByDesarmoniaPropia5", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.desarmoniaPropia5 = :desarmoniaPropia5"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByDesarmoniasOccidentales1", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.desarmoniasOccidentales1 = :desarmoniasOccidentales1"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByDesarmoniasOccidentales2", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.desarmoniasOccidentales2 = :desarmoniasOccidentales2"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByDesarmoniasOccidentales3", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.desarmoniasOccidentales3 = :desarmoniasOccidentales3"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByDesarmoniasOccidentales4", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.desarmoniasOccidentales4 = :desarmoniasOccidentales4"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByDesarmoniasOccidentales5", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.desarmoniasOccidentales5 = :desarmoniasOccidentales5"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByAntecedentesFamiliares1", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.antecedentesFamiliares1 = :antecedentesFamiliares1"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByAntecedentesFamiliares2", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.antecedentesFamiliares2 = :antecedentesFamiliares2"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByAntecedentesFamiliares3", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.antecedentesFamiliares3 = :antecedentesFamiliares3"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByAntecedentesFamiliares4", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.antecedentesFamiliares4 = :antecedentesFamiliares4"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByAntecedentesFamiliares5", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.antecedentesFamiliares5 = :antecedentesFamiliares5"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByFuma", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.fuma = :fuma"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByBebidasAlcoholicas", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.bebidasAlcoholicas = :bebidasAlcoholicas"),
    @NamedQuery(name = "CargaNucleoFamiliar.findBySustanciasPsicoativas", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.sustanciasPsicoativas = :sustanciasPsicoativas"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByEvidenciaViolencia1", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.evidenciaViolencia1 = :evidenciaViolencia1"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByEvidenciaViolencia2", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.evidenciaViolencia2 = :evidenciaViolencia2"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByEvidenciaViolencia3", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.evidenciaViolencia3 = :evidenciaViolencia3"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByEvidenciaViolencia4", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.evidenciaViolencia4 = :evidenciaViolencia4"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByEvidenciaViolencia5", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.evidenciaViolencia5 = :evidenciaViolencia5"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByEdadPrimeraMenstruacion", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.edadPrimeraMenstruacion = :edadPrimeraMenstruacion"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByNumeroGravidez", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.numeroGravidez = :numeroGravidez"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByNumeroParidez", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.numeroParidez = :numeroParidez"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByNumeroAbortos", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.numeroAbortos = :numeroAbortos"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByNumeroCesarea", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.numeroCesarea = :numeroCesarea"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByNumeroNacidosVivos", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.numeroNacidosVivos = :numeroNacidosVivos"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByNumeroNacidosMuertos", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.numeroNacidosMuertos = :numeroNacidosMuertos"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByTerminacionUltimaGestacion", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.terminacionUltimaGestacion = :terminacionUltimaGestacion"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByFechaTerminacionGestacion", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.fechaTerminacionGestacion = :fechaTerminacionGestacion"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByPersonaAtendioUltimoParto", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.personaAtendioUltimoParto = :personaAtendioUltimoParto"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByLugarAtencionUltimoParto", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.lugarAtencionUltimoParto = :lugarAtencionUltimoParto"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByComplicacionUltimoParto1", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.complicacionUltimoParto1 = :complicacionUltimoParto1"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByComplicacionUltimoParto2", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.complicacionUltimoParto2 = :complicacionUltimoParto2"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByComplicacionUltimoParto3", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.complicacionUltimoParto3 = :complicacionUltimoParto3"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByComplicacionUltimoParto4", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.complicacionUltimoParto4 = :complicacionUltimoParto4"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByComplicacionUltimoParto5", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.complicacionUltimoParto5 = :complicacionUltimoParto5"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByFechaUltimaMenstruacion", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.fechaUltimaMenstruacion = :fechaUltimaMenstruacion"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByEdadGestacion", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.edadGestacion = :edadGestacion"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByFechaProbableParto", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.fechaProbableParto = :fechaProbableParto"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByPracCultuDuranteGestacion1", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.pracCultuDuranteGestacion1 = :pracCultuDuranteGestacion1"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByPracCultuDuranteGestacion2", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.pracCultuDuranteGestacion2 = :pracCultuDuranteGestacion2"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByPracCultuDuranteGestacion3", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.pracCultuDuranteGestacion3 = :pracCultuDuranteGestacion3"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByPracCultuDuranteGestacion4", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.pracCultuDuranteGestacion4 = :pracCultuDuranteGestacion4"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByPracCultuDuranteGestacion5", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.pracCultuDuranteGestacion5 = :pracCultuDuranteGestacion5"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByAcompamientoGestacion1", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.acompamientoGestacion1 = :acompamientoGestacion1"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByAcompamientoGestacion2", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.acompamientoGestacion2 = :acompamientoGestacion2"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByAcompamientoGestacion3", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.acompamientoGestacion3 = :acompamientoGestacion3"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByAcompamientoGestacion4", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.acompamientoGestacion4 = :acompamientoGestacion4"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByAcompamientoGestacion5", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.acompamientoGestacion5 = :acompamientoGestacion5"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByAcompa\u00f1amientoFamilia", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.acompa\u00f1amientoFamilia = :acompa\u00f1amientoFamilia"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByFactoresRiesgoGestante1", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.factoresRiesgoGestante1 = :factoresRiesgoGestante1"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByFactoresRiesgoGestante2", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.factoresRiesgoGestante2 = :factoresRiesgoGestante2"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByFactoresRiesgoGestante3", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.factoresRiesgoGestante3 = :factoresRiesgoGestante3"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByFactoresRiesgoGestante4", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.factoresRiesgoGestante4 = :factoresRiesgoGestante4"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByFactoresRiesgoGestante5", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.factoresRiesgoGestante5 = :factoresRiesgoGestante5"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByPruebaSerologicaUltTriGes", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.pruebaSerologicaUltTriGes = :pruebaSerologicaUltTriGes"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByPruebaVihUlTriGes", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.pruebaVihUlTriGes = :pruebaVihUlTriGes"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByMetodoPlaneacionFamiliar1", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.metodoPlaneacionFamiliar1 = :metodoPlaneacionFamiliar1"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByMetodoPlaneacionFamiliar2", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.metodoPlaneacionFamiliar2 = :metodoPlaneacionFamiliar2"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByMetodoPlaneacionFamiliar3", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.metodoPlaneacionFamiliar3 = :metodoPlaneacionFamiliar3"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByMetodoPlaneacionFamiliar4", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.metodoPlaneacionFamiliar4 = :metodoPlaneacionFamiliar4"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByMetodoPlaneacionFamiliar5", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.metodoPlaneacionFamiliar5 = :metodoPlaneacionFamiliar5"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByCitologiaCervicoUterina", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.citologiaCervicoUterina = :citologiaCervicoUterina"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByResultadoExamenCitologia", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.resultadoExamenCitologia = :resultadoExamenCitologia"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByAccionesResultadoCitologia", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.accionesResultadoCitologia = :accionesResultadoCitologia"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByAutoexamenMama", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.autoexamenMama = :autoexamenMama"),
    @NamedQuery(name = "CargaNucleoFamiliar.findBySaludSexual", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.saludSexual = :saludSexual"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByExamenProstata", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.examenProstata = :examenProstata"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByResultadoExamenProstata", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.resultadoExamenProstata = :resultadoExamenProstata"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByAccionesExamenProstata", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.accionesExamenProstata = :accionesExamenProstata"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByFechaVisita", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.fechaVisita = :fechaVisita"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByIdentificacionAgente", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.identificacionAgente = :identificacionAgente"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByIdUsuarioCarga", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.idUsuarioCarga = :idUsuarioCarga"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByFechaCreacion", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "CargaNucleoFamiliar.findByMensaje", query = "SELECT c FROM CargaNucleoFamiliar c WHERE c.mensaje = :mensaje")})
public class CargaNucleoFamiliar implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CARGA_NUCLEO_FAMILIAR")
    private BigDecimal idCargaNucleoFamiliar;
    @Column(name = "NUCLEO_FAMILIAR")
    private BigInteger nucleoFamiliar;
    @Column(name = "CONSECUTIVO")
    private BigInteger consecutivo;
    @Size(max = 2)
    @Column(name = "TIPO_IDENTIFICACION")
    private String tipoIdentificacion;
    @Size(max = 50)
    @Column(name = "NUMERO_IDENTIFICACION")
    private String numeroIdentificacion;
    @Size(max = 2)
    @Column(name = "GENERO")
    private String genero;
    @Size(max = 50)
    @Column(name = "PRIMER_NOMBRE")
    private String primerNombre;
    @Size(max = 50)
    @Column(name = "SEGUNDO_NOMBRE")
    private String segundoNombre;
    @Size(max = 50)
    @Column(name = "PRIMER_APELLIDO")
    private String primerApellido;
    @Size(max = 50)
    @Column(name = "SEGUNDO_APELLIDO")
    private String segundoApellido;
    @Column(name = "FECHA_NACIMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;
    @Size(max = 20)
    @Column(name = "EDAD")
    private String edad;
    @Size(max = 10)
    @Column(name = "DEPARTAMENTO")
    private String departamento;
    @Size(max = 10)
    @Column(name = "MUNICIPIO")
    private String municipio;
    @Size(max = 10)
    @Column(name = "LUNA_OCCIDENTAL")
    private String lunaOccidental;
    @Size(max = 10)
    @Column(name = "LUNA_INDIGENA")
    private String lunaIndigena;
    @Size(max = 10)
    @Column(name = "LACTANCIA_MATERNA")
    private String lactanciaMaterna;
    @Size(max = 10)
    @Column(name = "TIPO_SEGURIDAD_SOCIAL")
    private String tipoSeguridadSocial;
    @Size(max = 10)
    @Column(name = "EMPRESA_AFILIADO")
    private String empresaAfiliado;
    @Size(max = 10)
    @Column(name = "PROGRAMA_SALUD_1")
    private String programaSalud1;
    @Size(max = 10)
    @Column(name = "PROGRAMA_SALUD_2")
    private String programaSalud2;
    @Size(max = 10)
    @Column(name = "PROGRAMA_SALUD_3")
    private String programaSalud3;
    @Size(max = 10)
    @Column(name = "PROGRAMA_SALUD_4")
    private String programaSalud4;
    @Size(max = 10)
    @Column(name = "PROGRAMA_SALUD_5")
    private String programaSalud5;
    @Size(max = 30)
    @Column(name = "NUMERO_TELEFONICO_1")
    private String numeroTelefonico1;
    @Size(max = 30)
    @Column(name = "NUMERO_TELEFONICO_2")
    private String numeroTelefonico2;
    @Size(max = 100)
    @Column(name = "CORREO_ELECTRONICO")
    private String correoElectronico;
    @Size(max = 10)
    @Column(name = "PARENTEZCO_GRUPO_FAMILIAR")
    private String parentezcoGrupoFamiliar;
    @Size(max = 10)
    @Column(name = "ESTADO_CIVIL")
    private String estadoCivil;
    @Size(max = 10)
    @Column(name = "GRUPO_ETNICO")
    private String grupoEtnico;
    @Size(max = 10)
    @Column(name = "PUEBLO")
    private String pueblo;
    @Size(max = 10)
    @Column(name = "CASTA")
    private String casta;
    @Size(max = 10)
    @Column(name = "LENGUA_MATERNA")
    private String lenguaMaterna;
    @Size(max = 10)
    @Column(name = "DOMINIO_LENGUA_MATERNA")
    private String dominioLenguaMaterna;
    @Size(max = 10)
    @Column(name = "SEGUNDA_LENGUA")
    private String segundaLengua;
    @Size(max = 10)
    @Column(name = "DOMINIO_SEGUNDA_LENGUA")
    private String dominioSegundaLengua;
    @Size(max = 10)
    @Column(name = "ORGANIZACION")
    private String organizacion;
    @Size(max = 10)
    @Column(name = "CAPACIDAD_DIVERSA_1")
    private String capacidadDiversa1;
    @Size(max = 10)
    @Column(name = "CAPACIDAD_DIVERSA_2")
    private String capacidadDiversa2;
    @Size(max = 10)
    @Column(name = "CAPACIDAD_DIVERSA_3")
    private String capacidadDiversa3;
    @Size(max = 10)
    @Column(name = "CAPACIDAD_DIVERSA_4")
    private String capacidadDiversa4;
    @Size(max = 10)
    @Column(name = "CAPACIDAD_DIVERSA_5")
    private String capacidadDiversa5;
    @Size(max = 10)
    @Column(name = "NIVEL_ESTUDIO")
    private String nivelEstudio;
    @Size(max = 10)
    @Column(name = "OCUPACION_PRINCIPAL")
    private String ocupacionPrincipal;
    @Size(max = 10)
    @Column(name = "TIPO_TRABAJO")
    private String tipoTrabajo;
    @Size(max = 10)
    @Column(name = "POBLACION_PENSIONAL")
    private String poblacionPensional;
    @Size(max = 10)
    @Column(name = "OTRO_SABER_ANCESTRAL_1")
    private String otroSaberAncestral1;
    @Size(max = 10)
    @Column(name = "OTRO_SABER_ANCESTRAL_2")
    private String otroSaberAncestral2;
    @Size(max = 10)
    @Column(name = "OTRO_SABER_ANCESTRAL_3")
    private String otroSaberAncestral3;
    @Size(max = 10)
    @Column(name = "OTRO_SABER_ANCESTRAL_4")
    private String otroSaberAncestral4;
    @Size(max = 10)
    @Column(name = "OTRO_SABER_ANCESTRAL_5")
    private String otroSaberAncestral5;
    @Size(max = 10)
    @Column(name = "CODIGO_RELIGION")
    private String codigoReligion;
    @Size(max = 10)
    @Column(name = "TIPO_CUIDADO_PERSONAL_1")
    private String tipoCuidadoPersonal1;
    @Size(max = 10)
    @Column(name = "TIPO_CUIDADO_PERSONAL_2")
    private String tipoCuidadoPersonal2;
    @Size(max = 10)
    @Column(name = "TIPO_CUIDADO_PERSONAL_3")
    private String tipoCuidadoPersonal3;
    @Size(max = 10)
    @Column(name = "TIPO_CUIDADO_PERSONAL_4")
    private String tipoCuidadoPersonal4;
    @Size(max = 10)
    @Column(name = "TIPO_CUIDADO_PERSONAL_5")
    private String tipoCuidadoPersonal5;
    @Size(max = 10)
    @Column(name = "PESO")
    private String peso;
    @Size(max = 10)
    @Column(name = "TALLA")
    private String talla;
    @Size(max = 10)
    @Column(name = "IMC")
    private String imc;
    @Size(max = 10)
    @Column(name = "CLASIFICACION_NUTRICIONAL")
    private String clasificacionNutricional;
    @Size(max = 10)
    @Column(name = "FACTOR_RIESGO")
    private String factorRiesgo;
    @Size(max = 10)
    @Column(name = "TENSION_ARTERIAL_SISTOLICA")
    private String tensionArterialSistolica;
    @Size(max = 10)
    @Column(name = "TENSION_ARTERIAL_DIASTOLICA")
    private String tensionArterialDiastolica;
    @Size(max = 10)
    @Column(name = "INTERPRETACION_TENSION_ARTERIAL")
    private String interpretacionTensionArterial;
    @Size(max = 10)
    @Column(name = "SALUD_VISUAL")
    private String saludVisual;
    @Size(max = 10)
    @Column(name = "SALUD_AUDITIVA_COMUNICATIVA")
    private String saludAuditivaComunicativa;
    @Size(max = 10)
    @Column(name = "SALUD_BUCAL_1")
    private String saludBucal1;
    @Size(max = 10)
    @Column(name = "SALUD_BUCAL_2")
    private String saludBucal2;
    @Size(max = 10)
    @Column(name = "SALUD_BUCAL_3")
    private String saludBucal3;
    @Size(max = 10)
    @Column(name = "SALUD_BUCAL_4")
    private String saludBucal4;
    @Size(max = 10)
    @Column(name = "SALUD_BUCAL_5")
    private String saludBucal5;
    @Size(max = 10)
    @Column(name = "PROTESIS")
    private String protesis;
    @Size(max = 10)
    @Column(name = "TIEMPO_PROTESIS")
    private String tiempoProtesis;
    @Size(max = 10)
    @Column(name = "RIESGO_DIABETES")
    private String riesgoDiabetes;
    @Size(max = 10)
    @Column(name = "SINTOMATICO_RESPIRATORIO")
    private String sintomaticoRespiratorio;
    @Size(max = 10)
    @Column(name = "SINTOMATICO_MALARIA")
    private String sintomaticoMalaria;
    @Size(max = 10)
    @Column(name = "DESPARACITACION_INTERNA_1")
    private String desparacitacionInterna1;
    @Size(max = 10)
    @Column(name = "DESPARACITACION_INTERNA_2")
    private String desparacitacionInterna2;
    @Size(max = 10)
    @Column(name = "DESPARACITACION_INTERNA_3")
    private String desparacitacionInterna3;
    @Size(max = 10)
    @Column(name = "DESPARACITACION_INTERNA_4")
    private String desparacitacionInterna4;
    @Size(max = 10)
    @Column(name = "DESPARACITACION_INTERNA_5")
    private String desparacitacionInterna5;
    @Size(max = 10)
    @Column(name = "DESPARACITACION_EXTERNA")
    private String desparacitacionExterna;
    @Size(max = 10)
    @Column(name = "DESARMONIA_PROPIA_1")
    private String desarmoniaPropia1;
    @Size(max = 10)
    @Column(name = "DESARMONIA_PROPIA_2")
    private String desarmoniaPropia2;
    @Size(max = 10)
    @Column(name = "DESARMONIA_PROPIA_3")
    private String desarmoniaPropia3;
    @Size(max = 10)
    @Column(name = "DESARMONIA_PROPIA_4")
    private String desarmoniaPropia4;
    @Size(max = 10)
    @Column(name = "DESARMONIA_PROPIA_5")
    private String desarmoniaPropia5;
    @Size(max = 10)
    @Column(name = "DESARMONIAS_OCCIDENTALES_1")
    private String desarmoniasOccidentales1;
    @Size(max = 10)
    @Column(name = "DESARMONIAS_OCCIDENTALES_2")
    private String desarmoniasOccidentales2;
    @Size(max = 10)
    @Column(name = "DESARMONIAS_OCCIDENTALES_3")
    private String desarmoniasOccidentales3;
    @Size(max = 10)
    @Column(name = "DESARMONIAS_OCCIDENTALES_4")
    private String desarmoniasOccidentales4;
    @Size(max = 10)
    @Column(name = "DESARMONIAS_OCCIDENTALES_5")
    private String desarmoniasOccidentales5;
    @Size(max = 10)
    @Column(name = "ANTECEDENTES_FAMILIARES_1")
    private String antecedentesFamiliares1;
    @Size(max = 10)
    @Column(name = "ANTECEDENTES_FAMILIARES_2")
    private String antecedentesFamiliares2;
    @Size(max = 10)
    @Column(name = "ANTECEDENTES_FAMILIARES_3")
    private String antecedentesFamiliares3;
    @Size(max = 10)
    @Column(name = "ANTECEDENTES_FAMILIARES_4")
    private String antecedentesFamiliares4;
    @Size(max = 10)
    @Column(name = "ANTECEDENTES_FAMILIARES_5")
    private String antecedentesFamiliares5;
    @Size(max = 10)
    @Column(name = "FUMA")
    private String fuma;
    @Size(max = 10)
    @Column(name = "BEBIDAS_ALCOHOLICAS")
    private String bebidasAlcoholicas;
    @Size(max = 10)
    @Column(name = "SUSTANCIAS_PSICOATIVAS")
    private String sustanciasPsicoativas;
    @Size(max = 10)
    @Column(name = "EVIDENCIA_VIOLENCIA_1")
    private String evidenciaViolencia1;
    @Size(max = 10)
    @Column(name = "EVIDENCIA_VIOLENCIA_2")
    private String evidenciaViolencia2;
    @Size(max = 10)
    @Column(name = "EVIDENCIA_VIOLENCIA_3")
    private String evidenciaViolencia3;
    @Size(max = 10)
    @Column(name = "EVIDENCIA_VIOLENCIA_4")
    private String evidenciaViolencia4;
    @Size(max = 10)
    @Column(name = "EVIDENCIA_VIOLENCIA_5")
    private String evidenciaViolencia5;
    @Size(max = 10)
    @Column(name = "EDAD_PRIMERA_MENSTRUACION")
    private String edadPrimeraMenstruacion;
    @Size(max = 10)
    @Column(name = "NUMERO_GRAVIDEZ")
    private String numeroGravidez;
    @Size(max = 10)
    @Column(name = "NUMERO_PARIDEZ")
    private String numeroParidez;
    @Size(max = 10)
    @Column(name = "NUMERO_ABORTOS")
    private String numeroAbortos;
    @Size(max = 10)
    @Column(name = "NUMERO_CESAREA")
    private String numeroCesarea;
    @Size(max = 10)
    @Column(name = "NUMERO_NACIDOS_VIVOS")
    private String numeroNacidosVivos;
    @Size(max = 10)
    @Column(name = "NUMERO_NACIDOS_MUERTOS")
    private String numeroNacidosMuertos;
    @Size(max = 10)
    @Column(name = "TERMINACION_ULTIMA_GESTACION")
    private String terminacionUltimaGestacion;
    @Column(name = "FECHA_TERMINACION_GESTACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaTerminacionGestacion;
    @Size(max = 50)
    @Column(name = "PERSONA_ATENDIO_ULTIMO_PARTO")
    private String personaAtendioUltimoParto;
    @Size(max = 50)
    @Column(name = "LUGAR_ATENCION_ULTIMO_PARTO")
    private String lugarAtencionUltimoParto;
    @Size(max = 100)
    @Column(name = "COMPLICACION_ULTIMO_PARTO_1")
    private String complicacionUltimoParto1;
    @Size(max = 100)
    @Column(name = "COMPLICACION_ULTIMO_PARTO_2")
    private String complicacionUltimoParto2;
    @Size(max = 100)
    @Column(name = "COMPLICACION_ULTIMO_PARTO_3")
    private String complicacionUltimoParto3;
    @Size(max = 100)
    @Column(name = "COMPLICACION_ULTIMO_PARTO_4")
    private String complicacionUltimoParto4;
    @Size(max = 100)
    @Column(name = "COMPLICACION_ULTIMO_PARTO_5")
    private String complicacionUltimoParto5;
    @Column(name = "FECHA_ULTIMA_MENSTRUACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaMenstruacion;
    @Size(max = 10)
    @Column(name = "EDAD_GESTACION")
    private String edadGestacion;
    @Column(name = "FECHA_PROBABLE_PARTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaProbableParto;
    @Size(max = 10)
    @Column(name = "PRAC_CULTU_DURANTE_GESTACION_1")
    private String pracCultuDuranteGestacion1;
    @Size(max = 10)
    @Column(name = "PRAC_CULTU_DURANTE_GESTACION_2")
    private String pracCultuDuranteGestacion2;
    @Size(max = 10)
    @Column(name = "PRAC_CULTU_DURANTE_GESTACION_3")
    private String pracCultuDuranteGestacion3;
    @Size(max = 10)
    @Column(name = "PRAC_CULTU_DURANTE_GESTACION_4")
    private String pracCultuDuranteGestacion4;
    @Size(max = 10)
    @Column(name = "PRAC_CULTU_DURANTE_GESTACION_5")
    private String pracCultuDuranteGestacion5;
    @Size(max = 10)
    @Column(name = "ACOMPAMIENTO_GESTACION_1")
    private String acompamientoGestacion1;
    @Size(max = 10)
    @Column(name = "ACOMPAMIENTO_GESTACION_2")
    private String acompamientoGestacion2;
    @Size(max = 10)
    @Column(name = "ACOMPAMIENTO_GESTACION_3")
    private String acompamientoGestacion3;
    @Size(max = 10)
    @Column(name = "ACOMPAMIENTO_GESTACION_4")
    private String acompamientoGestacion4;
    @Size(max = 10)
    @Column(name = "ACOMPAMIENTO_GESTACION_5")
    private String acompamientoGestacion5;
    @Size(max = 10)
    @Column(name = "ACOMPA\u00d1AMIENTO_FAMILIA")
    private String acompañamientoFamilia;
    @Size(max = 10)
    @Column(name = "FACTORES_RIESGO_GESTANTE_1")
    private String factoresRiesgoGestante1;
    @Size(max = 10)
    @Column(name = "FACTORES_RIESGO_GESTANTE_2")
    private String factoresRiesgoGestante2;
    @Size(max = 10)
    @Column(name = "FACTORES_RIESGO_GESTANTE_3")
    private String factoresRiesgoGestante3;
    @Size(max = 10)
    @Column(name = "FACTORES_RIESGO_GESTANTE_4")
    private String factoresRiesgoGestante4;
    @Size(max = 10)
    @Column(name = "FACTORES_RIESGO_GESTANTE_5")
    private String factoresRiesgoGestante5;
    @Size(max = 10)
    @Column(name = "PRUEBA_SEROLOGICA_ULT_TRI_GES")
    private String pruebaSerologicaUltTriGes;
    @Size(max = 10)
    @Column(name = "PRUEBA_VIH_UL_TRI_GES")
    private String pruebaVihUlTriGes;
    @Size(max = 10)
    @Column(name = "METODO_PLANEACION_FAMILIAR_1")
    private String metodoPlaneacionFamiliar1;
    @Size(max = 10)
    @Column(name = "METODO_PLANEACION_FAMILIAR_2")
    private String metodoPlaneacionFamiliar2;
    @Size(max = 10)
    @Column(name = "METODO_PLANEACION_FAMILIAR_3")
    private String metodoPlaneacionFamiliar3;
    @Size(max = 10)
    @Column(name = "METODO_PLANEACION_FAMILIAR_4")
    private String metodoPlaneacionFamiliar4;
    @Size(max = 10)
    @Column(name = "METODO_PLANEACION_FAMILIAR_5")
    private String metodoPlaneacionFamiliar5;
    @Size(max = 10)
    @Column(name = "CITOLOGIA_CERVICO_UTERINA")
    private String citologiaCervicoUterina;
    @Size(max = 50)
    @Column(name = "RESULTADO_EXAMEN_CITOLOGIA")
    private String resultadoExamenCitologia;
    @Size(max = 50)
    @Column(name = "ACCIONES_RESULTADO_CITOLOGIA")
    private String accionesResultadoCitologia;
    @Size(max = 50)
    @Column(name = "AUTOEXAMEN_MAMA")
    private String autoexamenMama;
    @Size(max = 10)
    @Column(name = "SALUD_SEXUAL")
    private String saludSexual;
    @Size(max = 10)
    @Column(name = "EXAMEN_PROSTATA")
    private String examenProstata;
    @Size(max = 50)
    @Column(name = "RESULTADO_EXAMEN_PROSTATA")
    private String resultadoExamenProstata;
    @Size(max = 50)
    @Column(name = "ACCIONES_EXAMEN_PROSTATA")
    private String accionesExamenProstata;
    @Column(name = "FECHA_VISITA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVisita;
    @Size(max = 30)
    @Column(name = "IDENTIFICACION_AGENTE")
    private String identificacionAgente;
    @Column(name = "ID_USUARIO_CARGA")
    private BigInteger idUsuarioCarga;
    @Column(name = "FECHA_CREACION")
    private Date fechaCreacion;
    @Size(max = 4000)
    @Column(name = "MENSAJE")
    private String mensaje;

    public CargaNucleoFamiliar() {
    }

    public CargaNucleoFamiliar(BigDecimal idCargaNucleoFamiliar) {
        this.idCargaNucleoFamiliar = idCargaNucleoFamiliar;
    }

    public BigDecimal getIdCargaNucleoFamiliar() {
        return idCargaNucleoFamiliar;
    }

    public void setIdCargaNucleoFamiliar(BigDecimal idCargaNucleoFamiliar) {
        this.idCargaNucleoFamiliar = idCargaNucleoFamiliar;
    }

    public BigInteger getNucleoFamiliar() {
        return nucleoFamiliar;
    }

    public void setNucleoFamiliar(BigInteger nucleoFamiliar) {
        this.nucleoFamiliar = nucleoFamiliar;
    }

    public BigInteger getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(BigInteger consecutivo) {
        this.consecutivo = consecutivo;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getLunaOccidental() {
        return lunaOccidental;
    }

    public void setLunaOccidental(String lunaOccidental) {
        this.lunaOccidental = lunaOccidental;
    }

    public String getLunaIndigena() {
        return lunaIndigena;
    }

    public void setLunaIndigena(String lunaIndigena) {
        this.lunaIndigena = lunaIndigena;
    }

    public String getLactanciaMaterna() {
        return lactanciaMaterna;
    }

    public void setLactanciaMaterna(String lactanciaMaterna) {
        this.lactanciaMaterna = lactanciaMaterna;
    }

    public String getTipoSeguridadSocial() {
        return tipoSeguridadSocial;
    }

    public void setTipoSeguridadSocial(String tipoSeguridadSocial) {
        this.tipoSeguridadSocial = tipoSeguridadSocial;
    }

    public String getEmpresaAfiliado() {
        return empresaAfiliado;
    }

    public void setEmpresaAfiliado(String empresaAfiliado) {
        this.empresaAfiliado = empresaAfiliado;
    }

    public String getProgramaSalud1() {
        return programaSalud1;
    }

    public void setProgramaSalud1(String programaSalud1) {
        this.programaSalud1 = programaSalud1;
    }

    public String getProgramaSalud2() {
        return programaSalud2;
    }

    public void setProgramaSalud2(String programaSalud2) {
        this.programaSalud2 = programaSalud2;
    }

    public String getProgramaSalud3() {
        return programaSalud3;
    }

    public void setProgramaSalud3(String programaSalud3) {
        this.programaSalud3 = programaSalud3;
    }

    public String getProgramaSalud4() {
        return programaSalud4;
    }

    public void setProgramaSalud4(String programaSalud4) {
        this.programaSalud4 = programaSalud4;
    }

    public String getProgramaSalud5() {
        return programaSalud5;
    }

    public void setProgramaSalud5(String programaSalud5) {
        this.programaSalud5 = programaSalud5;
    }

    public String getNumeroTelefonico1() {
        return numeroTelefonico1;
    }

    public void setNumeroTelefonico1(String numeroTelefonico1) {
        this.numeroTelefonico1 = numeroTelefonico1;
    }

    public String getNumeroTelefonico2() {
        return numeroTelefonico2;
    }

    public void setNumeroTelefonico2(String numeroTelefonico2) {
        this.numeroTelefonico2 = numeroTelefonico2;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getParentezcoGrupoFamiliar() {
        return parentezcoGrupoFamiliar;
    }

    public void setParentezcoGrupoFamiliar(String parentezcoGrupoFamiliar) {
        this.parentezcoGrupoFamiliar = parentezcoGrupoFamiliar;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getGrupoEtnico() {
        return grupoEtnico;
    }

    public void setGrupoEtnico(String grupoEtnico) {
        this.grupoEtnico = grupoEtnico;
    }

    public String getPueblo() {
        return pueblo;
    }

    public void setPueblo(String pueblo) {
        this.pueblo = pueblo;
    }

    public String getCasta() {
        return casta;
    }

    public void setCasta(String casta) {
        this.casta = casta;
    }

    public String getLenguaMaterna() {
        return lenguaMaterna;
    }

    public void setLenguaMaterna(String lenguaMaterna) {
        this.lenguaMaterna = lenguaMaterna;
    }

    public String getDominioLenguaMaterna() {
        return dominioLenguaMaterna;
    }

    public void setDominioLenguaMaterna(String dominioLenguaMaterna) {
        this.dominioLenguaMaterna = dominioLenguaMaterna;
    }

    public String getSegundaLengua() {
        return segundaLengua;
    }

    public void setSegundaLengua(String segundaLengua) {
        this.segundaLengua = segundaLengua;
    }

    public String getDominioSegundaLengua() {
        return dominioSegundaLengua;
    }

    public void setDominioSegundaLengua(String dominioSegundaLengua) {
        this.dominioSegundaLengua = dominioSegundaLengua;
    }

    public String getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
    }

    public String getCapacidadDiversa1() {
        return capacidadDiversa1;
    }

    public void setCapacidadDiversa1(String capacidadDiversa1) {
        this.capacidadDiversa1 = capacidadDiversa1;
    }

    public String getCapacidadDiversa2() {
        return capacidadDiversa2;
    }

    public void setCapacidadDiversa2(String capacidadDiversa2) {
        this.capacidadDiversa2 = capacidadDiversa2;
    }

    public String getCapacidadDiversa3() {
        return capacidadDiversa3;
    }

    public void setCapacidadDiversa3(String capacidadDiversa3) {
        this.capacidadDiversa3 = capacidadDiversa3;
    }

    public String getCapacidadDiversa4() {
        return capacidadDiversa4;
    }

    public void setCapacidadDiversa4(String capacidadDiversa4) {
        this.capacidadDiversa4 = capacidadDiversa4;
    }

    public String getCapacidadDiversa5() {
        return capacidadDiversa5;
    }

    public void setCapacidadDiversa5(String capacidadDiversa5) {
        this.capacidadDiversa5 = capacidadDiversa5;
    }

    public String getNivelEstudio() {
        return nivelEstudio;
    }

    public void setNivelEstudio(String nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }

    public String getOcupacionPrincipal() {
        return ocupacionPrincipal;
    }

    public void setOcupacionPrincipal(String ocupacionPrincipal) {
        this.ocupacionPrincipal = ocupacionPrincipal;
    }

    public String getTipoTrabajo() {
        return tipoTrabajo;
    }

    public void setTipoTrabajo(String tipoTrabajo) {
        this.tipoTrabajo = tipoTrabajo;
    }

    public String getPoblacionPensional() {
        return poblacionPensional;
    }

    public void setPoblacionPensional(String poblacionPensional) {
        this.poblacionPensional = poblacionPensional;
    }

    public String getOtroSaberAncestral1() {
        return otroSaberAncestral1;
    }

    public void setOtroSaberAncestral1(String otroSaberAncestral1) {
        this.otroSaberAncestral1 = otroSaberAncestral1;
    }

    public String getOtroSaberAncestral2() {
        return otroSaberAncestral2;
    }

    public void setOtroSaberAncestral2(String otroSaberAncestral2) {
        this.otroSaberAncestral2 = otroSaberAncestral2;
    }

    public String getOtroSaberAncestral3() {
        return otroSaberAncestral3;
    }

    public void setOtroSaberAncestral3(String otroSaberAncestral3) {
        this.otroSaberAncestral3 = otroSaberAncestral3;
    }

    public String getOtroSaberAncestral4() {
        return otroSaberAncestral4;
    }

    public void setOtroSaberAncestral4(String otroSaberAncestral4) {
        this.otroSaberAncestral4 = otroSaberAncestral4;
    }

    public String getOtroSaberAncestral5() {
        return otroSaberAncestral5;
    }

    public void setOtroSaberAncestral5(String otroSaberAncestral5) {
        this.otroSaberAncestral5 = otroSaberAncestral5;
    }

    public String getCodigoReligion() {
        return codigoReligion;
    }

    public void setCodigoReligion(String codigoReligion) {
        this.codigoReligion = codigoReligion;
    }

    public String getTipoCuidadoPersonal1() {
        return tipoCuidadoPersonal1;
    }

    public void setTipoCuidadoPersonal1(String tipoCuidadoPersonal1) {
        this.tipoCuidadoPersonal1 = tipoCuidadoPersonal1;
    }

    public String getTipoCuidadoPersonal2() {
        return tipoCuidadoPersonal2;
    }

    public void setTipoCuidadoPersonal2(String tipoCuidadoPersonal2) {
        this.tipoCuidadoPersonal2 = tipoCuidadoPersonal2;
    }

    public String getTipoCuidadoPersonal3() {
        return tipoCuidadoPersonal3;
    }

    public void setTipoCuidadoPersonal3(String tipoCuidadoPersonal3) {
        this.tipoCuidadoPersonal3 = tipoCuidadoPersonal3;
    }

    public String getTipoCuidadoPersonal4() {
        return tipoCuidadoPersonal4;
    }

    public void setTipoCuidadoPersonal4(String tipoCuidadoPersonal4) {
        this.tipoCuidadoPersonal4 = tipoCuidadoPersonal4;
    }

    public String getTipoCuidadoPersonal5() {
        return tipoCuidadoPersonal5;
    }

    public void setTipoCuidadoPersonal5(String tipoCuidadoPersonal5) {
        this.tipoCuidadoPersonal5 = tipoCuidadoPersonal5;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getImc() {
        return imc;
    }

    public void setImc(String imc) {
        this.imc = imc;
    }

    public String getClasificacionNutricional() {
        return clasificacionNutricional;
    }

    public void setClasificacionNutricional(String clasificacionNutricional) {
        this.clasificacionNutricional = clasificacionNutricional;
    }

    public String getFactorRiesgo() {
        return factorRiesgo;
    }

    public void setFactorRiesgo(String factorRiesgo) {
        this.factorRiesgo = factorRiesgo;
    }

    public String getTensionArterialSistolica() {
        return tensionArterialSistolica;
    }

    public void setTensionArterialSistolica(String tensionArterialSistolica) {
        this.tensionArterialSistolica = tensionArterialSistolica;
    }

    public String getTensionArterialDiastolica() {
        return tensionArterialDiastolica;
    }

    public void setTensionArterialDiastolica(String tensionArterialDiastolica) {
        this.tensionArterialDiastolica = tensionArterialDiastolica;
    }

    public String getInterpretacionTensionArterial() {
        return interpretacionTensionArterial;
    }

    public void setInterpretacionTensionArterial(String interpretacionTensionArterial) {
        this.interpretacionTensionArterial = interpretacionTensionArterial;
    }

    public String getSaludVisual() {
        return saludVisual;
    }

    public void setSaludVisual(String saludVisual) {
        this.saludVisual = saludVisual;
    }

    public String getSaludAuditivaComunicativa() {
        return saludAuditivaComunicativa;
    }

    public void setSaludAuditivaComunicativa(String saludAuditivaComunicativa) {
        this.saludAuditivaComunicativa = saludAuditivaComunicativa;
    }

    public String getSaludBucal1() {
        return saludBucal1;
    }

    public void setSaludBucal1(String saludBucal1) {
        this.saludBucal1 = saludBucal1;
    }

    public String getSaludBucal2() {
        return saludBucal2;
    }

    public void setSaludBucal2(String saludBucal2) {
        this.saludBucal2 = saludBucal2;
    }

    public String getSaludBucal3() {
        return saludBucal3;
    }

    public void setSaludBucal3(String saludBucal3) {
        this.saludBucal3 = saludBucal3;
    }

    public String getSaludBucal4() {
        return saludBucal4;
    }

    public void setSaludBucal4(String saludBucal4) {
        this.saludBucal4 = saludBucal4;
    }

    public String getSaludBucal5() {
        return saludBucal5;
    }

    public void setSaludBucal5(String saludBucal5) {
        this.saludBucal5 = saludBucal5;
    }

    public String getProtesis() {
        return protesis;
    }

    public void setProtesis(String protesis) {
        this.protesis = protesis;
    }

    public String getTiempoProtesis() {
        return tiempoProtesis;
    }

    public void setTiempoProtesis(String tiempoProtesis) {
        this.tiempoProtesis = tiempoProtesis;
    }

    public String getRiesgoDiabetes() {
        return riesgoDiabetes;
    }

    public void setRiesgoDiabetes(String riesgoDiabetes) {
        this.riesgoDiabetes = riesgoDiabetes;
    }

    public String getSintomaticoRespiratorio() {
        return sintomaticoRespiratorio;
    }

    public void setSintomaticoRespiratorio(String sintomaticoRespiratorio) {
        this.sintomaticoRespiratorio = sintomaticoRespiratorio;
    }

    public String getSintomaticoMalaria() {
        return sintomaticoMalaria;
    }

    public void setSintomaticoMalaria(String sintomaticoMalaria) {
        this.sintomaticoMalaria = sintomaticoMalaria;
    }

    public String getDesparacitacionInterna1() {
        return desparacitacionInterna1;
    }

    public void setDesparacitacionInterna1(String desparacitacionInterna1) {
        this.desparacitacionInterna1 = desparacitacionInterna1;
    }

    public String getDesparacitacionInterna2() {
        return desparacitacionInterna2;
    }

    public void setDesparacitacionInterna2(String desparacitacionInterna2) {
        this.desparacitacionInterna2 = desparacitacionInterna2;
    }

    public String getDesparacitacionInterna3() {
        return desparacitacionInterna3;
    }

    public void setDesparacitacionInterna3(String desparacitacionInterna3) {
        this.desparacitacionInterna3 = desparacitacionInterna3;
    }

    public String getDesparacitacionInterna4() {
        return desparacitacionInterna4;
    }

    public void setDesparacitacionInterna4(String desparacitacionInterna4) {
        this.desparacitacionInterna4 = desparacitacionInterna4;
    }

    public String getDesparacitacionInterna5() {
        return desparacitacionInterna5;
    }

    public void setDesparacitacionInterna5(String desparacitacionInterna5) {
        this.desparacitacionInterna5 = desparacitacionInterna5;
    }

    public String getDesparacitacionExterna() {
        return desparacitacionExterna;
    }

    public void setDesparacitacionExterna(String desparacitacionExterna) {
        this.desparacitacionExterna = desparacitacionExterna;
    }

    public String getDesarmoniaPropia1() {
        return desarmoniaPropia1;
    }

    public void setDesarmoniaPropia1(String desarmoniaPropia1) {
        this.desarmoniaPropia1 = desarmoniaPropia1;
    }

    public String getDesarmoniaPropia2() {
        return desarmoniaPropia2;
    }

    public void setDesarmoniaPropia2(String desarmoniaPropia2) {
        this.desarmoniaPropia2 = desarmoniaPropia2;
    }

    public String getDesarmoniaPropia3() {
        return desarmoniaPropia3;
    }

    public void setDesarmoniaPropia3(String desarmoniaPropia3) {
        this.desarmoniaPropia3 = desarmoniaPropia3;
    }

    public String getDesarmoniaPropia4() {
        return desarmoniaPropia4;
    }

    public void setDesarmoniaPropia4(String desarmoniaPropia4) {
        this.desarmoniaPropia4 = desarmoniaPropia4;
    }

    public String getDesarmoniaPropia5() {
        return desarmoniaPropia5;
    }

    public void setDesarmoniaPropia5(String desarmoniaPropia5) {
        this.desarmoniaPropia5 = desarmoniaPropia5;
    }

    public String getDesarmoniasOccidentales1() {
        return desarmoniasOccidentales1;
    }

    public void setDesarmoniasOccidentales1(String desarmoniasOccidentales1) {
        this.desarmoniasOccidentales1 = desarmoniasOccidentales1;
    }

    public String getDesarmoniasOccidentales2() {
        return desarmoniasOccidentales2;
    }

    public void setDesarmoniasOccidentales2(String desarmoniasOccidentales2) {
        this.desarmoniasOccidentales2 = desarmoniasOccidentales2;
    }

    public String getDesarmoniasOccidentales3() {
        return desarmoniasOccidentales3;
    }

    public void setDesarmoniasOccidentales3(String desarmoniasOccidentales3) {
        this.desarmoniasOccidentales3 = desarmoniasOccidentales3;
    }

    public String getDesarmoniasOccidentales4() {
        return desarmoniasOccidentales4;
    }

    public void setDesarmoniasOccidentales4(String desarmoniasOccidentales4) {
        this.desarmoniasOccidentales4 = desarmoniasOccidentales4;
    }

    public String getDesarmoniasOccidentales5() {
        return desarmoniasOccidentales5;
    }

    public void setDesarmoniasOccidentales5(String desarmoniasOccidentales5) {
        this.desarmoniasOccidentales5 = desarmoniasOccidentales5;
    }

    public String getAntecedentesFamiliares1() {
        return antecedentesFamiliares1;
    }

    public void setAntecedentesFamiliares1(String antecedentesFamiliares1) {
        this.antecedentesFamiliares1 = antecedentesFamiliares1;
    }

    public String getAntecedentesFamiliares2() {
        return antecedentesFamiliares2;
    }

    public void setAntecedentesFamiliares2(String antecedentesFamiliares2) {
        this.antecedentesFamiliares2 = antecedentesFamiliares2;
    }

    public String getAntecedentesFamiliares3() {
        return antecedentesFamiliares3;
    }

    public void setAntecedentesFamiliares3(String antecedentesFamiliares3) {
        this.antecedentesFamiliares3 = antecedentesFamiliares3;
    }

    public String getAntecedentesFamiliares4() {
        return antecedentesFamiliares4;
    }

    public void setAntecedentesFamiliares4(String antecedentesFamiliares4) {
        this.antecedentesFamiliares4 = antecedentesFamiliares4;
    }

    public String getAntecedentesFamiliares5() {
        return antecedentesFamiliares5;
    }

    public void setAntecedentesFamiliares5(String antecedentesFamiliares5) {
        this.antecedentesFamiliares5 = antecedentesFamiliares5;
    }

    public String getFuma() {
        return fuma;
    }

    public void setFuma(String fuma) {
        this.fuma = fuma;
    }

    public String getBebidasAlcoholicas() {
        return bebidasAlcoholicas;
    }

    public void setBebidasAlcoholicas(String bebidasAlcoholicas) {
        this.bebidasAlcoholicas = bebidasAlcoholicas;
    }

    public String getSustanciasPsicoativas() {
        return sustanciasPsicoativas;
    }

    public void setSustanciasPsicoativas(String sustanciasPsicoativas) {
        this.sustanciasPsicoativas = sustanciasPsicoativas;
    }

    public String getEvidenciaViolencia1() {
        return evidenciaViolencia1;
    }

    public void setEvidenciaViolencia1(String evidenciaViolencia1) {
        this.evidenciaViolencia1 = evidenciaViolencia1;
    }

    public String getEvidenciaViolencia2() {
        return evidenciaViolencia2;
    }

    public void setEvidenciaViolencia2(String evidenciaViolencia2) {
        this.evidenciaViolencia2 = evidenciaViolencia2;
    }

    public String getEvidenciaViolencia3() {
        return evidenciaViolencia3;
    }

    public void setEvidenciaViolencia3(String evidenciaViolencia3) {
        this.evidenciaViolencia3 = evidenciaViolencia3;
    }

    public String getEvidenciaViolencia4() {
        return evidenciaViolencia4;
    }

    public void setEvidenciaViolencia4(String evidenciaViolencia4) {
        this.evidenciaViolencia4 = evidenciaViolencia4;
    }

    public String getEvidenciaViolencia5() {
        return evidenciaViolencia5;
    }

    public void setEvidenciaViolencia5(String evidenciaViolencia5) {
        this.evidenciaViolencia5 = evidenciaViolencia5;
    }

    public String getEdadPrimeraMenstruacion() {
        return edadPrimeraMenstruacion;
    }

    public void setEdadPrimeraMenstruacion(String edadPrimeraMenstruacion) {
        this.edadPrimeraMenstruacion = edadPrimeraMenstruacion;
    }

    public String getNumeroGravidez() {
        return numeroGravidez;
    }

    public void setNumeroGravidez(String numeroGravidez) {
        this.numeroGravidez = numeroGravidez;
    }

    public String getNumeroParidez() {
        return numeroParidez;
    }

    public void setNumeroParidez(String numeroParidez) {
        this.numeroParidez = numeroParidez;
    }

    public String getNumeroAbortos() {
        return numeroAbortos;
    }

    public void setNumeroAbortos(String numeroAbortos) {
        this.numeroAbortos = numeroAbortos;
    }

    public String getNumeroCesarea() {
        return numeroCesarea;
    }

    public void setNumeroCesarea(String numeroCesarea) {
        this.numeroCesarea = numeroCesarea;
    }

    public String getNumeroNacidosVivos() {
        return numeroNacidosVivos;
    }

    public void setNumeroNacidosVivos(String numeroNacidosVivos) {
        this.numeroNacidosVivos = numeroNacidosVivos;
    }

    public String getNumeroNacidosMuertos() {
        return numeroNacidosMuertos;
    }

    public void setNumeroNacidosMuertos(String numeroNacidosMuertos) {
        this.numeroNacidosMuertos = numeroNacidosMuertos;
    }

    public String getTerminacionUltimaGestacion() {
        return terminacionUltimaGestacion;
    }

    public void setTerminacionUltimaGestacion(String terminacionUltimaGestacion) {
        this.terminacionUltimaGestacion = terminacionUltimaGestacion;
    }

    public Date getFechaTerminacionGestacion() {
        return fechaTerminacionGestacion;
    }

    public void setFechaTerminacionGestacion(Date fechaTerminacionGestacion) {
        this.fechaTerminacionGestacion = fechaTerminacionGestacion;
    }

    public String getPersonaAtendioUltimoParto() {
        return personaAtendioUltimoParto;
    }

    public void setPersonaAtendioUltimoParto(String personaAtendioUltimoParto) {
        this.personaAtendioUltimoParto = personaAtendioUltimoParto;
    }

    public String getLugarAtencionUltimoParto() {
        return lugarAtencionUltimoParto;
    }

    public void setLugarAtencionUltimoParto(String lugarAtencionUltimoParto) {
        this.lugarAtencionUltimoParto = lugarAtencionUltimoParto;
    }

    public String getComplicacionUltimoParto1() {
        return complicacionUltimoParto1;
    }

    public void setComplicacionUltimoParto1(String complicacionUltimoParto1) {
        this.complicacionUltimoParto1 = complicacionUltimoParto1;
    }

    public String getComplicacionUltimoParto2() {
        return complicacionUltimoParto2;
    }

    public void setComplicacionUltimoParto2(String complicacionUltimoParto2) {
        this.complicacionUltimoParto2 = complicacionUltimoParto2;
    }

    public String getComplicacionUltimoParto3() {
        return complicacionUltimoParto3;
    }

    public void setComplicacionUltimoParto3(String complicacionUltimoParto3) {
        this.complicacionUltimoParto3 = complicacionUltimoParto3;
    }

    public String getComplicacionUltimoParto4() {
        return complicacionUltimoParto4;
    }

    public void setComplicacionUltimoParto4(String complicacionUltimoParto4) {
        this.complicacionUltimoParto4 = complicacionUltimoParto4;
    }

    public String getComplicacionUltimoParto5() {
        return complicacionUltimoParto5;
    }

    public void setComplicacionUltimoParto5(String complicacionUltimoParto5) {
        this.complicacionUltimoParto5 = complicacionUltimoParto5;
    }

    public Date getFechaUltimaMenstruacion() {
        return fechaUltimaMenstruacion;
    }

    public void setFechaUltimaMenstruacion(Date fechaUltimaMenstruacion) {
        this.fechaUltimaMenstruacion = fechaUltimaMenstruacion;
    }

    public String getEdadGestacion() {
        return edadGestacion;
    }

    public void setEdadGestacion(String edadGestacion) {
        this.edadGestacion = edadGestacion;
    }

    public Date getFechaProbableParto() {
        return fechaProbableParto;
    }

    public void setFechaProbableParto(Date fechaProbableParto) {
        this.fechaProbableParto = fechaProbableParto;
    }

    public String getPracCultuDuranteGestacion1() {
        return pracCultuDuranteGestacion1;
    }

    public void setPracCultuDuranteGestacion1(String pracCultuDuranteGestacion1) {
        this.pracCultuDuranteGestacion1 = pracCultuDuranteGestacion1;
    }

    public String getPracCultuDuranteGestacion2() {
        return pracCultuDuranteGestacion2;
    }

    public void setPracCultuDuranteGestacion2(String pracCultuDuranteGestacion2) {
        this.pracCultuDuranteGestacion2 = pracCultuDuranteGestacion2;
    }

    public String getPracCultuDuranteGestacion3() {
        return pracCultuDuranteGestacion3;
    }

    public void setPracCultuDuranteGestacion3(String pracCultuDuranteGestacion3) {
        this.pracCultuDuranteGestacion3 = pracCultuDuranteGestacion3;
    }

    public String getPracCultuDuranteGestacion4() {
        return pracCultuDuranteGestacion4;
    }

    public void setPracCultuDuranteGestacion4(String pracCultuDuranteGestacion4) {
        this.pracCultuDuranteGestacion4 = pracCultuDuranteGestacion4;
    }

    public String getPracCultuDuranteGestacion5() {
        return pracCultuDuranteGestacion5;
    }

    public void setPracCultuDuranteGestacion5(String pracCultuDuranteGestacion5) {
        this.pracCultuDuranteGestacion5 = pracCultuDuranteGestacion5;
    }

    public String getAcompamientoGestacion1() {
        return acompamientoGestacion1;
    }

    public void setAcompamientoGestacion1(String acompamientoGestacion1) {
        this.acompamientoGestacion1 = acompamientoGestacion1;
    }

    public String getAcompamientoGestacion2() {
        return acompamientoGestacion2;
    }

    public void setAcompamientoGestacion2(String acompamientoGestacion2) {
        this.acompamientoGestacion2 = acompamientoGestacion2;
    }

    public String getAcompamientoGestacion3() {
        return acompamientoGestacion3;
    }

    public void setAcompamientoGestacion3(String acompamientoGestacion3) {
        this.acompamientoGestacion3 = acompamientoGestacion3;
    }

    public String getAcompamientoGestacion4() {
        return acompamientoGestacion4;
    }

    public void setAcompamientoGestacion4(String acompamientoGestacion4) {
        this.acompamientoGestacion4 = acompamientoGestacion4;
    }

    public String getAcompamientoGestacion5() {
        return acompamientoGestacion5;
    }

    public void setAcompamientoGestacion5(String acompamientoGestacion5) {
        this.acompamientoGestacion5 = acompamientoGestacion5;
    }

    public String getAcompañamientoFamilia() {
        return acompañamientoFamilia;
    }

    public void setAcompañamientoFamilia(String acompañamientoFamilia) {
        this.acompañamientoFamilia = acompañamientoFamilia;
    }

    public String getFactoresRiesgoGestante1() {
        return factoresRiesgoGestante1;
    }

    public void setFactoresRiesgoGestante1(String factoresRiesgoGestante1) {
        this.factoresRiesgoGestante1 = factoresRiesgoGestante1;
    }

    public String getFactoresRiesgoGestante2() {
        return factoresRiesgoGestante2;
    }

    public void setFactoresRiesgoGestante2(String factoresRiesgoGestante2) {
        this.factoresRiesgoGestante2 = factoresRiesgoGestante2;
    }

    public String getFactoresRiesgoGestante3() {
        return factoresRiesgoGestante3;
    }

    public void setFactoresRiesgoGestante3(String factoresRiesgoGestante3) {
        this.factoresRiesgoGestante3 = factoresRiesgoGestante3;
    }

    public String getFactoresRiesgoGestante4() {
        return factoresRiesgoGestante4;
    }

    public void setFactoresRiesgoGestante4(String factoresRiesgoGestante4) {
        this.factoresRiesgoGestante4 = factoresRiesgoGestante4;
    }

    public String getFactoresRiesgoGestante5() {
        return factoresRiesgoGestante5;
    }

    public void setFactoresRiesgoGestante5(String factoresRiesgoGestante5) {
        this.factoresRiesgoGestante5 = factoresRiesgoGestante5;
    }

    public String getPruebaSerologicaUltTriGes() {
        return pruebaSerologicaUltTriGes;
    }

    public void setPruebaSerologicaUltTriGes(String pruebaSerologicaUltTriGes) {
        this.pruebaSerologicaUltTriGes = pruebaSerologicaUltTriGes;
    }

    public String getPruebaVihUlTriGes() {
        return pruebaVihUlTriGes;
    }

    public void setPruebaVihUlTriGes(String pruebaVihUlTriGes) {
        this.pruebaVihUlTriGes = pruebaVihUlTriGes;
    }

    public String getMetodoPlaneacionFamiliar1() {
        return metodoPlaneacionFamiliar1;
    }

    public void setMetodoPlaneacionFamiliar1(String metodoPlaneacionFamiliar1) {
        this.metodoPlaneacionFamiliar1 = metodoPlaneacionFamiliar1;
    }

    public String getMetodoPlaneacionFamiliar2() {
        return metodoPlaneacionFamiliar2;
    }

    public void setMetodoPlaneacionFamiliar2(String metodoPlaneacionFamiliar2) {
        this.metodoPlaneacionFamiliar2 = metodoPlaneacionFamiliar2;
    }

    public String getMetodoPlaneacionFamiliar3() {
        return metodoPlaneacionFamiliar3;
    }

    public void setMetodoPlaneacionFamiliar3(String metodoPlaneacionFamiliar3) {
        this.metodoPlaneacionFamiliar3 = metodoPlaneacionFamiliar3;
    }

    public String getMetodoPlaneacionFamiliar4() {
        return metodoPlaneacionFamiliar4;
    }

    public void setMetodoPlaneacionFamiliar4(String metodoPlaneacionFamiliar4) {
        this.metodoPlaneacionFamiliar4 = metodoPlaneacionFamiliar4;
    }

    public String getMetodoPlaneacionFamiliar5() {
        return metodoPlaneacionFamiliar5;
    }

    public void setMetodoPlaneacionFamiliar5(String metodoPlaneacionFamiliar5) {
        this.metodoPlaneacionFamiliar5 = metodoPlaneacionFamiliar5;
    }

    public String getCitologiaCervicoUterina() {
        return citologiaCervicoUterina;
    }

    public void setCitologiaCervicoUterina(String citologiaCervicoUterina) {
        this.citologiaCervicoUterina = citologiaCervicoUterina;
    }

    public String getResultadoExamenCitologia() {
        return resultadoExamenCitologia;
    }

    public void setResultadoExamenCitologia(String resultadoExamenCitologia) {
        this.resultadoExamenCitologia = resultadoExamenCitologia;
    }

    public String getAccionesResultadoCitologia() {
        return accionesResultadoCitologia;
    }

    public void setAccionesResultadoCitologia(String accionesResultadoCitologia) {
        this.accionesResultadoCitologia = accionesResultadoCitologia;
    }

    public String getAutoexamenMama() {
        return autoexamenMama;
    }

    public void setAutoexamenMama(String autoexamenMama) {
        this.autoexamenMama = autoexamenMama;
    }

    public String getSaludSexual() {
        return saludSexual;
    }

    public void setSaludSexual(String saludSexual) {
        this.saludSexual = saludSexual;
    }

    public String getExamenProstata() {
        return examenProstata;
    }

    public void setExamenProstata(String examenProstata) {
        this.examenProstata = examenProstata;
    }

    public String getResultadoExamenProstata() {
        return resultadoExamenProstata;
    }

    public void setResultadoExamenProstata(String resultadoExamenProstata) {
        this.resultadoExamenProstata = resultadoExamenProstata;
    }

    public String getAccionesExamenProstata() {
        return accionesExamenProstata;
    }

    public void setAccionesExamenProstata(String accionesExamenProstata) {
        this.accionesExamenProstata = accionesExamenProstata;
    }

    public Date getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(Date fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public String getIdentificacionAgente() {
        return identificacionAgente;
    }

    public void setIdentificacionAgente(String identificacionAgente) {
        this.identificacionAgente = identificacionAgente;
    }

    public BigInteger getIdUsuarioCarga() {
        return idUsuarioCarga;
    }

    public void setIdUsuarioCarga(BigInteger idUsuarioCarga) {
        this.idUsuarioCarga = idUsuarioCarga;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCargaNucleoFamiliar != null ? idCargaNucleoFamiliar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CargaNucleoFamiliar)) {
            return false;
        }
        CargaNucleoFamiliar other = (CargaNucleoFamiliar) object;
        if ((this.idCargaNucleoFamiliar == null && other.idCargaNucleoFamiliar != null) || (this.idCargaNucleoFamiliar != null && !this.idCargaNucleoFamiliar.equals(other.idCargaNucleoFamiliar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sinchronize.entities.CargaNucleoFamiliar[ idCargaNucleoFamiliar=" + idCargaNucleoFamiliar + " ]";
    }
    
}
