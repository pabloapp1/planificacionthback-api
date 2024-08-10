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
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "DISTRIBUTIVO")
@NamedQueries({
    @NamedQuery(name = "Distributivo.findAll", query = "SELECT d FROM Distributivo d"),
    @NamedQuery(name = "Distributivo.findByIdDistributivo", query = "SELECT d FROM Distributivo d WHERE d.idDistributivo = :idDistributivo"),
    @NamedQuery(name = "Distributivo.findByNommodalidadlaboralDistributivo", query = "SELECT d FROM Distributivo d WHERE d.nommodalidadlaboralDistributivo = :nommodalidadlaboralDistributivo"),
    @NamedQuery(name = "Distributivo.findByNomescalaocupacionalDistributivo", query = "SELECT d FROM Distributivo d WHERE d.nomescalaocupacionalDistributivo = :nomescalaocupacionalDistributivo"),
    @NamedQuery(name = "Distributivo.findByNomgrupoocupacionalDistributivo", query = "SELECT d FROM Distributivo d WHERE d.nomgrupoocupacionalDistributivo = :nomgrupoocupacionalDistributivo"),
    @NamedQuery(name = "Distributivo.findByRmupuestosaDistributivo", query = "SELECT d FROM Distributivo d WHERE d.rmupuestosaDistributivo = :rmupuestosaDistributivo"),
    @NamedQuery(name = "Distributivo.findByNumservidsaDistributivo", query = "SELECT d FROM Distributivo d WHERE d.numservidsaDistributivo = :numservidsaDistributivo"),
    @NamedQuery(name = "Distributivo.findByImpactosalarialsaDistributivo", query = "SELECT d FROM Distributivo d WHERE d.impactosalarialsaDistributivo = :impactosalarialsaDistributivo"),
    @NamedQuery(name = "Distributivo.findByObservacionDistributivo", query = "SELECT d FROM Distributivo d WHERE d.observacionDistributivo = :observacionDistributivo"),
    @NamedQuery(name = "Distributivo.findByIdPeriodoplanifthDistributivo", query = "SELECT d FROM Distributivo d WHERE d.idPeriodoplanifthDistributivo = :idPeriodoplanifthDistributivo"),
    @NamedQuery(name = "Distributivo.findByIdusuarioDistributivo", query = "SELECT d FROM Distributivo d WHERE d.idusuarioDistributivo = :idusuarioDistributivo"),
    @NamedQuery(name = "Distributivo.findByIdestadoDistributivo", query = "SELECT d FROM Distributivo d WHERE d.idestadoDistributivo = :idestadoDistributivo"),
    @NamedQuery(name = "Distributivo.findByFecharegistroDistributivo", query = "SELECT d FROM Distributivo d WHERE d.fecharegistroDistributivo = :fecharegistroDistributivo")})
