package br.com.alx.b2w.validadores;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import br.com.alx.b2w.HellTriangleApplicationTests;
import br.com.alx.b2w.exceptions.TrianguloException;
import br.com.alx.b2w.models.triangulo.Triangulo;
import br.com.alx.b2w.validatores.ValidadorTriangulo;

public class ValidadorTrianguloTest extends HellTriangleApplicationTests {

	@Autowired
	private ValidadorTriangulo validador;

	@Test
	public void trianguloValido() {
		long[][] dado = { { 1 }, { 2, 3 }, { 4, 5, 6 }, { 7, 8, 9, 0 } };
		try {
			validador.validate(new Triangulo(dado));
		} catch (TrianguloException e) {
		}
	}

	@Test
	public void trianguloNuloOuVazio() {
		long[][] dado = {};
		try {
			validador.validate(new Triangulo(dado));
		} catch (TrianguloException e) {
			assertEquals(ValidadorTriangulo.ERRO_TRIANGULO_NULO_VAZIO, e.getMessage());
		}
	}
	
	@Test
	public void trianguloInvalido() {
		long[][] dado = { { 4 }, { 5,6,7 }, {8, 9, 2}, { 4, 1, 3,0 } };
		try {
			validador.validate(new Triangulo(dado));
		} catch (TrianguloException e) {
			assertEquals(ValidadorTriangulo.ERRO_TRIANGULO_INVALIDO, e.getMessage());
		}
	}

}
