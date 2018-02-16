package br.com.alx.b2w.models.triangulo;

import java.io.Serializable;

public class Triangulo implements Serializable{

	private static final long serialVersionUID = 7966014809034532198L;
	
	private long[][] dados;

	public Triangulo() {
		super();
	}
	public Triangulo(long[][] dados) {
		super();
		this.dados = dados;
	}


	public long[][] getDados() {
		return dados;
	}
	public void setDados(long[][] dados) {
		this.dados = dados;
	}

	
}
