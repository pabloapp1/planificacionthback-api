package ec.edu.epn.controller;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import ec.edu.epn.model.dto.ProductoActividadDTO;
//import ec.edu.epn.model.dto.ingreso.TrackingDTO;
import ec.edu.epn.model.enums.EnumMessages;
import ec.edu.epn.model.response.ResponseGenerico;
import ec.edu.epn.service.ProductoActividadService;


@CrossOrigin
@RestController
@RequestMapping("private/")
public class ProductoActividadRest {
	
    @Autowired
    ProductoActividadService service;

    @PostMapping(value = "guardarProductoActividad")
    public ResponseEntity<?> create(@RequestBody ProductoActividadDTO obj) throws Exception {
    	ProductoActividadDTO dto = service.create(obj);
        ResponseGenerico<ProductoActividadDTO> response = new ResponseGenerico<>();
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

    @PostMapping(value = "guardarListaProductoActividad")
    public ResponseEntity<?> createList(@RequestBody List<ProductoActividadDTO> listObj) throws Exception {
        List<ProductoActividadDTO> listDto = service.createList(listObj);
        ResponseGenerico<ProductoActividadDTO> response = new ResponseGenerico<>();
        try {
            response.setCodigoRespuestaName(HttpStatus.OK.name());
            response.setCodigoRespuestaValue(HttpStatus.OK.value());
            response.setListado(listDto);
            response.setMensaje(EnumMessages.INGRESO_EXITOSO.getValor());
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            response.setCodigoRespuestaName(HttpStatus.BAD_REQUEST.name());
            response.setCodigoRespuestaValue(HttpStatus.BAD_REQUEST.value());
            response.setMensaje(EnumMessages.INGRESO_FALLIDO.name() + ":" + e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
    }
    
    
    @GetMapping(value = "listaProductoActividad")
    public ResponseEntity<?> listar() {
        ResponseGenerico<ProductoActividadDTO> response = new ResponseGenerico<>();
        try {
            List<ProductoActividadDTO> lista = service.listar();
            response.setCodigoRespuestaName(HttpStatus.OK.name());
            response.setCodigoRespuestaValue(HttpStatus.OK.value());
            response.setListado(lista);
            response.setTotalRegistros((long) lista.size());
            response.setMensaje(EnumMessages.REGISTRO_EXISTENTE.name());
            return new ResponseEntity<>(response, HttpStatus.OK);

        } catch (Exception e) {
            e.printStackTrace();
            response.setCodigoRespuestaName(HttpStatus.BAD_REQUEST.name());
            response.setCodigoRespuestaValue(HttpStatus.BAD_REQUEST.value());
            response.setMensaje(EnumMessages.REGISTRO_NO_EXISTENTE.name() + ":" + e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
    }
    
    
    @GetMapping(value = "buscarProductoActividadPorId/{id}")
    public ResponseEntity<?> findById(@PathVariable Integer id) {
        ResponseGenerico<ProductoActividadDTO> response = new ResponseGenerico<>();
        try {
        	ProductoActividadDTO dto = service.findById(id);
            response.setCodigoRespuestaName(HttpStatus.OK.name());
            response.setCodigoRespuestaValue(HttpStatus.OK.value());
            response.setObjeto(dto);
            response.setMensaje(EnumMessages.REGISTRO_EXISTENTE.name());
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            response.setCodigoRespuestaName(HttpStatus.BAD_REQUEST.name());
            response.setCodigoRespuestaValue(HttpStatus.BAD_REQUEST.value());
            response.setMensaje(EnumMessages.REGISTRO_NO_EXISTENTE.name() + ":" + e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(value = "obtenerGrupoOcupacional")
    public ResponseEntity<?> obtenerGrupoOcupacional(double ponderacion) {
        ResponseGenerico<HashMap<String, String>> response = new ResponseGenerico<>();
        try {
            HashMap<String, String> dto = service.obtenerGrupoOcupacional(ponderacion);
            response.setCodigoRespuestaName(HttpStatus.OK.name());
            response.setCodigoRespuestaValue(HttpStatus.OK.value());
            response.setObjeto(dto);
            response.setMensaje(EnumMessages.REGISTRO_EXISTENTE.name());
            return new ResponseEntity<>(response, HttpStatus.OK);

        } catch (Exception e) {
            response.setCodigoRespuestaName(HttpStatus.BAD_REQUEST.name());
            response.setCodigoRespuestaValue(HttpStatus.BAD_REQUEST.value());
            response.setMensaje(EnumMessages.REGISTRO_NO_EXISTENTE.name() + ":" + e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
    }


    @GetMapping(value = "buscarProductoActividadPorIdProductoVolumen/{idProductoVolumen}")
    public ResponseEntity<?> findByIdProductoVolumen(@PathVariable Integer idProductoVolumen) {
        ResponseGenerico<ProductoActividadDTO> response = new ResponseGenerico<>();
        try {
            ProductoActividadDTO dto = service.findByIdProductoVolumen(idProductoVolumen);
            response.setCodigoRespuestaName(HttpStatus.OK.name());
            response.setCodigoRespuestaValue(HttpStatus.OK.value());
            response.setObjeto(dto);
            response.setMensaje(EnumMessages.REGISTRO_EXISTENTE.name());
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            response.setCodigoRespuestaName(HttpStatus.BAD_REQUEST.name());
            response.setCodigoRespuestaValue(HttpStatus.BAD_REQUEST.value());
            response.setMensaje(EnumMessages.REGISTRO_NO_EXISTENTE.name() + ":" + e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(value = "buscarProductoActividadPorIdProductoVolumenList/{idProductoVolumen}")
    public ResponseEntity<?> findByIdProductoVolumenList(@PathVariable Integer idProductoVolumen) {
        ResponseGenerico<ProductoActividadDTO> response = new ResponseGenerico<>();
        try {
            List<ProductoActividadDTO> dto = service.findByIdProductovolumenList(idProductoVolumen);
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
    
    @DeleteMapping(value = "eliminarProductoActividad/{id}")
    public ResponseGenerico<?> eliminarById(@PathVariable int id) throws Exception {
        ResponseGenerico<?> response = new ResponseGenerico<>();
        try {

            if(service.findByIdProductovolumenList(id).size()>3){
            service.eliminar(id);
            response.setMensaje(String.valueOf(EnumMessages.ELIMINADO_EXITOSO));
            response.setCodigoRespuestaValue(HttpStatus.OK.value());
            response.setCodigoRespuestaName(HttpStatus.OK.name());
            return response;

            }else{
                return null;
            }

        } catch (Exception e) {
            response.setCodigoRespuestaName(HttpStatus.BAD_REQUEST.name());
            response.setCodigoRespuestaValue(HttpStatus.BAD_REQUEST.value());
            response.setMensaje(EnumMessages.REGISTRO_NO_EXISTENTE.name() + ":" + e.getMessage());
            return response;
        }
    }

    @PutMapping(value = "updateProductoActividad/{id}")
    public ResponseGenerico<?> updateCupo(@PathVariable int id, @RequestBody ProductoActividadDTO obj) {

    	ProductoActividadDTO carrera = service.findById(id);
        //carrera.setAcepta(obj.getAcepta());

        ResponseGenerico<ProductoActividadDTO> response = new ResponseGenerico<>();
        /*TrackingDTO tracking = new TrackingDTO();
        tracking.setEstadoInicial("INGRESADO");
        tracking.setEstadoFinal("INGRESADO");
        tracking.setFechaRegistro(new Date());
        tracking.setIdRegistro(obj.getIdCarreraInscrip());
        tracking.setObservacion("Estudiante registra desd el sistema" + carrera.getAcepta().toString());
        tracking.setUsuario(obj.getIdInscripcionDTO().getCodigo());
        tracking.setTablaAfectada("CARRERA INSCRIPCION");*/
        try {
            //carrera.setFechaAceptacion(new Date());

            carrera.setNombreActividad(obj.getNombreActividad());
            carrera.setConocimientoActividad(obj.getConocimientoActividad());
            carrera.setRelacionamientoActividad(obj.getRelacionamientoActividad());
            carrera.setCondiciontrabajoActividad(obj.getCondiciontrabajoActividad());
            carrera.setImpactoActividad(obj.getImpactoActividad());
            carrera.setResponsabilidadActividad(obj.getResponsabilidadActividad());
            carrera.setPonderacionActividad(obj.getPonderacionActividad());
            carrera.setPonderacionnivelActividad(obj.getPonderacionnivelActividad());
            carrera.setPonderaciongoActividad(obj.getPonderaciongoActividad());
            carrera.setObservacionActividad(obj.getObservacionActividad());

            ProductoActividadDTO resturn = service.update(carrera);
            response.setCodigoRespuestaName(HttpStatus.OK.name());
            response.setCodigoRespuestaValue(HttpStatus.OK.value());
            response.setMensaje("CARRERA ACEPTADA");
            response.setObjeto(resturn);
            //serviceTrack.create(tracking);
            return response;
        } catch (Exception e) {
            e.printStackTrace();
            response.setCodigoRespuestaName(HttpStatus.BAD_REQUEST.name());
            response.setCodigoRespuestaValue(HttpStatus.BAD_REQUEST.value());
            response.setMensaje("PROBLEMAS AL FINALZIAR SU INSCRIPCIÓN");
            return response;
        }
    }
    
    

}
