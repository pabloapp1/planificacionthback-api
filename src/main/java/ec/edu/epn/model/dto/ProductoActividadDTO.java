package ec.edu.epn.model.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import ec.edu.epn.model.ClasificacionPuesto;
import ec.edu.epn.model.ProductoVolumen;
import ec.edu.epn.model.ValoracionPuesto;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductoActividadDTO implements Serializable{
	


	private Integer idActividad;
	private String nombreActividad;
	private BigDecimal conocimientoActividad;
	private BigDecimal relacionamientoActividad;
	private BigDecimal condiciontrabajoActividad;
	private BigDecimal impactoActividad;
	private BigDecimal responsabilidadActividad;
	private BigDecimal ponderacionActividad;
	private String ponderacionnivelActividad;
	private String ponderaciongoActividad;
	private String observacionActividad;
	private Integer idusuarioregistroActividad;
	private Integer idestadoActividad;
	private Date fecharegistroActividad;
	//private ClasificacionPuesto idClasificpuesto;
	private ProductoVolumen idProductovolumen;
	//private ValoracionPuesto idValoracionpuesto;
	
    public ProductoActividadDTO() {
    }
    
	public Integer getIdActividad() {
		return idActividad;
	}

	public void setIdActividad(Integer idActividad) {
		this.idActividad = idActividad;
	}

}
