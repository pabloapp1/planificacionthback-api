/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.epn.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "PRODUCTO_VOLUMEN")
@NamedQueries({
    @NamedQuery(name = "ProductoVolumen.findAll", query = "SELECT p FROM ProductoVolumen p"),
    @NamedQuery(name = "ProductoVolumen.findByIdProductovolumen", query = "SELECT p FROM ProductoVolumen p WHERE p.idProductovolumen = :idProductovolumen"),
    @NamedQuery(name = "ProductoVolumen.findByNombreProductovolumen", query = "SELECT p FROM ProductoVolumen p WHERE p.nombreProductovolumen = :nombreProductovolumen"),
    @NamedQuery(name = "ProductoVolumen.findByFrecuenciaProductovolumen", query = "SELECT p FROM ProductoVolumen p WHERE p.frecuenciaProductovolumen = :frecuenciaProductovolumen"),
    @NamedQuery(name = "ProductoVolumen.findByVolumenProductovolumen", query = "SELECT p FROM ProductoVolumen p WHERE p.volumenProductovolumen = :volumenProductovolumen"),
    @NamedQuery(name = "ProductoVolumen.findByVolumenmensualProductovolumen", query = "SELECT p FROM ProductoVolumen p WHERE p.volumenmensualProductovolumen = :volumenmensualProductovolumen"),
    @NamedQuery(name = "ProductoVolumen.findByTiempominiminuProductovolumen", query = "SELECT p FROM ProductoVolumen p WHERE p.tiempominiminuProductovolumen = :tiempominiminuProductovolumen"),
    @NamedQuery(name = "ProductoVolumen.findByTiempomaximinuProductovolumen", query = "SELECT p FROM ProductoVolumen p WHERE p.tiempomaximinuProductovolumen = :tiempomaximinuProductovolumen"),
    @NamedQuery(name = "ProductoVolumen.findByTiempopromedioProductovolumen", query = "SELECT p FROM ProductoVolumen p WHERE p.tiempopromedioProductovolumen = :tiempopromedioProductovolumen"),
    @NamedQuery(name = "ProductoVolumen.findByNumpersonasProductovolumen", query = "SELECT p FROM ProductoVolumen p WHERE p.numpersonasProductovolumen = :numpersonasProductovolumen"),
    @NamedQuery(name = "ProductoVolumen.findByObservacionProductovolumen", query = "SELECT p FROM ProductoVolumen p WHERE p.observacionProductovolumen = :observacionProductovolumen"),
    @NamedQuery(name = "ProductoVolumen.findByIdPeriodoplanifthProductovolumen", query = "SELECT p FROM ProductoVolumen p WHERE p.idPeriodoplanifthProductovolumen = :idPeriodoplanifthProductovolumen"),
    @NamedQuery(name = "ProductoVolumen.findByIdusuarioProductovolumen", query = "SELECT p FROM ProductoVolumen p WHERE p.idusuarioProductovolumen = :idusuarioProductovolumen"),
    @NamedQuery(name = "ProductoVolumen.findByIdestadoProductovolumen", query = "SELECT p FROM ProductoVolumen p WHERE p.idestadoProductovolumen = :idestadoProductovolumen"),
    @NamedQuery(name = "ProductoVolumen.findByFecharegistroProductovolumen", query = "SELECT p FROM ProductoVolumen p WHERE p.fecharegistroProductovolumen = :fecharegistroProductovolumen")})
