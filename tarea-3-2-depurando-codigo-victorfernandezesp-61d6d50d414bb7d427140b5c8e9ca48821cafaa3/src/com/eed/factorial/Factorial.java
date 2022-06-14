package com.eed.factorial;

/**
 * Calcula el factorial de un número
 * 
 * @author lmagarin
 *
 */
public class Factorial {

	/**
	 * Calcula el factorial de un número de forma iterativa.
	 *
	 * <p>
	 * Casos especiales:
	 * <ul>
	 * <li>El factorial de cero es 1
	 * <li>No existe el factorial de un número negativo
	 * </ul>
	 * 
	 * @param numero del que se quiere calcular el factorial
	 * @return el factorial del argumento
	 * @throws NumeroDebeSerPositivoException cuando el número es negativo
	 */
	static long iterativo(int numero) throws NumeroDebeSerPositivoException {
		if (numero < 0)// cláusula guarda.
			throw new NumeroDebeSerPositivoException("El número debe ser positivo");

		long resultado = 1;
		while (numero > 1) {
			resultado = resultado * numero;
			numero = numero - 1;
		}
		return resultado;
	}

	/**
	 * Calcula el factorial de un número de forma recursiva.
	 * <p>
	 * Un método es recursivo cuando se invoca a sí mismo. La recursividad necesita
	 * una condición de salida. En este caso la condición de salida es que el número
	 * sea 1
	 * <p>
	 * Casos especiales:
	 * <ul>
	 * <li>El factorial de cero es 1
	 * <li>No existe el factorial de un número negativo
	 * </ul>
	 * 
	 * @param numero del que se quiere calcular el factorial
	 * @return el factorial del argumento
	 * @throws NumeroDebeSerPositivoException cuando el número es negativo
	 */
	static long recursivo(int numero) throws NumeroDebeSerPositivoException {
		if (numero < 0)// cláusula guarda.
			throw new NumeroDebeSerPositivoException("El número debe ser positivo");

		if (numero <= 1) {
			numero = 1;
		} else {
			numero = (int) (numero * recursivo(numero - 1));
		}

		return numero;
		// return (numero <= 1) ? 1 : numero * recursivo(--numero);
	}
}
