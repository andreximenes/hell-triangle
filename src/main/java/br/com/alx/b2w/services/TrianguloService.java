package br.com.alx.b2w.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alx.b2w.models.ResponseStatus;
import br.com.alx.b2w.models.triangulo.Triangulo;
import br.com.alx.b2w.models.triangulo.TrianguloResponse;
import br.com.alx.b2w.validatores.ValidadorTriangulo;

@Service
public class TrianguloService implements MainService <Triangulo, TrianguloResponse> {
	private final ValidadorTriangulo validador;

	@Autowired
	public TrianguloService(ValidadorTriangulo validador) {
		this.validador = validador;
	}

	@Override
	public TrianguloResponse calcular(Triangulo t) {
		TrianguloResponse response = null;
		try {
			validador.validate(t);
			response = new TrianguloResponse(ResponseStatus.SUCESSO, this.calcTriangulo(t.getDados()));
		} catch (Exception e) {
			response = new TrianguloResponse(ResponseStatus.ERRO, 0);
		}
		return response;
	}

	public long calcTriangulo (long[][] triangulo) {
		int pos = 0;
		long resultado = triangulo[0][pos];
		for(int i = 1 ; i < triangulo.length ; i++){
			pos = getProximaPosicao(triangulo[i],pos);
			resultado += triangulo[i][pos];
		}

		return resultado;
	}

	private int getProximaPosicao(long[] ls, int pos) {
		if(ls[pos] > ls[pos+1]) {
			return pos;
		}
		return pos+1;
	}
}
