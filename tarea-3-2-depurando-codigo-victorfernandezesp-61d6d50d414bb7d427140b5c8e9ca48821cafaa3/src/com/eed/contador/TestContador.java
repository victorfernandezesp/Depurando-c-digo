package com.eed.contador;

public class TestContador {
	public static void main(String[] args) throws MaximoContadorException {
		int numContadores = 10;
		Contador contadores[] = new Contador[numContadores];

		for(int i = 0; i < numContadores; i++) {
			int maximo = (int) Math.round(Math.random() * 100);

			contadores[i] = new Contador(i + "", maximo);
			System.out.println(contadores[i]);
		}

		while (true) {
			for (int i = 0; i < numContadores; i++) {
				contadores[i].incrementar();
			}
		}
	}
}
