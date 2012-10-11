package br.faccamp.domain;

public class Logaritmo {

	static String calcula(String num) {
		return String.valueOf(Math.log10(Double.parseDouble(num)));
	}
}
