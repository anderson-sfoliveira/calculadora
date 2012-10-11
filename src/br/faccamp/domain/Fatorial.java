package br.faccamp.domain;

public class Fatorial {

	static String calcula(String num) {
		double n = Double.parseDouble(num);

		if (n <= 1) {
			return "1";
		} else {
			return String.valueOf(n	* Double.parseDouble(calcula(String.valueOf(n - 1))));
		}
	}
}
