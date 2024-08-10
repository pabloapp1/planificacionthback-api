package ec.edu.epn.model.mapper;

import ec.edu.epn.model.DatosGlobales;
import ec.edu.epn.model.dto.DatosGlobalesDTO;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface DatosGlobalesMapper extends EntityMapper<DatosGlobalesDTO, DatosGlobales>{

    @Override
    DatosGlobales toEntity(DatosGlobalesDTO dto);

    @Override
    DatosGlobalesDTO toDto(DatosGlobales entity);

    @Override
    List<DatosGlobales> toEntity(List<DatosGlobalesDTO> dtoList);

    @Override
    List<DatosGlobalesDTO> toDto(List<DatosGlobales> entityList);

    @Override
    Set<DatosGlobalesDTO> toDto(Set<DatosGlobales> entityList);
}
