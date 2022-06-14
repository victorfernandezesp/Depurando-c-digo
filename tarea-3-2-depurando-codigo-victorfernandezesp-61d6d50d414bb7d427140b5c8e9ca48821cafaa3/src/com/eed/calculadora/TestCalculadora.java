package com.eed.calculadora;

import java.util.Scanner;

public class TestCalculadora {
  public static void main(String[] args) {

    int numero1;
    int numero2;
    int i = 1;

    do {

    Scanner s = new Scanner(System.in);
    System.out.println("Primer numero");
    numero1= s.nextInt();
    System.out.println("Segundo numero");
    numero2= s.nextInt();
    mostrarResultado(numero1, numero2, "+", Calculadora.sumar(numero1, numero2));
    mostrarResultado(numero1, numero2, "-", Calculadora.restar(numero1, numero2));
    mostrarResultado(numero1, numero2, "*", Calculadora.multiplicar(numero1, numero2));
    i++;
    }while (i<10);

    try {

    mostrarResultado(numero1, numero2, "/", Calculadora.dividir(numero1, numero2));
    }catch (Exception a){
        System.err.println("No se divide entre 0");

    }
}

private static void mostrarResultado(int numero1, int numero2, String operador, int resultado) {
    System.out.println(numero1 + " " + operador + " " + numero2 + " = " + resultado);
}
}