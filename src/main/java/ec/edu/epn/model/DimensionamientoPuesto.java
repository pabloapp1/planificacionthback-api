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
@Table(name = "DIMENSIONAMIENTO_PUESTO")
@NamedQueries({
    @NamedQuery(name = "DimensionamientoPuesto.findAll", query = "SELECT d FROM DimensionamientoPuesto d"),
    @NamedQuery(name = "DimensionamientoPuesto.findByIdDimenpuesto", query = "SELECT d FROM DimensionamientoPuesto d WHERE d.idDimenpuesto = :idDimenpuesto"),
    @NamedQuery(name = "DimensionamientoPuesto.findBySumvolumenDimenpuesto", query = "SELECT d FROM DimensionamientoPuesto d WHERE d.sumvolumenDimenpuesto = :sumvolumenDimenpuesto"),
    @NamedQuery(name = "DimensionamientoPuesto.findByNumnivelgoDimenpuesto", query = "SELECT d FROM DimensionamientoPuesto d WHERE d.numnivelgoDimenpuesto = :numnivelgoDimenpuesto"),
    @NamedQuery(name = "DimensionamientoPuesto.findByPromedsumnivelgoDimenpuesto", query = "SELECT d FROM DimensionamientoPuesto d WHERE d.promedsumnivelgoDimenpuesto = :promedsumnivelgoDimenpuesto"),
    @NamedQuery(name = "DimensionamientoPuesto.findByGrupoocupacionalDimenpuesto", query = "SELECT d FROM DimensionamientoPuesto d WHERE d.grupoocupacionalDimenpuesto = :grupoocupacionalDimenpuesto"),
    @NamedQuery(name = "DimensionamientoPuesto.findByNumactividgoDimenpuesto", query = "SELECT d FROM DimensionamientoPuesto d WHERE d.numactividgoDimenpuesto = :numactividgoDimenpuesto"),
    @NamedQuery(name = "DimensionamientoPuesto.findByTotalactividgonivelDimenpuesto", query = "SELECT d FROM DimensionamientoPuesto d WHERE d.totalactividgonivelDimenpuesto = :totalactividgonivelDimenpuesto"),
    @NamedQuery(name = "DimensionamientoPuesto.findByPromnumactividgoDimenpuesto", query = "SELECT d FROM DimensionamientoPuesto d WHERE d.promnumactividgoDimenpuesto = :promnumactividgoDimenpuesto"),
    @NamedQuery(name = "DimensionamientoPuesto.findByPersoredonpromactividgoDimenpuesto", query = "SELECT d FROM DimensionamientoPuesto d WHERE d.persoredonpromactividgoDimenpuesto = :persoredonpromactividgoDimenpuesto"),
    @NamedQuery(name = "DimensionamientoPuesto.findByNivelDimenpuesto", query = "SELECT d FROM DimensionamientoPuesto d WHERE d.nivelDimenpuesto = :nivelDimenpuesto"),
    @NamedQuery(name = "DimensionamientoPuesto.findByObservacionDimenpuesto", query = "SELECT d FROM DimensionamientoPuesto d WHERE d.observacionDimenpuesto = :observacionDimenpuesto"),
    @NamedQuery(name = "DimensionamientoPuesto.findByIdPeriodoplanifthDimenpuesto", query = "SELECT d FROM DimensionamientoPuesto d WHERE d.idPeriodoplanifthDimenpuesto = :idPeriodoplanifthDimenpuesto"),
    @NamedQuery(name = "DimensionamientoPuesto.findByIdusuarioDimenpuesto", query = "SELECT d FROM DimensionamientoPuesto d WHERE d.idusuarioDimenpuesto = :idusuarioDimenpuesto"),
    @NamedQuery(name = "DimensionamientoPuesto.findByIdestadoDimenpuesto", query = "SELECT d FROM DimensionamientoPuesto d WHERE d.idestadoDimenpuesto = :idestadoDimenpuesto"),
    @NamedQuery(name = "DimensionamientoPuesto.findByFecharegistroDimenpuesto", query = "SELECT d FROM DimensionamientoPuesto d WHERE d.fecharegistroDimenpuesto = :fecharegistroDimenpuesto")})
