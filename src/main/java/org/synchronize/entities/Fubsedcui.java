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
@Table(name = "FUBSEDCUI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fubsedcui.findAll", query = "SELECT f FROM Fubsedcui f"),
    @NamedQuery(name = "Fubsedcui.findById", query = "SELECT f FROM Fubsedcui f WHERE f.id = :id"),
    @NamedQuery(name = "Fubsedcui.findByCodigo", query = "SELECT f FROM Fubsedcui f WHERE f.codigo = :codigo"),
    @NamedQuery(name = "Fubsedcui.findByNombre", query = "SELECT f FROM Fubsedcui f WHERE f.nombre = :nombre"),
    @NamedQuery(name = "Fubsedcui.findByDireccion", query = "SELECT f FROM Fubsedcui f WHERE f.direccion = :direccion"),
    @NamedQuery(name = "Fubsedcui.findByPrincipal", query = "SELECT f FROM Fubsedcui f WHERE f.principal = :principal"),
    @NamedQuery(name = "Fubsedcui.findByEstado", query = "SELECT f FROM Fubsedcui f WHERE f.estado = :estado"),
    @NamedQuery(name = "Fubsedcui.findByFechaActividad", query = "SELECT f FROM Fubsedcui f WHERE f.fechaActividad = :fechaActividad"),
    @NamedQuery(name = "Fubsedcui.findByUsuarioData", query = "SELECT f FROM Fubsedcui f WHERE f.usuarioData = :usuarioData"),
    @NamedQuery(name = "Fubsedcui.findByFechaCreacion", query = "SELECT f FROM Fubsedcui f WHERE f.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Fubsedcui.findByOrigenData", query = "SELECT f FROM Fubsedcui f WHERE f.origenData = :origenData")})
public class Fubsedcui implements Serializable {

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
    @Size(min = 1, max = 50)
    @Column(name = "DIRECCION")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRINCIPAL")
    private BigInteger principal;
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
    @JoinColumn(name = "FUCUNICUI_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fucunicui fucunicuiId;
   
    public Fubsedcui() {
    }

    public Fubsedcui(Long id) {
        this.id = id;
    }

    public Fubsedcui(Long id, String codigo, String nombre, String direccion, BigInteger principal, BigInteger estado, Date fechaActividad, String usuarioData, Date fechaCreacion, String origenData) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.principal = principal;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public BigInteger getPrincipal() {
        return principal;
    }

    public void setPrincipal(BigInteger principal) {
        this.principal = principal;
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

    public Fucunicui getFucunicuiId() {
        return fucunicuiId;
    }

    public void setFucunicuiId(Fucunicui fucunicuiId) {
        this.fucunicuiId = fucunicuiId;
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
        if (!(object instanceof Fubsedcui)) {
            return false;
        }
        Fubsedcui other = (Fubsedcui) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sinchronize.entities.Fubsedcui[ id=" + id + " ]";
    }
    
}
