package ec.edu.epn.model.mapper;

import ec.edu.epn.model.DatosGlobales;
import ec.edu.epn.model.Dependencia;
import ec.edu.epn.model.dto.DatosGlobalesDTO;
import ec.edu.epn.model.dto.DependenciaDTO;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface DependenciaMapper extends EntityMapper<DependenciaDTO, Dependencia>{


    @Override
    Dependencia toEntity(DependenciaDTO dto);

    @Override
    DependenciaDTO toDto(Dependencia entity);

    @Override
    List<Dependencia> toEntity(List<DependenciaDTO> dtoList);

    @Override
    List<DependenciaDTO> toDto(List<Dependencia> entityList);

    @Override
    Set<DependenciaDTO> toDto(Set<Dependencia> entityList);

}
