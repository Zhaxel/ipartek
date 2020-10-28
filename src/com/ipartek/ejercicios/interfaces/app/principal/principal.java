/**
 * 
 */
package com.ipartek.ejercicios.interfaces.app.principal;

import com.ipartek.ejercicios.interfaces.app.clases.Bici;
import com.ipartek.ejercicios.interfaces.app.clases.Coche;
import com.ipartek.ejercicios.interfaces.app.clases.Patinete;
import com.ipartek.ejercicios.interfaces.app.interfaces.IVehiculo;

/**
 * 
 * Se probaran los m�todos con los tres objetos de cada tipo de vehiculo,
 * arranc�ndolos, acelerando varias veces hasta que lleguen a velocidad m�xima,
 * frenando hasta detenerse en varias veces y apag�ndose. El proceso deber�
 * seguir la l�gica del mundo real. No se podr� apagar si ya est� encendido, no
 * podr� acelerar ni frenar si esta apagado�
 * 
 * @author Joaqu�n Ruiz Mor�n
 *
 */
public class principal {

	static private Bici b = new Bici();
	static private Coche c = new Coche();
	static private Patinete p = new Patinete();

	static private int r;
	static private int velocidad;

	public static void main(String[] args) {

		//

		pruebaBici(b);
		/*
		 * pruebaCoche(c); pruebaPatinete(p);
		 */

	}

	private static void pruebaBici(Bici b) {

		b.setEstarArracando(b.Arrancar());

		if (b.isEstarArracando()) {
			System.out.println("El veh�culo est� encendido");
		} else {
			System.out.println("El veh�culo est� apagado");
		}

		do {
			r = (int) Math.floor(Math.random() * 20 + 1); // Da un valor entre 1 y 20
			velocidad = b.Acelerar(r);
			if (velocidad == 0) {
				System.out.println("No se puede acelerar. Velocidad m�xima (" + IVehiculo.VEL_MAX_BICI + ") alcanzada");
			} else {
				b.setVelocidadActual(velocidad);
			}

		} while (!(b.getVelocidadActual() > IVehiculo.VEL_MAX_BICI) || !(b.getVelocidadActual() == 0));

	}

	private static void pruebaCoche(Coche c) {
		// TODO Auto-generated method stub

	}

	private static void pruebaPatinete(Patinete p) {
		// TODO Auto-generated method stub

	}
}
