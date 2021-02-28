/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.synchronize.entities;

import java.util.Date;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
@Table(name = "FNCORGANI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fncorgani.findAll", query = "SELECT f FROM Fncorgani f"),
    @NamedQuery(name = "Fncorgani.findById", query = "SELECT f FROM Fncorgani f WHERE f.id = :id"),
    @NamedQuery(name = "Fncorgani.findByCodigo", query = "SELECT f FROM Fncorgani f WHERE f.codigo = :codigo"),
    @NamedQuery(name = "Fncorgani.findByNombre", query = "SELECT f FROM Fncorgani f WHERE f.nombre = :nombre"),
    @NamedQuery(name = "Fncorgani.findByEstado", query = "SELECT f FROM Fncorgani f WHERE f.estado = :estado"),
    @NamedQuery(name = "Fncorgani.findByFechaActividad", query = "SELECT f FROM Fncorgani f WHERE f.fechaActividad = :fechaActividad"),
    @NamedQuery(name = "Fncorgani.findByUsuarioData", query = "SELECT f FROM Fncorgani f WHERE f.usuarioData = :usuarioData"),
    @NamedQuery(name = "Fncorgani.findByFechaCreacion", query = "SELECT f FROM Fncorgani f WHERE f.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Fncorgani.findByOrigenData", query = "SELECT f FROM Fncorgani f WHERE f.origenData = :origenData")})
public class Fncorgani implements Serializable {

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
    @JoinColumn(name = "FNCREGION_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fncregion fncregionId;

    public Fncorgani() {
    }

    public Fncorgani(Long id) {
        this.id = id;
    }

    public Fncorgani(Long id, String codigo, String nombre, BigInteger estado, Date fechaActividad, String usuarioData, Date fechaCreacion, String origenData) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.estado = estado;
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
   
    public Fncregion getFncregionId() {
        return fncregionId;
    }

    public void setFncregionId(Fncregion fncregionId) {
        this.fncregionId = fncregionId;
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
        if (!(object instanceof Fncorgani)) {
            return false;
        }
        Fncorgani other = (Fncorgani) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sinchronize.entities.Fncorgani[ id=" + id + " ]";
    }
    
}
