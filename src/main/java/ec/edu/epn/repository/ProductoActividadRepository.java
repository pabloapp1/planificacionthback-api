package ec.edu.epn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.epn.model.ProductoActividad;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ProductoActividadRepository extends JpaRepository<ProductoActividad, Integer>{
    @Query("Select p from ProductoActividad p where p.idProductovolumen.idProductovolumen = ?1")
    ProductoActividad findByIdProductovolumen(Integer idProductovolumen);

    @Query("Select p from ProductoActividad p where p.idProductovolumen.idProductovolumen = ?1 order by p.idActividad")
    List<ProductoActividad> findByIdProductovolumenList(Integer idProductovolumen);

    @Query("SELECT COUNT(p) FROM ProductoActividad p where p.idProductovolumen.idProductovolumen = ?1")
    ProductoActividad findCountProductoActividad(Integer idProductovolumen);
}

