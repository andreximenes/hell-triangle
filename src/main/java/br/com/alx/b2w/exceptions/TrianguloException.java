package br.com.alx.b2w.exceptions;

public class TrianguloException extends Exception{

	private static final long serialVersionUID = -912929491065135599L;
	private int codigoErro;

	public TrianguloException(int codigoErro, String msg) {
		super(msg);
		this.codigoErro = codigoErro;
	}

	public int getCodigoErro() {
		return codigoErro;
	}

	public void setCodigoErro(int codigoErro) {
		this.codigoErro = codigoErro;
	}
	
	
}
