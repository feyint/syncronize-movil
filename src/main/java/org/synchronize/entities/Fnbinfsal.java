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
import javax.persistence.ManyToOne;
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
@Table(name = "FNBINFSAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fnbinfsal.findAll", query = "SELECT f FROM Fnbinfsal f"),
    @NamedQuery(name = "Fnbinfsal.findById", query = "SELECT f FROM Fnbinfsal f WHERE f.id = :id"),
    @NamedQuery(name = "Fnbinfsal.findByPeso", query = "SELECT f FROM Fnbinfsal f WHERE f.peso = :peso"),
    @NamedQuery(name = "Fnbinfsal.findByTalla", query = "SELECT f FROM Fnbinfsal f WHERE f.talla = :talla"),
    @NamedQuery(name = "Fnbinfsal.findByTaSistolica", query = "SELECT f FROM Fnbinfsal f WHERE f.taSistolica = :taSistolica"),
    @NamedQuery(name = "Fnbinfsal.findByTaDiastolica", query = "SELECT f FROM Fnbinfsal f WHERE f.taDiastolica = :taDiastolica"),
    @NamedQuery(name = "Fnbinfsal.findByUsoProtesis", query = "SELECT f FROM Fnbinfsal f WHERE f.usoProtesis = :usoProtesis"),
    @NamedQuery(name = "Fnbinfsal.findByTiempoProtesis", query = "SELECT f FROM Fnbinfsal f WHERE f.tiempoProtesis = :tiempoProtesis"),
    @NamedQuery(name = "Fnbinfsal.findByUltimaVisita", query = "SELECT f FROM Fnbinfsal f WHERE f.ultimaVisita = :ultimaVisita"),
    @NamedQuery(name = "Fnbinfsal.findByFechaMuerte", query = "SELECT f FROM Fnbinfsal f WHERE f.fechaMuerte = :fechaMuerte"),
   // @NamedQuery(name = "Fnbinfsal.findByDefuncion", query = "SELECT f FROM Fnbinfsal f WHERE f.defuncion = :defuncion"),
    @NamedQuery(name = "Fnbinfsal.findByFechaActividad", query = "SELECT f FROM Fnbinfsal f WHERE f.fechaActividad = :fechaActividad"),
    @NamedQuery(name = "Fnbinfsal.findByUsuarioData", query = "SELECT f FROM Fnbinfsal f WHERE f.usuarioData = :usuarioData"),
    @NamedQuery(name = "Fnbinfsal.findByFechaCreacion", query = "SELECT f FROM Fnbinfsal f WHERE f.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Fnbinfsal.findByOrigenData", query = "SELECT f FROM Fnbinfsal f WHERE f.origenData = :origenData"),
    @NamedQuery(name = "Fnbinfsal.findByOriginalReference", query = "SELECT f FROM Fnbinfsal f WHERE f.originalReference = :originalReference"),
    @NamedQuery(name = "Fnbinfsal.findByHasDuplicates", query = "SELECT f FROM Fnbinfsal f WHERE f.hasDuplicates = :hasDuplicates"),
    @NamedQuery(name = "Fnbinfsal.findByStatus", query = "SELECT f FROM Fnbinfsal f WHERE f.status = :status"),
    @NamedQuery(name = "Fnbinfsal.findByUpdatedAt", query = "SELECT f FROM Fnbinfsal f WHERE f.updatedAt = :updatedAt")})
public class Fnbinfsal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name = "ISEQ$$_74976", sequenceName = "ISEQ$$_74976", initialValue = 10, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ISEQ$$_74976")
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PESO")
    private Float peso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TALLA")
    private Float talla;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TA_SISTOLICA")
    private Integer taSistolica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TA_DIASTOLICA")
    private Integer taDiastolica;
    @Column(name = "USO_PROTESIS")
    private Integer usoProtesis;
    @Column(name = "TIEMPO_PROTESIS")
    private Integer tiempoProtesis;
    @Basic(optional = false)
    @NotNull    
    @Column(name = "ULTIMA_VISITA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultimaVisita;
    @Column(name = "FECHA_MUERTE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaMuerte;
    //@Column(name = "DEFUNCION")
    //private Date defuncion;
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
    private Integer originalReference;
    @Column(name = "HAS_DUPLICATES")
    private Integer hasDuplicates;
    @Column(name = "STATUS")
    private Integer status;
    @Column(name = "UPDATED_AT")
    private Date updatedAt;   
        @JoinColumn(name = "FNCINTIMC_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fncintimc fncintimcId;
    @JoinColumn(name = "FNCINTTEA_ID", referencedColumnName = "ID")
    @ManyToOne
    private Fncinttea fncintteaId;
    @JoinColumn(name = "FNCPERSON_ID", referencedColumnName = "ID")
    @OneToOne(optional = false)
    private Fncperson fncpersonId;

    public Fnbinfsal() {
    }

    public Fnbinfsal(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Float getTalla() {
        return talla;
    }

    public void setTalla(Float talla) {
        this.talla = talla;
    }

    public Integer getTaSistolica() {
        return taSistolica;
    }

    public void setTaSistolica(Integer taSistolica) {
        this.taSistolica = taSistolica;
    }

    public Integer getTaDiastolica() {
        return taDiastolica;
    }

    public void setTaDiastolica(Integer taDiastolica) {
        this.taDiastolica = taDiastolica;
    }

    public Integer getUsoProtesis() {
        return usoProtesis;
    }

    public void setUsoProtesis(Integer usoProtesis) {
        this.usoProtesis = usoProtesis;
    }

    public Integer getTiempoProtesis() {
        return tiempoProtesis;
    }

    public void setTiempoProtesis(Integer tiempoProtesis) {
        this.tiempoProtesis = tiempoProtesis;
    }

    public Date getUltimaVisita() {
        return ultimaVisita;
    }

    public void setUltimaVisita(Date ultimaVisita) {
        this.ultimaVisita = ultimaVisita;
    }

    public Date getFechaMuerte() {
        return fechaMuerte;
    }

    public void setFechaMuerte(Date fechaMuerte) {
        this.fechaMuerte = fechaMuerte;
    }
/*
    public Date getDefuncion() {
        return defuncion;
    }

    public void setDefuncion(Date defuncion) {
        this.defuncion = defuncion;
    }
*/
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

    public Integer getOriginalReference() {
        return originalReference;
    }

    public void setOriginalReference(Integer originalReference) {
        this.originalReference = originalReference;
    }

    public Integer getHasDuplicates() {
        return hasDuplicates;
    }

    public void setHasDuplicates(Integer hasDuplicates) {
        this.hasDuplicates = hasDuplicates;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Fncintimc getFncintimcId() {
        return fncintimcId;
    }

    public void setFncintimcId(Fncintimc fncintimcId) {
        this.fncintimcId = fncintimcId;
    }

    public Fncinttea getFncintteaId() {
        return fncintteaId;
    }

    public void setFncintteaId(Fncinttea fncintteaId) {
        this.fncintteaId = fncintteaId;
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
        if (!(object instanceof Fnbinfsal)) {
            return false;
        }
        Fnbinfsal other = (Fnbinfsal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.synchronize.entities.Fnbinfsal[ id=" + id + " ]";
    }
    
}
