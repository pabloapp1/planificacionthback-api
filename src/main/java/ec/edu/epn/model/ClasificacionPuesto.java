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
@Table(name = "CLASIFICACION_PUESTO")
@NamedQueries({
    @NamedQuery(name = "ClasificacionPuesto.findAll", query = "SELECT c FROM ClasificacionPuesto c"),
    @NamedQuery(name = "ClasificacionPuesto.findByIdClasificpuesto", query = "SELECT c FROM ClasificacionPuesto c WHERE c.idClasificpuesto = :idClasificpuesto"),
    @NamedQuery(name = "ClasificacionPuesto.findByNivelClasificpuesto", query = "SELECT c FROM ClasificacionPuesto c WHERE c.nivelClasificpuesto = :nivelClasificpuesto"),
    @NamedQuery(name = "ClasificacionPuesto.findByGrupoClasificpuesto", query = "SELECT c FROM ClasificacionPuesto c WHERE c.grupoClasificpuesto = :grupoClasificpuesto"),
    @NamedQuery(name = "ClasificacionPuesto.findByLimiteinferiorClasificpuesto", query = "SELECT c FROM ClasificacionPuesto c WHERE c.limiteinferiorClasificpuesto = :limiteinferiorClasificpuesto"),
    @NamedQuery(name = "ClasificacionPuesto.findByLimitesuperiorClasificpuesto", query = "SELECT c FROM ClasificacionPuesto c WHERE c.limitesuperiorClasificpuesto = :limitesuperiorClasificpuesto"),
    @NamedQuery(name = "ClasificacionPuesto.findByNivelpropuestoClasificpuesto", query = "SELECT c FROM ClasificacionPuesto c WHERE c.nivelpropuestoClasificpuesto = :nivelpropuestoClasificpuesto"),
    @NamedQuery(name = "ClasificacionPuesto.findByDiferenciaClasificpuesto", query = "SELECT c FROM ClasificacionPuesto c WHERE c.diferenciaClasificpuesto = :diferenciaClasificpuesto"),
    @NamedQuery(name = "ClasificacionPuesto.findByRmupuestosaClasificpuesto", query = "SELECT c FROM ClasificacionPuesto c WHERE c.rmupuestosaClasificpuesto = :rmupuestosaClasificpuesto"),
    @NamedQuery(name = "ClasificacionPuesto.findByDescripcionClasificpuesto", query = "SELECT c FROM ClasificacionPuesto c WHERE c.descripcionClasificpuesto = :descripcionClasificpuesto"),
    @NamedQuery(name = "ClasificacionPuesto.findByIdusuarioClasificpuesto", query = "SELECT c FROM ClasificacionPuesto c WHERE c.idusuarioClasificpuesto = :idusuarioClasificpuesto"),
    @NamedQuery(name = "ClasificacionPuesto.findByIdestadoClasificpuesto", query = "SELECT c FROM ClasificacionPuesto c WHERE c.idestadoClasificpuesto = :idestadoClasificpuesto"),
    @NamedQuery(name = "ClasificacionPuesto.findByFecharegistroClasificpuesto", query = "SELECT c FROM ClasificacionPuesto c WHERE c.fecharegistroClasificpuesto = :fecharegistroClasificpuesto")})
