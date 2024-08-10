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
import java.util.Date;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "PRODUCTO_RESPALDO")
@NamedQueries({
    @NamedQuery(name = "ProductoRespaldo.findAll", query = "SELECT p FROM ProductoRespaldo p"),
    @NamedQuery(name = "ProductoRespaldo.findByIdProductorespaldo", query = "SELECT p FROM ProductoRespaldo p WHERE p.idProductorespaldo = :idProductorespaldo"),
    @NamedQuery(name = "ProductoRespaldo.findByNombreProductorespaldo", query = "SELECT p FROM ProductoRespaldo p WHERE p.nombreProductorespaldo = :nombreProductorespaldo"),
    @NamedQuery(name = "ProductoRespaldo.findByPadProductorespaldo", query = "SELECT p FROM ProductoRespaldo p WHERE p.padProductorespaldo = :padProductorespaldo"),
    @NamedQuery(name = "ProductoRespaldo.findByObservacionProductorespaldo", query = "SELECT p FROM ProductoRespaldo p WHERE p.observacionProductorespaldo = :observacionProductorespaldo"),
    @NamedQuery(name = "ProductoRespaldo.findByIdusuarioProductorespaldo", query = "SELECT p FROM ProductoRespaldo p WHERE p.idusuarioProductorespaldo = :idusuarioProductorespaldo"),
    @NamedQuery(name = "ProductoRespaldo.findByIdestadoProductorespaldo", query = "SELECT p FROM ProductoRespaldo p WHERE p.idestadoProductorespaldo = :idestadoProductorespaldo"),
    @NamedQuery(name = "ProductoRespaldo.findByFecharegistroProductorespaldo", query = "SELECT p FROM ProductoRespaldo p WHERE p.fecharegistroProductorespaldo = :fecharegistroProductorespaldo"),
    @NamedQuery(name = "ProductoRespaldo.findByHoraregistroProductorespaldo", query = "SELECT p FROM ProductoRespaldo p WHERE p.horaregistroProductorespaldo = :horaregistroProductorespaldo")})
public class ProductoRespaldo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_PRODUCTORESPALDO")
    private Integer idProductorespaldo;
    @Column(name = "NOMBRE_PRODUCTORESPALDO")
    private String nombreProductorespaldo;
    @Column(name = "PAD_PRODUCTORESPALDO")
    private String padProductorespaldo;
    @Column(name = "OBSERVACION_PRODUCTORESPALDO")
    private String observacionProductorespaldo;
    @Column(name = "IDUSUARIO_PRODUCTORESPALDO")
    private Integer idusuarioProductorespaldo;
    @Column(name = "IDESTADO_PRODUCTORESPALDO")
    private Integer idestadoProductorespaldo;
    @Column(name = "FECHAREGISTRO_PRODUCTORESPALDO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharegistroProductorespaldo;
    @Column(name = "HORAREGISTRO_PRODUCTORESPALDO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaregistroProductorespaldo;
    @JoinColumn(name = "ID_PRODUCTOVOLUMEN", referencedColumnName = "ID_PRODUCTOVOLUMEN")
    @ManyToOne
    private ProductoVolumen idProductovolumen;

    public ProductoRespaldo() {
    }

    public ProductoRespaldo(Integer idProductorespaldo) {
        this.idProductorespaldo = idProductorespaldo;
    }

    public Integer getIdProductorespaldo() {
        return idProductorespaldo;
    }

    public void setIdProductorespaldo(Integer idProductorespaldo) {
        this.idProductorespaldo = idProductorespaldo;
    }

    public String getNombreProductorespaldo() {
        return nombreProductorespaldo;
    }

    public void setNombreProductorespaldo(String nombreProductorespaldo) {
        this.nombreProductorespaldo = nombreProductorespaldo;
    }

    public String getPadProductorespaldo() {
        return padProductorespaldo;
    }

    public void setPadProductorespaldo(String padProductorespaldo) {
        this.padProductorespaldo = padProductorespaldo;
    }

    public String getObservacionProductorespaldo() {
        return observacionProductorespaldo;
    }

    public void setObservacionProductorespaldo(String observacionProductorespaldo) {
        this.observacionProductorespaldo = observacionProductorespaldo;
    }

    public Integer getIdusuarioProductorespaldo() {
        return idusuarioProductorespaldo;
    }

    public void setIdusuarioProductorespaldo(Integer idusuarioProductorespaldo) {
        this.idusuarioProductorespaldo = idusuarioProductorespaldo;
    }

    public Integer getIdestadoProductorespaldo() {
        return idestadoProductorespaldo;
    }

    public void setIdestadoProductorespaldo(Integer idestadoProductorespaldo) {
        this.idestadoProductorespaldo = idestadoProductorespaldo;
    }

    public Date getFecharegistroProductorespaldo() {
        return fecharegistroProductorespaldo;
    }

    public void setFecharegistroProductorespaldo(Date fecharegistroProductorespaldo) {
        this.fecharegistroProductorespaldo = fecharegistroProductorespaldo;
    }

    public Date getHoraregistroProductorespaldo() {
        return horaregistroProductorespaldo;
    }

    public void setHoraregistroProductorespaldo(Date horaregistroProductorespaldo) {
        this.horaregistroProductorespaldo = horaregistroProductorespaldo;
    }

    public ProductoVolumen getIdProductovolumen() {
        return idProductovolumen;
    }

    public void setIdProductovolumen(ProductoVolumen idProductovolumen) {
        this.idProductovolumen = idProductovolumen;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProductorespaldo != null ? idProductorespaldo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductoRespaldo)) {
            return false;
        }
        ProductoRespaldo other = (ProductoRespaldo) object;
        if ((this.idProductorespaldo == null && other.idProductorespaldo != null) || (this.idProductorespaldo != null && !this.idProductorespaldo.equals(other.idProductorespaldo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.epn.model.ProductoRespaldo[ idProductorespaldo=" + idProductorespaldo + " ]";
    }
    
}
