package br.com.alx.b2w.validatores;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import br.com.alx.b2w.exceptions.TrianguloException;
import br.com.alx.b2w.models.triangulo.Triangulo;

@Component
public class ValidadorTriangulo implements Serializable{
	
	private static final long serialVersionUID = 5559513775623092153L;
	public static final String ERRO_TRIANGULO_NULO_VAZIO = "Triângulo Nulo ou em Branco";
	public static final String ERRO_TRIANGULO_INVALIDO = "Triângulo Inválido";

	public void validate (Triangulo triangulo) throws TrianguloException {
		if (triangulo == null || triangulo.getDados() == null || triangulo.getDados().length <= 0) {
            error(ERRO_TRIANGULO_NULO_VAZIO);
        }
        int row = 1;
        for (long[] rowData : triangulo.getDados()) {
            if (rowData.length != row){
                error(ERRO_TRIANGULO_INVALIDO);
            }
            row++;
        }
	}
	
	private void error(String msg) throws TrianguloException {
		throw new TrianguloException(msg);
	}
	
}
