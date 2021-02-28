/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.synchronize.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
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
@Table(name = "FNCSALREP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fncsalrep.findAll", query = "SELECT f FROM Fncsalrep f"),
    @NamedQuery(name = "Fncsalrep.findById", query = "SELECT f FROM Fncsalrep f WHERE f.id = :id"),
    @NamedQuery(name = "Fncsalrep.findByEdadPrimeraRegla", query = "SELECT f FROM Fncsalrep f WHERE f.edadPrimeraRegla = :edadPrimeraRegla"),
    @NamedQuery(name = "Fncsalrep.findByGravidez", query = "SELECT f FROM Fncsalrep f WHERE f.gravidez = :gravidez"),
    @NamedQuery(name = "Fncsalrep.findByParidez", query = "SELECT f FROM Fncsalrep f WHERE f.paridez = :paridez"),
    @NamedQuery(name = "Fncsalrep.findByAborto", query = "SELECT f FROM Fncsalrep f WHERE f.aborto = :aborto"),
    @NamedQuery(name = "Fncsalrep.findByCesarea", query = "SELECT f FROM Fncsalrep f WHERE f.cesarea = :cesarea"),
    @NamedQuery(name = "Fncsalrep.findByNacidosVivos", query = "SELECT f FROM Fncsalrep f WHERE f.nacidosVivos = :nacidosVivos"),
    @NamedQuery(name = "Fncsalrep.findByNacidosMuertos", query = "SELECT f FROM Fncsalrep f WHERE f.nacidosMuertos = :nacidosMuertos"),
    @NamedQuery(name = "Fncsalrep.findByPartoUltimo", query = "SELECT f FROM Fncsalrep f WHERE f.partoUltimo = :partoUltimo"),
    @NamedQuery(name = "Fncsalrep.findByUltimaRegla", query = "SELECT f FROM Fncsalrep f WHERE f.ultimaRegla = :ultimaRegla"),
    @NamedQuery(name = "Fncsalrep.findByEdadGestacion", query = "SELECT f FROM Fncsalrep f WHERE f.edadGestacion = :edadGestacion"),
    @NamedQuery(name = "Fncsalrep.findByPartoEstimado", query = "SELECT f FROM Fncsalrep f WHERE f.partoEstimado = :partoEstimado"),
    @NamedQuery(name = "Fncsalrep.findByPresenciaFam", query = "SELECT f FROM Fncsalrep f WHERE f.presenciaFam = :presenciaFam"),
    @NamedQuery(name = "Fncsalrep.findBySerologia", query = "SELECT f FROM Fncsalrep f WHERE f.serologia = :serologia"),
    @NamedQuery(name = "Fncsalrep.findByVih", query = "SELECT f FROM Fncsalrep f WHERE f.vih = :vih"),
    @NamedQuery(name = "Fncsalrep.findByResulCitologia", query = "SELECT f FROM Fncsalrep f WHERE f.resulCitologia = :resulCitologia"),
    @NamedQuery(name = "Fncsalrep.findByAccionCitologia", query = "SELECT f FROM Fncsalrep f WHERE f.accionCitologia = :accionCitologia"),
    @NamedQuery(name = "Fncsalrep.findByResulProstata", query = "SELECT f FROM Fncsalrep f WHERE f.resulProstata = :resulProstata"),
    @NamedQuery(name = "Fncsalrep.findByAccionProstata", query = "SELECT f FROM Fncsalrep f WHERE f.accionProstata = :accionProstata"),
    @NamedQuery(name = "Fncsalrep.findByFechaActividad", query = "SELECT f FROM Fncsalrep f WHERE f.fechaActividad = :fechaActividad"),
    @NamedQuery(name = "Fncsalrep.findByUsuarioData", query = "SELECT f FROM Fncsalrep f WHERE f.usuarioData = :usuarioData"),
    @NamedQuery(name = "Fncsalrep.findByFechaCreacion", query = "SELECT f FROM Fncsalrep f WHERE f.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Fncsalrep.findByOrigenData", query = "SELECT f FROM Fncsalrep f WHERE f.origenData = :origenData"),
    @NamedQuery(name = "Fncsalrep.findByOriginalReference", query = "SELECT f FROM Fncsalrep f WHERE f.originalReference = :originalReference"),
    @NamedQuery(name = "Fncsalrep.findByHasDuplicates", query = "SELECT f FROM Fncsalrep f WHERE f.hasDuplicates = :hasDuplicates"),
    @NamedQuery(name = "Fncsalrep.findByStatus", query = "SELECT f FROM Fncsalrep f WHERE f.status = :status"),
    @NamedQuery(name = "Fncsalrep.findByUpdatedAt", query = "SELECT f FROM Fncsalrep f WHERE f.updatedAt = :updatedAt")})
