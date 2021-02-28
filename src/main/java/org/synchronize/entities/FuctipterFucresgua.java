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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "FUCTIPTER_FUCRESGUA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FuctipterFucresgua.findAll", query = "SELECT f FROM FuctipterFucresgua f"),
    @NamedQuery(name = "FuctipterFucresgua.findById", query = "SELECT f FROM FuctipterFucresgua f WHERE f.id = :id"),
    @NamedQuery(name = "FuctipterFucresgua.findBySeleccion", query = "SELECT f FROM FuctipterFucresgua f WHERE f.seleccion = :seleccion"),
    @NamedQuery(name = "FuctipterFucresgua.findByFechaActividad", query = "SELECT f FROM FuctipterFucresgua f WHERE f.fechaActividad = :fechaActividad"),
    @NamedQuery(name = "FuctipterFucresgua.findByUsuarioData", query = "SELECT f FROM FuctipterFucresgua f WHERE f.usuarioData = :usuarioData"),
    @NamedQuery(name = "FuctipterFucresgua.findByFechaCreacion", query = "SELECT f FROM FuctipterFucresgua f WHERE f.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "FuctipterFucresgua.findByOrigenData", query = "SELECT f FROM FuctipterFucresgua f WHERE f.origenData = :origenData")})
public class FuctipterFucresgua implements Serializable {

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
    @JoinColumn(name = "FUCRESGUA_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fucresgua fucresguaId;
    @JoinColumn(name = "FUCTIPTER_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fuctipter fuctipterId;

    public FuctipterFucresgua() {
    }

    public FuctipterFucresgua(Long id) {
        this.id = id;
    }

    public FuctipterFucresgua(Long id, String seleccion, Date fechaActividad, String usuarioData, Date fechaCreacion, String origenData) {
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

    public Fucresgua getFucresguaId() {
        return fucresguaId;
    }

    public void setFucresguaId(Fucresgua fucresguaId) {
        this.fucresguaId = fucresguaId;
    }

    public Fuctipter getFuctipterId() {
        return fuctipterId;
    }

    public void setFuctipterId(Fuctipter fuctipterId) {
        this.fuctipterId = fuctipterId;
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
        if (!(object instanceof FuctipterFucresgua)) {
            return false;
        }
        FuctipterFucresgua other = (FuctipterFucresgua) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sinchronize.entities.FuctipterFucresgua[ id=" + id + " ]";
    }
    
}
