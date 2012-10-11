package br.faccamp.domain;

public class Memoria {
	
	private String memoria;
	
	public Memoria() {
		limpaMemoria();
	}
	
	public String getMemoria() {
		return memoria;
	}

	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}

	public void limpaMemoria() {
		this.memoria = "0";
	}

	public void somaMemoria(String memoria) {
		this.memoria = String.valueOf(Double.parseDouble(this.memoria) + Double.parseDouble(memoria));
	}

	public void subtraiMemoria(String memoria) {
		this.memoria = String.valueOf(Double.parseDouble(this.memoria) - Double.parseDouble(memoria));
	}
}
