package ec.edu.epn.repository;


import ec.edu.epn.model.Dependencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DependenciaRepository extends JpaRepository<Dependencia, String> {

    @Query("SELECT d FROM Dependencia d WHERE d.idDepPadre = ?1")
    List<Dependencia> findByIdDepPadre(String idDepPadre);
}
