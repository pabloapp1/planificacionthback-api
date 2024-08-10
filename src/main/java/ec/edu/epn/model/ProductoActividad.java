/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.epn.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "PRODUCTO_ACTIVIDAD")
@NamedQueries({
    @NamedQuery(name = "ProductoActividad.findAll", query = "SELECT p FROM ProductoActividad p"),
    @NamedQuery(name = "ProductoActividad.findByIdActividad", query = "SELECT p FROM ProductoActividad p WHERE p.idActividad = :idActividad"),
    @NamedQuery(name = "ProductoActividad.findByIdProductovolumen", query = "SELECT p FROM ProductoActividad p WHERE p.idProductovolumen.idProductovolumen = :idProductovolumen"),
    @NamedQuery(name = "ProductoActividad.findByNombreActividad", query = "SELECT p FROM ProductoActividad p WHERE p.nombreActividad = :nombreActividad"),
    @NamedQuery(name = "ProductoActividad.findByConocimientoActividad", query = "SELECT p FROM ProductoActividad p WHERE p.conocimientoActividad = :conocimientoActividad"),
    @NamedQuery(name = "ProductoActividad.findByRelacionamientoActividad", query = "SELECT p FROM ProductoActividad p WHERE p.relacionamientoActividad = :relacionamientoActividad"),
    @NamedQuery(name = "ProductoActividad.findByCondiciontrabajoActividad", query = "SELECT p FROM ProductoActividad p WHERE p.condiciontrabajoActividad = :condiciontrabajoActividad"),
    @NamedQuery(name = "ProductoActividad.findByImpactoActividad", query = "SELECT p FROM ProductoActividad p WHERE p.impactoActividad = :impactoActividad"),
    @NamedQuery(name = "ProductoActividad.findByResponsabilidadActividad", query = "SELECT p FROM ProductoActividad p WHERE p.responsabilidadActividad = :responsabilidadActividad"),
    @NamedQuery(name = "ProductoActividad.findByPonderacionActividad", query = "SELECT p FROM ProductoActividad p WHERE p.ponderacionActividad = :ponderacionActividad"),
    @NamedQuery(name = "ProductoActividad.findByPonderacionnivelActividad", query = "SELECT p FROM ProductoActividad p WHERE p.ponderacionnivelActividad = :ponderacionnivelActividad"),
    @NamedQuery(name = "ProductoActividad.findByPonderaciongoActividad", query = "SELECT p FROM ProductoActividad p WHERE p.ponderaciongoActividad = :ponderaciongoActividad"),
    @NamedQuery(name = "ProductoActividad.findByObservacionActividad", query = "SELECT p FROM ProductoActividad p WHERE p.observacionActividad = :observacionActividad"),
    @NamedQuery(name = "ProductoActividad.findByIdusuarioregistroActividad", query = "SELECT p FROM ProductoActividad p WHERE p.idusuarioregistroActividad = :idusuarioregistroActividad"),
    @NamedQuery(name = "ProductoActividad.findByIdestadoActividad", query = "SELECT p FROM ProductoActividad p WHERE p.idestadoActividad = :idestadoActividad"),
    @NamedQuery(name = "ProductoActividad.findByFecharegistroActividad", query = "SELECT p FROM ProductoActividad p WHERE p.fecharegistroActividad = :fecharegistroActividad")})
