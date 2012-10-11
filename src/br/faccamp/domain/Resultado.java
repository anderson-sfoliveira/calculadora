package br.faccamp.domain;

import java.util.ArrayList;
import java.util.List;

public class Resultado {

	List<String> resultados = new ArrayList<String>();
	int posicao = -1;

	public void incluiResultado(String res) {
		this.resultados.add(res);
		this.posicao = this.resultados.size() - 1;
	}

	public void ultimoResultado() {
		this.posicao = this.resultados.size() - 1;
	}

	public String desfazer() {
		if (posicao > 0) {
			this.posicao--;
		}
			
		if (posicao == -1) {
			return "0";
		} else {
			return this.resultados.get(posicao);
		}
	}

	public String reexecutar() {
		if (posicao < this.resultados.size() - 1) {
			this.posicao++;
		}

		if (posicao == -1) {
			return "0";
		} else {
			return this.resultados.get(posicao);
		}
	}
}
