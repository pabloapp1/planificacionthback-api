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
@Table(name = "ESTADO")
@NamedQueries({
    @NamedQuery(name = "Estado.findAll", query = "SELECT e FROM Estado e"),
    @NamedQuery(name = "Estado.findByIdEstado", query = "SELECT e FROM Estado e WHERE e.idEstado = :idEstado"),
    @NamedQuery(name = "Estado.findByNombreEstado", query = "SELECT e FROM Estado e WHERE e.nombreEstado = :nombreEstado"),
    @NamedQuery(name = "Estado.findByTipoEstado", query = "SELECT e FROM Estado e WHERE e.tipoEstado = :tipoEstado"),
    @NamedQuery(name = "Estado.findByObservacionEstado", query = "SELECT e FROM Estado e WHERE e.observacionEstado = :observacionEstado"),
    @NamedQuery(name = "Estado.findByIdusuarioEstado", query = "SELECT e FROM Estado e WHERE e.idusuarioEstado = :idusuarioEstado"),
    @NamedQuery(name = "Estado.findByEstadoEstado", query = "SELECT e FROM Estado e WHERE e.estadoEstado = :estadoEstado"),
    @NamedQuery(name = "Estado.findByFecharegistroEstado", query = "SELECT e FROM Estado e WHERE e.fecharegistroEstado = :fecharegistroEstado")})
public class Estado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_ESTADO")
    private Integer idEstado;
    @Column(name = "NOMBRE_ESTADO")
    private String nombreEstado;
    @Column(name = "TIPO_ESTADO")
    private String tipoEstado;
    @Column(name = "OBSERVACION_ESTADO")
    private String observacionEstado;
    @Column(name = "IDUSUARIO_ESTADO")
    private Integer idusuarioEstado;
    @Column(name = "ESTADO_ESTADO")
    private Integer estadoEstado;
    @Column(name = "FECHAREGISTRO_ESTADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharegistroEstado;

    public Estado() {
    }

    public Estado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

    public String getTipoEstado() {
        return tipoEstado;
    }

    public void setTipoEstado(String tipoEstado) {
        this.tipoEstado = tipoEstado;
    }

    public String getObservacionEstado() {
        return observacionEstado;
    }

    public void setObservacionEstado(String observacionEstado) {
        this.observacionEstado = observacionEstado;
    }

    public Integer getIdusuarioEstado() {
        return idusuarioEstado;
    }

    public void setIdusuarioEstado(Integer idusuarioEstado) {
        this.idusuarioEstado = idusuarioEstado;
    }

    public Integer getEstadoEstado() {
        return estadoEstado;
    }

    public void setEstadoEstado(Integer estadoEstado) {
        this.estadoEstado = estadoEstado;
    }

    public Date getFecharegistroEstado() {
        return fecharegistroEstado;
    }

    public void setFecharegistroEstado(Date fecharegistroEstado) {
        this.fecharegistroEstado = fecharegistroEstado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstado != null ? idEstado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estado)) {
            return false;
        }
        Estado other = (Estado) object;
        if ((this.idEstado == null && other.idEstado != null) || (this.idEstado != null && !this.idEstado.equals(other.idEstado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.epn.model.Estado[ idEstado=" + idEstado + " ]";
    }
    
}
