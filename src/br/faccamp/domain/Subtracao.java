package br.faccamp.domain;

public class Subtracao extends Operacao {

	public Subtracao(String valorUm) {
		super(valorUm);
	}

	public String processar(String valorDois) {
		return String.valueOf(Double.parseDouble(getValorUm()) - Double.parseDouble(valorDois));
	}
}
