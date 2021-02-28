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
@Table(name = "FUCRESGUA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fucresgua.findAll", query = "SELECT f FROM Fucresgua f"),
    @NamedQuery(name = "Fucresgua.findById", query = "SELECT f FROM Fucresgua f WHERE f.id = :id"),
    @NamedQuery(name = "Fucresgua.findByCodigo", query = "SELECT f FROM Fucresgua f WHERE f.codigo = :codigo"),
    @NamedQuery(name = "Fucresgua.findByNombre", query = "SELECT f FROM Fucresgua f WHERE f.nombre = :nombre"),
    @NamedQuery(name = "Fucresgua.findByEstado", query = "SELECT f FROM Fucresgua f WHERE f.estado = :estado"),
    @NamedQuery(name = "Fucresgua.findByFechaActividad", query = "SELECT f FROM Fucresgua f WHERE f.fechaActividad = :fechaActividad"),
    @NamedQuery(name = "Fucresgua.findByUsuarioData", query = "SELECT f FROM Fucresgua f WHERE f.usuarioData = :usuarioData"),
    @NamedQuery(name = "Fucresgua.findByFechaCreacion", query = "SELECT f FROM Fucresgua f WHERE f.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Fucresgua.findByOrigenData", query = "SELECT f FROM Fucresgua f WHERE f.origenData = :origenData"),
    @NamedQuery(name = "Fucresgua.findByCodigoFf", query = "SELECT f FROM Fucresgua f WHERE f.codigoFf = :codigoFf")})
public class Fucresgua implements Serializable {

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
    @Size(min = 1, max = 30)
    @Column(name = "CODIGO_FF")
    private String codigoFf;  
    @JoinColumn(name = "FUCMUNICI_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fucmunici fucmuniciId;
    @JoinColumn(name = "FUCTERCRI_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fuctercri fuctercriId;
    @JoinColumn(name = "FUCTIPRES_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fuctipres fuctipresId;

    public Fucresgua() {
    }

    public Fucresgua(Long id) {
        this.id = id;
    }

    public Fucresgua(Long id, String codigo, String nombre, BigInteger estado, Date fechaActividad, String usuarioData, Date fechaCreacion, String origenData, String codigoFf) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.estado = estado;
        this.fechaActividad = fechaActividad;
        this.usuarioData = usuarioData;
        this.fechaCreacion = fechaCreacion;
        this.origenData = origenData;
        this.codigoFf = codigoFf;
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

    public String getCodigoFf() {
        return codigoFf;
    }

    public void setCodigoFf(String codigoFf) {
        this.codigoFf = codigoFf;
    }

    public Fucmunici getFucmuniciId() {
        return fucmuniciId;
    }

    public void setFucmuniciId(Fucmunici fucmuniciId) {
        this.fucmuniciId = fucmuniciId;
    }

    public Fuctercri getFuctercriId() {
        return fuctercriId;
    }

    public void setFuctercriId(Fuctercri fuctercriId) {
        this.fuctercriId = fuctercriId;
    }

    public Fuctipres getFuctipresId() {
        return fuctipresId;
    }

    public void setFuctipresId(Fuctipres fuctipresId) {
        this.fuctipresId = fuctipresId;
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
        if (!(object instanceof Fucresgua)) {
            return false;
        }
        Fucresgua other = (Fucresgua) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sinchronize.entities.Fucresgua[ id=" + id + " ]";
    }
    
}
