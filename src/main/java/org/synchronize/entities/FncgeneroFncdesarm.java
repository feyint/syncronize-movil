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
@Table(name = "FNCGENERO_FNCDESARM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FncgeneroFncdesarm.findAll", query = "SELECT f FROM FncgeneroFncdesarm f"),
    @NamedQuery(name = "FncgeneroFncdesarm.findById", query = "SELECT f FROM FncgeneroFncdesarm f WHERE f.id = :id"),
    @NamedQuery(name = "FncgeneroFncdesarm.findBySeleccion", query = "SELECT f FROM FncgeneroFncdesarm f WHERE f.seleccion = :seleccion"),
    @NamedQuery(name = "FncgeneroFncdesarm.findByFechaActividad", query = "SELECT f FROM FncgeneroFncdesarm f WHERE f.fechaActividad = :fechaActividad"),
    @NamedQuery(name = "FncgeneroFncdesarm.findByUsuarioData", query = "SELECT f FROM FncgeneroFncdesarm f WHERE f.usuarioData = :usuarioData"),
    @NamedQuery(name = "FncgeneroFncdesarm.findByFechaCreacion", query = "SELECT f FROM FncgeneroFncdesarm f WHERE f.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "FncgeneroFncdesarm.findByOrigenData", query = "SELECT f FROM FncgeneroFncdesarm f WHERE f.origenData = :origenData")})
public class FncgeneroFncdesarm implements Serializable {

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
    @JoinColumn(name = "FNCDESARM_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fncdesarm fncdesarmId;
    @JoinColumn(name = "FNCGENERO_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fncgenero fncgeneroId;

    public FncgeneroFncdesarm() {
    }

    public FncgeneroFncdesarm(Long id) {
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

    public Fncdesarm getFncdesarmId() {
        return fncdesarmId;
    }

    public void setFncdesarmId(Fncdesarm fncdesarmId) {
        this.fncdesarmId = fncdesarmId;
    }

    public Fncgenero getFncgeneroId() {
        return fncgeneroId;
    }

    public void setFncgeneroId(Fncgenero fncgeneroId) {
        this.fncgeneroId = fncgeneroId;
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
        if (!(object instanceof FncgeneroFncdesarm)) {
            return false;
        }
        FncgeneroFncdesarm other = (FncgeneroFncdesarm) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sinchronize.entities.FncgeneroFncdesarm[ id=" + id + " ]";
    }
    
}
