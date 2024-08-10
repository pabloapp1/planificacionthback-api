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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "FACTOR_PUESTO")
@NamedQueries({
    @NamedQuery(name = "FactorPuesto.findAll", query = "SELECT f FROM FactorPuesto f"),
    @NamedQuery(name = "FactorPuesto.findByIdfactorPuesto", query = "SELECT f FROM FactorPuesto f WHERE f.idfactorPuesto = :idfactorPuesto"),
    @NamedQuery(name = "FactorPuesto.findByNombreFactorpuesto", query = "SELECT f FROM FactorPuesto f WHERE f.nombreFactorpuesto = :nombreFactorpuesto"),
    @NamedQuery(name = "FactorPuesto.findByDescripcionFactorpuesto", query = "SELECT f FROM FactorPuesto f WHERE f.descripcionFactorpuesto = :descripcionFactorpuesto"),
    @NamedQuery(name = "FactorPuesto.findByIdusuarioFactorpuesto", query = "SELECT f FROM FactorPuesto f WHERE f.idusuarioFactorpuesto = :idusuarioFactorpuesto"),
    @NamedQuery(name = "FactorPuesto.findByIdestadoFactorpuesto", query = "SELECT f FROM FactorPuesto f WHERE f.idestadoFactorpuesto = :idestadoFactorpuesto"),
    @NamedQuery(name = "FactorPuesto.findByFecharegistroFactorpuesto", query = "SELECT f FROM FactorPuesto f WHERE f.fecharegistroFactorpuesto = :fecharegistroFactorpuesto")})
public class FactorPuesto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDFACTOR_PUESTO")
    private Integer idfactorPuesto;
    @Column(name = "NOMBRE_FACTORPUESTO")
    private String nombreFactorpuesto;
    @Column(name = "DESCRIPCION_FACTORPUESTO")
    private String descripcionFactorpuesto;
    @Column(name = "IDUSUARIO_FACTORPUESTO")
    private Integer idusuarioFactorpuesto;
    @Column(name = "IDESTADO_FACTORPUESTO")
    private Integer idestadoFactorpuesto;
    @Column(name = "FECHAREGISTRO_FACTORPUESTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharegistroFactorpuesto;
    @OneToMany(mappedBy = "idfactorPuesto")
    private List<ValoracionPuesto> valoracionPuestoList;
    @OneToMany(mappedBy = "facIdfactorPuesto")
    private List<FactorPuesto> factorPuestoList;
    @JoinColumn(name = "FAC_IDFACTOR_PUESTO", referencedColumnName = "IDFACTOR_PUESTO")
    @ManyToOne
    private FactorPuesto facIdfactorPuesto;

    public FactorPuesto() {
    }

    public FactorPuesto(Integer idfactorPuesto) {
        this.idfactorPuesto = idfactorPuesto;
    }

    public Integer getIdfactorPuesto() {
        return idfactorPuesto;
    }

    public void setIdfactorPuesto(Integer idfactorPuesto) {
        this.idfactorPuesto = idfactorPuesto;
    }

    public String getNombreFactorpuesto() {
        return nombreFactorpuesto;
    }

    public void setNombreFactorpuesto(String nombreFactorpuesto) {
        this.nombreFactorpuesto = nombreFactorpuesto;
    }

    public String getDescripcionFactorpuesto() {
        return descripcionFactorpuesto;
    }

    public void setDescripcionFactorpuesto(String descripcionFactorpuesto) {
        this.descripcionFactorpuesto = descripcionFactorpuesto;
    }

    public Integer getIdusuarioFactorpuesto() {
        return idusuarioFactorpuesto;
    }

    public void setIdusuarioFactorpuesto(Integer idusuarioFactorpuesto) {
        this.idusuarioFactorpuesto = idusuarioFactorpuesto;
    }

    public Integer getIdestadoFactorpuesto() {
        return idestadoFactorpuesto;
    }

    public void setIdestadoFactorpuesto(Integer idestadoFactorpuesto) {
        this.idestadoFactorpuesto = idestadoFactorpuesto;
    }

    public Date getFecharegistroFactorpuesto() {
        return fecharegistroFactorpuesto;
    }

    public void setFecharegistroFactorpuesto(Date fecharegistroFactorpuesto) {
        this.fecharegistroFactorpuesto = fecharegistroFactorpuesto;
    }

    public List<ValoracionPuesto> getValoracionPuestoList() {
        return valoracionPuestoList;
    }

    public void setValoracionPuestoList(List<ValoracionPuesto> valoracionPuestoList) {
        this.valoracionPuestoList = valoracionPuestoList;
    }

    public List<FactorPuesto> getFactorPuestoList() {
        return factorPuestoList;
    }

    public void setFactorPuestoList(List<FactorPuesto> factorPuestoList) {
        this.factorPuestoList = factorPuestoList;
    }

    public FactorPuesto getFacIdfactorPuesto() {
        return facIdfactorPuesto;
    }

    public void setFacIdfactorPuesto(FactorPuesto facIdfactorPuesto) {
        this.facIdfactorPuesto = facIdfactorPuesto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfactorPuesto != null ? idfactorPuesto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FactorPuesto)) {
            return false;
        }
        FactorPuesto other = (FactorPuesto) object;
        if ((this.idfactorPuesto == null && other.idfactorPuesto != null) || (this.idfactorPuesto != null && !this.idfactorPuesto.equals(other.idfactorPuesto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.epn.model.FactorPuesto[ idfactorPuesto=" + idfactorPuesto + " ]";
    }
    
}
