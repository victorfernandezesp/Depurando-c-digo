package com.eed.factorial;

public class TestFactorial {

	public static void main(String[] args) throws NumeroDebeSerPositivoException {
		int numero = 9; 
		System.out.println(Factorial.recursivo(numero));
		System.out.println(Factorial.iterativo(numero));
	}
}
