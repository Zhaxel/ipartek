/**
 * 
 */
package com.ipartek.ejercicios.interfaces.app.clases;

import com.ipartek.ejercicios.interfaces.app.interfaces.IVehiculo;

/**
 * @author Joaquín Ruiz Morín
 *
 */
public class Vehículo implements IVehiculo {

	protected int velocidadActual;
	protected boolean estarArracando;

	public Vehículo() {
		super();
		this.velocidadActual = 0;
		this.estarArracando = false;
	}

	public Vehículo(int velocidadActual, boolean estarArracando) {
		super();
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
		return false;
	}

	@Override
	public int Acelerar(int incrementoVel) {
		return 0;
	}

	@Override
	public int Frenar(int decrementoVel) {
		return 0;
	}

	@Override
	public boolean Apagar() {
		return false;
	}

}
