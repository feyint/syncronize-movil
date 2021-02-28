/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.synchronize.entities;

import java.util.Date;
import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "FNCSALREP_FNCCONREP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FncsalrepFncconrep.findAll", query = "SELECT f FROM FncsalrepFncconrep f"),
    @NamedQuery(name = "FncsalrepFncconrep.findById", query = "SELECT f FROM FncsalrepFncconrep f WHERE f.id = :id"),
    @NamedQuery(name = "FncsalrepFncconrep.findBySeleccion", query = "SELECT f FROM FncsalrepFncconrep f WHERE f.seleccion = :seleccion"),
    @NamedQuery(name = "FncsalrepFncconrep.findByFncelerepId", query = "SELECT f FROM FncsalrepFncconrep f WHERE f.fncelerepId = :fncelerepId"),
    @NamedQuery(name = "FncsalrepFncconrep.findByFechaActividad", query = "SELECT f FROM FncsalrepFncconrep f WHERE f.fechaActividad = :fechaActividad"),
    @NamedQuery(name = "FncsalrepFncconrep.findByUsuarioData", query = "SELECT f FROM FncsalrepFncconrep f WHERE f.usuarioData = :usuarioData"),
    @NamedQuery(name = "FncsalrepFncconrep.findByFechaCreacion", query = "SELECT f FROM FncsalrepFncconrep f WHERE f.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "FncsalrepFncconrep.findByOrigenData", query = "SELECT f FROM FncsalrepFncconrep f WHERE f.origenData = :origenData"),
    @NamedQuery(name = "FncsalrepFncconrep.findByOriginalReference", query = "SELECT f FROM FncsalrepFncconrep f WHERE f.originalReference = :originalReference"),
    @NamedQuery(name = "FncsalrepFncconrep.findByHasDuplicates", query = "SELECT f FROM FncsalrepFncconrep f WHERE f.hasDuplicates = :hasDuplicates"),
    @NamedQuery(name = "FncsalrepFncconrep.findByStatus", query = "SELECT f FROM FncsalrepFncconrep f WHERE f.status = :status"),
    @NamedQuery(name = "FncsalrepFncconrep.findByUpdatedAt", query = "SELECT f FROM FncsalrepFncconrep f WHERE f.updatedAt = :updatedAt")})
public class FncsalrepFncconrep implements Serializable {

    //ISEQ$$_74919
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name = "ISEQ$$_74919", sequenceName = "ISEQ$$_74919", initialValue = 10, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ISEQ$$_74919")
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Size(max = 250)
    @Column(name = "SELECCION")
    private String seleccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FNCELEREP_ID")
    private long fncelerepId;
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
    private Short originalReference;
    @Column(name = "HAS_DUPLICATES")
    private BigInteger hasDuplicates;
    @Column(name = "STATUS")
    private Short status;
    @Column(name = "UPDATED_AT")
    private Date updatedAt;
    @JoinColumn(name = "FNCCONREP_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fncconrep fncconrepId;
    @JoinColumn(name = "FNCSALREP_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fncsalrep fncsalrepId;

    public FncsalrepFncconrep() {
    }

    public FncsalrepFncconrep(Long id) {
        this.id = id;
    }

    public FncsalrepFncconrep(Long id, long fncelerepId, Date fechaActividad, String usuarioData, Date fechaCreacion, String origenData) {
        this.id = id;
        this.fncelerepId = fncelerepId;
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

    public String getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(String seleccion) {
        this.seleccion = seleccion;
    }

    public long getFncelerepId() {
        return fncelerepId;
    }

    public void setFncelerepId(long fncelerepId) {
        this.fncelerepId = fncelerepId;
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

    public Short getOriginalReference() {
        return originalReference;
    }

    public void setOriginalReference(Short originalReference) {
        this.originalReference = originalReference;
    }

    public BigInteger getHasDuplicates() {
        return hasDuplicates;
    }

    public void setHasDuplicates(BigInteger hasDuplicates) {
        this.hasDuplicates = hasDuplicates;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Fncconrep getFncconrepId() {
        return fncconrepId;
    }

    public void setFncconrepId(Fncconrep fncconrepId) {
        this.fncconrepId = fncconrepId;
    }

    public Fncsalrep getFncsalrepId() {
        return fncsalrepId;
    }

    public void setFncsalrepId(Fncsalrep fncsalrepId) {
        this.fncsalrepId = fncsalrepId;
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
        if (!(object instanceof FncsalrepFncconrep)) {
            return false;
        }
        FncsalrepFncconrep other = (FncsalrepFncconrep) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sinchronize.entities.FncsalrepFncconrep[ id=" + id + " ]";
    }
    
}
