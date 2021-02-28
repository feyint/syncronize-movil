/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.synchronize.entities;

import java.util.Date;
import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "FNCINTIMC")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fncintimc.findAll", query = "SELECT f FROM Fncintimc f"),
    @NamedQuery(name = "Fncintimc.findById", query = "SELECT f FROM Fncintimc f WHERE f.id = :id"),
    @NamedQuery(name = "Fncintimc.findByCodigo", query = "SELECT f FROM Fncintimc f WHERE f.codigo = :codigo"),
    @NamedQuery(name = "Fncintimc.findByNombre", query = "SELECT f FROM Fncintimc f WHERE f.nombre = :nombre"),
    @NamedQuery(name = "Fncintimc.findByValorInf", query = "SELECT f FROM Fncintimc f WHERE f.valorInf = :valorInf"),
    @NamedQuery(name = "Fncintimc.findByValorSup", query = "SELECT f FROM Fncintimc f WHERE f.valorSup = :valorSup"),
    @NamedQuery(name = "Fncintimc.findByEstado", query = "SELECT f FROM Fncintimc f WHERE f.estado = :estado"),
    @NamedQuery(name = "Fncintimc.findByFechaActividad", query = "SELECT f FROM Fncintimc f WHERE f.fechaActividad = :fechaActividad"),
    @NamedQuery(name = "Fncintimc.findByUsuarioData", query = "SELECT f FROM Fncintimc f WHERE f.usuarioData = :usuarioData"),
    @NamedQuery(name = "Fncintimc.findByFechaCreacion", query = "SELECT f FROM Fncintimc f WHERE f.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Fncintimc.findByOrigenData", query = "SELECT f FROM Fncintimc f WHERE f.origenData = :origenData")})
public class Fncintimc implements Serializable {

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
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "VALOR_INF")
    private BigDecimal valorInf;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VALOR_SUP")
    private BigDecimal valorSup;
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
    @JoinColumn(name = "FSCSEMAFO_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fscsemafo fscsemafoId;  

    public Fncintimc() {
    }

    public Fncintimc(Long id) {
        this.id = id;
    }

    public Fncintimc(Long id, String codigo, String nombre, BigDecimal valorInf, BigDecimal valorSup, BigInteger estado, Date fechaActividad, String usuarioData, Date fechaCreacion, String origenData) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.valorInf = valorInf;
        this.valorSup = valorSup;
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

    public BigDecimal getValorInf() {
        return valorInf;
    }

    public void setValorInf(BigDecimal valorInf) {
        this.valorInf = valorInf;
    }

    public BigDecimal getValorSup() {
        return valorSup;
    }

    public void setValorSup(BigDecimal valorSup) {
        this.valorSup = valorSup;
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

    public Fscsemafo getFscsemafoId() {
        return fscsemafoId;
    }

    public void setFscsemafoId(Fscsemafo fscsemafoId) {
        this.fscsemafoId = fscsemafoId;
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
        if (!(object instanceof Fncintimc)) {
            return false;
        }
        Fncintimc other = (Fncintimc) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sinchronize.entities.Fncintimc[ id=" + id + " ]";
    }
    
}