public class ProductoActividad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_ACTIVIDAD")
    private Integer idActividad;
    @Column(name = "NOMBRE_ACTIVIDAD")
    private String nombreActividad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CONOCIMIENTO_ACTIVIDAD")
    private BigDecimal conocimientoActividad;
    @Column(name = "RELACIONAMIENTO_ACTIVIDAD")
    private BigDecimal relacionamientoActividad;
    @Column(name = "CONDICIONTRABAJO_ACTIVIDAD")
    private BigDecimal condiciontrabajoActividad;
    @Column(name = "IMPACTO_ACTIVIDAD")
    private BigDecimal impactoActividad;
    @Column(name = "RESPONSABILIDAD_ACTIVIDAD")
    private BigDecimal responsabilidadActividad;
    @Column(name = "PONDERACION_ACTIVIDAD")
    private BigDecimal ponderacionActividad;
    @Column(name = "PONDERACIONNIVEL_ACTIVIDAD")
    private String ponderacionnivelActividad;
    @Column(name = "PONDERACIONGO_ACTIVIDAD")
    private String ponderaciongoActividad;
    @Column(name = "OBSERVACION_ACTIVIDAD")
    private String observacionActividad;
    @Column(name = "IDUSUARIOREGISTRO_ACTIVIDAD")
    private Integer idusuarioregistroActividad;
    @Column(name = "IDESTADO_ACTIVIDAD")
    private Integer idestadoActividad;
    @Column(name = "FECHAREGISTRO_ACTIVIDAD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharegistroActividad;
    @JoinColumn(name = "ID_CLASIFICPUESTO", referencedColumnName = "ID_CLASIFICPUESTO")
    @ManyToOne
    private ClasificacionPuesto idClasificpuesto;

    @JoinColumn(name = "ID_PRODUCTOVOLUMEN", referencedColumnName = "ID_PRODUCTOVOLUMEN")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JsonBackReference
    private ProductoVolumen idProductovolumen;

    @JoinColumn(name = "ID_VALORACIONPUESTO", referencedColumnName = "ID_VALORACIONPUESTO")
    @ManyToOne
    private ValoracionPuesto idValoracionpuesto;

    public ProductoActividad() {
    }

    public ProductoActividad(Integer idActividad) {
        this.idActividad = idActividad;
    }

    public Integer getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(Integer idActividad) {
        this.idActividad = idActividad;
    }

    public String getNombreActividad() {
        return nombreActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }

    public BigDecimal getConocimientoActividad() {
        return conocimientoActividad;
    }

    public void setConocimientoActividad(BigDecimal conocimientoActividad) {
        this.conocimientoActividad = conocimientoActividad;
    }

    public BigDecimal getRelacionamientoActividad() {
        return relacionamientoActividad;
    }

    public void setRelacionamientoActividad(BigDecimal relacionamientoActividad) {
        this.relacionamientoActividad = relacionamientoActividad;
    }

    public BigDecimal getCondiciontrabajoActividad() {
        return condiciontrabajoActividad;
    }

    public void setCondiciontrabajoActividad(BigDecimal condiciontrabajoActividad) {
        this.condiciontrabajoActividad = condiciontrabajoActividad;
    }

    public BigDecimal getImpactoActividad() {
        return impactoActividad;
    }

    public void setImpactoActividad(BigDecimal impactoActividad) {
        this.impactoActividad = impactoActividad;
    }

    public BigDecimal getResponsabilidadActividad() {
        return responsabilidadActividad;
    }

    public void setResponsabilidadActividad(BigDecimal responsabilidadActividad) {
        this.responsabilidadActividad = responsabilidadActividad;
    }

    public BigDecimal getPonderacionActividad() {
        return ponderacionActividad;
    }

    public void setPonderacionActividad(BigDecimal ponderacionActividad) {
        this.ponderacionActividad = ponderacionActividad;
    }

    public String getPonderacionnivelActividad() {
        return ponderacionnivelActividad;
    }

    public void setPonderacionnivelActividad(String ponderacionnivelActividad) {
        this.ponderacionnivelActividad = ponderacionnivelActividad;
    }

    public String getPonderaciongoActividad() {
        return ponderaciongoActividad;
    }

    public void setPonderaciongoActividad(String ponderaciongoActividad) {
        this.ponderaciongoActividad = ponderaciongoActividad;
    }

    public String getObservacionActividad() {
        return observacionActividad;
    }

    public void setObservacionActividad(String observacionActividad) {
        this.observacionActividad = observacionActividad;
    }

    public Integer getIdusuarioregistroActividad() {
        return idusuarioregistroActividad;
    }

    public void setIdusuarioregistroActividad(Integer idusuarioregistroActividad) {
        this.idusuarioregistroActividad = idusuarioregistroActividad;
    }

    public Integer getIdestadoActividad() {
        return idestadoActividad;
    }

    public void setIdestadoActividad(Integer idestadoActividad) {
        this.idestadoActividad = idestadoActividad;
    }

    public Date getFecharegistroActividad() {
        return fecharegistroActividad;
    }

    public void setFecharegistroActividad(Date fecharegistroActividad) {
        this.fecharegistroActividad = fecharegistroActividad;
    }

    public ClasificacionPuesto getIdClasificpuesto() {
        return idClasificpuesto;
    }

    public void setIdClasificpuesto(ClasificacionPuesto idClasificpuesto) {
        this.idClasificpuesto = idClasificpuesto;
    }

    public ProductoVolumen getIdProductovolumen() {
        return idProductovolumen;
    }

    public void setIdProductovolumen(ProductoVolumen idProductovolumen) {
        this.idProductovolumen = idProductovolumen;
    }

    public ValoracionPuesto getIdValoracionpuesto() {
        return idValoracionpuesto;
    }

    public void setIdValoracionpuesto(ValoracionPuesto idValoracionpuesto) {
        this.idValoracionpuesto = idValoracionpuesto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idActividad != null ? idActividad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductoActividad)) {
            return false;
        }
        ProductoActividad other = (ProductoActividad) object;
        if ((this.idActividad == null && other.idActividad != null) || (this.idActividad != null && !this.idActividad.equals(other.idActividad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.epn.model.ProductoActividad[ idActividad=" + idActividad + " ]";
    }
    
}
