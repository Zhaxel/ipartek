/**
 * 
 */
package com.ipartek.ejercicios.interfaces;

/**
 * @author Joaquín Ruiz Morín
 *
 */
public class Acumulador implements IModificacion {

	private int valor;

	public Acumulador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Acumulador(int valor) {
		this();
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Acumulador [valor=" + valor + "]";
	}

	@Override
	public void incremento(int a) {
		this.valor += a;

	}

}
