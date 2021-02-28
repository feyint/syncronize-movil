/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.synchronize.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author 57315
 */
@Entity
@Table(name = "FNCELESAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fncelesal.findAll", query = "SELECT f FROM Fncelesal f"),
    @NamedQuery(name = "Fncelesal.findById", query = "SELECT f FROM Fncelesal f WHERE f.id = :id"),
    @NamedQuery(name = "Fncelesal.findByCodigo", query = "SELECT f FROM Fncelesal f WHERE f.codigo = :codigo"),
    @NamedQuery(name = "Fncelesal.findByNombre", query = "SELECT f FROM Fncelesal f WHERE f.nombre = :nombre"),
    @NamedQuery(name = "Fncelesal.findByEstado", query = "SELECT f FROM Fncelesal f WHERE f.estado = :estado"),
    @NamedQuery(name = "Fncelesal.findByFechaActividad", query = "SELECT f FROM Fncelesal f WHERE f.fechaActividad = :fechaActividad"),
    @NamedQuery(name = "Fncelesal.findByUsuarioData", query = "SELECT f FROM Fncelesal f WHERE f.usuarioData = :usuarioData"),
    @NamedQuery(name = "Fncelesal.findByFechaCreacion", query = "SELECT f FROM Fncelesal f WHERE f.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Fncelesal.findByOrigenData", query = "SELECT f FROM Fncelesal f WHERE f.origenData = :origenData"),
    @NamedQuery(name = "Fncelesal.findBySeccion", query = "SELECT f FROM Fncelesal f WHERE f.seccion = :seccion"),
    @NamedQuery(name = "Fncelesal.findByRender", query = "SELECT f FROM Fncelesal f WHERE f.render = :render"),
    @NamedQuery(name = "Fncelesal.findByRequerido", query = "SELECT f FROM Fncelesal f WHERE f.requerido = :requerido")})
public class Fncelesal implements Serializable {

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
    

    public Fncelesal() {
    }

    public Fncelesal(Long id) {
        this.id = id;
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
        if (!(object instanceof Fncelesal)) {
            return false;
        }
        Fncelesal other = (Fncelesal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sinchronize.entities.Fncelesal[ id=" + id + " ]";
    }
    
}
