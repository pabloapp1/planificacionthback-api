package ec.edu.epn.service;

import ec.edu.epn.model.dto.DatosGlobalesDTO;
import ec.edu.epn.model.dto.DependenciaDTO;
import ec.edu.epn.model.dto.ProductoActividadDTO;

import java.util.List;

public interface DependenciaService {

    List<DependenciaDTO> findByIdDepPadre(String idDepPadre);

    DependenciaDTO create(DependenciaDTO obj);
}
