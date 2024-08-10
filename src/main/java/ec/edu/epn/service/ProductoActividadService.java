package ec.edu.epn.service;

import java.util.HashMap;
import java.util.List;


import ec.edu.epn.model.dto.ProductoActividadDTO;


public interface ProductoActividadService {
	
    List<ProductoActividadDTO> listar();

    HashMap<String, String> obtenerGrupoOcupacional(double ponderacion);

    ProductoActividadDTO create(ProductoActividadDTO obj);

    List<ProductoActividadDTO> createList(List<ProductoActividadDTO> listObj);

    ProductoActividadDTO findById(Integer id);

    List<ProductoActividadDTO> findByIdProductovolumenList(Integer id);


    void eliminar(Integer id);
    
    ProductoActividadDTO update(ProductoActividadDTO obj);

    ProductoActividadDTO findByIdProductoVolumen(Integer idProductoVolumen);

}
