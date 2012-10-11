package br.faccamp.domain;

public abstract class Operacao {

	private String valorUm;

	public Operacao(String valorUm) {
		this.valorUm = valorUm;
	}
	
	public String getValorUm() {
		return valorUm;
	}

	public abstract String processar(String valorDois);

	public String processarPorcentagem(String valorDois) {
		return String.valueOf(Double.parseDouble(getValorUm()) * Double.parseDouble(valorDois) / 100);
	}
}
