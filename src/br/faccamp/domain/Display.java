package br.faccamp.domain;

import br.faccamp.view.CalculadoraGUI;

public class Display {
	
	private CalculadoraGUI gui;
	private Operacao ope;
	private Memoria mem;
	private Resultado res;

	public Display(CalculadoraGUI gui) {
		this.gui = gui;
		this.mem = new Memoria();
		this.res = new Resultado();
	}

	private String getConteudo() {
		return gui.getDisplay();
	}

	private void mostraDisplay(String texto) {
		if (getConteudo().equalsIgnoreCase("")) {
			gui.atualizaDisplay(texto);
		}
		else {
			gui.atualizaDisplay((getConteudo()+texto));	
		}
	}

	public void atualiza(String texto) {
		if (isCarecterEspecial(texto)) {
			if (deveMostrarCaracter(texto)) {
				mostraDisplay(texto);
			}
		} else {
			mostraDisplay(texto);
		}
	}

	private boolean isCarecterEspecial(String texto) {
		if (texto.equalsIgnoreCase(",")) {
			return true;
		}
		
		return false;
	}

	private boolean deveMostrarCaracter(String texto) {
		if (!getConteudo().equalsIgnoreCase("") && getConteudo().indexOf(",") == -1) {
			return true;
		}

		return false;
	}
	
	public void atualizaAdicao() {
		if (!getConteudo().equalsIgnoreCase("")) {
			ope = new Adicao(getConteudo());
			limpaDisplay();
		}
	}
	
	public void atualizaSubtracao() {
		if (!getConteudo().equalsIgnoreCase("")) {
			ope = new Subtracao(getConteudo());
			limpaDisplay();
		}
	}
	
	public void atualizaMultiplicacao() {
		if (!getConteudo().equalsIgnoreCase("")) {
			ope = new Multiplicacao(getConteudo());
			limpaDisplay();
		}
	}
	
	public void atualizaDivisao() {
		if (!getConteudo().equalsIgnoreCase("")) {
			ope = new Divisao(getConteudo());
			limpaDisplay();
		}
	}
	
	public void limpaDisplay() {
		gui.atualizaDisplay("");
		res.ultimoResultado();
	}

	public void processa() {
		if ((ope != null) && (!getConteudo().equalsIgnoreCase(""))) {
			gui.atualizaDisplay(ope.processar(getConteudo()));
			res.incluiResultado(getConteudo());
		}
	}
	
	public void limpaTudo(){
		ope = null;
		limpaDisplay();
		res.ultimoResultado();
	}
	
	public void atualizaPontenciacao() {
		if (!getConteudo().equalsIgnoreCase("")) {
			ope = new Pontenciacao(getConteudo());
			limpaDisplay();
		}
	}

	public void inverteSinal() {
		if (!getConteudo().equalsIgnoreCase("")) {
			gui.atualizaDisplay(InverteSinal.calcula(getConteudo()));
			res.incluiResultado(getConteudo());
		}
	}
	
	public void fatorial() {
		if (!getConteudo().equalsIgnoreCase("")) {
			gui.atualizaDisplay(Fatorial.calcula(getConteudo()));
			res.incluiResultado(getConteudo());
		}
	}
	
	public void umSobreX() {
		if (!getConteudo().equalsIgnoreCase("")) {
			gui.atualizaDisplay(UmSobreX.calcula(getConteudo()));
			res.incluiResultado(getConteudo());
		}
	}

	public void porcentagem() {
		if ((ope != null) && (!getConteudo().equalsIgnoreCase(""))) {
			gui.atualizaDisplay(ope.processarPorcentagem(getConteudo()));
			res.incluiResultado(getConteudo());
		}
	}
	
	public void memoryClear() {
		mem.limpaMemoria();
	}
	
	public void memoryRecall() {
		gui.atualizaDisplay(mem.getMemoria());
	}
	
	public void memoryStore() {
		mem.setMemoria(getConteudo());
	}
	
	public void memoryPlus() {
		mem.somaMemoria(getConteudo());
	}

	public void memoryMinus() {
		mem.subtraiMemoria(getConteudo());
	}
	
	public void raiz() {
		if (!getConteudo().equalsIgnoreCase("")) {
			gui.atualizaDisplay(RaizQuadrada.calcula(getConteudo()));
			res.incluiResultado(getConteudo());
		}
	}

	public void logaritmo() {
		if (!getConteudo().equalsIgnoreCase("")) {
			gui.atualizaDisplay(Logaritmo.calcula(getConteudo()));
			res.incluiResultado(getConteudo());
		}
	}
	
	public void desfazer() {
		gui.atualizaDisplay(res.desfazer());
	}

	public void reexecutar() {
		gui.atualizaDisplay(res.reexecutar());
	}
}
