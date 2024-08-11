package ec.edu.epn.service.impl;

import ec.edu.epn.model.dto.DependenciaDTO;
import ec.edu.epn.model.dto.ProductoActividadDTO;
import ec.edu.epn.model.mapper.DependenciaMapper;
import ec.edu.epn.repository.DependenciaRepository;
import ec.edu.epn.service.DependenciaService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Transactional
public class DependenciaServiceImpl implements DependenciaService {


    @Autowired
    private DependenciaRepository repository;

    @Autowired
    private DependenciaMapper mapper;

    @Override
    public List<DependenciaDTO> findByIdDepPadre(String idDepPadre) {

        return mapper.toDto(repository.findByIdDepPadre(idDepPadre));
        //return List.of();
    }

    @Override
    public DependenciaDTO create(DependenciaDTO obj) {
        // TODO Auto-generated method stub
        return mapper.toDto(repository.save(mapper.toEntity(obj)));
        //return null;
    }
}
