package ec.edu.epn.model.enums;

public enum EnumMessages {
    INGRESO_COLA_EXITOSO("Registro Exitoso en Cola"),
    INGRESO_COLA_FALLIDO("Registro Fallido en Cola"),
    INGRESO_EXITOSO("Registro Exitoso"),
    INGRESO_FALLIDO("Registro Fallido"),
    REGISTRO_EXISTENTE("Registro Existente"),
    REGISTRO_NO_EXISTENTE("Registro NO Existente"),
    ELIMINADO_EXITOSO("Eliminación Exitosa"),
    ELIMINADOS_EXITOSOs("Regsitro(s) eliminado(s) exitosamente."),
    ACCION_ELIMINAR("ELIMINAR"),
    ACCION_ACTIVAR("ACTIVAR"),
    ELIMINADO_FALLIDO("Eliminación Fallida"),
    DATO_EXISTE("Información Existente"),
    DATO_NO_EXISTE("Información NO Existe"),
    INACTIVO_EXITOSO("Registro INACTIVADO porque tiene transacciones vinculadas."),
    INACTIVOS_EXITOSOS("Registro(s) INACTIVO porque tienen transacciones vinculadas."),
    INACTIVO_FALLIDO("Se intentó inactivar el registro ya que tiene transacciones. Hubo errores.."),
    INACTIVOS_FALLIDOS("Se intentaron inactivar los registros ya que tiene transacciones. Hubo errores.."),
    ACTIVO_EXITOSO("Activación Exitosa"),
    ACTIVOS_EXITOSOS("Regsitro(s) activado(s) exitosamente."),
    ACTIVO_FALLIDO("Activación Fallida"),
    CARRERA_YA_INSCRITA("YA SE ENCUENTRA INSCRITO EN LA CARRERA SOLICITADA"),
    PRIORIDAD_YA_INSCRITA("YA HA REGISTRADO UNA CARRERA EN LA PRIORIDAD SELECCIONADA"),
    PRIORIDAD_COMPLETA("YA SE HA INSCRITO EN TODAS LAS PRIORIDADES DISPONIBLES"),
    IDENTIFIACION_INCORRECTA("Debe ingresar un número valido de: "
          );




    private String valor;

    EnumMessages(String nombreValor) {
        this.valor = nombreValor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
