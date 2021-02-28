/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.synchronize.entities;

import java.util.Date;
import java.io.Serializable;
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
@Table(name = "FNBINFSAL_FNCDESARM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FnbinfsalFncdesarm.findAll", query = "SELECT f FROM FnbinfsalFncdesarm f"),
    @NamedQuery(name = "FnbinfsalFncdesarm.findById", query = "SELECT f FROM FnbinfsalFncdesarm f WHERE f.id = :id"),
    @NamedQuery(name = "FnbinfsalFncdesarm.findBySeleccion", query = "SELECT f FROM FnbinfsalFncdesarm f WHERE f.seleccion = :seleccion"),
    @NamedQuery(name = "FnbinfsalFncdesarm.findByFechaActividad", query = "SELECT f FROM FnbinfsalFncdesarm f WHERE f.fechaActividad = :fechaActividad"),
    @NamedQuery(name = "FnbinfsalFncdesarm.findByUsuarioData", query = "SELECT f FROM FnbinfsalFncdesarm f WHERE f.usuarioData = :usuarioData"),
    @NamedQuery(name = "FnbinfsalFncdesarm.findByFechaCreacion", query = "SELECT f FROM FnbinfsalFncdesarm f WHERE f.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "FnbinfsalFncdesarm.findByOrigenData", query = "SELECT f FROM FnbinfsalFncdesarm f WHERE f.origenData = :origenData")})
public class FnbinfsalFncdesarm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name = "ISEQ$$_74860", sequenceName = "ISEQ$$_74860", initialValue = 10, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ISEQ$$_74860")
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
    @JoinColumn(name = "FNBINFSAL_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fnbinfsal fnbinfsalId;
    @JoinColumn(name = "FNCDESARM_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fncdesarm fncdesarmId;

    public FnbinfsalFncdesarm() {
    }

    public FnbinfsalFncdesarm(Long id) {
        this.id = id;
    }

    public FnbinfsalFncdesarm(Long id, String seleccion, Date fechaActividad, String usuarioData, Date fechaCreacion, String origenData) {
        this.id = id;
        this.seleccion = seleccion;
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

    public Fncdesarm getFncdesarmId() {
        return fncdesarmId;
    }

    public void setFncdesarmId(Fncdesarm fncdesarmId) {
        this.fncdesarmId = fncdesarmId;
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
        if (!(object instanceof FnbinfsalFncdesarm)) {
            return false;
        }
        FnbinfsalFncdesarm other = (FnbinfsalFncdesarm) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sinchronize.entities.FnbinfsalFncdesarm[ id=" + id + " ]";
    }
    
}
