package ec.edu.epn.model.response;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@AllArgsConstructor
public class ResponseGenerico<T> implements Serializable {
	
    private String codigoRespuestaName;
    private int codigoRespuestaValue;
    private String mensaje;
    private T objeto;
    private List<T> listado;
    private Long totalRegistros;

    public ResponseGenerico() {
    }

    
    
	public String getCodigoRespuestaName() {
		return codigoRespuestaName;
	}

	public void setCodigoRespuestaName(String codigoRespuestaName) {
		this.codigoRespuestaName = codigoRespuestaName;
	}

	public int getCodigoRespuestaValue() {
		return codigoRespuestaValue;
	}

	public void setCodigoRespuestaValue(int codigoRespuestaValue) {
		this.codigoRespuestaValue = codigoRespuestaValue;
	} // nooooooooooo


	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public T getObjeto() {
		return objeto;
	}

	public void setObjeto(T objeto) {
		this.objeto = objeto;
	}

	public List<T> getListado() {
		return listado;
	}

	public void setListado(List<T> listado) {
		this.listado = listado;
	}

	public Long getTotalRegistros() {
		return totalRegistros;
	}

	public void setTotalRegistros(Long totalRegistros) {
		this.totalRegistros = totalRegistros;
	}
    
    
    
    

}
