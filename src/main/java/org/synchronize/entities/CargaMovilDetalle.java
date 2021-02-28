/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.synchronize.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author 57315
 */
@Entity
@Table(name = "CARGA_MOVIL_DETALLE")
@NamedQueries({
    @NamedQuery(name = "CargaMovilDetalle.findAll", query = "SELECT c FROM CargaMovilDetalle c"),
    @NamedQuery(name = "CargaMovilDetalle.findById", query = "SELECT c FROM CargaMovilDetalle c WHERE c.id = :id"),
    @NamedQuery(name = "CargaMovilDetalle.findByEntidad", query = "SELECT c FROM CargaMovilDetalle c WHERE c.entidad = :entidad"),
    @NamedQuery(name = "CargaMovilDetalle.findByRegistros", query = "SELECT c FROM CargaMovilDetalle c WHERE c.registros = :registros")})
public class CargaMovilDetalle implements Serializable {

    @Size(max = 100)
    @Column(name = "ENTIDAD")
    private String entidad;
    
    /*
    @JoinColumn(name = "ID_CARGA_MOVIL", referencedColumnName = "ID")
    @ManyToOne
    private CargaMovil idCargaMovil;*/
    
    
    @JoinColumn(name = "ID_CARGA_MOVIL", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private CargaMovil idCargaMovil;
    
    

    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name = "S_CARGA_DETALLE", sequenceName = "S_CARGA_DETALLE", initialValue = 10, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_CARGA_DETALLE")
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "REGISTROS")
    private Long registros;

    public CargaMovilDetalle() {
    }

    public CargaMovilDetalle(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getRegistros() {
        return registros;
    }

    public void setRegistros(Long registros) {
        this.registros = registros;
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
        if (!(object instanceof CargaMovilDetalle)) {
            return false;
        }
        CargaMovilDetalle other = (CargaMovilDetalle) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.synchronize.entities.CargaMovilDetalle[ id=" + id + " ]";
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public CargaMovil getIdCargaMovil() {
        return idCargaMovil;
    }

    public void setIdCargaMovil(CargaMovil idCargaMovil) {
        this.idCargaMovil = idCargaMovil;
    }
    
}
