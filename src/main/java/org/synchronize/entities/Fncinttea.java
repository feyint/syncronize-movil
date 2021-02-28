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
@Table(name = "FNCINTTEA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fncinttea.findAll", query = "SELECT f FROM Fncinttea f"),
    @NamedQuery(name = "Fncinttea.findById", query = "SELECT f FROM Fncinttea f WHERE f.id = :id"),
    @NamedQuery(name = "Fncinttea.findByCodigo", query = "SELECT f FROM Fncinttea f WHERE f.codigo = :codigo"),
    @NamedQuery(name = "Fncinttea.findByNombre", query = "SELECT f FROM Fncinttea f WHERE f.nombre = :nombre"),
    @NamedQuery(name = "Fncinttea.findByPasInferior", query = "SELECT f FROM Fncinttea f WHERE f.pasInferior = :pasInferior"),
    @NamedQuery(name = "Fncinttea.findByPasSuperior", query = "SELECT f FROM Fncinttea f WHERE f.pasSuperior = :pasSuperior"),
    @NamedQuery(name = "Fncinttea.findByPadInferior", query = "SELECT f FROM Fncinttea f WHERE f.padInferior = :padInferior"),
    @NamedQuery(name = "Fncinttea.findByPadSuperior", query = "SELECT f FROM Fncinttea f WHERE f.padSuperior = :padSuperior"),
    @NamedQuery(name = "Fncinttea.findByEstado", query = "SELECT f FROM Fncinttea f WHERE f.estado = :estado"),
    @NamedQuery(name = "Fncinttea.findByFechaActividad", query = "SELECT f FROM Fncinttea f WHERE f.fechaActividad = :fechaActividad"),
    @NamedQuery(name = "Fncinttea.findByUsuarioData", query = "SELECT f FROM Fncinttea f WHERE f.usuarioData = :usuarioData"),
    @NamedQuery(name = "Fncinttea.findByFechaCreacion", query = "SELECT f FROM Fncinttea f WHERE f.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Fncinttea.findByOrigenData", query = "SELECT f FROM Fncinttea f WHERE f.origenData = :origenData")})
public class Fncinttea implements Serializable {

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
    @Column(name = "PAS_INFERIOR")
    private short pasInferior;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PAS_SUPERIOR")
    private short pasSuperior;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PAD_INFERIOR")
    private short padInferior;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PAD_SUPERIOR")
    private short padSuperior;
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
  
    public Fncinttea() {
    }

    public Fncinttea(Long id) {
        this.id = id;
    }

    public Fncinttea(Long id, String codigo, String nombre, short pasInferior, short pasSuperior, short padInferior, short padSuperior, BigInteger estado, Date fechaActividad, String usuarioData, Date fechaCreacion, String origenData) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.pasInferior = pasInferior;
        this.pasSuperior = pasSuperior;
        this.padInferior = padInferior;
        this.padSuperior = padSuperior;
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

    public short getPasInferior() {
        return pasInferior;
    }

    public void setPasInferior(short pasInferior) {
        this.pasInferior = pasInferior;
    }

    public short getPasSuperior() {
        return pasSuperior;
    }

    public void setPasSuperior(short pasSuperior) {
        this.pasSuperior = pasSuperior;
    }

    public short getPadInferior() {
        return padInferior;
    }

    public void setPadInferior(short padInferior) {
        this.padInferior = padInferior;
    }

    public short getPadSuperior() {
        return padSuperior;
    }

    public void setPadSuperior(short padSuperior) {
        this.padSuperior = padSuperior;
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
        if (!(object instanceof Fncinttea)) {
            return false;
        }
        Fncinttea other = (Fncinttea) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sinchronize.entities.Fncinttea[ id=" + id + " ]";
    }
    
}
