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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
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
@Table(name = "FUBUBIVIV")
@XmlRootElement
@NamedQueries({
 /*   @NamedQuery(name = "Fububiviv.findAll", query = "SELECT f FROM Fububiviv f"),
    @NamedQuery(name = "Fububiviv.findById", query = "SELECT f FROM Fububiviv f WHERE f.id = :id"),
    @NamedQuery(name = "Fububiviv.findByCodigo", query = "SELECT f FROM Fububiviv f WHERE f.codigo = :codigo"),
    @NamedQuery(name = "Fububiviv.findByDireccion", query = "SELECT f FROM Fububiviv f WHERE f.direccion = :direccion"),
   // @NamedQuery(name = "Fububiviv.findByCoordenada", query = "SELECT f FROM Fububiviv f WHERE f.coordenada = :coordenada"),
    //@NamedQuery(name = "Fububiviv.findByNumNucleos", query = "SELECT f FROM Fububiviv f WHERE f.numNucleos = :numNucleos"),
    @NamedQuery(name = "Fububiviv.findByFechaActividad", query = "SELECT f FROM Fububiviv f WHERE f.fechaActividad = :fechaActividad"),
    @NamedQuery(name = "Fububiviv.findByUsuarioData", query = "SELECT f FROM Fububiviv f WHERE f.usuarioData = :usuarioData"),
    @NamedQuery(name = "Fububiviv.findByFechaCreacion", query = "SELECT f FROM Fububiviv f WHERE f.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Fububiviv.findByOrigenData", query = "SELECT f FROM Fububiviv f WHERE f.origenData = :origenData"),
    @NamedQuery(name = "Fububiviv.findByCoordenadaX", query = "SELECT f FROM Fububiviv f WHERE f.coordenadaX = :coordenadaX"),
    @NamedQuery(name = "Fububiviv.findByCoordenadaY", query = "SELECT f FROM Fububiviv f WHERE f.coordenadaY = :coordenadaY"),*/
    //@NamedQuery(name = "Fububiviv.findByOriginalReference", query = "SELECT f FROM Fububiviv f WHERE f.originalReference = :originalReference"),
    //@NamedQuery(name = "Fububiviv.findByHasDuplicates", query = "SELECT f FROM Fububiviv f WHERE f.hasDuplicates = :hasDuplicates"),
    //@NamedQuery(name = "Fububiviv.findByStatus", query = "SELECT f FROM Fububiviv f WHERE f.status = :status"),
   // @NamedQuery(name = "Fububiviv.findByUpdatedAt", query = "SELECT f FROM Fububiviv f WHERE f.updatedAt = :updatedAt")
})
public class Fububiviv implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name = "ISEQ$$_74978", sequenceName = "ISEQ$$_74978", initialValue = 10, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ISEQ$$_74978")
    @Basic(optional = false)    
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CODIGO")
    private String codigo;
    @Size(max = 50)
    @Column(name = "DIRECCION")
    private String direccion;
    //@Column(name = "COORDENADA")
    //private Serializable coordenada;
    //@Column(name = "NUM_NUCLEOS")
    //private Integer numNucleos;
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
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "COORDENADA_X")
    private Double coordenadaX;
    @Column(name = "COORDENADA_Y")
    private Double coordenadaY;
   /* @Column(name = "ORIGINAL_REFERENCE")
    private Integer originalReference;*/
    /*@Column(name = "HAS_DUPLICATES")
    private BigInteger hasDuplicates;*/
    @Column(name = "STATUS")
    private Integer status;
    /*@Column(name = "UPDATED_AT")
    private Serializable updatedAt;*/
    
    
    @JoinColumn(name = "FUCZONCUI_FUCBARVER_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private FuczoncuiFucbarver fuczoncuiFucbarverId;
    
    
    @JoinColumn(name = "FVBENCUES_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fvbencues fvbencuesId;
    
    
    
    public Fububiviv() {
    }

    public Fububiviv(Long id) {
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /*
    public Serializable getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(Serializable coordenada) {
        this.coordenada = coordenada;
    }*/
    
    
    /*
    public Integer getNumNucleos() {
        return numNucleos;
    }

    public void setNumNucleos(Integer numNucleos) {
        this.numNucleos = numNucleos;
    }
*/
    
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

    public Double getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(Double coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public Double getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(Double coordenadaY) {
        this.coordenadaY = coordenadaY;
    }
/*
    public Integer getOriginalReference() {
        return originalReference;
    }

    public void setOriginalReference(Integer originalReference) {
        this.originalReference = originalReference;
    }
*/
    /*
    public BigInteger getHasDuplicates() {
        return hasDuplicates;
    }

    public void setHasDuplicates(BigInteger hasDuplicates) {
        this.hasDuplicates = hasDuplicates;
    }
*/
    
   
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    /*
    public Serializable getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Serializable updatedAt) {
        this.updatedAt = updatedAt;
    }
*/
    
    
    public FuczoncuiFucbarver getFuczoncuiFucbarverId() {
        return fuczoncuiFucbarverId;
    }

    public void setFuczoncuiFucbarverId(FuczoncuiFucbarver fuczoncuiFucbarverId) {
        this.fuczoncuiFucbarverId = fuczoncuiFucbarverId;
    }

    
    public Fvbencues getFvbencuesId() {
        return fvbencuesId;
    }

    public void setFvbencuesId(Fvbencues fvbencuesId) {
        this.fvbencuesId = fvbencuesId;
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
        if (!(object instanceof Fububiviv)) {
            return false;
        }
        Fububiviv other = (Fububiviv) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sinchronize.entities.Fububiviv[ id=" + id + " ]";
    }
    
}
