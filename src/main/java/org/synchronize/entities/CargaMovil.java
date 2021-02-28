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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author 57315
 */
@Entity
@Table(name = "CARGA_MOVIL")
@NamedQueries({
    @NamedQuery(name = "CargaMovil.findAll", query = "SELECT c FROM CargaMovil c"),
    @NamedQuery(name = "CargaMovil.findById", query = "SELECT c FROM CargaMovil c WHERE c.id = :id"),
    @NamedQuery(name = "CargaMovil.findByFecha", query = "SELECT c FROM CargaMovil c WHERE c.fecha = :fecha"),
    @NamedQuery(name = "CargaMovil.findByRegistros", query = "SELECT c FROM CargaMovil c WHERE c.registros = :registros"),
    @NamedQuery(name = "CargaMovil.findByUsuario", query = "SELECT c FROM CargaMovil c WHERE c.usuario = :usuario")})
public class CargaMovil implements Serializable {

    @Size(max = 100)
    @Column(name = "USUARIO")
    private String usuario;
   
    private static final long serialVersionUID = 1L;
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name = "S_CARGA", sequenceName = "S_CARGA", initialValue = 10, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_CARGA")
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "REGISTROS")
    private Long registros;

    public CargaMovil() {
    }

    public CargaMovil(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
        if (!(object instanceof CargaMovil)) {
            return false;
        }
        CargaMovil other = (CargaMovil) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.synchronize.entities.CargaMovil[ id=" + id + " ]";
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
      
}
