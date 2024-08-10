package ec.edu.epn.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class DatosGlobalesDTO implements Serializable {

    private Integer idDatosglobales;
    private String claveDatosglobales;
    private String tipoDatosglobales;
    private String valorDatosglobales;

    public DatosGlobalesDTO() {
    }
}
