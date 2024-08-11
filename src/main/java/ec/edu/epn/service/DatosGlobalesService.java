package ec.edu.epn.service;

import ec.edu.epn.model.dto.DatosGlobalesDTO;

import java.util.List;

public interface DatosGlobalesService {

    DatosGlobalesDTO findByClaveDatosGlobales(String claveDatosglobales);
}
