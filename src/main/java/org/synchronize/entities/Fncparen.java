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
import javax.persistence.Id;
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
@Table(name = "FNCPAREN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fncparen.findAll", query = "SELECT f FROM Fncparen f"),
    @NamedQuery(name = "Fncparen.findById", query = "SELECT f FROM Fncparen f WHERE f.id = :id"),
    @NamedQuery(name = "Fncparen.findByCodigo", query = "SELECT f FROM Fncparen f WHERE f.codigo = :codigo"),
    @NamedQuery(name = "Fncparen.findByNombre", query = "SELECT f FROM Fncparen f WHERE f.nombre = :nombre"),
    @NamedQuery(name = "Fncparen.findByEstado", query = "SELECT f FROM Fncparen f WHERE f.estado = :estado"),
    @NamedQuery(name = "Fncparen.findByFechaActividad", query = "SELECT f FROM Fncparen f WHERE f.fechaActividad = :fechaActividad"),
    @NamedQuery(name = "Fncparen.findByUsuarioData", query = "SELECT f FROM Fncparen f WHERE f.usuarioData = :usuarioData"),
    @NamedQuery(name = "Fncparen.findByOrigenData", query = "SELECT f FROM Fncparen f WHERE f.origenData = :origenData"),
    @NamedQuery(name = "Fncparen.findByFechaCreacion", query = "SELECT f FROM Fncparen f WHERE f.fechaCreacion = :fechaCreacion")})
public class Fncparen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CODIGO")
    private String codigo;
    @Size(max = 250)
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "ESTADO")
    private BigInteger estado;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_ACTIVIDAD")
    private Date fechaActividad;
    @Size(max = 20)
    @Column(name = "USUARIO_DATA")
    private String usuarioData;
    @Size(max = 30)
    @Column(name = "ORIGEN_DATA")
    private String origenData;
    @Basic(optional = false)
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_CREACION")
    private Date fechaCreacion;
  
    public Fncparen() {
    }

    public Fncparen(Long id) {
        this.id = id;
    }

    public Fncparen(Long id, String codigo, Date fechaCreacion) {
        this.id = id;
        this.codigo = codigo;
        this.fechaCreacion = fechaCreacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigInteger getEstado() {
        return estado;
    }

    public void setEstado(BigInteger estado) {
        this.estado = estado;
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

    public String getOrigenData() {
        return origenData;
    }

    public void setOrigenData(String origenData) {
        this.origenData = origenData;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
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
        if (!(object instanceof Fncparen)) {
            return false;
        }
        Fncparen other = (Fncparen) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sinchronize.entities.Fncparen[ id=" + id + " ]";
    }
    
}
