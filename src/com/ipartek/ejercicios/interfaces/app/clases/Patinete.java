/**
 * 
 */
package com.ipartek.ejercicios.interfaces.app.clases;

import com.ipartek.ejercicios.interfaces.app.interfaces.IVehiculo;

/**
 * 
 * • Arrancar: pondrá el atributo estaArrancado a true. Debe estar apagado para
 * poder arrancarse • Acelerar: incrementara la velocidad actual con el valor
 * que se le pasa por parámetro sin sobrepasar el limite máximo de velocidad.
 * Solo acelerara si el patinete esta encendido • Frenar: decrementara la
 * velocidad actual con el valor que se le pasa por parámetro sin llegar a bajar
 * de 0. Solo frenara si el patinete esta encendido • Apagar: pondrá el atributo
 * estaArrancado a false, solo si la velocidadActual es 0 • toString: mostrara
 * una cadena de texto con el siguiente formato: “Soy un patinete, estoy
 * (encendido/apagado) y mi velocidad es de (velocidadActual) Km/h”
 * 
 * @author Joaquín Ruiz Morín
 *
 */
final public class Patinete extends Vehículo implements IVehiculo {

	public Patinete() {
		super();
		this.velocidadActual = 0;
		this.estarArracando = false;
	}

	public Patinete(int velocidadActual, boolean estarArracando) {
		this();
		this.velocidadActual = velocidadActual;
		this.estarArracando = estarArracando;
	}

	public int getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	public boolean isEstarArracando() {
		return estarArracando;
	}

	public void setEstarArracando(boolean estarArracando) {
		this.estarArracando = estarArracando;
	}

	@Override
	public boolean Arrancar() {
		if (estarArracando) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Incrementa la velocidad actual con el valor que se le pasa por parámetro sin
	 * sobrepasar el limite máximo de velocidad. Solo acelerara si el patinete esta
	 * encendido
	 */
	@Override
	public int Acelerar(int incrementoVel) {
		int velocidadSiguiente = (velocidadActual + incrementoVel);
		if (estarArracando && velocidadSiguiente > VEL_MAX_PATINETE) {
			return velocidadSiguiente;
		} else {
			return 0;
		}

	}

	/**
	 * Decrementa la velocidad actual con el valor que se le pasa por parámetro sin
	 * llegar a bajar de 0. Solo frenara si el patinete esta encendido.
	 */
	@Override
	public int Frenar(int decrementoVel) {
		int velocidadSiguiente = (velocidadActual + decrementoVel);
		if (estarArracando && velocidadSiguiente <= 0) {
			return velocidadSiguiente;
		} else {
			return 0;
		}
	}

	/**
	 * Pone el atributo estaArrancado a false, solo si la velocidadActual es 0
	 */
	@Override
	public boolean Apagar() {
		if (velocidadActual == 0) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public String toString() {
		return "Patinete [velocidadActual=" + velocidadActual + ", estarArracando=" + estarArracando + "]";
	}

}