public class Fncsalrep implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name = "ISEQ$$_74909", sequenceName = "ISEQ$$_74909", initialValue = 10, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ISEQ$$_74909")
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Column(name = "EDAD_PRIMERA_REGLA")
    private Integer  edadPrimeraRegla;
    @Column(name = "GRAVIDEZ")
    private Integer  gravidez;
    @Column(name = "PARIDEZ")
    private Integer  paridez;
    @Column(name = "ABORTO")
    private Integer  aborto;
    @Size(max = 250)
    @Column(name = "CESAREA")
    private String cesarea;
    @Column(name = "NACIDOS_VIVOS")
    private Integer  nacidosVivos;
    @Column(name = "NACIDOS_MUERTOS")
    private Integer  nacidosMuertos;
    @Column(name = "PARTO_ULTIMO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date partoUltimo;
    @Column(name = "ULTIMA_REGLA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultimaRegla;
    @Size(max = 500)
    @Column(name = "EDAD_GESTACION")
    private String edadGestacion;
    @Column(name = "PARTO_ESTIMADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date partoEstimado;
    @Column(name = "PRESENCIA_FAM")
    private Integer  presenciaFam;
    @Column(name = "SEROLOGIA")
    private Integer  serologia;
    @Column(name = "VIH")
    private Integer  vih;
    @Size(max = 10)
    @Column(name = "RESUL_CITOLOGIA")
    private String resulCitologia;
    @Column(name = "ACCION_CITOLOGIA")
    private Integer  accionCitologia;
    @Size(max = 10)
    @Column(name = "RESUL_PROSTATA")
    private String resulProstata;
    @Column(name = "ACCION_PROSTATA")
    private Integer  accionProstata;
    @Basic(optional = false)
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_ACTIVIDAD")
    private Date fechaActividad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "USUARIO_DATA")
    private String usuarioData;
    @Basic(optional = false)
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_CREACION")
    private Date fechaCreacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "ORIGEN_DATA")
    private String origenData;
    @Column(name = "ORIGINAL_REFERENCE")
    private Integer  originalReference;
    @Column(name = "HAS_DUPLICATES")
    private Integer  hasDuplicates;
    @Column(name = "STATUS")
    private Integer  status;
    @Column(name = "UPDATED_AT")
    private Date updatedAt;
   
    @JoinColumn(name = "FNCPERSON_ID", referencedColumnName = "ID")
    @OneToOne(optional = false)
    private Fncperson fncpersonId;

    public Fncsalrep() {
    }

    public Fncsalrep(Long id) {
        this.id = id;
    }

    public Fncsalrep(Long id, Date fechaActividad, String usuarioData, Date fechaCreacion, String origenData) {
        this.id = id;
        this.fechaActividad = fechaActividad;
        this.usuarioData = usuarioData;
        this.fechaCreacion = fechaCreacion;
        this.origenData = origenData;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer  getEdadPrimeraRegla() {
        return edadPrimeraRegla;
    }

    public void setEdadPrimeraRegla(Integer  edadPrimeraRegla) {
        this.edadPrimeraRegla = edadPrimeraRegla;
    }

    public Integer  getGravidez() {
        return gravidez;
    }

    public void setGravidez(Integer  gravidez) {
        this.gravidez = gravidez;
    }

    public Integer  getParidez() {
        return paridez;
    }

    public void setParidez(Integer  paridez) {
        this.paridez = paridez;
    }

    public Integer  getAborto() {
        return aborto;
    }

    public void setAborto(Integer  aborto) {
        this.aborto = aborto;
    }

    public String getCesarea() {
        return cesarea;
    }

    public void setCesarea(String cesarea) {
        this.cesarea = cesarea;
    }

    public Integer  getNacidosVivos() {
        return nacidosVivos;
    }

    public void setNacidosVivos(Integer  nacidosVivos) {
        this.nacidosVivos = nacidosVivos;
    }

    public Integer  getNacidosMuertos() {
        return nacidosMuertos;
    }

    public void setNacidosMuertos(Integer  nacidosMuertos) {
        this.nacidosMuertos = nacidosMuertos;
    }

    public Date getPartoUltimo() {
        return partoUltimo;
    }

    public void setPartoUltimo(Date partoUltimo) {
        this.partoUltimo = partoUltimo;
    }

    public Date getUltimaRegla() {
        return ultimaRegla;
    }

    public void setUltimaRegla(Date ultimaRegla) {
        this.ultimaRegla = ultimaRegla;
    }

    public String getEdadGestacion() {
        return edadGestacion;
    }

    public void setEdadGestacion(String edadGestacion) {
        this.edadGestacion = edadGestacion;
    }

    public Date getPartoEstimado() {
        return partoEstimado;
    }

    public void setPartoEstimado(Date partoEstimado) {
        this.partoEstimado = partoEstimado;
    }

    public Integer  getPresenciaFam() {
        return presenciaFam;
    }

    public void setPresenciaFam(Integer  presenciaFam) {
        this.presenciaFam = presenciaFam;
    }

    public Integer  getSerologia() {
        return serologia;
    }

    public void setSerologia(Integer  serologia) {
        this.serologia = serologia;
    }

    public Integer  getVih() {
        return vih;
    }

    public void setVih(Integer  vih) {
        this.vih = vih;
    }

    public String getResulCitologia() {
        return resulCitologia;
    }

    public void setResulCitologia(String resulCitologia) {
        this.resulCitologia = resulCitologia;
    }

    public Integer  getAccionCitologia() {
        return accionCitologia;
    }

    public void setAccionCitologia(Integer  accionCitologia) {
        this.accionCitologia = accionCitologia;
    }

    public String getResulProstata() {
        return resulProstata;
    }

    public void setResulProstata(String resulProstata) {
        this.resulProstata = resulProstata;
    }

    public Integer  getAccionProstata() {
        return accionProstata;
    }

    public void setAccionProstata(Integer  accionProstata) {
        this.accionProstata = accionProstata;
    }

    public Date getFechaActividad() {
        return fechaActividad;
    }

    public void setFechaActividad(Date fechaActividad) {
        this.fechaActividad = fechaActividad;
    }

    public String getUsuarioData() {
        return usuarioData;
    }

    public void setUsuarioData(String usuarioData) {
        this.usuarioData = usuarioData;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getOrigenData() {
        return origenData;
    }

    public void setOrigenData(String origenData) {
        this.origenData = origenData;
    }

    public Integer  getOriginalReference() {
        return originalReference;
    }

    public void setOriginalReference(Integer  originalReference) {
        this.originalReference = originalReference;
    }

    public Integer  getHasDuplicates() {
        return hasDuplicates;
    }

    public void setHasDuplicates(Integer  hasDuplicates) {
        this.hasDuplicates = hasDuplicates;
    }

    public Integer  getStatus() {
        return status;
    }

    public void setStatus(Integer  status) {
        this.status = status;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
 
    public Fncperson getFncpersonId() {
        return fncpersonId;
    }

    public void setFncpersonId(Fncperson fncpersonId) {
        this.fncpersonId = fncpersonId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fncsalrep)) {
            return false;
        }
        Fncsalrep other = (Fncsalrep) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sinchronize.entities.Fncsalrep[ id=" + id + " ]";
    }
    
}
