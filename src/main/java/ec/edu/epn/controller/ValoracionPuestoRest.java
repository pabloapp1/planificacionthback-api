package ec.edu.epn.controller;

import ec.edu.epn.model.dto.DependenciaDTO;
import ec.edu.epn.model.dto.ValoracionPuestoDTO;
import ec.edu.epn.model.enums.EnumMessages;
import ec.edu.epn.model.response.ResponseGenerico;
import ec.edu.epn.service.DependenciaService;
import ec.edu.epn.service.ValoracionPuestoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("private/")
public class ValoracionPuestoRest {

    @Autowired
    ValoracionPuestoService service;


    @GetMapping(value = "buscarValoracionPuestoPorSubfactorList/{subfactorValoracionpuesto}")
    public ResponseEntity<?> findBySubfactorValoracionpuesto(@PathVariable String subfactorValoracionpuesto) {
        ResponseGenerico<ValoracionPuestoDTO> response = new ResponseGenerico<>();
        try {
            List<ValoracionPuestoDTO> dto = service.findBySubfactorValoracionpuesto(subfactorValoracionpuesto);
            response.setCodigoRespuestaName(HttpStatus.OK.name());
            response.setCodigoRespuestaValue(HttpStatus.OK.value());
            response.setListado(dto);
            response.setMensaje(EnumMessages.REGISTRO_EXISTENTE.name());
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            response.setCodigoRespuestaName(HttpStatus.BAD_REQUEST.name());
            response.setCodigoRespuestaValue(HttpStatus.BAD_REQUEST.value());
            response.setMensaje(EnumMessages.REGISTRO_NO_EXISTENTE.name() + ":" + e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
    }

}
