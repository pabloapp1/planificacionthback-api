/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.epn.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "DATOS_GLOBALES")
@NamedQueries({
    @NamedQuery(name = "DatosGlobales.findAll", query = "SELECT d FROM DatosGlobales d"),
    @NamedQuery(name = "DatosGlobales.findByIdDatosglobales", query = "SELECT d FROM DatosGlobales d WHERE d.idDatosglobales = :idDatosglobales"),
    @NamedQuery(name = "DatosGlobales.findByClaveDatosglobales", query = "SELECT d FROM DatosGlobales d WHERE d.claveDatosglobales = :claveDatosglobales"),
    @NamedQuery(name = "DatosGlobales.findByTipoDatosglobales", query = "SELECT d FROM DatosGlobales d WHERE d.tipoDatosglobales = :tipoDatosglobales"),
    @NamedQuery(name = "DatosGlobales.findByValorDatosglobales", query = "SELECT d FROM DatosGlobales d WHERE d.valorDatosglobales = :valorDatosglobales"),
    @NamedQuery(name = "DatosGlobales.findByIdusuarioDatosglobales", query = "SELECT d FROM DatosGlobales d WHERE d.idusuarioDatosglobales = :idusuarioDatosglobales"),
    @NamedQuery(name = "DatosGlobales.findByIdestadoDatosglobales", query = "SELECT d FROM DatosGlobales d WHERE d.idestadoDatosglobales = :idestadoDatosglobales"),
    @NamedQuery(name = "DatosGlobales.findByFecharegistroDatosglobales", query = "SELECT d FROM DatosGlobales d WHERE d.fecharegistroDatosglobales = :fecharegistroDatosglobales")})
public class DatosGlobales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_DATOSGLOBALES")
    private Integer idDatosglobales;
    @Column(name = "CLAVE_DATOSGLOBALES")
    private String claveDatosglobales;
    @Column(name = "TIPO_DATOSGLOBALES")
    private String tipoDatosglobales;
    @Column(name = "VALOR_DATOSGLOBALES")
    private String valorDatosglobales;
    @Column(name = "IDUSUARIO_DATOSGLOBALES")
    private Integer idusuarioDatosglobales;
    @Column(name = "IDESTADO_DATOSGLOBALES")
    private Integer idestadoDatosglobales;
    @Column(name = "FECHAREGISTRO_DATOSGLOBALES")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharegistroDatosglobales;

    public DatosGlobales() {
    }

    public DatosGlobales(Integer idDatosglobales) {
        this.idDatosglobales = idDatosglobales;
    }

    public Integer getIdDatosglobales() {
        return idDatosglobales;
    }

    public void setIdDatosglobales(Integer idDatosglobales) {
        this.idDatosglobales = idDatosglobales;
    }

    public String getClaveDatosglobales() {
        return claveDatosglobales;
    }

    public void setClaveDatosglobales(String claveDatosglobales) {
        this.claveDatosglobales = claveDatosglobales;
    }

    public String getTipoDatosglobales() {
        return tipoDatosglobales;
    }

    public void setTipoDatosglobales(String tipoDatosglobales) {
        this.tipoDatosglobales = tipoDatosglobales;
    }

    public String getValorDatosglobales() {
        return valorDatosglobales;
    }

    public void setValorDatosglobales(String valorDatosglobales) {
        this.valorDatosglobales = valorDatosglobales;
    }

    public Integer getIdusuarioDatosglobales() {
        return idusuarioDatosglobales;
    }

    public void setIdusuarioDatosglobales(Integer idusuarioDatosglobales) {
        this.idusuarioDatosglobales = idusuarioDatosglobales;
    }

    public Integer getIdestadoDatosglobales() {
        return idestadoDatosglobales;
    }

    public void setIdestadoDatosglobales(Integer idestadoDatosglobales) {
        this.idestadoDatosglobales = idestadoDatosglobales;
    }

    public Date getFecharegistroDatosglobales() {
        return fecharegistroDatosglobales;
    }

    public void setFecharegistroDatosglobales(Date fecharegistroDatosglobales) {
        this.fecharegistroDatosglobales = fecharegistroDatosglobales;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDatosglobales != null ? idDatosglobales.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DatosGlobales)) {
            return false;
        }
        DatosGlobales other = (DatosGlobales) object;
        if ((this.idDatosglobales == null && other.idDatosglobales != null) || (this.idDatosglobales != null && !this.idDatosglobales.equals(other.idDatosglobales))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.epn.model.DatosGlobales[ idDatosglobales=" + idDatosglobales + " ]";
    }
    
}
