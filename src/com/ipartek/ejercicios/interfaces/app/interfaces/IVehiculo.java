/**
 * 
 */
package com.ipartek.ejercicios.interfaces.app.interfaces;

/**
 * @author Joaquín Ruiz Morín
 *
 */
public interface IVehiculo {

	final int VEL_MAX_COCHE = 150;
	final int VEL_MAX_BICI = 50;

	final int VEL_MAX_PATINETE = 80;

	boolean Arrancar();

	int Acelerar(int incrementoVel);

	int Frenar(int decrementoVel);

	boolean Apagar();

}
