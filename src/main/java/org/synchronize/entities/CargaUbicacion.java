/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.synchronize.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "CARGA_UBICACION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CargaUbicacion.findAll", query = "SELECT c FROM CargaUbicacion c"),
    @NamedQuery(name = "CargaUbicacion.findByIdCargaUbicacion", query = "SELECT c FROM CargaUbicacion c WHERE c.idCargaUbicacion = :idCargaUbicacion"),
    @NamedQuery(name = "CargaUbicacion.findByCodigoReferencia", query = "SELECT c FROM CargaUbicacion c WHERE c.codigoReferencia = :codigoReferencia"),
    @NamedQuery(name = "CargaUbicacion.findByCodigoDepartamento", query = "SELECT c FROM CargaUbicacion c WHERE c.codigoDepartamento = :codigoDepartamento"),
    @NamedQuery(name = "CargaUbicacion.findByCodigoMunicipio", query = "SELECT c FROM CargaUbicacion c WHERE c.codigoMunicipio = :codigoMunicipio"),
    @NamedQuery(name = "CargaUbicacion.findByCodigoTipoTerritorio", query = "SELECT c FROM CargaUbicacion c WHERE c.codigoTipoTerritorio = :codigoTipoTerritorio"),
    @NamedQuery(name = "CargaUbicacion.findByCodigoResguardo", query = "SELECT c FROM CargaUbicacion c WHERE c.codigoResguardo = :codigoResguardo"),
    @NamedQuery(name = "CargaUbicacion.findByCodigoBarrio", query = "SELECT c FROM CargaUbicacion c WHERE c.codigoBarrio = :codigoBarrio"),
    @NamedQuery(name = "CargaUbicacion.findByCodigoZona", query = "SELECT c FROM CargaUbicacion c WHERE c.codigoZona = :codigoZona"),
    @NamedQuery(name = "CargaUbicacion.findByCodigoUnidadCuidado", query = "SELECT c FROM CargaUbicacion c WHERE c.codigoUnidadCuidado = :codigoUnidadCuidado"),
    @NamedQuery(name = "CargaUbicacion.findByCodigoZonaCuidado", query = "SELECT c FROM CargaUbicacion c WHERE c.codigoZonaCuidado = :codigoZonaCuidado"),
    @NamedQuery(name = "CargaUbicacion.findByDireccion", query = "SELECT c FROM CargaUbicacion c WHERE c.direccion = :direccion"),
    @NamedQuery(name = "CargaUbicacion.findByCodigoVivienda", query = "SELECT c FROM CargaUbicacion c WHERE c.codigoVivienda = :codigoVivienda"),
    @NamedQuery(name = "CargaUbicacion.findByCoordenadasX", query = "SELECT c FROM CargaUbicacion c WHERE c.coordenadasX = :coordenadasX"),
    @NamedQuery(name = "CargaUbicacion.findByCoordenadasY", query = "SELECT c FROM CargaUbicacion c WHERE c.coordenadasY = :coordenadasY"),
    @NamedQuery(name = "CargaUbicacion.findByNumeroNucleos", query = "SELECT c FROM CargaUbicacion c WHERE c.numeroNucleos = :numeroNucleos"),
    @NamedQuery(name = "CargaUbicacion.findByFechaRegistro", query = "SELECT c FROM CargaUbicacion c WHERE c.fechaRegistro = :fechaRegistro"),
    @NamedQuery(name = "CargaUbicacion.findByIdentificacionAgente", query = "SELECT c FROM CargaUbicacion c WHERE c.identificacionAgente = :identificacionAgente"),
    @NamedQuery(name = "CargaUbicacion.findByIdUsuarioCarga", query = "SELECT c FROM CargaUbicacion c WHERE c.idUsuarioCarga = :idUsuarioCarga"),
    @NamedQuery(name = "CargaUbicacion.findByFechaCreacion", query = "SELECT c FROM CargaUbicacion c WHERE c.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "CargaUbicacion.findByMensaje", query = "SELECT c FROM CargaUbicacion c WHERE c.mensaje = :mensaje")})
public class CargaUbicacion implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CARGA_UBICACION")
    private BigDecimal idCargaUbicacion;
    @Column(name = "CODIGO_REFERENCIA")
    private BigInteger codigoReferencia;
    @Column(name = "CODIGO_DEPARTAMENTO")
    private BigInteger codigoDepartamento;
    @Column(name = "CODIGO_MUNICIPIO")
    private BigInteger codigoMunicipio;
    @Column(name = "CODIGO_TIPO_TERRITORIO")
    private BigInteger codigoTipoTerritorio;
    @Column(name = "CODIGO_RESGUARDO")
    private BigInteger codigoResguardo;
    @Column(name = "CODIGO_BARRIO")
    private BigInteger codigoBarrio;
    @Size(max = 2)
    @Column(name = "CODIGO_ZONA")
    private String codigoZona;
    @Column(name = "CODIGO_UNIDAD_CUIDADO")
    private BigInteger codigoUnidadCuidado;
    @Size(max = 50)
    @Column(name = "CODIGO_ZONA_CUIDADO")
    private String codigoZonaCuidado;
    @Size(max = 200)
    @Column(name = "DIRECCION")
    private String direccion;
    @Size(max = 5)
    @Column(name = "CODIGO_VIVIENDA")
    private String codigoVivienda;
    @Size(max = 5)
    @Column(name = "COORDENADAS_X")
    private String coordenadasX;
    @Size(max = 5)
    @Column(name = "COORDENADAS_Y")
    private String coordenadasY;
    @Column(name = "NUMERO_NUCLEOS")
    private BigInteger numeroNucleos;
    @Column(name = "FECHA_REGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Size(max = 30)
    @Column(name = "IDENTIFICACION_AGENTE")
    private String identificacionAgente;
    @Column(name = "ID_USUARIO_CARGA")
    private BigInteger idUsuarioCarga;
    @Column(name = "FECHA_CREACION")
    private Date fechaCreacion;
    @Size(max = 4000)
    @Column(name = "MENSAJE")
    private String mensaje;

    public CargaUbicacion() {
    }

    public CargaUbicacion(BigDecimal idCargaUbicacion) {
        this.idCargaUbicacion = idCargaUbicacion;
    }

    public BigDecimal getIdCargaUbicacion() {
        return idCargaUbicacion;
    }

    public void setIdCargaUbicacion(BigDecimal idCargaUbicacion) {
        this.idCargaUbicacion = idCargaUbicacion;
    }

    public BigInteger getCodigoReferencia() {
        return codigoReferencia;
    }

    public void setCodigoReferencia(BigInteger codigoReferencia) {
        this.codigoReferencia = codigoReferencia;
    }

    public BigInteger getCodigoDepartamento() {
        return codigoDepartamento;
    }

    public void setCodigoDepartamento(BigInteger codigoDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
    }

    public BigInteger getCodigoMunicipio() {
        return codigoMunicipio;
    }

    public void setCodigoMunicipio(BigInteger codigoMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
    }

    public BigInteger getCodigoTipoTerritorio() {
        return codigoTipoTerritorio;
    }

    public void setCodigoTipoTerritorio(BigInteger codigoTipoTerritorio) {
        this.codigoTipoTerritorio = codigoTipoTerritorio;
    }

    public BigInteger getCodigoResguardo() {
        return codigoResguardo;
    }

    public void setCodigoResguardo(BigInteger codigoResguardo) {
        this.codigoResguardo = codigoResguardo;
    }

    public BigInteger getCodigoBarrio() {
        return codigoBarrio;
    }

    public void setCodigoBarrio(BigInteger codigoBarrio) {
        this.codigoBarrio = codigoBarrio;
    }

    public String getCodigoZona() {
        return codigoZona;
    }

    public void setCodigoZona(String codigoZona) {
        this.codigoZona = codigoZona;
    }

    public BigInteger getCodigoUnidadCuidado() {
        return codigoUnidadCuidado;
    }

    public void setCodigoUnidadCuidado(BigInteger codigoUnidadCuidado) {
        this.codigoUnidadCuidado = codigoUnidadCuidado;
    }

    public String getCodigoZonaCuidado() {
        return codigoZonaCuidado;
    }

    public void setCodigoZonaCuidado(String codigoZonaCuidado) {
        this.codigoZonaCuidado = codigoZonaCuidado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoVivienda() {
        return codigoVivienda;
    }

    public void setCodigoVivienda(String codigoVivienda) {
        this.codigoVivienda = codigoVivienda;
    }

    public String getCoordenadasX() {
        return coordenadasX;
    }

    public void setCoordenadasX(String coordenadasX) {
        this.coordenadasX = coordenadasX;
    }

    public String getCoordenadasY() {
        return coordenadasY;
    }

    public void setCoordenadasY(String coordenadasY) {
        this.coordenadasY = coordenadasY;
    }

    public BigInteger getNumeroNucleos() {
        return numeroNucleos;
    }

    public void setNumeroNucleos(BigInteger numeroNucleos) {
        this.numeroNucleos = numeroNucleos;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getIdentificacionAgente() {
        return identificacionAgente;
    }

    public void setIdentificacionAgente(String identificacionAgente) {
        this.identificacionAgente = identificacionAgente;
    }

    public BigInteger getIdUsuarioCarga() {
        return idUsuarioCarga;
    }

    public void setIdUsuarioCarga(BigInteger idUsuarioCarga) {
        this.idUsuarioCarga = idUsuarioCarga;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCargaUbicacion != null ? idCargaUbicacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CargaUbicacion)) {
            return false;
        }
        CargaUbicacion other = (CargaUbicacion) object;
        if ((this.idCargaUbicacion == null && other.idCargaUbicacion != null) || (this.idCargaUbicacion != null && !this.idCargaUbicacion.equals(other.idCargaUbicacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sinchronize.entities.CargaUbicacion[ idCargaUbicacion=" + idCargaUbicacion + " ]";
    }
    
}
