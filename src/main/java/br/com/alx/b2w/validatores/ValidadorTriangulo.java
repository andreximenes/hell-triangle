package br.com.alx.b2w.validatores;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import br.com.alx.b2w.exceptions.TrianguloException;
import br.com.alx.b2w.models.EnumStatus;
import br.com.alx.b2w.models.triangulo.Triangulo;

@Component
public class ValidadorTriangulo implements Serializable{
	
	private static final long serialVersionUID = 5559513775623092153L;

	public void validate(Triangulo triangulo) throws TrianguloException {
		if(triangulo == null || triangulo.getDados() == null || triangulo.getDados().length <= 0) {
            error(EnumStatus.ERRO_TRIANGULO_NULO_VAZIO.getCodigo(), EnumStatus.ERRO_TRIANGULO_NULO_VAZIO.getMsg());
        }
        int row = 1;
        for(long[] rowData : triangulo.getDados()) {
            if(rowData.length != row){
                error(EnumStatus.ERRO_TRIANGULO_INVALIDO.getCodigo(), EnumStatus.ERRO_TRIANGULO_INVALIDO.getMsg());
            }
            row++;
        }
	}
	
	private void error(int codigo, String msg) throws TrianguloException {
		throw new TrianguloException(codigo, msg);
	}
	
}
