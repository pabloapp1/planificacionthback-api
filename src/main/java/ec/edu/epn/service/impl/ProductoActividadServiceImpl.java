package ec.edu.epn.service.impl;



import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import ec.edu.epn.model.dto.ProductoActividadDTO;
import ec.edu.epn.model.mapper.ProductoActividadMapper;
import ec.edu.epn.repository.ProductoActividadRepository;
import ec.edu.epn.service.ProductoActividadService;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductoActividadServiceImpl implements ProductoActividadService{
	
    @Autowired
    private ProductoActividadRepository repository;

    @Autowired
    private ProductoActividadMapper mapper;

	@Override
	public List<ProductoActividadDTO> listar() {
		// TODO Auto-generated method stub
		return mapper.toDto(repository.findAll());
		//return null;
	}

	@Override
	public HashMap<String, String> obtenerGrupoOcupacional(double ponderacion) {
		// TODO Auto-generated method stub

		//OP
		double spa1Li = 6.0;
		double spa1Ls = 8.2;
		double spa2Li = 8.3;
		double spa2Ls = 10.4;
		double spa3Li = 10.5;
		double spa3Ls = 12.5;
		double spa4Li = 12.6;
		double spa4Ls = 14.7;
		double sp1Li = 14.8;
		double sp1Ls = 16.9;

		//TC
		double sp2Li = 17.0;
		double sp2Ls = 19.1;
		double sp3Li = 19.2;
		double sp3Ls = 21.3;
		double sp4Li = 21.4;
		double sp4Ls = 23.5;
		double sp5Li = 23.6;
		double sp5Ls = 25.6;

		//ES
		double sp6Li = 25.7;
		double sp6Ls = 27.8;
		double sp7Li = 28.8;
		double sp7Ls = 30.0;

		HashMap<String, String> grupoOcupacional = new HashMap<String, String>();

		//OP
		if (ponderacion >= spa1Li && ponderacion <= spa1Ls)
		{
			grupoOcupacional.put("result1", "OP");
			grupoOcupacional.put("result2", "SPA1");

			//nivelGrupoOcupacional = "OP";
			//grupoOcupacional = "SPA1";
		}
		else if (ponderacion >= spa2Li && ponderacion <= spa2Ls)
		{
			grupoOcupacional.put("result1", "OP");
			grupoOcupacional.put("result2", "SPA2");

			//nivelGrupoOcupacional = "OP";
			//grupoOcupacional = "SPA2";
		}
		else if (ponderacion >= spa3Li && ponderacion <= spa3Ls)
		{
			grupoOcupacional.put("result1", "OP");
			grupoOcupacional.put("result2", "SPA3");

			//nivelGrupoOcupacional = "OP";
			//grupoOcupacional = "SPA3";
		}
		else if (ponderacion >= spa4Li && ponderacion <= spa4Ls)
		{
			grupoOcupacional.put("result1", "OP");
			grupoOcupacional.put("result2", "SPA4");

			//nivelGrupoOcupacional = "OP";
			//grupoOcupacional = "SPA4";
		}
		else if (ponderacion >= sp1Li && ponderacion <= sp1Ls)
		{
			grupoOcupacional.put("result1", "OP");
			grupoOcupacional.put("result2", "SP1");

			//nivelGrupoOcupacional = "OP";
			//grupoOcupacional = "SP1";
		}
		//TC
		else if (ponderacion >= sp2Li && ponderacion <= sp2Ls)
		{
			grupoOcupacional.put("result1", "TC");
			grupoOcupacional.put("result2", "SP2");

			//nivelGrupoOcupacional = "TC";
			//grupoOcupacional = "SP2";
		}
		else if (ponderacion >= sp3Li && ponderacion <= sp3Ls)
		{
			grupoOcupacional.put("result1", "TC");
			grupoOcupacional.put("result2", "SP3");

			//nivelGrupoOcupacional = "TC";
			//grupoOcupacional = "SP3";
		}
		else if (ponderacion >= sp4Li && ponderacion <= sp4Ls)
		{
			grupoOcupacional.put("result1", "TC");
			grupoOcupacional.put("result2", "SP4");

			//nivelGrupoOcupacional = "TC";
			//grupoOcupacional = "SP4";
		}
		else if (ponderacion >= sp5Li && ponderacion <= sp5Ls)
		{
			grupoOcupacional.put("result1", "TC");
			grupoOcupacional.put("result2", "SP5");

			//nivelGrupoOcupacional = "TC";
			//grupoOcupacional = "SP5";
		}
		//ES
		else if (ponderacion >= sp6Li && ponderacion <= sp6Ls)
		{
			grupoOcupacional.put("result1", "ES");
			grupoOcupacional.put("result2", "SP6");

			//nivelGrupoOcupacional = "ES";
			//grupoOcupacional = "SP6";
		}
		else if (ponderacion >= sp7Li && ponderacion <= sp7Ls)
		{
			grupoOcupacional.put("result1", "ES");
			grupoOcupacional.put("result2", "SP7");

			//nivelGrupoOcupacional = "ES";
			//grupoOcupacional = "SP7";
		}
		else
		{
			grupoOcupacional.put("result1", "INDEFINIDO");
			grupoOcupacional.put("result2", "INDEFINIDO");

			//nivelGrupoOcupacional = "INDEFINIDO";
			//grupoOcupacional = "INDEFINIDO";
		}

		return grupoOcupacional;
	}


	@Override
	public ProductoActividadDTO create(ProductoActividadDTO obj) {
		// TODO Auto-generated method stub
		return mapper.toDto(repository.save(mapper.toEntity(obj)));
		//return null;
	}

	@Override
	public List<ProductoActividadDTO> createList(List<ProductoActividadDTO> listObj) {
		// TODO Auto-generated method stub
		return mapper.toDto(repository.saveAll(mapper.toEntity(listObj)));
		//return null;
	}

	@Override
	public ProductoActividadDTO findById(Integer id) {
		// TODO Auto-generated method stub
		return mapper.toDto(repository.findById(id).isPresent() ? repository.findById(id).get() : null);
		//return null;
	}



	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}
	
    @Override
    public ProductoActividadDTO update(ProductoActividadDTO obj) {
        if (obj.getIdActividad() != null) { // Verifica que el ID no sea nulo
            return mapper.toDto(repository.save(mapper.toEntity(obj)));
        } else {
            // Manejo si el ID es nulo
            throw new IllegalArgumentException("El ID de la inscripción es nulo. No se puede actualizar.");
        }
    }

	@Override
	public ProductoActividadDTO findByIdProductoVolumen(Integer idProductoVolumen) {
		return mapper.toDto(repository.findByIdProductovolumen(idProductoVolumen));
//		return null;
	}

	@Override
	public List<ProductoActividadDTO> findByIdProductovolumenList(Integer idProductoVolumen) {
		return mapper.toDto(repository.findByIdProductovolumenList(idProductoVolumen));
		//return List.of();
	}

}
