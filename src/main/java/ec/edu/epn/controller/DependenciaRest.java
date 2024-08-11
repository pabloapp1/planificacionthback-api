package ec.edu.epn.controller;

import ec.edu.epn.model.dto.DependenciaDTO;
import ec.edu.epn.model.dto.ProductoActividadDTO;
import ec.edu.epn.model.enums.EnumMessages;
import ec.edu.epn.model.response.ResponseGenerico;
import ec.edu.epn.service.DependenciaService;
import ec.edu.epn.service.ProductoActividadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("private/")
public class DependenciaRest {

    @Autowired
    DependenciaService service;

    @GetMapping(value = "buscarDependenciaPorIdDepPadreList")
    public ResponseEntity<?> findByIdDepPadre(@PathVariable String idDepPadre) {
        ResponseGenerico<DependenciaDTO> response = new ResponseGenerico<>();
        try {
            List<DependenciaDTO> dto = service.findByIdDepPadre(idDepPadre);
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

    @PostMapping(value = "guardarDependencia")
    public ResponseEntity<?> create(@RequestBody DependenciaDTO obj) throws Exception {
        DependenciaDTO dto = service.create(obj);
        ResponseGenerico<DependenciaDTO> response = new ResponseGenerico<>();
        try {
            response.setCodigoRespuestaName(HttpStatus.OK.name());
            response.setCodigoRespuestaValue(HttpStatus.OK.value());
            response.setObjeto(dto);
            response.setMensaje(EnumMessages.INGRESO_EXITOSO.getValor());
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            response.setCodigoRespuestaName(HttpStatus.BAD_REQUEST.name());
            response.setCodigoRespuestaValue(HttpStatus.BAD_REQUEST.value());
            response.setMensaje(EnumMessages.INGRESO_FALLIDO.name() + ":" + e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
    }
}