public class DimensionamientoPuesto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_DIMENPUESTO")
    private Integer idDimenpuesto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SUMVOLUMEN_DIMENPUESTO")
    private BigDecimal sumvolumenDimenpuesto;
    @Column(name = "NUMNIVELGO_DIMENPUESTO")
    private BigDecimal numnivelgoDimenpuesto;
    @Column(name = "PROMEDSUMNIVELGO_DIMENPUESTO")
    private BigDecimal promedsumnivelgoDimenpuesto;
    @Column(name = "GRUPOOCUPACIONAL_DIMENPUESTO")
    private String grupoocupacionalDimenpuesto;
    @Column(name = "NUMACTIVIDGO_DIMENPUESTO")
    private Integer numactividgoDimenpuesto;
    @Column(name = "TOTALACTIVIDGONIVEL_DIMENPUESTO")
    private Integer totalactividgonivelDimenpuesto;
    @Column(name = "PROMNUMACTIVIDGO_DIMENPUESTO")
    private BigDecimal promnumactividgoDimenpuesto;
    @Column(name = "PERSOREDONPROMACTIVIDGO_DIMENPUESTO")
    private Integer persoredonpromactividgoDimenpuesto;
    @Column(name = "NIVEL_DIMENPUESTO")
    private String nivelDimenpuesto;
    @Column(name = "OBSERVACION_DIMENPUESTO")
    private String observacionDimenpuesto;
    @Column(name = "ID_PERIODOPLANIFTH_DIMENPUESTO")
    private Integer idPeriodoplanifthDimenpuesto;
    @Column(name = "IDUSUARIO_DIMENPUESTO")
    private Integer idusuarioDimenpuesto;
    @Column(name = "IDESTADO_DIMENPUESTO")
    private Integer idestadoDimenpuesto;
    @Column(name = "FECHAREGISTRO_DIMENPUESTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharegistroDimenpuesto;
    @OneToMany(mappedBy = "idDimenpuesto")
    private List<PlantillaOptima> plantillaOptimaList;
    @JoinColumn(name = "ID_CLASIFICPUESTO", referencedColumnName = "ID_CLASIFICPUESTO")
    @ManyToOne
    private ClasificacionPuesto idClasificpuesto;
    @JoinColumn(name = "COD_DEP", referencedColumnName = "COD_DEP")
    @ManyToOne
    private Dependencia codDep;
    @JoinColumn(name = "ID_PLANTILLAOPTIMA", referencedColumnName = "ID_PLANTILLAOPTIMA")
    @ManyToOne
    private PlantillaOptima idPlantillaoptima;

    public DimensionamientoPuesto() {
    }

    public DimensionamientoPuesto(Integer idDimenpuesto) {
        this.idDimenpuesto = idDimenpuesto;
    }

    public Integer getIdDimenpuesto() {
        return idDimenpuesto;
    }

    public void setIdDimenpuesto(Integer idDimenpuesto) {
        this.idDimenpuesto = idDimenpuesto;
    }

    public BigDecimal getSumvolumenDimenpuesto() {
        return sumvolumenDimenpuesto;
    }

    public void setSumvolumenDimenpuesto(BigDecimal sumvolumenDimenpuesto) {
        this.sumvolumenDimenpuesto = sumvolumenDimenpuesto;
    }

    public BigDecimal getNumnivelgoDimenpuesto() {
        return numnivelgoDimenpuesto;
    }

    public void setNumnivelgoDimenpuesto(BigDecimal numnivelgoDimenpuesto) {
        this.numnivelgoDimenpuesto = numnivelgoDimenpuesto;
    }

    public BigDecimal getPromedsumnivelgoDimenpuesto() {
        return promedsumnivelgoDimenpuesto;
    }

    public void setPromedsumnivelgoDimenpuesto(BigDecimal promedsumnivelgoDimenpuesto) {
        this.promedsumnivelgoDimenpuesto = promedsumnivelgoDimenpuesto;
    }

    public String getGrupoocupacionalDimenpuesto() {
        return grupoocupacionalDimenpuesto;
    }

    public void setGrupoocupacionalDimenpuesto(String grupoocupacionalDimenpuesto) {
        this.grupoocupacionalDimenpuesto = grupoocupacionalDimenpuesto;
    }

    public Integer getNumactividgoDimenpuesto() {
        return numactividgoDimenpuesto;
    }

    public void setNumactividgoDimenpuesto(Integer numactividgoDimenpuesto) {
        this.numactividgoDimenpuesto = numactividgoDimenpuesto;
    }

    public Integer getTotalactividgonivelDimenpuesto() {
        return totalactividgonivelDimenpuesto;
    }

    public void setTotalactividgonivelDimenpuesto(Integer totalactividgonivelDimenpuesto) {
        this.totalactividgonivelDimenpuesto = totalactividgonivelDimenpuesto;
    }

    public BigDecimal getPromnumactividgoDimenpuesto() {
        return promnumactividgoDimenpuesto;
    }

    public void setPromnumactividgoDimenpuesto(BigDecimal promnumactividgoDimenpuesto) {
        this.promnumactividgoDimenpuesto = promnumactividgoDimenpuesto;
    }

    public Integer getPersoredonpromactividgoDimenpuesto() {
        return persoredonpromactividgoDimenpuesto;
    }

    public void setPersoredonpromactividgoDimenpuesto(Integer persoredonpromactividgoDimenpuesto) {
        this.persoredonpromactividgoDimenpuesto = persoredonpromactividgoDimenpuesto;
    }

    public String getNivelDimenpuesto() {
        return nivelDimenpuesto;
    }

    public void setNivelDimenpuesto(String nivelDimenpuesto) {
        this.nivelDimenpuesto = nivelDimenpuesto;
    }

    public String getObservacionDimenpuesto() {
        return observacionDimenpuesto;
    }

    public void setObservacionDimenpuesto(String observacionDimenpuesto) {
        this.observacionDimenpuesto = observacionDimenpuesto;
    }

    public Integer getIdPeriodoplanifthDimenpuesto() {
        return idPeriodoplanifthDimenpuesto;
    }

    public void setIdPeriodoplanifthDimenpuesto(Integer idPeriodoplanifthDimenpuesto) {
        this.idPeriodoplanifthDimenpuesto = idPeriodoplanifthDimenpuesto;
    }

    public Integer getIdusuarioDimenpuesto() {
        return idusuarioDimenpuesto;
    }

    public void setIdusuarioDimenpuesto(Integer idusuarioDimenpuesto) {
        this.idusuarioDimenpuesto = idusuarioDimenpuesto;
    }

    public Integer getIdestadoDimenpuesto() {
        return idestadoDimenpuesto;
    }

    public void setIdestadoDimenpuesto(Integer idestadoDimenpuesto) {
        this.idestadoDimenpuesto = idestadoDimenpuesto;
    }

    public Date getFecharegistroDimenpuesto() {
        return fecharegistroDimenpuesto;
    }

    public void setFecharegistroDimenpuesto(Date fecharegistroDimenpuesto) {
        this.fecharegistroDimenpuesto = fecharegistroDimenpuesto;
    }

    public List<PlantillaOptima> getPlantillaOptimaList() {
        return plantillaOptimaList;
    }

    public void setPlantillaOptimaList(List<PlantillaOptima> plantillaOptimaList) {
        this.plantillaOptimaList = plantillaOptimaList;
    }

    public ClasificacionPuesto getIdClasificpuesto() {
        return idClasificpuesto;
    }

    public void setIdClasificpuesto(ClasificacionPuesto idClasificpuesto) {
        this.idClasificpuesto = idClasificpuesto;
    }

    public Dependencia getCodDep() {
        return codDep;
    }

    public void setCodDep(Dependencia codDep) {
        this.codDep = codDep;
    }

    public PlantillaOptima getIdPlantillaoptima() {
        return idPlantillaoptima;
    }

    public void setIdPlantillaoptima(PlantillaOptima idPlantillaoptima) {
        this.idPlantillaoptima = idPlantillaoptima;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDimenpuesto != null ? idDimenpuesto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DimensionamientoPuesto)) {
            return false;
        }
        DimensionamientoPuesto other = (DimensionamientoPuesto) object;
        if ((this.idDimenpuesto == null && other.idDimenpuesto != null) || (this.idDimenpuesto != null && !this.idDimenpuesto.equals(other.idDimenpuesto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.epn.model.DimensionamientoPuesto[ idDimenpuesto=" + idDimenpuesto + " ]";
    }
    
}
