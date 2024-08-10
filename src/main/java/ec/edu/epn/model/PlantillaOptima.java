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
@Table(name = "PLANTILLA_OPTIMA")
@NamedQueries({
    @NamedQuery(name = "PlantillaOptima.findAll", query = "SELECT p FROM PlantillaOptima p"),
    @NamedQuery(name = "PlantillaOptima.findByIdPlantillaoptima", query = "SELECT p FROM PlantillaOptima p WHERE p.idPlantillaoptima = :idPlantillaoptima"),
    @NamedQuery(name = "PlantillaOptima.findByNomgrupoocupacionalPlantillaoptima", query = "SELECT p FROM PlantillaOptima p WHERE p.nomgrupoocupacionalPlantillaoptima = :nomgrupoocupacionalPlantillaoptima"),
    @NamedQuery(name = "PlantillaOptima.findByRmupuestosaPlantillaoptima", query = "SELECT p FROM PlantillaOptima p WHERE p.rmupuestosaPlantillaoptima = :rmupuestosaPlantillaoptima"),
    @NamedQuery(name = "PlantillaOptima.findByNumservidsaPlantillaoptima", query = "SELECT p FROM PlantillaOptima p WHERE p.numservidsaPlantillaoptima = :numservidsaPlantillaoptima"),
    @NamedQuery(name = "PlantillaOptima.findByImpactosalarialsaPlantillaoptima", query = "SELECT p FROM PlantillaOptima p WHERE p.impactosalarialsaPlantillaoptima = :impactosalarialsaPlantillaoptima"),
    @NamedQuery(name = "PlantillaOptima.findByNumservidsslPlantillaoptima", query = "SELECT p FROM PlantillaOptima p WHERE p.numservidsslPlantillaoptima = :numservidsslPlantillaoptima"),
    @NamedQuery(name = "PlantillaOptima.findByImpactosalarialsslPlantillaoptima", query = "SELECT p FROM PlantillaOptima p WHERE p.impactosalarialsslPlantillaoptima = :impactosalarialsslPlantillaoptima"),
    @NamedQuery(name = "PlantillaOptima.findByObservacionPlantillaoptima", query = "SELECT p FROM PlantillaOptima p WHERE p.observacionPlantillaoptima = :observacionPlantillaoptima"),
    @NamedQuery(name = "PlantillaOptima.findByIdusuarioPlantillaoptima", query = "SELECT p FROM PlantillaOptima p WHERE p.idusuarioPlantillaoptima = :idusuarioPlantillaoptima"),
    @NamedQuery(name = "PlantillaOptima.findByIdestadoPlantillaoptima", query = "SELECT p FROM PlantillaOptima p WHERE p.idestadoPlantillaoptima = :idestadoPlantillaoptima"),
    @NamedQuery(name = "PlantillaOptima.findByFecharegistroPlantillaoptima", query = "SELECT p FROM PlantillaOptima p WHERE p.fecharegistroPlantillaoptima = :fecharegistroPlantillaoptima")})
