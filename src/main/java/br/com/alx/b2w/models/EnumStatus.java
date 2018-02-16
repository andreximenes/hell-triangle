package br.com.alx.b2w.models;

public enum EnumStatus {
	SUCESSO (200, "Total máximo obtido com sucesso."),
	ERRO_TRIANGULO_NULO_VAZIO (500, "Triângulo nulo ou vazio."),
	ERRO_TRIANGULO_INVALIDO (500, "Trinângulo inválido.");
	
	private int codigo;
    private String msg;

    private EnumStatus(int codigo, String msg) {
        this.codigo = codigo;
        this.msg = msg;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getMsg() {
        return msg;
    }
}
