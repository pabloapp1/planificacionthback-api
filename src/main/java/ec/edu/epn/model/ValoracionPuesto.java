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
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "VALORACION_PUESTO")
@NamedQueries({
    @NamedQuery(name = "ValoracionPuesto.findAll", query = "SELECT v FROM ValoracionPuesto v"),
    @NamedQuery(name = "ValoracionPuesto.findByIdValoracionpuesto", query = "SELECT v FROM ValoracionPuesto v WHERE v.idValoracionpuesto = :idValoracionpuesto"),
    @NamedQuery(name = "ValoracionPuesto.findByFactorValoracionpuesto", query = "SELECT v FROM ValoracionPuesto v WHERE v.factorValoracionpuesto = :factorValoracionpuesto"),
    @NamedQuery(name = "ValoracionPuesto.findBySubfactorValoracionpuesto", query = "SELECT v FROM ValoracionPuesto v WHERE v.subfactorValoracionpuesto = :subfactorValoracionpuesto"),
    @NamedQuery(name = "ValoracionPuesto.findByNivelValoracionpuesto", query = "SELECT v FROM ValoracionPuesto v WHERE v.nivelValoracionpuesto = :nivelValoracionpuesto"),
    @NamedQuery(name = "ValoracionPuesto.findByRolValoracionpuesto", query = "SELECT v FROM ValoracionPuesto v WHERE v.rolValoracionpuesto = :rolValoracionpuesto"),
    @NamedQuery(name = "ValoracionPuesto.findByPonderacionValoracionpuesto", query = "SELECT v FROM ValoracionPuesto v WHERE v.ponderacionValoracionpuesto = :ponderacionValoracionpuesto"),
    @NamedQuery(name = "ValoracionPuesto.findByPorcentajeValoracionpuesto", query = "SELECT v FROM ValoracionPuesto v WHERE v.porcentajeValoracionpuesto = :porcentajeValoracionpuesto"),
    @NamedQuery(name = "ValoracionPuesto.findByPuntajeValoracionpuesto", query = "SELECT v FROM ValoracionPuesto v WHERE v.puntajeValoracionpuesto = :puntajeValoracionpuesto"),
    @NamedQuery(name = "ValoracionPuesto.findByGradovaloracionpuesto", query = "SELECT v FROM ValoracionPuesto v WHERE v.gradovaloracionpuesto = :gradovaloracionpuesto"),
    @NamedQuery(name = "ValoracionPuesto.findByCriterioValoracionpuesto", query = "SELECT v FROM ValoracionPuesto v WHERE v.criterioValoracionpuesto = :criterioValoracionpuesto"),
    @NamedQuery(name = "ValoracionPuesto.findByDescripcionValoracionpuesto", query = "SELECT v FROM ValoracionPuesto v WHERE v.descripcionValoracionpuesto = :descripcionValoracionpuesto"),
    @NamedQuery(name = "ValoracionPuesto.findByIdusuarioValoracionpuesto", query = "SELECT v FROM ValoracionPuesto v WHERE v.idusuarioValoracionpuesto = :idusuarioValoracionpuesto"),
    @NamedQuery(name = "ValoracionPuesto.findByIdestadoValoracionpuesto", query = "SELECT v FROM ValoracionPuesto v WHERE v.idestadoValoracionpuesto = :idestadoValoracionpuesto"),
    @NamedQuery(name = "ValoracionPuesto.findByFecharegistroValoracionpuesto", query = "SELECT v FROM ValoracionPuesto v WHERE v.fecharegistroValoracionpuesto = :fecharegistroValoracionpuesto")})
