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
	public TrianguloResponse calculate(Triangulo t) {
		TrianguloResponse response = null;
		try {
			validador.validate(t);
			response = new TrianguloResponse(ResponseStatus.SUCESSO, this.calcTriangle(t.getDado()));
		} catch (Exception e) {
			response = new TrianguloResponse(ResponseStatus.ERRO, 0);
		}
		return response;
	}
	
	public long calcTriangle (long[][] t) {
		long resultado = 0;
		
		
		return resultado;
	}
}
