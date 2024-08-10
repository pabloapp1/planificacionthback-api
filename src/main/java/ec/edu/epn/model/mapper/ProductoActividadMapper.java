package ec.edu.epn.model.mapper;

import java.util.List;
import java.util.Set;

import org.mapstruct.Mapper;

import ec.edu.epn.model.ProductoActividad;
import ec.edu.epn.model.dto.ProductoActividadDTO;


@Mapper(componentModel = "spring")
public interface ProductoActividadMapper extends EntityMapper<ProductoActividadDTO, ProductoActividad>{
	
    @Override
    ProductoActividad toEntity(ProductoActividadDTO dto);

    @Override
    ProductoActividadDTO toDto(ProductoActividad entity);

    @Override
    List<ProductoActividad> toEntity(List<ProductoActividadDTO> dtoList);

    @Override
    List<ProductoActividadDTO> toDto(List<ProductoActividad> entityList);

    @Override
    Set<ProductoActividadDTO> toDto(Set<ProductoActividad> entityList);

}