public class ClasificacionPuesto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_CLASIFICPUESTO")
    private Integer idClasificpuesto;
    @Column(name = "NIVEL_CLASIFICPUESTO")
    private String nivelClasificpuesto;
    @Column(name = "GRUPO_CLASIFICPUESTO")
    private String grupoClasificpuesto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "LIMITEINFERIOR_CLASIFICPUESTO")
    private BigDecimal limiteinferiorClasificpuesto;
    @Column(name = "LIMITESUPERIOR_CLASIFICPUESTO")
    private BigDecimal limitesuperiorClasificpuesto;
    @Column(name = "NIVELPROPUESTO_CLASIFICPUESTO")
    private String nivelpropuestoClasificpuesto;
    @Column(name = "DIFERENCIA_CLASIFICPUESTO")
    private BigDecimal diferenciaClasificpuesto;
    @Column(name = "RMUPUESTOSA_CLASIFICPUESTO")
    private BigDecimal rmupuestosaClasificpuesto;
    @Column(name = "DESCRIPCION_CLASIFICPUESTO")
    private String descripcionClasificpuesto;
    @Column(name = "IDUSUARIO_CLASIFICPUESTO")
    private Integer idusuarioClasificpuesto;
    @Column(name = "IDESTADO_CLASIFICPUESTO")
    private Integer idestadoClasificpuesto;
    @Column(name = "FECHAREGISTRO_CLASIFICPUESTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharegistroClasificpuesto;
    @OneToMany(mappedBy = "idClasificpuesto")
    private List<PlantillaOptima> plantillaOptimaList;
    @OneToMany(mappedBy = "idClasificpuesto")
    private List<ProductoActividad> productoActividadList;
    @OneToMany(mappedBy = "idClasificpuesto")
    private List<DimensionamientoPuesto> dimensionamientoPuestoList;

    public ClasificacionPuesto() {
    }

    public ClasificacionPuesto(Integer idClasificpuesto) {
        this.idClasificpuesto = idClasificpuesto;
    }

    public Integer getIdClasificpuesto() {
        return idClasificpuesto;
    }

    public void setIdClasificpuesto(Integer idClasificpuesto) {
        this.idClasificpuesto = idClasificpuesto;
    }

    public String getNivelClasificpuesto() {
        return nivelClasificpuesto;
    }

    public void setNivelClasificpuesto(String nivelClasificpuesto) {
        this.nivelClasificpuesto = nivelClasificpuesto;
    }

    public String getGrupoClasificpuesto() {
        return grupoClasificpuesto;
    }

    public void setGrupoClasificpuesto(String grupoClasificpuesto) {
        this.grupoClasificpuesto = grupoClasificpuesto;
    }

    public BigDecimal getLimiteinferiorClasificpuesto() {
        return limiteinferiorClasificpuesto;
    }

    public void setLimiteinferiorClasificpuesto(BigDecimal limiteinferiorClasificpuesto) {
        this.limiteinferiorClasificpuesto = limiteinferiorClasificpuesto;
    }

    public BigDecimal getLimitesuperiorClasificpuesto() {
        return limitesuperiorClasificpuesto;
    }

    public void setLimitesuperiorClasificpuesto(BigDecimal limitesuperiorClasificpuesto) {
        this.limitesuperiorClasificpuesto = limitesuperiorClasificpuesto;
    }

    public String getNivelpropuestoClasificpuesto() {
        return nivelpropuestoClasificpuesto;
    }

    public void setNivelpropuestoClasificpuesto(String nivelpropuestoClasificpuesto) {
        this.nivelpropuestoClasificpuesto = nivelpropuestoClasificpuesto;
    }

    public BigDecimal getDiferenciaClasificpuesto() {
        return diferenciaClasificpuesto;
    }

    public void setDiferenciaClasificpuesto(BigDecimal diferenciaClasificpuesto) {
        this.diferenciaClasificpuesto = diferenciaClasificpuesto;
    }

    public BigDecimal getRmupuestosaClasificpuesto() {
        return rmupuestosaClasificpuesto;
    }

    public void setRmupuestosaClasificpuesto(BigDecimal rmupuestosaClasificpuesto) {
        this.rmupuestosaClasificpuesto = rmupuestosaClasificpuesto;
    }

    public String getDescripcionClasificpuesto() {
        return descripcionClasificpuesto;
    }

    public void setDescripcionClasificpuesto(String descripcionClasificpuesto) {
        this.descripcionClasificpuesto = descripcionClasificpuesto;
    }

    public Integer getIdusuarioClasificpuesto() {
        return idusuarioClasificpuesto;
    }

    public void setIdusuarioClasificpuesto(Integer idusuarioClasificpuesto) {
        this.idusuarioClasificpuesto = idusuarioClasificpuesto;
    }

    public Integer getIdestadoClasificpuesto() {
        return idestadoClasificpuesto;
    }

    public void setIdestadoClasificpuesto(Integer idestadoClasificpuesto) {
        this.idestadoClasificpuesto = idestadoClasificpuesto;
    }

    public Date getFecharegistroClasificpuesto() {
        return fecharegistroClasificpuesto;
    }

    public void setFecharegistroClasificpuesto(Date fecharegistroClasificpuesto) {
        this.fecharegistroClasificpuesto = fecharegistroClasificpuesto;
    }

    public List<PlantillaOptima> getPlantillaOptimaList() {
        return plantillaOptimaList;
    }

    public void setPlantillaOptimaList(List<PlantillaOptima> plantillaOptimaList) {
        this.plantillaOptimaList = plantillaOptimaList;
    }

    public List<ProductoActividad> getProductoActividadList() {
        return productoActividadList;
    }

    public void setProductoActividadList(List<ProductoActividad> productoActividadList) {
        this.productoActividadList = productoActividadList;
    }

    public List<DimensionamientoPuesto> getDimensionamientoPuestoList() {
        return dimensionamientoPuestoList;
    }

    public void setDimensionamientoPuestoList(List<DimensionamientoPuesto> dimensionamientoPuestoList) {
        this.dimensionamientoPuestoList = dimensionamientoPuestoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idClasificpuesto != null ? idClasificpuesto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClasificacionPuesto)) {
            return false;
        }
        ClasificacionPuesto other = (ClasificacionPuesto) object;
        if ((this.idClasificpuesto == null && other.idClasificpuesto != null) || (this.idClasificpuesto != null && !this.idClasificpuesto.equals(other.idClasificpuesto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.epn.model.ClasificacionPuesto[ idClasificpuesto=" + idClasificpuesto + " ]";
    }
    
}
