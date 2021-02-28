/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.synchronize.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author EDUAR OROZCO
 */
@Entity
@Table(name = "FNBINFSAL_FNCINTANT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FnbinfsalFncintant.findAll", query = "SELECT f FROM FnbinfsalFncintant f"),
    @NamedQuery(name = "FnbinfsalFncintant.findById", query = "SELECT f FROM FnbinfsalFncintant f WHERE f.id = :id"),
    @NamedQuery(name = "FnbinfsalFncintant.findBySeleccion", query = "SELECT f FROM FnbinfsalFncintant f WHERE f.seleccion = :seleccion"),
    @NamedQuery(name = "FnbinfsalFncintant.findByFechaActividad", query = "SELECT f FROM FnbinfsalFncintant f WHERE f.fechaActividad = :fechaActividad"),
    @NamedQuery(name = "FnbinfsalFncintant.findByUsuarioData", query = "SELECT f FROM FnbinfsalFncintant f WHERE f.usuarioData = :usuarioData"),
    @NamedQuery(name = "FnbinfsalFncintant.findByFechaCreacion", query = "SELECT f FROM FnbinfsalFncintant f WHERE f.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "FnbinfsalFncintant.findByOrigenData", query = "SELECT f FROM FnbinfsalFncintant f WHERE f.origenData = :origenData")})
public class FnbinfsalFncintant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "SELECCION")
    private String seleccion;
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
    @JoinColumn(name = "FNBINFSAL_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fnbinfsal fnbinfsalId;
    @JoinColumn(name = "FNCINTANT_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fncintant fncintantId;

    public FnbinfsalFncintant() {
    }

    public FnbinfsalFncintant(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(String seleccion) {
        this.seleccion = seleccion;
    }

    public Serializable getFechaActividad() {
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

    public Fnbinfsal getFnbinfsalId() {
        return fnbinfsalId;
    }

    public void setFnbinfsalId(Fnbinfsal fnbinfsalId) {
        this.fnbinfsalId = fnbinfsalId;
    }

    public Fncintant getFncintantId() {
        return fncintantId;
    }

    public void setFncintantId(Fncintant fncintantId) {
        this.fncintantId = fncintantId;
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
        if (!(object instanceof FnbinfsalFncintant)) {
            return false;
        }
        FnbinfsalFncintant other = (FnbinfsalFncintant) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sinchronize.entities.FnbinfsalFncintant[ id=" + id + " ]";
    }
    
}
