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
@Table(name = "FUCMUNICI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fucmunici.findAll", query = "SELECT f FROM Fucmunici f"),
    @NamedQuery(name = "Fucmunici.findById", query = "SELECT f FROM Fucmunici f WHERE f.id = :id"),
    @NamedQuery(name = "Fucmunici.findByCodigo", query = "SELECT f FROM Fucmunici f WHERE f.codigo = :codigo"),
    @NamedQuery(name = "Fucmunici.findByNombre", query = "SELECT f FROM Fucmunici f WHERE f.nombre = :nombre"),
    @NamedQuery(name = "Fucmunici.findByEstado", query = "SELECT f FROM Fucmunici f WHERE f.estado = :estado"),
    @NamedQuery(name = "Fucmunici.findByFechaActividad", query = "SELECT f FROM Fucmunici f WHERE f.fechaActividad = :fechaActividad"),
    @NamedQuery(name = "Fucmunici.findByUsuarioData", query = "SELECT f FROM Fucmunici f WHERE f.usuarioData = :usuarioData"),
    @NamedQuery(name = "Fucmunici.findByFechaCreacion", query = "SELECT f FROM Fucmunici f WHERE f.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Fucmunici.findByOrigenData", query = "SELECT f FROM Fucmunici f WHERE f.origenData = :origenData")})
public class Fucmunici implements Serializable {

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
    @JoinColumn(name = "FUCDEPART_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fucdepart fucdepartId;
    @JoinColumn(name = "FUCTIPMUN_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fuctipmun fuctipmunId;

    public Fucmunici() {
    }

    public Fucmunici(Long id) {
        this.id = id;
    }

    public Fucmunici(Long id, String codigo, String nombre, BigInteger estado, Date fechaActividad, String usuarioData, Date fechaCreacion, String origenData) {
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

    public Fucdepart getFucdepartId() {
        return fucdepartId;
    }

    public void setFucdepartId(Fucdepart fucdepartId) {
        this.fucdepartId = fucdepartId;
    }

    public Fuctipmun getFuctipmunId() {
        return fuctipmunId;
    }

    public void setFuctipmunId(Fuctipmun fuctipmunId) {
        this.fuctipmunId = fuctipmunId;
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
        if (!(object instanceof Fucmunici)) {
            return false;
        }
        Fucmunici other = (Fucmunici) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sinchronize.entities.Fucmunici[ id=" + id + " ]";
    }
    
}
