package br.com.alx.b2w.models.triangulo;

import java.io.Serializable;

public class Triangulo implements Serializable{

	private static final long serialVersionUID = 7966014809034532198L;
	
	private long[][] dado;

	public Triangulo() {
		super();
	}
	public Triangulo(long[][] dado) {
		super();
		this.dado = dado;
	}


	public long[][] getDado() {
		return dado;
	}
	public void setDado(long[][] dado) {
		this.dado = dado;
	}

	
}
