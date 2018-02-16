package br.com.alx.b2w.models.triangulo;

import java.io.Serializable;

public class TrianguloResponse implements Serializable{

	private static final long serialVersionUID = -8920809218258051925L;
	
	private int status;
	private String statusMsg;
	private long resultado;
	
	public TrianguloResponse(int status, String statusMsg, long resultado) {
		super();
		this.status	   = status;
		this.statusMsg = statusMsg;
		this.resultado = resultado;
	}
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getStatusMsg() {
		return statusMsg;
	}
	public void setStatusMsg(String statusMsg) {
		this.statusMsg = statusMsg;
	}
	public long getResultado() {
		return resultado;
	}
	public void setResultado(long resultado) {
		this.resultado = resultado;
	}
	
	
	
}
