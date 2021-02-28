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
@Table(name = "FNBNUCVIV")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fnbnucviv.findAll", query = "SELECT f FROM Fnbnucviv f"),
    @NamedQuery(name = "Fnbnucviv.findById", query = "SELECT f FROM Fnbnucviv f WHERE f.id = :id"),
    @NamedQuery(name = "Fnbnucviv.findByCodigo", query = "SELECT f FROM Fnbnucviv f WHERE f.codigo = :codigo"),
    @NamedQuery(name = "Fnbnucviv.findByCocinaDentro", query = "SELECT f FROM Fnbnucviv f WHERE f.cocinaDentro = :cocinaDentro"),
    @NamedQuery(name = "Fnbnucviv.findByHumoDentro", query = "SELECT f FROM Fnbnucviv f WHERE f.humoDentro = :humoDentro"),
    @NamedQuery(name = "Fnbnucviv.findByAccesoInternet", query = "SELECT f FROM Fnbnucviv f WHERE f.accesoInternet = :accesoInternet"),
    @NamedQuery(name = "Fnbnucviv.findByResiduoBor", query = "SELECT f FROM Fnbnucviv f WHERE f.residuoBor = :residuoBor"),
    @NamedQuery(name = "Fnbnucviv.findByResiduoPeligroso", query = "SELECT f FROM Fnbnucviv f WHERE f.residuoPeligroso = :residuoPeligroso"),
    @NamedQuery(name = "Fnbnucviv.findByAnimalVacunado", query = "SELECT f FROM Fnbnucviv f WHERE f.animalVacunado = :animalVacunado"),
    @NamedQuery(name = "Fnbnucviv.findByAnimalNovacunado", query = "SELECT f FROM Fnbnucviv f WHERE f.animalNovacunado = :animalNovacunado"),
    @NamedQuery(name = "Fnbnucviv.findByRiesgo", query = "SELECT f FROM Fnbnucviv f WHERE f.riesgo = :riesgo"),
    @NamedQuery(name = "Fnbnucviv.findByObservacion", query = "SELECT f FROM Fnbnucviv f WHERE f.observacion = :observacion"),
    @NamedQuery(name = "Fnbnucviv.findByFechaActividad", query = "SELECT f FROM Fnbnucviv f WHERE f.fechaActividad = :fechaActividad"),
    @NamedQuery(name = "Fnbnucviv.findByUsuarioData", query = "SELECT f FROM Fnbnucviv f WHERE f.usuarioData = :usuarioData"),
    @NamedQuery(name = "Fnbnucviv.findByFechaCreacion", query = "SELECT f FROM Fnbnucviv f WHERE f.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Fnbnucviv.findByOrigenData", query = "SELECT f FROM Fnbnucviv f WHERE f.origenData = :origenData"),
    @NamedQuery(name = "Fnbnucviv.findByOriginalReference", query = "SELECT f FROM Fnbnucviv f WHERE f.originalReference = :originalReference"),
    @NamedQuery(name = "Fnbnucviv.findByHasDuplicates", query = "SELECT f FROM Fnbnucviv f WHERE f.hasDuplicates = :hasDuplicates"),
    @NamedQuery(name = "Fnbnucviv.findByStatus", query = "SELECT f FROM Fnbnucviv f WHERE f.status = :status"),
   // @NamedQuery(name = "Fnbnucviv.findByUpdatedAt", query = "SELECT f FROM Fnbnucviv f WHERE f.updatedAt = :updatedAt")
})
public class Fnbnucviv implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name = "ISEQ$$_74875", sequenceName = "ISEQ$$_74875", initialValue = 10, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ISEQ$$_74875")
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "COCINA_DENTRO")
    private Integer cocinaDentro;
    @Column(name = "HUMO_DENTRO")
    private Integer humoDentro;
    @Column(name = "ACCESO_INTERNET")
    private Integer accesoInternet;
    @Column(name = "RESIDUO_BOR")
    private Integer residuoBor;
    @Column(name = "RESIDUO_PELIGROSO")
    private Integer residuoPeligroso;
    @Column(name = "ANIMAL_VACUNADO")
    private Integer animalVacunado;
    @Column(name = "ANIMAL_NOVACUNADO")
    private Integer animalNovacunado;
    @Column(name = "RIESGO")
    private Integer riesgo;
    @Size(max = 2000)
    @Column(name = "OBSERVACION")
    private String observacion;
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
    @Column(name = "ORIGINAL_REFERENCE")
    private Integer originalReference;
    @Column(name = "HAS_DUPLICATES")
    private Integer hasDuplicates;
    @Column(name = "STATUS")
    private Integer status;
    /*@Column(name = "UPDATED_AT")
    private Serializable updatedAt;   */
    @JoinColumn(name = "FUBUBIVIV_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fububiviv fububivivId;
    
    
    @JoinColumn(name = "FVBENCUES_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fvbencues fvbencuesId;
    
    
    public Fnbnucviv() {
    }

    public Fnbnucviv(Long id) {
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

    public Integer getCocinaDentro() {
        return cocinaDentro;
    }

    public void setCocinaDentro(Integer cocinaDentro) {
        this.cocinaDentro = cocinaDentro;
    }

    public Integer getHumoDentro() {
        return humoDentro;
    }

    public void setHumoDentro(Integer humoDentro) {
        this.humoDentro = humoDentro;
    }

    public Integer getAccesoInternet() {
        return accesoInternet;
    }

    public void setAccesoInternet(Integer accesoInternet) {
        this.accesoInternet = accesoInternet;
    }

    public Integer getResiduoBor() {
        return residuoBor;
    }

    public void setResiduoBor(Integer residuoBor) {
        this.residuoBor = residuoBor;
    }

    public Integer getResiduoPeligroso() {
        return residuoPeligroso;
    }

    public void setResiduoPeligroso(Integer residuoPeligroso) {
        this.residuoPeligroso = residuoPeligroso;
    }

    public Integer getAnimalVacunado() {
        return animalVacunado;
    }

    public void setAnimalVacunado(Integer animalVacunado) {
        this.animalVacunado = animalVacunado;
    }

    public Integer getAnimalNovacunado() {
        return animalNovacunado;
    }

    public void setAnimalNovacunado(Integer animalNovacunado) {
        this.animalNovacunado = animalNovacunado;
    }

    public Integer getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(Integer riesgo) {
        this.riesgo = riesgo;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
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

    public Integer getOriginalReference() {
        return originalReference;
    }

    public void setOriginalReference(Integer originalReference) {
        this.originalReference = originalReference;
    }

    public Integer getHasDuplicates() {
        return hasDuplicates;
    }

    public void setHasDuplicates(Integer hasDuplicates) {
        this.hasDuplicates = hasDuplicates;
    }

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
    public Fububiviv getFububivivId() {
        return fububivivId;
    }

    public void setFububivivId(Fububiviv fububivivId) {
        this.fububivivId = fububivivId;
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
        if (!(object instanceof Fnbnucviv)) {
            return false;
        }
        Fnbnucviv other = (Fnbnucviv) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sinchronize.entities.Fnbnucviv[ id=" + id + " ]";
    }
    
}
