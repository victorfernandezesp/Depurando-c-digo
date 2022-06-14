package com.eed.contador;

public class Contador implements Comparable<Contador> {

  private final String nombre;
  private final int maximo;
  private int valor;

  public Contador(String nombre, int maximo) {
    this.nombre = nombre;
    this.maximo = maximo;
    try {
      setValor(0);
    } catch (MaximoContadorException e) {
      // Aquí nunca debe llegar
    }
  }

  private void setValor(int valor) throws MaximoContadorException {
    this.valor = valor;
    if (valor == maximo)
      throw new MaximoContadorException(
          "Fin del contador " + this.nombre + ". Máximo: " + this.maximo + ". Valor: " + this.valor);
  }

  public void incrementar() throws MaximoContadorException {
    if (valor < maximo)
      setValor(getValor() + 1);
  }

  public int getValor() {
    return valor;
  }

  @Override
  public String toString() {
    return "\nContador [nombre=" + nombre + ", maximo=" + maximo + ", valor=" + valor + "]";
  }

  @Override
  public int compareTo(Contador otroContador) {
    if (this.valor < otroContador.valor)
      return -1;
    else if (this.valor > otroContador.valor)
      return +1;
    else
      return 0;
  }

}