public class Distributivo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_DISTRIBUTIVO")
    private Integer idDistributivo;
    @Column(name = "NOMMODALIDADLABORAL_DISTRIBUTIVO")
    private String nommodalidadlaboralDistributivo;
    @Column(name = "NOMESCALAOCUPACIONAL_DISTRIBUTIVO")
    private String nomescalaocupacionalDistributivo;
    @Column(name = "NOMGRUPOOCUPACIONAL_DISTRIBUTIVO")
    private String nomgrupoocupacionalDistributivo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "RMUPUESTOSA_DISTRIBUTIVO")
    private BigDecimal rmupuestosaDistributivo;
    @Column(name = "NUMSERVIDSA_DISTRIBUTIVO")
    private Integer numservidsaDistributivo;
    @Column(name = "IMPACTOSALARIALSA_DISTRIBUTIVO")
    private BigDecimal impactosalarialsaDistributivo;
    @Column(name = "OBSERVACION_DISTRIBUTIVO")
    private String observacionDistributivo;
    @Column(name = "ID_PERIODOPLANIFTH_DISTRIBUTIVO")
    private Integer idPeriodoplanifthDistributivo;
    @Column(name = "IDUSUARIO_DISTRIBUTIVO")
    private Integer idusuarioDistributivo;
    @Column(name = "IDESTADO_DISTRIBUTIVO")
    private Integer idestadoDistributivo;
    @Column(name = "FECHAREGISTRO_DISTRIBUTIVO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharegistroDistributivo;
    @JoinColumn(name = "COD_DEP", referencedColumnName = "COD_DEP")
    @ManyToOne
    private Dependencia codDep;
    @JoinColumn(name = "ID_PLANTILLAOPTIMA", referencedColumnName = "ID_PLANTILLAOPTIMA")
    @ManyToOne
    private PlantillaOptima idPlantillaoptima;

    public Distributivo() {
    }

    public Distributivo(Integer idDistributivo) {
        this.idDistributivo = idDistributivo;
    }

    public Integer getIdDistributivo() {
        return idDistributivo;
    }

    public void setIdDistributivo(Integer idDistributivo) {
        this.idDistributivo = idDistributivo;
    }

    public String getNommodalidadlaboralDistributivo() {
        return nommodalidadlaboralDistributivo;
    }

    public void setNommodalidadlaboralDistributivo(String nommodalidadlaboralDistributivo) {
        this.nommodalidadlaboralDistributivo = nommodalidadlaboralDistributivo;
    }

    public String getNomescalaocupacionalDistributivo() {
        return nomescalaocupacionalDistributivo;
    }

    public void setNomescalaocupacionalDistributivo(String nomescalaocupacionalDistributivo) {
        this.nomescalaocupacionalDistributivo = nomescalaocupacionalDistributivo;
    }

    public String getNomgrupoocupacionalDistributivo() {
        return nomgrupoocupacionalDistributivo;
    }

    public void setNomgrupoocupacionalDistributivo(String nomgrupoocupacionalDistributivo) {
        this.nomgrupoocupacionalDistributivo = nomgrupoocupacionalDistributivo;
    }

    public BigDecimal getRmupuestosaDistributivo() {
        return rmupuestosaDistributivo;
    }

    public void setRmupuestosaDistributivo(BigDecimal rmupuestosaDistributivo) {
        this.rmupuestosaDistributivo = rmupuestosaDistributivo;
    }

    public Integer getNumservidsaDistributivo() {
        return numservidsaDistributivo;
    }

    public void setNumservidsaDistributivo(Integer numservidsaDistributivo) {
        this.numservidsaDistributivo = numservidsaDistributivo;
    }

    public BigDecimal getImpactosalarialsaDistributivo() {
        return impactosalarialsaDistributivo;
    }

    public void setImpactosalarialsaDistributivo(BigDecimal impactosalarialsaDistributivo) {
        this.impactosalarialsaDistributivo = impactosalarialsaDistributivo;
    }

    public String getObservacionDistributivo() {
        return observacionDistributivo;
    }

    public void setObservacionDistributivo(String observacionDistributivo) {
        this.observacionDistributivo = observacionDistributivo;
    }

    public Integer getIdPeriodoplanifthDistributivo() {
        return idPeriodoplanifthDistributivo;
    }

    public void setIdPeriodoplanifthDistributivo(Integer idPeriodoplanifthDistributivo) {
        this.idPeriodoplanifthDistributivo = idPeriodoplanifthDistributivo;
    }

    public Integer getIdusuarioDistributivo() {
        return idusuarioDistributivo;
    }

    public void setIdusuarioDistributivo(Integer idusuarioDistributivo) {
        this.idusuarioDistributivo = idusuarioDistributivo;
    }

    public Integer getIdestadoDistributivo() {
        return idestadoDistributivo;
    }

    public void setIdestadoDistributivo(Integer idestadoDistributivo) {
        this.idestadoDistributivo = idestadoDistributivo;
    }

    public Date getFecharegistroDistributivo() {
        return fecharegistroDistributivo;
    }

    public void setFecharegistroDistributivo(Date fecharegistroDistributivo) {
        this.fecharegistroDistributivo = fecharegistroDistributivo;
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
        hash += (idDistributivo != null ? idDistributivo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Distributivo)) {
            return false;
        }
        Distributivo other = (Distributivo) object;
        if ((this.idDistributivo == null && other.idDistributivo != null) || (this.idDistributivo != null && !this.idDistributivo.equals(other.idDistributivo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.epn.model.Distributivo[ idDistributivo=" + idDistributivo + " ]";
    }
    
}
