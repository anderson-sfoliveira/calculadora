package br.faccamp.domain;

import br.faccamp.view.CalculadoraGUI;

public class Calculadora  {
	
	private CalculadoraGUI gui;
	private Display display;

	public Calculadora() {
		gui = new CalculadoraGUI(this);
		display = new Display(gui);
	}

	public void processaDesfazer() {
		display.desfazer();
	}

	public void processaRefazer() {
		display.reexecutar();
	}
	
	public void processaLog() {
		display.logaritmo();
	}

	public void processaRaiz() {
		display.raiz();
	}

	public void processaMC() {
		display.memoryClear();
	}

	public void processaMR() {
		display.memoryRecall();
	}

	public void processaMS() {
		display.memoryStore();		
	}

	public void processaMMais() {
		display.memoryPlus();
	}

	public void processaMMenos() {
		display.memoryMinus();
	}

	public void processaPorcentual() {
		display.porcentagem();
	}
	
	public void processaUmSobreX() {
		display.umSobreX();
	}

	public void processaXElevadoY() {
		display.atualizaPontenciacao();
	}

	public void processaFatorial() {
		display.fatorial();
	}

	public void processaMaisOuMenos() {
		display.inverteSinal();
	}

	public void processaCE() {
		display.limpaDisplay();
	}

	public void processaC() {
		display.limpaTudo();
	}

	public void processaIgual() {
		display.processa();
	}

	public void processaMais() {
		display.atualizaAdicao();
	}

	public void processaMenos() {
		display.atualizaSubtracao();
	}

	public void processaVezes() {
		display.atualizaMultiplicacao();
	}

	public void processaDivisao() {
		display.atualizaDivisao();
	}

	public void processaVirgula() {
		display.atualiza(",");
	}

	public void processaZero() {
		display.atualiza("0");
	}

	public void processaUm() {
		display.atualiza("1");
	}

	public void processaDois() {
		display.atualiza("2");
	}

	public void processaTres() {
		display.atualiza("3");
	}

	public void processaQuatro() {
		display.atualiza("4");
	}

	public void processaCinco() {
		display.atualiza("5");	
	}

	public void processaSeis() {
		display.atualiza("6");	
	}

	public void processaSete() {
		display.atualiza("7");
	}

	public void processaOito() {
		display.atualiza("8");
	}

	public void processaNove() {
		display.atualiza("9");
	}
}
