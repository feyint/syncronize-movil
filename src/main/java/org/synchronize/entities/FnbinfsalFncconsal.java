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
@Table(name = "FNBINFSAL_FNCCONSAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FnbinfsalFncconsal.findAll", query = "SELECT f FROM FnbinfsalFncconsal f"),
    @NamedQuery(name = "FnbinfsalFncconsal.findById", query = "SELECT f FROM FnbinfsalFncconsal f WHERE f.id = :id"),
    @NamedQuery(name = "FnbinfsalFncconsal.findBySeleccion", query = "SELECT f FROM FnbinfsalFncconsal f WHERE f.seleccion = :seleccion"),
    @NamedQuery(name = "FnbinfsalFncconsal.findByFncelesalId", query = "SELECT f FROM FnbinfsalFncconsal f WHERE f.fncelesalId = :fncelesalId"),
    @NamedQuery(name = "FnbinfsalFncconsal.findByFechaActividad", query = "SELECT f FROM FnbinfsalFncconsal f WHERE f.fechaActividad = :fechaActividad"),
    @NamedQuery(name = "FnbinfsalFncconsal.findByUsuarioData", query = "SELECT f FROM FnbinfsalFncconsal f WHERE f.usuarioData = :usuarioData"),
    @NamedQuery(name = "FnbinfsalFncconsal.findByFechaCreacion", query = "SELECT f FROM FnbinfsalFncconsal f WHERE f.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "FnbinfsalFncconsal.findByOrigenData", query = "SELECT f FROM FnbinfsalFncconsal f WHERE f.origenData = :origenData")})
public class FnbinfsalFncconsal implements Serializable {

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
    @Column(name = "FNCELESAL_ID")
    private long fncelesalId;
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
    @JoinColumn(name = "FNBINFSAL_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fnbinfsal fnbinfsalId;
    @JoinColumn(name = "FNCCONSAL_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fncconsal fncconsalId;

    public FnbinfsalFncconsal() {
    }

    public FnbinfsalFncconsal(Long id) {
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

    public long getFncelesalId() {
        return fncelesalId;
    }

    public void setFncelesalId(long fncelesalId) {
        this.fncelesalId = fncelesalId;
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

    public Fnbinfsal getFnbinfsalId() {
        return fnbinfsalId;
    }

    public void setFnbinfsalId(Fnbinfsal fnbinfsalId) {
        this.fnbinfsalId = fnbinfsalId;
    }

    public Fncconsal getFncconsalId() {
        return fncconsalId;
    }

    public void setFncconsalId(Fncconsal fncconsalId) {
        this.fncconsalId = fncconsalId;
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
        if (!(object instanceof FnbinfsalFncconsal)) {
            return false;
        }
        FnbinfsalFncconsal other = (FnbinfsalFncconsal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sinchronize.entities.FnbinfsalFncconsal[ id=" + id + " ]";
    }
    
}
