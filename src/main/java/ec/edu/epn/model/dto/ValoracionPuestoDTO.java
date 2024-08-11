package ec.edu.epn.model.dto;

import ec.edu.epn.model.FactorPuesto;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
public class ValoracionPuestoDTO {

    private Integer idValoracionpuesto;
    private String factorValoracionpuesto;
    private String subfactorValoracionpuesto;
    private String nivelValoracionpuesto;
    private String rolValoracionpuesto;
    private BigDecimal ponderacionValoracionpuesto;
    //private BigDecimal porcentajeValoracionpuesto;
    //private BigDecimal puntajeValoracionpuesto;
    private Integer gradovaloracionpuesto;
    private String criterioValoracionpuesto;
    //private String descripcionValoracionpuesto;
    //private Integer idusuarioValoracionpuesto;
    //private Integer idestadoValoracionpuesto;
    //private Date fecharegistroValoracionpuesto;

    public ValoracionPuestoDTO() {
    }

}
