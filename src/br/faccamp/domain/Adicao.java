package br.faccamp.domain;

public class Adicao extends Operacao {

	public Adicao(String valorUm) {
		super(valorUm);
	}

	public String processar(String valorDois) {
		return String.valueOf(Double.parseDouble(getValorUm()) + Double.parseDouble(valorDois));
	}
}
