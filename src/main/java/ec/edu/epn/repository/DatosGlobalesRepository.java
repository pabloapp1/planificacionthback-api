package ec.edu.epn.repository;


import ec.edu.epn.model.DatosGlobales;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DatosGlobalesRepository extends JpaRepository<DatosGlobales, Integer> {

    //List<DatosGlobales> findByIdDatosGlobalesList(Integer idDatosGlobales);

    String findByClaveDatosGlobales(String claveDatosglobales);

}
