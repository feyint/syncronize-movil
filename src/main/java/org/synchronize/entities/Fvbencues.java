/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.synchronize.entities;

import java.io.Serializable;
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
@Table(name = "FVBENCUES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fvbencues.findAll", query = "SELECT f FROM Fvbencues f"),
    @NamedQuery(name = "Fvbencues.findById", query = "SELECT f FROM Fvbencues f WHERE f.id = :id"),
    @NamedQuery(name = "Fvbencues.findByIdentificacion", query = "SELECT f FROM Fvbencues f WHERE f.identificacion = :identificacion"),
    @NamedQuery(name = "Fvbencues.findByNombre", query = "SELECT f FROM Fvbencues f WHERE f.nombre = :nombre"),
    @NamedQuery(name = "Fvbencues.findByApellido", query = "SELECT f FROM Fvbencues f WHERE f.apellido = :apellido"),
    @NamedQuery(name = "Fvbencues.findByFechaActividad", query = "SELECT f FROM Fvbencues f WHERE f.fechaActividad = :fechaActividad"),
    @NamedQuery(name = "Fvbencues.findByUsuarioData", query = "SELECT f FROM Fvbencues f WHERE f.usuarioData = :usuarioData"),
    @NamedQuery(name = "Fvbencues.findByFechaCreacion", query = "SELECT f FROM Fvbencues f WHERE f.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Fvbencues.findByOrigenData", query = "SELECT f FROM Fvbencues f WHERE f.origenData = :origenData")})
public class Fvbencues implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "IDENTIFICACION")
    private String identificacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "APELLIDO")
    private String apellido;
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
    
    
    
    @JoinColumn(name = "FNCTIPIDE_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fnctipide fnctipideId;
    


    public Fvbencues() {
    }

    public Fvbencues(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

   
    public Fnctipide getFnctipideId() {
        return fnctipideId;
    }

    public void setFnctipideId(Fnctipide fnctipideId) {
        this.fnctipideId = fnctipideId;
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
        if (!(object instanceof Fvbencues)) {
            return false;
        }
        Fvbencues other = (Fvbencues) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sinchronize.entities.Fvbencues[ id=" + id + " ]";
    }
    
}
