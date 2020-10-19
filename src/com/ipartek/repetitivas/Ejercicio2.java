package com.ipartek.repetitivas;

/**
 * Mostrar con bucles for anidados las tablas de multiplicar del 0 al 10
 * 
 * @author Joaquín Ruiz Morín
 * 
 */
public class Ejercicio2 {

	static final int[] NUMBERS = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	public static void main(String[] args) {
		// FIXME Las comprobaciones para el formato de texto no funcionan bien.
		for (int i = 0; i < NUMBERS.length; i++) {
			System.out.println("TABLA DE MULTIPLICAR DEL NÚMERO " + NUMBERS[i]);
			for (int j = 0; j < 11; j++) {
				if ((j + 1) == 10) {
					System.out.println(NUMBERS[i] + " x " + j + " = " + (NUMBERS[i] * (j + 1)));
				} else {
					System.out.println(NUMBERS[i] + " x " + j + "  = " + (NUMBERS[i] * (j + 1)));
				} // end-if
			} // end-j-for
		} // end-i-for
	}// end-main
}// end-class