public class ValoracionPuesto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_VALORACIONPUESTO")
    private Integer idValoracionpuesto;
    @Column(name = "FACTOR_VALORACIONPUESTO")
    private String factorValoracionpuesto;
    @Column(name = "SUBFACTOR_VALORACIONPUESTO")
    private String subfactorValoracionpuesto;
    @Column(name = "NIVEL_VALORACIONPUESTO")
    private String nivelValoracionpuesto;
    @Column(name = "ROL_VALORACIONPUESTO")
    private String rolValoracionpuesto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PONDERACION_VALORACIONPUESTO")
    private BigDecimal ponderacionValoracionpuesto;
    @Column(name = "PORCENTAJE_VALORACIONPUESTO")
    private BigDecimal porcentajeValoracionpuesto;
    @Column(name = "PUNTAJE_VALORACIONPUESTO")
    private BigDecimal puntajeValoracionpuesto;
    @Column(name = "GRADOVALORACIONPUESTO")
    private Integer gradovaloracionpuesto;
    @Column(name = "CRITERIO_VALORACIONPUESTO")
    private String criterioValoracionpuesto;
    @Column(name = "DESCRIPCION_VALORACIONPUESTO")
    private String descripcionValoracionpuesto;
    @Column(name = "IDUSUARIO_VALORACIONPUESTO")
    private Integer idusuarioValoracionpuesto;
    @Column(name = "IDESTADO_VALORACIONPUESTO")
    private Integer idestadoValoracionpuesto;
    @Column(name = "FECHAREGISTRO_VALORACIONPUESTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharegistroValoracionpuesto;
    @JoinColumn(name = "IDFACTOR_PUESTO", referencedColumnName = "IDFACTOR_PUESTO")
    @ManyToOne
    private FactorPuesto idfactorPuesto;
    @OneToMany(mappedBy = "idValoracionpuesto")
    private List<ProductoActividad> productoActividadList;

    public ValoracionPuesto() {
    }

    public ValoracionPuesto(Integer idValoracionpuesto) {
        this.idValoracionpuesto = idValoracionpuesto;
    }

    public Integer getIdValoracionpuesto() {
        return idValoracionpuesto;
    }

    public void setIdValoracionpuesto(Integer idValoracionpuesto) {
        this.idValoracionpuesto = idValoracionpuesto;
    }

    public String getFactorValoracionpuesto() {
        return factorValoracionpuesto;
    }

    public void setFactorValoracionpuesto(String factorValoracionpuesto) {
        this.factorValoracionpuesto = factorValoracionpuesto;
    }

    public String getSubfactorValoracionpuesto() {
        return subfactorValoracionpuesto;
    }

    public void setSubfactorValoracionpuesto(String subfactorValoracionpuesto) {
        this.subfactorValoracionpuesto = subfactorValoracionpuesto;
    }

    public String getNivelValoracionpuesto() {
        return nivelValoracionpuesto;
    }

    public void setNivelValoracionpuesto(String nivelValoracionpuesto) {
        this.nivelValoracionpuesto = nivelValoracionpuesto;
    }

    public String getRolValoracionpuesto() {
        return rolValoracionpuesto;
    }

    public void setRolValoracionpuesto(String rolValoracionpuesto) {
        this.rolValoracionpuesto = rolValoracionpuesto;
    }

    public BigDecimal getPonderacionValoracionpuesto() {
        return ponderacionValoracionpuesto;
    }

    public void setPonderacionValoracionpuesto(BigDecimal ponderacionValoracionpuesto) {
        this.ponderacionValoracionpuesto = ponderacionValoracionpuesto;
    }

    public BigDecimal getPorcentajeValoracionpuesto() {
        return porcentajeValoracionpuesto;
    }

    public void setPorcentajeValoracionpuesto(BigDecimal porcentajeValoracionpuesto) {
        this.porcentajeValoracionpuesto = porcentajeValoracionpuesto;
    }

    public BigDecimal getPuntajeValoracionpuesto() {
        return puntajeValoracionpuesto;
    }

    public void setPuntajeValoracionpuesto(BigDecimal puntajeValoracionpuesto) {
        this.puntajeValoracionpuesto = puntajeValoracionpuesto;
    }

    public Integer getGradovaloracionpuesto() {
        return gradovaloracionpuesto;
    }

    public void setGradovaloracionpuesto(Integer gradovaloracionpuesto) {
        this.gradovaloracionpuesto = gradovaloracionpuesto;
    }

    public String getCriterioValoracionpuesto() {
        return criterioValoracionpuesto;
    }

    public void setCriterioValoracionpuesto(String criterioValoracionpuesto) {
        this.criterioValoracionpuesto = criterioValoracionpuesto;
    }

    public String getDescripcionValoracionpuesto() {
        return descripcionValoracionpuesto;
    }

    public void setDescripcionValoracionpuesto(String descripcionValoracionpuesto) {
        this.descripcionValoracionpuesto = descripcionValoracionpuesto;
    }

    public Integer getIdusuarioValoracionpuesto() {
        return idusuarioValoracionpuesto;
    }

    public void setIdusuarioValoracionpuesto(Integer idusuarioValoracionpuesto) {
        this.idusuarioValoracionpuesto = idusuarioValoracionpuesto;
    }

    public Integer getIdestadoValoracionpuesto() {
        return idestadoValoracionpuesto;
    }

    public void setIdestadoValoracionpuesto(Integer idestadoValoracionpuesto) {
        this.idestadoValoracionpuesto = idestadoValoracionpuesto;
    }

    public Date getFecharegistroValoracionpuesto() {
        return fecharegistroValoracionpuesto;
    }

    public void setFecharegistroValoracionpuesto(Date fecharegistroValoracionpuesto) {
        this.fecharegistroValoracionpuesto = fecharegistroValoracionpuesto;
    }

    public FactorPuesto getIdfactorPuesto() {
        return idfactorPuesto;
    }

    public void setIdfactorPuesto(FactorPuesto idfactorPuesto) {
        this.idfactorPuesto = idfactorPuesto;
    }

    public List<ProductoActividad> getProductoActividadList() {
        return productoActividadList;
    }

    public void setProductoActividadList(List<ProductoActividad> productoActividadList) {
        this.productoActividadList = productoActividadList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idValoracionpuesto != null ? idValoracionpuesto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ValoracionPuesto)) {
            return false;
        }
        ValoracionPuesto other = (ValoracionPuesto) object;
        if ((this.idValoracionpuesto == null && other.idValoracionpuesto != null) || (this.idValoracionpuesto != null && !this.idValoracionpuesto.equals(other.idValoracionpuesto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.epn.model.ValoracionPuesto[ idValoracionpuesto=" + idValoracionpuesto + " ]";
    }
    
}
