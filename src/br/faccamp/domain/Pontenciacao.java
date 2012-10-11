package br.faccamp.domain;

public class Pontenciacao extends Operacao {

	public Pontenciacao(String valorUm) {
		super(valorUm);
	}

	public String processar(String valorDois) {
		double numero = 1;
		
		for (int i = 1; i <= Integer.parseInt(valorDois); i++) {
			numero *= Double.parseDouble(getValorUm());
		}

		return String.valueOf(numero);
	}
}
