package ec.edu.epn.repository;


import ec.edu.epn.model.DatosGlobales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DatosGlobalesRepository extends JpaRepository<DatosGlobales, String> {

    //List<DatosGlobales> findByIdDatosGlobalesList(Integer idDatosGlobales);

    @Query("SELECT d FROM DatosGlobales d WHERE d.claveDatosglobales = ?1")
    DatosGlobales findByClaveDatosGlobales(String claveDatosglobales);

}
