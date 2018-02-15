package br.com.alx.b2w.models.triangulo;

import java.io.Serializable;

import br.com.alx.b2w.models.ResponseStatus;

public class TrianguloResponse implements Serializable{

	private static final long serialVersionUID = -8920809218258051925L;
	
	private ResponseStatus status;
	private long resultado;
	
	public TrianguloResponse(ResponseStatus status, long resultado) {
		super();
		this.status = status;
		this.resultado = resultado;
	}
	
	public ResponseStatus getStatus() {
		return status;
	}
	public void setStatus(ResponseStatus status) {
		this.status = status;
	}
	public long getResultado() {
		return resultado;
	}
	public void setResultado(long resultado) {
		this.resultado = resultado;
	}
	
	
	
}
