/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.epn.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "DEPENDENCIA")
@NamedQueries({
    @NamedQuery(name = "Dependencia.findAll", query = "SELECT d FROM Dependencia d"),
    @NamedQuery(name = "Dependencia.findByCodDep", query = "SELECT d FROM Dependencia d WHERE d.codDep = :codDep"),
    @NamedQuery(name = "Dependencia.findByIdDepPadre", query = "SELECT d FROM Dependencia d WHERE d.idDepPadre = :idDepPadre"),
    @NamedQuery(name = "Dependencia.findByNomDep", query = "SELECT d FROM Dependencia d WHERE d.nomDep = :nomDep"),
    @NamedQuery(name = "Dependencia.findByDescDep", query = "SELECT d FROM Dependencia d WHERE d.descDep = :descDep"),
    @NamedQuery(name = "Dependencia.findByEstado", query = "SELECT d FROM Dependencia d WHERE d.estado = :estado"),
    @NamedQuery(name = "Dependencia.findByTipo", query = "SELECT d FROM Dependencia d WHERE d.tipo = :tipo"),
    @NamedQuery(name = "Dependencia.findByExtDep", query = "SELECT d FROM Dependencia d WHERE d.extDep = :extDep"),
    @NamedQuery(name = "Dependencia.findByMailjefe", query = "SELECT d FROM Dependencia d WHERE d.mailjefe = :mailjefe"),
    @NamedQuery(name = "Dependencia.findByIdFacultad", query = "SELECT d FROM Dependencia d WHERE d.idFacultad = :idFacultad"),
    @NamedQuery(name = "Dependencia.findBySigla", query = "SELECT d FROM Dependencia d WHERE d.sigla = :sigla")})
public class Dependencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_DEP")
    private String codDep;
    @Column(name = "ID_DEP_PADRE")
    private String idDepPadre;
    @Basic(optional = false)
    @Column(name = "NOM_DEP")
    private String nomDep;
    @Column(name = "DESC_DEP")
    private String descDep;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "EXT_DEP")
    private String extDep;
    @Column(name = "MAILJEFE")
    private String mailjefe;
    @Column(name = "ID_FACULTAD")
    private Integer idFacultad;
    @Column(name = "SIGLA")
    private String sigla;
    @OneToMany(mappedBy = "codDep")
    private List<ProductoVolumen> productoVolumenList;
    @OneToMany(mappedBy = "codDep")
    private List<PlantillaOptima> plantillaOptimaList;
    @OneToMany(mappedBy = "depCodDep")
    private List<Dependencia> dependenciaList;
    @JoinColumn(name = "DEP_COD_DEP", referencedColumnName = "COD_DEP")
    @ManyToOne
    private Dependencia depCodDep;
    @OneToMany(mappedBy = "codDep")
    private List<Distributivo> distributivoList;
    @OneToMany(mappedBy = "codDep")
    private List<PeriodoPlanificacionth> periodoPlanificacionthList;
    @OneToMany(mappedBy = "codDep")
    private List<DimensionamientoPuesto> dimensionamientoPuestoList;

    public Dependencia() {
    }

    public Dependencia(String codDep) {
        this.codDep = codDep;
    }

    public Dependencia(String codDep, String nomDep) {
        this.codDep = codDep;
        this.nomDep = nomDep;
    }

    public String getCodDep() {
        return codDep;
    }

    public void setCodDep(String codDep) {
        this.codDep = codDep;
    }

    public String getIdDepPadre() {
        return idDepPadre;
    }

    public void setIdDepPadre(String idDepPadre) {
        this.idDepPadre = idDepPadre;
    }

    public String getNomDep() {
        return nomDep;
    }

    public void setNomDep(String nomDep) {
        this.nomDep = nomDep;
    }

    public String getDescDep() {
        return descDep;
    }

    public void setDescDep(String descDep) {
        this.descDep = descDep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getExtDep() {
        return extDep;
    }

    public void setExtDep(String extDep) {
        this.extDep = extDep;
    }

    public String getMailjefe() {
        return mailjefe;
    }

    public void setMailjefe(String mailjefe) {
        this.mailjefe = mailjefe;
    }

    public Integer getIdFacultad() {
        return idFacultad;
    }

    public void setIdFacultad(Integer idFacultad) {
        this.idFacultad = idFacultad;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public List<ProductoVolumen> getProductoVolumenList() {
        return productoVolumenList;
    }

    public void setProductoVolumenList(List<ProductoVolumen> productoVolumenList) {
        this.productoVolumenList = productoVolumenList;
    }

    public List<PlantillaOptima> getPlantillaOptimaList() {
        return plantillaOptimaList;
    }

    public void setPlantillaOptimaList(List<PlantillaOptima> plantillaOptimaList) {
        this.plantillaOptimaList = plantillaOptimaList;
    }

    public List<Dependencia> getDependenciaList() {
        return dependenciaList;
    }

    public void setDependenciaList(List<Dependencia> dependenciaList) {
        this.dependenciaList = dependenciaList;
    }

    public Dependencia getDepCodDep() {
        return depCodDep;
    }

    public void setDepCodDep(Dependencia depCodDep) {
        this.depCodDep = depCodDep;
    }

    public List<Distributivo> getDistributivoList() {
        return distributivoList;
    }

    public void setDistributivoList(List<Distributivo> distributivoList) {
        this.distributivoList = distributivoList;
    }

    public List<PeriodoPlanificacionth> getPeriodoPlanificacionthList() {
        return periodoPlanificacionthList;
    }

    public void setPeriodoPlanificacionthList(List<PeriodoPlanificacionth> periodoPlanificacionthList) {
        this.periodoPlanificacionthList = periodoPlanificacionthList;
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
        hash += (codDep != null ? codDep.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dependencia)) {
            return false;
        }
        Dependencia other = (Dependencia) object;
        if ((this.codDep == null && other.codDep != null) || (this.codDep != null && !this.codDep.equals(other.codDep))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.epn.model.Dependencia[ codDep=" + codDep + " ]";
    }
    
}
