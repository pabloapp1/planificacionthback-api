package ec.edu.epn.service;

import ec.edu.epn.model.dto.DependenciaDTO;
import ec.edu.epn.model.dto.ValoracionPuestoDTO;

import java.util.List;

public interface ValoracionPuestoService {

    List<ValoracionPuestoDTO> findBySubfactorValoracionpuesto(String subfactorValoracionpuesto);
}
