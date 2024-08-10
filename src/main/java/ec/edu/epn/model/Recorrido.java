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
import jakarta.persistence.Lob;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "RECORRIDO")
@NamedQueries({
    @NamedQuery(name = "Recorrido.findAll", query = "SELECT r FROM Recorrido r"),
    @NamedQuery(name = "Recorrido.findByIdRecorrido", query = "SELECT r FROM Recorrido r WHERE r.idRecorrido = :idRecorrido"),
    @NamedQuery(name = "Recorrido.findByIdgestionRecorrido", query = "SELECT r FROM Recorrido r WHERE r.idgestionRecorrido = :idgestionRecorrido"),
    @NamedQuery(name = "Recorrido.findByTipogestionRecorrido", query = "SELECT r FROM Recorrido r WHERE r.tipogestionRecorrido = :tipogestionRecorrido"),
    @NamedQuery(name = "Recorrido.findByNomestadoanteriorRecorrido", query = "SELECT r FROM Recorrido r WHERE r.nomestadoanteriorRecorrido = :nomestadoanteriorRecorrido"),
    @NamedQuery(name = "Recorrido.findByNomestadoactualRecorrido", query = "SELECT r FROM Recorrido r WHERE r.nomestadoactualRecorrido = :nomestadoactualRecorrido"),
    @NamedQuery(name = "Recorrido.findByIdPeriodoplanifthRecorrido", query = "SELECT r FROM Recorrido r WHERE r.idPeriodoplanifthRecorrido = :idPeriodoplanifthRecorrido"),
    @NamedQuery(name = "Recorrido.findByIdusuarioRecorrido", query = "SELECT r FROM Recorrido r WHERE r.idusuarioRecorrido = :idusuarioRecorrido"),
    @NamedQuery(name = "Recorrido.findByIdestadoRecorrido", query = "SELECT r FROM Recorrido r WHERE r.idestadoRecorrido = :idestadoRecorrido"),
    @NamedQuery(name = "Recorrido.findByObservacionRecorrido", query = "SELECT r FROM Recorrido r WHERE r.observacionRecorrido = :observacionRecorrido")})
public class Recorrido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_RECORRIDO")
    private Integer idRecorrido;
    @Column(name = "IDGESTION_RECORRIDO")
    private Integer idgestionRecorrido;
    @Column(name = "TIPOGESTION_RECORRIDO")
    private String tipogestionRecorrido;
    @Column(name = "NOMESTADOANTERIOR_RECORRIDO")
    private String nomestadoanteriorRecorrido;
    @Column(name = "NOMESTADOACTUAL_RECORRIDO")
    private String nomestadoactualRecorrido;
    @Column(name = "ID_PERIODOPLANIFTH_RECORRIDO")
    private Integer idPeriodoplanifthRecorrido;
    @Column(name = "IDUSUARIO_RECORRIDO")
    private Integer idusuarioRecorrido;
    @Column(name = "IDESTADO_RECORRIDO")
    private Integer idestadoRecorrido;
    @Column(name = "OBSERVACION_RECORRIDO")
    private String observacionRecorrido;
    @Lob
    @Column(name = "FECHAREGISTRO_RECORRIDO")
    private byte[] fecharegistroRecorrido;

    public Recorrido() {
    }

    public Recorrido(Integer idRecorrido) {
        this.idRecorrido = idRecorrido;
    }

    public Integer getIdRecorrido() {
        return idRecorrido;
    }

    public void setIdRecorrido(Integer idRecorrido) {
        this.idRecorrido = idRecorrido;
    }

    public Integer getIdgestionRecorrido() {
        return idgestionRecorrido;
    }

    public void setIdgestionRecorrido(Integer idgestionRecorrido) {
        this.idgestionRecorrido = idgestionRecorrido;
    }

    public String getTipogestionRecorrido() {
        return tipogestionRecorrido;
    }

    public void setTipogestionRecorrido(String tipogestionRecorrido) {
        this.tipogestionRecorrido = tipogestionRecorrido;
    }

    public String getNomestadoanteriorRecorrido() {
        return nomestadoanteriorRecorrido;
    }

    public void setNomestadoanteriorRecorrido(String nomestadoanteriorRecorrido) {
        this.nomestadoanteriorRecorrido = nomestadoanteriorRecorrido;
    }

    public String getNomestadoactualRecorrido() {
        return nomestadoactualRecorrido;
    }

    public void setNomestadoactualRecorrido(String nomestadoactualRecorrido) {
        this.nomestadoactualRecorrido = nomestadoactualRecorrido;
    }

    public Integer getIdPeriodoplanifthRecorrido() {
        return idPeriodoplanifthRecorrido;
    }

    public void setIdPeriodoplanifthRecorrido(Integer idPeriodoplanifthRecorrido) {
        this.idPeriodoplanifthRecorrido = idPeriodoplanifthRecorrido;
    }

    public Integer getIdusuarioRecorrido() {
        return idusuarioRecorrido;
    }

    public void setIdusuarioRecorrido(Integer idusuarioRecorrido) {
        this.idusuarioRecorrido = idusuarioRecorrido;
    }

    public Integer getIdestadoRecorrido() {
        return idestadoRecorrido;
    }

    public void setIdestadoRecorrido(Integer idestadoRecorrido) {
        this.idestadoRecorrido = idestadoRecorrido;
    }

    public String getObservacionRecorrido() {
        return observacionRecorrido;
    }

    public void setObservacionRecorrido(String observacionRecorrido) {
        this.observacionRecorrido = observacionRecorrido;
    }

    public byte[] getFecharegistroRecorrido() {
        return fecharegistroRecorrido;
    }

    public void setFecharegistroRecorrido(byte[] fecharegistroRecorrido) {
        this.fecharegistroRecorrido = fecharegistroRecorrido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRecorrido != null ? idRecorrido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Recorrido)) {
            return false;
        }
        Recorrido other = (Recorrido) object;
        if ((this.idRecorrido == null && other.idRecorrido != null) || (this.idRecorrido != null && !this.idRecorrido.equals(other.idRecorrido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.epn.model.Recorrido[ idRecorrido=" + idRecorrido + " ]";
    }
    
}