public class PlantillaOptima implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_PLANTILLAOPTIMA")
    private Integer idPlantillaoptima;
    @Column(name = "NOMGRUPOOCUPACIONAL_PLANTILLAOPTIMA")
    private String nomgrupoocupacionalPlantillaoptima;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "RMUPUESTOSA_PLANTILLAOPTIMA")
    private BigDecimal rmupuestosaPlantillaoptima;
    @Column(name = "NUMSERVIDSA_PLANTILLAOPTIMA")
    private Integer numservidsaPlantillaoptima;
    @Column(name = "IMPACTOSALARIALSA_PLANTILLAOPTIMA")
    private BigDecimal impactosalarialsaPlantillaoptima;
    @Column(name = "NUMSERVIDSSL_PLANTILLAOPTIMA")
    private Integer numservidsslPlantillaoptima;
    @Column(name = "IMPACTOSALARIALSSL_PLANTILLAOPTIMA")
    private BigDecimal impactosalarialsslPlantillaoptima;
    @Column(name = "OBSERVACION_PLANTILLAOPTIMA")
    private String observacionPlantillaoptima;
    @Column(name = "IDUSUARIO_PLANTILLAOPTIMA")
    private Integer idusuarioPlantillaoptima;
    @Column(name = "IDESTADO_PLANTILLAOPTIMA")
    private Integer idestadoPlantillaoptima;
    @Column(name = "FECHAREGISTRO_PLANTILLAOPTIMA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharegistroPlantillaoptima;
    @JoinColumn(name = "ID_CLASIFICPUESTO", referencedColumnName = "ID_CLASIFICPUESTO")
    @ManyToOne
    private ClasificacionPuesto idClasificpuesto;
    @JoinColumn(name = "COD_DEP", referencedColumnName = "COD_DEP")
    @ManyToOne
    private Dependencia codDep;
    @JoinColumn(name = "ID_DIMENPUESTO", referencedColumnName = "ID_DIMENPUESTO")
    @ManyToOne
    private DimensionamientoPuesto idDimenpuesto;
    @OneToMany(mappedBy = "idPlantillaoptima")
    private List<Distributivo> distributivoList;
    @OneToMany(mappedBy = "idPlantillaoptima")
    private List<DimensionamientoPuesto> dimensionamientoPuestoList;

    public PlantillaOptima() {
    }

    public PlantillaOptima(Integer idPlantillaoptima) {
        this.idPlantillaoptima = idPlantillaoptima;
    }

    public Integer getIdPlantillaoptima() {
        return idPlantillaoptima;
    }

    public void setIdPlantillaoptima(Integer idPlantillaoptima) {
        this.idPlantillaoptima = idPlantillaoptima;
    }

    public String getNomgrupoocupacionalPlantillaoptima() {
        return nomgrupoocupacionalPlantillaoptima;
    }

    public void setNomgrupoocupacionalPlantillaoptima(String nomgrupoocupacionalPlantillaoptima) {
        this.nomgrupoocupacionalPlantillaoptima = nomgrupoocupacionalPlantillaoptima;
    }

    public BigDecimal getRmupuestosaPlantillaoptima() {
        return rmupuestosaPlantillaoptima;
    }

    public void setRmupuestosaPlantillaoptima(BigDecimal rmupuestosaPlantillaoptima) {
        this.rmupuestosaPlantillaoptima = rmupuestosaPlantillaoptima;
    }

    public Integer getNumservidsaPlantillaoptima() {
        return numservidsaPlantillaoptima;
    }

    public void setNumservidsaPlantillaoptima(Integer numservidsaPlantillaoptima) {
        this.numservidsaPlantillaoptima = numservidsaPlantillaoptima;
    }

    public BigDecimal getImpactosalarialsaPlantillaoptima() {
        return impactosalarialsaPlantillaoptima;
    }

    public void setImpactosalarialsaPlantillaoptima(BigDecimal impactosalarialsaPlantillaoptima) {
        this.impactosalarialsaPlantillaoptima = impactosalarialsaPlantillaoptima;
    }

    public Integer getNumservidsslPlantillaoptima() {
        return numservidsslPlantillaoptima;
    }

    public void setNumservidsslPlantillaoptima(Integer numservidsslPlantillaoptima) {
        this.numservidsslPlantillaoptima = numservidsslPlantillaoptima;
    }

    public BigDecimal getImpactosalarialsslPlantillaoptima() {
        return impactosalarialsslPlantillaoptima;
    }

    public void setImpactosalarialsslPlantillaoptima(BigDecimal impactosalarialsslPlantillaoptima) {
        this.impactosalarialsslPlantillaoptima = impactosalarialsslPlantillaoptima;
    }

    public String getObservacionPlantillaoptima() {
        return observacionPlantillaoptima;
    }

    public void setObservacionPlantillaoptima(String observacionPlantillaoptima) {
        this.observacionPlantillaoptima = observacionPlantillaoptima;
    }

    public Integer getIdusuarioPlantillaoptima() {
        return idusuarioPlantillaoptima;
    }

    public void setIdusuarioPlantillaoptima(Integer idusuarioPlantillaoptima) {
        this.idusuarioPlantillaoptima = idusuarioPlantillaoptima;
    }

    public Integer getIdestadoPlantillaoptima() {
        return idestadoPlantillaoptima;
    }

    public void setIdestadoPlantillaoptima(Integer idestadoPlantillaoptima) {
        this.idestadoPlantillaoptima = idestadoPlantillaoptima;
    }

    public Date getFecharegistroPlantillaoptima() {
        return fecharegistroPlantillaoptima;
    }

    public void setFecharegistroPlantillaoptima(Date fecharegistroPlantillaoptima) {
        this.fecharegistroPlantillaoptima = fecharegistroPlantillaoptima;
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

    public DimensionamientoPuesto getIdDimenpuesto() {
        return idDimenpuesto;
    }

    public void setIdDimenpuesto(DimensionamientoPuesto idDimenpuesto) {
        this.idDimenpuesto = idDimenpuesto;
    }

    public List<Distributivo> getDistributivoList() {
        return distributivoList;
    }

    public void setDistributivoList(List<Distributivo> distributivoList) {
        this.distributivoList = distributivoList;
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
        hash += (idPlantillaoptima != null ? idPlantillaoptima.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlantillaOptima)) {
            return false;
        }
        PlantillaOptima other = (PlantillaOptima) object;
        if ((this.idPlantillaoptima == null && other.idPlantillaoptima != null) || (this.idPlantillaoptima != null && !this.idPlantillaoptima.equals(other.idPlantillaoptima))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.epn.model.PlantillaOptima[ idPlantillaoptima=" + idPlantillaoptima + " ]";
    }
    
}
