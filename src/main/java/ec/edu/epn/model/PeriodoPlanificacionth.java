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
@Table(name = "PERIODO_PLANIFICACIONTH")
@NamedQueries({
    @NamedQuery(name = "PeriodoPlanificacionth.findAll", query = "SELECT p FROM PeriodoPlanificacionth p"),
    @NamedQuery(name = "PeriodoPlanificacionth.findByIdPeriodoplanifth", query = "SELECT p FROM PeriodoPlanificacionth p WHERE p.idPeriodoplanifth = :idPeriodoplanifth"),
    @NamedQuery(name = "PeriodoPlanificacionth.findByNombrePeriodoplanifth", query = "SELECT p FROM PeriodoPlanificacionth p WHERE p.nombrePeriodoplanifth = :nombrePeriodoplanifth"),
    @NamedQuery(name = "PeriodoPlanificacionth.findByFechainicioPeriodoplanifth", query = "SELECT p FROM PeriodoPlanificacionth p WHERE p.fechainicioPeriodoplanifth = :fechainicioPeriodoplanifth"),
    @NamedQuery(name = "PeriodoPlanificacionth.findByFechafinPeriodoplanifth", query = "SELECT p FROM PeriodoPlanificacionth p WHERE p.fechafinPeriodoplanifth = :fechafinPeriodoplanifth"),
    @NamedQuery(name = "PeriodoPlanificacionth.findByDescripcionPeriodoplanifth", query = "SELECT p FROM PeriodoPlanificacionth p WHERE p.descripcionPeriodoplanifth = :descripcionPeriodoplanifth"),
    @NamedQuery(name = "PeriodoPlanificacionth.findByIdusuarioPeriodoplanifth", query = "SELECT p FROM PeriodoPlanificacionth p WHERE p.idusuarioPeriodoplanifth = :idusuarioPeriodoplanifth"),
    @NamedQuery(name = "PeriodoPlanificacionth.findByIdestadoPeriodoplanifth", query = "SELECT p FROM PeriodoPlanificacionth p WHERE p.idestadoPeriodoplanifth = :idestadoPeriodoplanifth"),
    @NamedQuery(name = "PeriodoPlanificacionth.findByFecharegistroPeriodoplanifth", query = "SELECT p FROM PeriodoPlanificacionth p WHERE p.fecharegistroPeriodoplanifth = :fecharegistroPeriodoplanifth")})
public class PeriodoPlanificacionth implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_PERIODOPLANIFTH")
    private Integer idPeriodoplanifth;
    @Column(name = "NOMBRE_PERIODOPLANIFTH")
    private String nombrePeriodoplanifth;
    @Column(name = "FECHAINICIO_PERIODOPLANIFTH")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechainicioPeriodoplanifth;
    @Column(name = "FECHAFIN_PERIODOPLANIFTH")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechafinPeriodoplanifth;
    @Column(name = "DESCRIPCION_PERIODOPLANIFTH")
    private String descripcionPeriodoplanifth;
    @Column(name = "IDUSUARIO_PERIODOPLANIFTH")
    private Integer idusuarioPeriodoplanifth;
    @Column(name = "IDESTADO_PERIODOPLANIFTH")
    private Integer idestadoPeriodoplanifth;
    @Column(name = "FECHAREGISTRO_PERIODOPLANIFTH")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharegistroPeriodoplanifth;
    @OneToMany(mappedBy = "idPeriodoplanifth")
    private List<ProductoVolumen> productoVolumenList;
    @JoinColumn(name = "COD_DEP", referencedColumnName = "COD_DEP")
    @ManyToOne
    private Dependencia codDep;

    public PeriodoPlanificacionth() {
    }

    public PeriodoPlanificacionth(Integer idPeriodoplanifth) {
        this.idPeriodoplanifth = idPeriodoplanifth;
    }

    public Integer getIdPeriodoplanifth() {
        return idPeriodoplanifth;
    }

    public void setIdPeriodoplanifth(Integer idPeriodoplanifth) {
        this.idPeriodoplanifth = idPeriodoplanifth;
    }

    public String getNombrePeriodoplanifth() {
        return nombrePeriodoplanifth;
    }

    public void setNombrePeriodoplanifth(String nombrePeriodoplanifth) {
        this.nombrePeriodoplanifth = nombrePeriodoplanifth;
    }

    public Date getFechainicioPeriodoplanifth() {
        return fechainicioPeriodoplanifth;
    }

    public void setFechainicioPeriodoplanifth(Date fechainicioPeriodoplanifth) {
        this.fechainicioPeriodoplanifth = fechainicioPeriodoplanifth;
    }

    public Date getFechafinPeriodoplanifth() {
        return fechafinPeriodoplanifth;
    }

    public void setFechafinPeriodoplanifth(Date fechafinPeriodoplanifth) {
        this.fechafinPeriodoplanifth = fechafinPeriodoplanifth;
    }

    public String getDescripcionPeriodoplanifth() {
        return descripcionPeriodoplanifth;
    }

    public void setDescripcionPeriodoplanifth(String descripcionPeriodoplanifth) {
        this.descripcionPeriodoplanifth = descripcionPeriodoplanifth;
    }

    public Integer getIdusuarioPeriodoplanifth() {
        return idusuarioPeriodoplanifth;
    }

    public void setIdusuarioPeriodoplanifth(Integer idusuarioPeriodoplanifth) {
        this.idusuarioPeriodoplanifth = idusuarioPeriodoplanifth;
    }

    public Integer getIdestadoPeriodoplanifth() {
        return idestadoPeriodoplanifth;
    }

    public void setIdestadoPeriodoplanifth(Integer idestadoPeriodoplanifth) {
        this.idestadoPeriodoplanifth = idestadoPeriodoplanifth;
    }

    public Date getFecharegistroPeriodoplanifth() {
        return fecharegistroPeriodoplanifth;
    }

    public void setFecharegistroPeriodoplanifth(Date fecharegistroPeriodoplanifth) {
        this.fecharegistroPeriodoplanifth = fecharegistroPeriodoplanifth;
    }

    public List<ProductoVolumen> getProductoVolumenList() {
        return productoVolumenList;
    }

    public void setProductoVolumenList(List<ProductoVolumen> productoVolumenList) {
        this.productoVolumenList = productoVolumenList;
    }

    public Dependencia getCodDep() {
        return codDep;
    }

    public void setCodDep(Dependencia codDep) {
        this.codDep = codDep;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPeriodoplanifth != null ? idPeriodoplanifth.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PeriodoPlanificacionth)) {
            return false;
        }
        PeriodoPlanificacionth other = (PeriodoPlanificacionth) object;
        if ((this.idPeriodoplanifth == null && other.idPeriodoplanifth != null) || (this.idPeriodoplanifth != null && !this.idPeriodoplanifth.equals(other.idPeriodoplanifth))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.epn.model.PeriodoPlanificacionth[ idPeriodoplanifth=" + idPeriodoplanifth + " ]";
    }
    
}
