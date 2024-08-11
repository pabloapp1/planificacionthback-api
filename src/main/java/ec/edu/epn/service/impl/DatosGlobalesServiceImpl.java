package ec.edu.epn.service.impl;

import ec.edu.epn.model.dto.DatosGlobalesDTO;
import ec.edu.epn.model.mapper.DatosGlobalesMapper;
import ec.edu.epn.repository.DatosGlobalesRepository;
import ec.edu.epn.service.DatosGlobalesService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
@Transactional
public class DatosGlobalesServiceImpl implements DatosGlobalesService {

    @Autowired
    private DatosGlobalesRepository repository;

    @Autowired
    private DatosGlobalesMapper mapper;

    @Override
    public DatosGlobalesDTO findByClaveDatosGlobales(String claveDatosglobales) {

        return mapper.toDto(repository.findByClaveDatosGlobales(claveDatosglobales));
        //return List.of();
    }
}
