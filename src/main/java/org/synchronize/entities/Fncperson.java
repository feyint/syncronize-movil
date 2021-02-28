/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.synchronize.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
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
@Table(name = "FNCPERSON")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fncperson.findAll", query = "SELECT f FROM Fncperson f"),
    @NamedQuery(name = "Fncperson.findById", query = "SELECT f FROM Fncperson f WHERE f.id = :id"),
    @NamedQuery(name = "Fncperson.findByCodigo", query = "SELECT f FROM Fncperson f WHERE f.codigo = :codigo"),
    @NamedQuery(name = "Fncperson.findByIdentificacion", query = "SELECT f FROM Fncperson f WHERE f.identificacion = :identificacion"),
    @NamedQuery(name = "Fncperson.findByPrimerNombre", query = "SELECT f FROM Fncperson f WHERE f.primerNombre = :primerNombre"),
    @NamedQuery(name = "Fncperson.findBySegundoNombre", query = "SELECT f FROM Fncperson f WHERE f.segundoNombre = :segundoNombre"),
    @NamedQuery(name = "Fncperson.findByPrimerApellido", query = "SELECT f FROM Fncperson f WHERE f.primerApellido = :primerApellido"),
    @NamedQuery(name = "Fncperson.findBySegundoApellido", query = "SELECT f FROM Fncperson f WHERE f.segundoApellido = :segundoApellido"),
    @NamedQuery(name = "Fncperson.findByFechaNacimiento", query = "SELECT f FROM Fncperson f WHERE f.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "Fncperson.findByTelCelular", query = "SELECT f FROM Fncperson f WHERE f.telCelular = :telCelular"),
    @NamedQuery(name = "Fncperson.findByTelAlterno", query = "SELECT f FROM Fncperson f WHERE f.telAlterno = :telAlterno"),
    @NamedQuery(name = "Fncperson.findByCorreoElectronico", query = "SELECT f FROM Fncperson f WHERE f.correoElectronico = :correoElectronico"),
    @NamedQuery(name = "Fncperson.findByFechaActividad", query = "SELECT f FROM Fncperson f WHERE f.fechaActividad = :fechaActividad"),
    @NamedQuery(name = "Fncperson.findByUsuarioData", query = "SELECT f FROM Fncperson f WHERE f.usuarioData = :usuarioData"),
    @NamedQuery(name = "Fncperson.findByFechaCreacion", query = "SELECT f FROM Fncperson f WHERE f.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Fncperson.findByOrigenData", query = "SELECT f FROM Fncperson f WHERE f.origenData = :origenData"),
    @NamedQuery(name = "Fncperson.findByOriginalReference", query = "SELECT f FROM Fncperson f WHERE f.originalReference = :originalReference"),
    @NamedQuery(name = "Fncperson.findByHasDuplicates", query = "SELECT f FROM Fncperson f WHERE f.hasDuplicates = :hasDuplicates"),
    @NamedQuery(name = "Fncperson.findByStatus", query = "SELECT f FROM Fncperson f WHERE f.status = :status"),
    @NamedQuery(name = "Fncperson.findByUpdatedAt", query = "SELECT f FROM Fncperson f WHERE f.updatedAt = :updatedAt")})
