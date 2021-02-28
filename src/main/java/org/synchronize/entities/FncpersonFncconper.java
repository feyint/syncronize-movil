/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.synchronize.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 57315
 */
@Entity
@Table(name = "FNCPERSON_FNCCONPER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FncpersonFncconper.findAll", query = "SELECT f FROM FncpersonFncconper f"),
    @NamedQuery(name = "FncpersonFncconper.findById", query = "SELECT f FROM FncpersonFncconper f WHERE f.id = :id"),
    @NamedQuery(name = "FncpersonFncconper.findBySeleccion", query = "SELECT f FROM FncpersonFncconper f WHERE f.seleccion = :seleccion"),
    @NamedQuery(name = "FncpersonFncconper.findByFnceleperId", query = "SELECT f FROM FncpersonFncconper f WHERE f.fnceleperId = :fnceleperId"),
    @NamedQuery(name = "FncpersonFncconper.findByFechaActividad", query = "SELECT f FROM FncpersonFncconper f WHERE f.fechaActividad = :fechaActividad"),
    @NamedQuery(name = "FncpersonFncconper.findByUsuarioData", query = "SELECT f FROM FncpersonFncconper f WHERE f.usuarioData = :usuarioData"),
    @NamedQuery(name = "FncpersonFncconper.findByFechaCreacion", query = "SELECT f FROM FncpersonFncconper f WHERE f.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "FncpersonFncconper.findByOrigenData", query = "SELECT f FROM FncpersonFncconper f WHERE f.origenData = :origenData"),
    @NamedQuery(name = "FncpersonFncconper.findByOriginalReference", query = "SELECT f FROM FncpersonFncconper f WHERE f.originalReference = :originalReference"),
    @NamedQuery(name = "FncpersonFncconper.findByHasDuplicates", query = "SELECT f FROM FncpersonFncconper f WHERE f.hasDuplicates = :hasDuplicates"),
    @NamedQuery(name = "FncpersonFncconper.findByStatus", query = "SELECT f FROM FncpersonFncconper f WHERE f.status = :status"),
    @NamedQuery(name = "FncpersonFncconper.findByUpdatedAt", query = "SELECT f FROM FncpersonFncconper f WHERE f.updatedAt = :updatedAt")})
public class FncpersonFncconper implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "SELECCION")
    private String seleccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FNCELEPER_ID")
    private long fnceleperId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_ACTIVIDAD")
    private Date fechaActividad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "USUARIO_DATA")
    private String usuarioData;
    @Basic(optional = false)
    @NotNull
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
    private Serializable updatedAt;
    @JoinColumn(name = "FNCCONPER_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fncconper fncconperId;
    @JoinColumn(name = "FNCPERSON_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fncperson fncpersonId;

    public FncpersonFncconper() {
    }

    public FncpersonFncconper(Long id) {
        this.id = id;
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

    public long getFnceleperId() {
        return fnceleperId;
    }

    public void setFnceleperId(long fnceleperId) {
        this.fnceleperId = fnceleperId;
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

    public Serializable getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Serializable updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Fncconper getFncconperId() {
        return fncconperId;
    }

    public void setFncconperId(Fncconper fncconperId) {
        this.fncconperId = fncconperId;
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
        if (!(object instanceof FncpersonFncconper)) {
            return false;
        }
        FncpersonFncconper other = (FncpersonFncconper) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sinchronize.entities.FncpersonFncconper[ id=" + id + " ]";
    }
    
}
