package br.faccamp.domain;

public class Multiplicacao extends Operacao {

	public Multiplicacao(String valorUm) {
		super(valorUm);
	}

	public String processar(String valorDois) {
		return String.valueOf(Double.parseDouble(getValorUm()) * Double.parseDouble(valorDois));
	}
}
