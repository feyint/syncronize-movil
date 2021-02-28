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
@Table(name = "FNCELEREP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fncelerep.findAll", query = "SELECT f FROM Fncelerep f"),
    @NamedQuery(name = "Fncelerep.findById", query = "SELECT f FROM Fncelerep f WHERE f.id = :id"),
    @NamedQuery(name = "Fncelerep.findByCodigo", query = "SELECT f FROM Fncelerep f WHERE f.codigo = :codigo"),
    @NamedQuery(name = "Fncelerep.findByNombre", query = "SELECT f FROM Fncelerep f WHERE f.nombre = :nombre"),
    @NamedQuery(name = "Fncelerep.findByEstado", query = "SELECT f FROM Fncelerep f WHERE f.estado = :estado"),
    @NamedQuery(name = "Fncelerep.findByFechaActividad", query = "SELECT f FROM Fncelerep f WHERE f.fechaActividad = :fechaActividad"),
    @NamedQuery(name = "Fncelerep.findByUsuarioData", query = "SELECT f FROM Fncelerep f WHERE f.usuarioData = :usuarioData"),
    @NamedQuery(name = "Fncelerep.findByFechaCreacion", query = "SELECT f FROM Fncelerep f WHERE f.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Fncelerep.findByOrigenData", query = "SELECT f FROM Fncelerep f WHERE f.origenData = :origenData"),
    @NamedQuery(name = "Fncelerep.findBySeccion", query = "SELECT f FROM Fncelerep f WHERE f.seccion = :seccion"),
    @NamedQuery(name = "Fncelerep.findByRender", query = "SELECT f FROM Fncelerep f WHERE f.render = :render"),
    @NamedQuery(name = "Fncelerep.findByRequerido", query = "SELECT f FROM Fncelerep f WHERE f.requerido = :requerido")})
public class Fncelerep implements Serializable {

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
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ESTADO")
    private BigInteger estado;
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
    @Size(min = 1, max = 50)
    @Column(name = "SECCION")
    private String seccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RENDER")
    private short render;
    @Basic(optional = false)
    @NotNull
    @Column(name = "REQUERIDO")
    private BigInteger requerido;
   

    public Fncelerep() {
    }

    public Fncelerep(Long id) {
        this.id = id;
    }

    public Fncelerep(Long id, String codigo, String nombre, BigInteger estado, Date fechaActividad, String usuarioData, Date fechaCreacion, String origenData, String seccion, short render, BigInteger requerido) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.estado = estado;
        this.fechaActividad = fechaActividad;
        this.usuarioData = usuarioData;
        this.fechaCreacion = fechaCreacion;
        this.origenData = origenData;
        this.seccion = seccion;
        this.render = render;
        this.requerido = requerido;
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

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public short getRender() {
        return render;
    }

    public void setRender(short render) {
        this.render = render;
    }

    public BigInteger getRequerido() {
        return requerido;
    }

    public void setRequerido(BigInteger requerido) {
        this.requerido = requerido;
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
        if (!(object instanceof Fncelerep)) {
            return false;
        }
        Fncelerep other = (Fncelerep) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sinchronize.entities.Fncelerep[ id=" + id + " ]";
    }
    
}
