package ec.edu.epn.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DependenciaDTO {

    private String codDep;
    private String idDepPadre;
    private String nomDep;

    public DependenciaDTO() {
    }
}
