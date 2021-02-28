/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.synchronize.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
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
@Table(name = "FNCINTANT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fncintant.findAll", query = "SELECT f FROM Fncintant f"),
    @NamedQuery(name = "Fncintant.findById", query = "SELECT f FROM Fncintant f WHERE f.id = :id"),
    @NamedQuery(name = "Fncintant.findByCodigo", query = "SELECT f FROM Fncintant f WHERE f.codigo = :codigo"),
    @NamedQuery(name = "Fncintant.findByNombre", query = "SELECT f FROM Fncintant f WHERE f.nombre = :nombre"),
    @NamedQuery(name = "Fncintant.findByValorInferior", query = "SELECT f FROM Fncintant f WHERE f.valorInferior = :valorInferior"),
    @NamedQuery(name = "Fncintant.findByValorSuperior", query = "SELECT f FROM Fncintant f WHERE f.valorSuperior = :valorSuperior"),
    @NamedQuery(name = "Fncintant.findByEdadInferior", query = "SELECT f FROM Fncintant f WHERE f.edadInferior = :edadInferior"),
    @NamedQuery(name = "Fncintant.findByEdadSuperior", query = "SELECT f FROM Fncintant f WHERE f.edadSuperior = :edadSuperior"),
    @NamedQuery(name = "Fncintant.findByEstado", query = "SELECT f FROM Fncintant f WHERE f.estado = :estado"),
    @NamedQuery(name = "Fncintant.findByFechaActividad", query = "SELECT f FROM Fncintant f WHERE f.fechaActividad = :fechaActividad"),
    @NamedQuery(name = "Fncintant.findByUsuarioData", query = "SELECT f FROM Fncintant f WHERE f.usuarioData = :usuarioData"),
    @NamedQuery(name = "Fncintant.findByFechaCreacion", query = "SELECT f FROM Fncintant f WHERE f.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Fncintant.findByOrigenData", query = "SELECT f FROM Fncintant f WHERE f.origenData = :origenData")})
public class Fncintant implements Serializable {

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
    @Column(name = "VALOR_INFERIOR")
    private BigDecimal valorInferior;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VALOR_SUPERIOR")
    private BigDecimal valorSuperior;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EDAD_INFERIOR")
    private short edadInferior;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EDAD_SUPERIOR")
    private short edadSuperior;
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
    @JoinColumn(name = "FNCTIPANT_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fnctipant fnctipantId;
    @JoinColumn(name = "FSCSEMAFO_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fscsemafo fscsemafoId;

    public Fncintant() {
    }

    public Fncintant(Long id) {
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

    public BigDecimal getValorInferior() {
        return valorInferior;
    }

    public void setValorInferior(BigDecimal valorInferior) {
        this.valorInferior = valorInferior;
    }

    public BigDecimal getValorSuperior() {
        return valorSuperior;
    }

    public void setValorSuperior(BigDecimal valorSuperior) {
        this.valorSuperior = valorSuperior;
    }

    public short getEdadInferior() {
        return edadInferior;
    }

    public void setEdadInferior(short edadInferior) {
        this.edadInferior = edadInferior;
    }

    public short getEdadSuperior() {
        return edadSuperior;
    }

    public void setEdadSuperior(short edadSuperior) {
        this.edadSuperior = edadSuperior;
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

    public Fnctipant getFnctipantId() {
        return fnctipantId;
    }

    public void setFnctipantId(Fnctipant fnctipantId) {
        this.fnctipantId = fnctipantId;
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
        if (!(object instanceof Fncintant)) {
            return false;
        }
        Fncintant other = (Fncintant) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sinchronize.entities.Fncintant[ id=" + id + " ]";
    }
    
}
