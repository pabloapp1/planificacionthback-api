package ec.edu.epn.model.mapper;

import ec.edu.epn.model.Dependencia;
import ec.edu.epn.model.ValoracionPuesto;
import ec.edu.epn.model.dto.DependenciaDTO;
import ec.edu.epn.model.dto.ValoracionPuestoDTO;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface ValoracionPuestoMapper extends EntityMapper<ValoracionPuestoDTO, ValoracionPuesto>{

    @Override
    ValoracionPuesto toEntity(ValoracionPuestoDTO dto);

    @Override
    ValoracionPuestoDTO toDto(ValoracionPuesto entity);

    @Override
    List<ValoracionPuesto> toEntity(List<ValoracionPuestoDTO> dtoList);

    @Override
    List<ValoracionPuestoDTO> toDto(List<ValoracionPuesto> entityList);

    @Override
    Set<ValoracionPuestoDTO> toDto(Set<ValoracionPuesto> entityList);
}