public class Fncperson implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name = "ISEQ$$_74903", sequenceName = "ISEQ$$_74903", initialValue = 10, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ISEQ$$_74903")
    @Basic(optional = false)    
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CODIGO")
    private String codigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "IDENTIFICACION")
    private String identificacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "PRIMER_NOMBRE")
    private String primerNombre;
    @Size(max = 50)
    @Column(name = "SEGUNDO_NOMBRE")
    private String segundoNombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "PRIMER_APELLIDO")
    private String primerApellido;
    @Size(max = 50)
    @Column(name = "SEGUNDO_APELLIDO")
    private String segundoApellido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_NACIMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;
    @Size(max = 15)
    @Column(name = "TEL_CELULAR")
    private String telCelular;
    @Size(max = 15)
    @Column(name = "TEL_ALTERNO")
    private String telAlterno;
    @Size(max = 250)
    @Column(name = "CORREO_ELECTRONICO")
    private String correoElectronico;
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
    @Size(min = 1, max = 20)
    @Column(name = "ORIGEN_DATA")
    private String origenData;
    @Column(name = "ORIGINAL_REFERENCE")
    private Short originalReference;
    @Column(name = "HAS_DUPLICATES")
    private BigInteger hasDuplicates;
    @Column(name = "STATUS")
    private Short status;
    @Column(name = "UPDATED_AT")
    private Date updatedAt;   
    @JoinColumn(name = "FNCGENERO_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fncgenero fncgeneroId;
    @JoinColumn(name = "FNCLUNIND_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fnclunind fnclunindId;
    @JoinColumn(name = "FNCOCUPAC_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fncocupac fncocupacId;
    @JoinColumn(name = "FNCORGANI_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fncorgani fncorganiId;
    @JoinColumn(name = "FNCPAREN_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fncparen fncparenId;
    @JoinColumn(name = "FNCTIPIDE_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fnctipide fnctipideId;
    @JoinColumn(name = "FUCMUNICI_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fucmunici fucmuniciId;
    @JoinColumn(name = "FVBENCUES_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fvbencues fvbencuesId;   
//    @JoinColumn(name = "FNCPUEIND_ID", referencedColumnName = "ID")
//    @ManyToOne(optional = false)
//    private Fncpueind fncpueindId;   
    

    public Fncperson() {
    }

    public Fncperson(Long id) {
        this.id = id;
    }

    public Fncperson(Long id, String codigo, String identificacion, String primerNombre, String primerApellido, Date fechaNacimiento, Date fechaActividad, String usuarioData, Date fechaCreacion, String origenData) {
        this.id = id;
        this.codigo = codigo;
        this.identificacion = identificacion;
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.fechaNacimiento = fechaNacimiento;
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

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelCelular() {
        return telCelular;
    }

    public void setTelCelular(String telCelular) {
        this.telCelular = telCelular;
    }

    public String getTelAlterno() {
        return telAlterno;
    }

    public void setTelAlterno(String telAlterno) {
        this.telAlterno = telAlterno;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
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

    public Short getOriginalReference() {
        return originalReference;
    }

    public void setOriginalReference(Short originalReference) {
        this.originalReference = originalReference;
    }

    public BigInteger getHasDuplicates() {
        return hasDuplicates;
    }

    public void setHasDuplicates(BigInteger hasDuplicates) {
        this.hasDuplicates = hasDuplicates;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Fncgenero getFncgeneroId() {
        return fncgeneroId;
    }

    public void setFncgeneroId(Fncgenero fncgeneroId) {
        this.fncgeneroId = fncgeneroId;
    }

    public Fnclunind getFnclunindId() {
        return fnclunindId;
    }

    public void setFnclunindId(Fnclunind fnclunindId) {
        this.fnclunindId = fnclunindId;
    }

    public Fncocupac getFncocupacId() {
        return fncocupacId;
    }

    public void setFncocupacId(Fncocupac fncocupacId) {
        this.fncocupacId = fncocupacId;
    }

    public Fncorgani getFncorganiId() {
        return fncorganiId;
    }

    public void setFncorganiId(Fncorgani fncorganiId) {
        this.fncorganiId = fncorganiId;
    }

    public Fncparen getFncparenId() {
        return fncparenId;
    }

    public void setFncparenId(Fncparen fncparenId) {
        this.fncparenId = fncparenId;
    }

    public Fnctipide getFnctipideId() {
        return fnctipideId;
    }

    public void setFnctipideId(Fnctipide fnctipideId) {
        this.fnctipideId = fnctipideId;
    }

    public Fucmunici getFucmuniciId() {
        return fucmuniciId;
    }

    public void setFucmuniciId(Fucmunici fucmuniciId) {
        this.fucmuniciId = fucmuniciId;
    }

    public Fvbencues getFvbencuesId() {
        return fvbencuesId;
    }

    public void setFvbencuesId(Fvbencues fvbencuesId) {
        this.fvbencuesId = fvbencuesId;
    }

//    public Fncpueind getFncpueindId() {
//        return fncpueindId;
//    }
//
//    public void setFncpueindId(Fncpueind fncpueindId) {
//        this.fncpueindId = fncpueindId;
//    }
//    
//    


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fncperson)) {
            return false;
        }
        Fncperson other = (Fncperson) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sinchronize.entities.Fncperson[ id=" + id + " ]";
    }
    
}
