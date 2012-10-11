package br.faccamp.domain;

public class Divisao extends Operacao {

	public Divisao(String valorUm) {
		super(valorUm);
	}

	public String processar(String valorDois) {
		return String.valueOf(Double.parseDouble(getValorUm()) / Double.parseDouble(valorDois));
	}
}
