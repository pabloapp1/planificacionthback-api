package ec.edu.epn.service.impl;

import ec.edu.epn.model.dto.ValoracionPuestoDTO;
import ec.edu.epn.model.mapper.ValoracionPuestoMapper;
import ec.edu.epn.repository.ValoracionPuestoRepository;
import ec.edu.epn.service.ValoracionPuestoService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ValoracionPuestoServiceImpl implements ValoracionPuestoService {

    @Autowired
    private ValoracionPuestoRepository repository;

    @Autowired
    private ValoracionPuestoMapper mapper;

    @Override
    public List<ValoracionPuestoDTO> findBySubfactorValoracionpuesto(String subfactorValoracionpuesto) {

        return mapper.toDto(repository.findBySubfactorValoracionpuesto(subfactorValoracionpuesto));
        //return List.of();
    }
}
