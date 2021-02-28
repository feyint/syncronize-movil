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
@Table(name = "FNBNUCVIV_FVCCONVIV")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FnbnucvivFvcconviv.findAll", query = "SELECT f FROM FnbnucvivFvcconviv f"),
    @NamedQuery(name = "FnbnucvivFvcconviv.findById", query = "SELECT f FROM FnbnucvivFvcconviv f WHERE f.id = :id"),
    @NamedQuery(name = "FnbnucvivFvcconviv.findBySeleccion", query = "SELECT f FROM FnbnucvivFvcconviv f WHERE f.seleccion = :seleccion"),
    @NamedQuery(name = "FnbnucvivFvcconviv.findByFechaActividad", query = "SELECT f FROM FnbnucvivFvcconviv f WHERE f.fechaActividad = :fechaActividad"),
    @NamedQuery(name = "FnbnucvivFvcconviv.findByUsuarioData", query = "SELECT f FROM FnbnucvivFvcconviv f WHERE f.usuarioData = :usuarioData"),
    @NamedQuery(name = "FnbnucvivFvcconviv.findByFechaCreacion", query = "SELECT f FROM FnbnucvivFvcconviv f WHERE f.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "FnbnucvivFvcconviv.findByOrigenData", query = "SELECT f FROM FnbnucvivFvcconviv f WHERE f.origenData = :origenData"),
    @NamedQuery(name = "FnbnucvivFvcconviv.findByFvcelevivId", query = "SELECT f FROM FnbnucvivFvcconviv f WHERE f.fvcelevivId = :fvcelevivId"),
    @NamedQuery(name = "FnbnucvivFvcconviv.findByOriginalReference", query = "SELECT f FROM FnbnucvivFvcconviv f WHERE f.originalReference = :originalReference"),
    @NamedQuery(name = "FnbnucvivFvcconviv.findByHasDuplicates", query = "SELECT f FROM FnbnucvivFvcconviv f WHERE f.hasDuplicates = :hasDuplicates"),
    @NamedQuery(name = "FnbnucvivFvcconviv.findByStatus", query = "SELECT f FROM FnbnucvivFvcconviv f WHERE f.status = :status"),
    @NamedQuery(name = "FnbnucvivFvcconviv.findByUpdatedAt", query = "SELECT f FROM FnbnucvivFvcconviv f WHERE f.updatedAt = :updatedAt")})
public class FnbnucvivFvcconviv implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name = "ISEQ$$_74862", sequenceName = "ISEQ$$_74862", initialValue = 10, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ISEQ$$_74862")
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "FVCELEVIV_ID")
    private Long fvcelevivId;
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
    @JoinColumn(name = "FVCCONVIV_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fvcconviv fvcconvivId;

    public FnbnucvivFvcconviv() {
    }

    public FnbnucvivFvcconviv(Long id) {
        this.id = id;
    }

    public FnbnucvivFvcconviv(Long id, String seleccion, Date fechaActividad, String usuarioData, Date fechaCreacion, String origenData, Long fvcelevivId) {
        this.id = id;
        this.seleccion = seleccion;
        this.fechaActividad = fechaActividad;
        this.usuarioData = usuarioData;
        this.fechaCreacion = fechaCreacion;
        this.origenData = origenData;
        this.fvcelevivId = fvcelevivId;
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

    public Long getFvcelevivId() {
        return fvcelevivId;
    }

    public void setFvcelevivId(Long fvcelevivId) {
        this.fvcelevivId = fvcelevivId;
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

    public Fvcconviv getFvcconvivId() {
        return fvcconvivId;
    }

    public void setFvcconvivId(Fvcconviv fvcconvivId) {
        this.fvcconvivId = fvcconvivId;
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
        if (!(object instanceof FnbnucvivFvcconviv)) {
            return false;
        }
        FnbnucvivFvcconviv other = (FnbnucvivFvcconviv) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sinchronize.entities.FnbnucvivFvcconviv[ id=" + id + " ]";
    }
    
}
