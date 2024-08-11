package ec.edu.epn.repository;


import ec.edu.epn.model.Dependencia;
import ec.edu.epn.model.ValoracionPuesto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ValoracionPuestoRepository extends JpaRepository<ValoracionPuesto, String> {

    @Query("SELECT v FROM ValoracionPuesto v WHERE v.subfactorValoracionpuesto = ?1")
    List<ValoracionPuesto> findBySubfactorValoracionpuesto(String subfactorValoracionpuesto);

}
