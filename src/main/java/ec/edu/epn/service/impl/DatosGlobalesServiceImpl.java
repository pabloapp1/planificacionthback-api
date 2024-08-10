package ec.edu.epn.service.impl;

import ec.edu.epn.model.dto.DatosGlobalesDTO;
import ec.edu.epn.repository.DatosGlobalesRepository;
import ec.edu.epn.service.DatosGlobalesService;

import java.util.List;

public class DatosGlobalesServiceImpl implements DatosGlobalesService {

//    @Autowired
//    private DatosGlobalesRepository repository;
//
//    @Autowired
//    private DatosGlobalesMapper mapper;

    @Override
    public List<DatosGlobalesDTO> listar() {

//        return mapper.toDto(repository.findAll());

        return List.of();
    }
}
