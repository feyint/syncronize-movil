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
@Table(name = "FNBNUCVIV_FNCPERSON")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FnbnucvivFncperson.findAll", query = "SELECT f FROM FnbnucvivFncperson f"),
    @NamedQuery(name = "FnbnucvivFncperson.findById", query = "SELECT f FROM FnbnucvivFncperson f WHERE f.id = :id"),
    @NamedQuery(name = "FnbnucvivFncperson.findBySeleccion", query = "SELECT f FROM FnbnucvivFncperson f WHERE f.seleccion = :seleccion"),
    @NamedQuery(name = "FnbnucvivFncperson.findByFechaActividad", query = "SELECT f FROM FnbnucvivFncperson f WHERE f.fechaActividad = :fechaActividad"),
    @NamedQuery(name = "FnbnucvivFncperson.findByUsuarioData", query = "SELECT f FROM FnbnucvivFncperson f WHERE f.usuarioData = :usuarioData"),
    @NamedQuery(name = "FnbnucvivFncperson.findByFechaCreacion", query = "SELECT f FROM FnbnucvivFncperson f WHERE f.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "FnbnucvivFncperson.findByOrigenData", query = "SELECT f FROM FnbnucvivFncperson f WHERE f.origenData = :origenData"),
    @NamedQuery(name = "FnbnucvivFncperson.findByOriginalReference", query = "SELECT f FROM FnbnucvivFncperson f WHERE f.originalReference = :originalReference"),
    @NamedQuery(name = "FnbnucvivFncperson.findByHasDuplicates", query = "SELECT f FROM FnbnucvivFncperson f WHERE f.hasDuplicates = :hasDuplicates"),
    @NamedQuery(name = "FnbnucvivFncperson.findByStatus", query = "SELECT f FROM FnbnucvivFncperson f WHERE f.status = :status"),
    @NamedQuery(name = "FnbnucvivFncperson.findByUpdatedAt", query = "SELECT f FROM FnbnucvivFncperson f WHERE f.updatedAt = :updatedAt")})
public class FnbnucvivFncperson implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name = "ISEQ$$_74889", sequenceName = "ISEQ$$_74889", initialValue = 10, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ISEQ$$_74889")
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "SELECCION")
    private String seleccion;
    @Basic(optional = false)
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_ACTIVIDAD")
    private Date fechaActividad;
    @Size(max = 20)
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
    @JoinColumn(name = "FNBNUCVIV_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fnbnucviv fnbnucvivId;
    @JoinColumn(name = "FNCPERSON_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fncperson fncpersonId;

    public FnbnucvivFncperson() {
    }

    public FnbnucvivFncperson(Long id) {
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

    public Fnbnucviv getFnbnucvivId() {
        return fnbnucvivId;
    }

    public void setFnbnucvivId(Fnbnucviv fnbnucvivId) {
        this.fnbnucvivId = fnbnucvivId;
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
        if (!(object instanceof FnbnucvivFncperson)) {
            return false;
        }
        FnbnucvivFncperson other = (FnbnucvivFncperson) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sinchronize.entities.FnbnucvivFncperson[ id=" + id + " ]";
    }
    
}