public class ProductoVolumen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_PRODUCTOVOLUMEN")
    private Integer idProductovolumen;
    @Column(name = "NOMBRE_PRODUCTOVOLUMEN")
    private String nombreProductovolumen;
    @Column(name = "FRECUENCIA_PRODUCTOVOLUMEN")
    private String frecuenciaProductovolumen;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VOLUMEN_PRODUCTOVOLUMEN")
    private BigDecimal volumenProductovolumen;
    @Column(name = "VOLUMENMENSUAL_PRODUCTOVOLUMEN")
    private BigDecimal volumenmensualProductovolumen;
    @Column(name = "TIEMPOMINIMINU_PRODUCTOVOLUMEN")
    private BigDecimal tiempominiminuProductovolumen;
    @Column(name = "TIEMPOMAXIMINU_PRODUCTOVOLUMEN")
    private BigDecimal tiempomaximinuProductovolumen;
    @Column(name = "TIEMPOPROMEDIO_PRODUCTOVOLUMEN")
    private BigDecimal tiempopromedioProductovolumen;
    @Column(name = "NUMPERSONAS_PRODUCTOVOLUMEN")
    private BigDecimal numpersonasProductovolumen;
    @Column(name = "OBSERVACION_PRODUCTOVOLUMEN")
    private String observacionProductovolumen;
    @Column(name = "ID_PERIODOPLANIFTH_PRODUCTOVOLUMEN")
    private Integer idPeriodoplanifthProductovolumen;
    @Column(name = "IDUSUARIO_PRODUCTOVOLUMEN")
    private Integer idusuarioProductovolumen;
    @Column(name = "IDESTADO_PRODUCTOVOLUMEN")
    private Integer idestadoProductovolumen;
    @Column(name = "FECHAREGISTRO_PRODUCTOVOLUMEN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharegistroProductovolumen;
    @JoinColumn(name = "COD_DEP", referencedColumnName = "COD_DEP")
    @ManyToOne
    private Dependencia codDep;
    @JoinColumn(name = "ID_PERIODOPLANIFTH", referencedColumnName = "ID_PERIODOPLANIFTH")
    @ManyToOne
    private PeriodoPlanificacionth idPeriodoplanifth;
    @OneToMany(mappedBy = "idProductovolumen")
    private List<ProductoRespaldo> productoRespaldoList;

    @OneToMany(mappedBy = "idProductovolumen", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<ProductoActividad> productoActividadList;

    public ProductoVolumen() {
    }

    public ProductoVolumen(Integer idProductovolumen) {
        this.idProductovolumen = idProductovolumen;
    }

    public Integer getIdProductovolumen() {
        return idProductovolumen;
    }

    public void setIdProductovolumen(Integer idProductovolumen) {
        this.idProductovolumen = idProductovolumen;
    }

    public String getNombreProductovolumen() {
        return nombreProductovolumen;
    }

    public void setNombreProductovolumen(String nombreProductovolumen) {
        this.nombreProductovolumen = nombreProductovolumen;
    }

    public String getFrecuenciaProductovolumen() {
        return frecuenciaProductovolumen;
    }

    public void setFrecuenciaProductovolumen(String frecuenciaProductovolumen) {
        this.frecuenciaProductovolumen = frecuenciaProductovolumen;
    }

    public BigDecimal getVolumenProductovolumen() {
        return volumenProductovolumen;
    }

    public void setVolumenProductovolumen(BigDecimal volumenProductovolumen) {
        this.volumenProductovolumen = volumenProductovolumen;
    }

    public BigDecimal getVolumenmensualProductovolumen() {
        return volumenmensualProductovolumen;
    }

    public void setVolumenmensualProductovolumen(BigDecimal volumenmensualProductovolumen) {
        this.volumenmensualProductovolumen = volumenmensualProductovolumen;
    }

    public BigDecimal getTiempominiminuProductovolumen() {
        return tiempominiminuProductovolumen;
    }

    public void setTiempominiminuProductovolumen(BigDecimal tiempominiminuProductovolumen) {
        this.tiempominiminuProductovolumen = tiempominiminuProductovolumen;
    }

    public BigDecimal getTiempomaximinuProductovolumen() {
        return tiempomaximinuProductovolumen;
    }

    public void setTiempomaximinuProductovolumen(BigDecimal tiempomaximinuProductovolumen) {
        this.tiempomaximinuProductovolumen = tiempomaximinuProductovolumen;
    }

    public BigDecimal getTiempopromedioProductovolumen() {
        return tiempopromedioProductovolumen;
    }

    public void setTiempopromedioProductovolumen(BigDecimal tiempopromedioProductovolumen) {
        this.tiempopromedioProductovolumen = tiempopromedioProductovolumen;
    }

    public BigDecimal getNumpersonasProductovolumen() {
        return numpersonasProductovolumen;
    }

    public void setNumpersonasProductovolumen(BigDecimal numpersonasProductovolumen) {
        this.numpersonasProductovolumen = numpersonasProductovolumen;
    }

    public String getObservacionProductovolumen() {
        return observacionProductovolumen;
    }

    public void setObservacionProductovolumen(String observacionProductovolumen) {
        this.observacionProductovolumen = observacionProductovolumen;
    }

    public Integer getIdPeriodoplanifthProductovolumen() {
        return idPeriodoplanifthProductovolumen;
    }

    public void setIdPeriodoplanifthProductovolumen(Integer idPeriodoplanifthProductovolumen) {
        this.idPeriodoplanifthProductovolumen = idPeriodoplanifthProductovolumen;
    }

    public Integer getIdusuarioProductovolumen() {
        return idusuarioProductovolumen;
    }

    public void setIdusuarioProductovolumen(Integer idusuarioProductovolumen) {
        this.idusuarioProductovolumen = idusuarioProductovolumen;
    }

    public Integer getIdestadoProductovolumen() {
        return idestadoProductovolumen;
    }

    public void setIdestadoProductovolumen(Integer idestadoProductovolumen) {
        this.idestadoProductovolumen = idestadoProductovolumen;
    }

    public Date getFecharegistroProductovolumen() {
        return fecharegistroProductovolumen;
    }

    public void setFecharegistroProductovolumen(Date fecharegistroProductovolumen) {
        this.fecharegistroProductovolumen = fecharegistroProductovolumen;
    }

    public Dependencia getCodDep() {
        return codDep;
    }

    public void setCodDep(Dependencia codDep) {
        this.codDep = codDep;
    }

    public PeriodoPlanificacionth getIdPeriodoplanifth() {
        return idPeriodoplanifth;
    }

    public void setIdPeriodoplanifth(PeriodoPlanificacionth idPeriodoplanifth) {
        this.idPeriodoplanifth = idPeriodoplanifth;
    }

    public List<ProductoRespaldo> getProductoRespaldoList() {
        return productoRespaldoList;
    }

    public void setProductoRespaldoList(List<ProductoRespaldo> productoRespaldoList) {
        this.productoRespaldoList = productoRespaldoList;
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
        hash += (idProductovolumen != null ? idProductovolumen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductoVolumen)) {
            return false;
        }
        ProductoVolumen other = (ProductoVolumen) object;
        if ((this.idProductovolumen == null && other.idProductovolumen != null) || (this.idProductovolumen != null && !this.idProductovolumen.equals(other.idProductovolumen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.epn.model.ProductoVolumen[ idProductovolumen=" + idProductovolumen + " ]";
    }
    
}
