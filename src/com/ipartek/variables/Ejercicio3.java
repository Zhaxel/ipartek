package com.ipartek.variables;

/**
 * Realizar un programa que tenga 2 variables enteras, dividendo y
 * divisor.Meterle valores enteros y positivos. Realizar la operación división y
 * mostrar el resultado en pantalla. <br>
 * Repetir el mismo código con estas variaciones: entero y real, real y entero,
 * real y real Por ultimo, intentar dividir en los cuatro casos anteriores entre
 * 0 y mostrar el resultado en pantalla
 * 
 * @author Joaquín Ruiz Morín
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		// PRIMERA PARTE
		System.out.println("> PRIMERA PARTE");
		int dividendo = 2;
		int divisor = 4;

		System.out.println("Operación división = " + (dividendo / divisor));
		// SEGUNDA PARTE
		System.out.println("> SEGUNDA PARTE");
		float entero = 2.5f;
		int real = 5;

		System.out.println("Entero / Real = " + (entero / real));
		System.out.println("Real / Entero = " + (real / entero));
		System.out.println("Real / Real = " + (real / real));
		// TERCERA PARTE
		System.out.println("> TERCERA PARTE");
		try {
			System.out.println("Operación división entre cero = " + ((dividendo / divisor) / 0));
			System.out.println("Entero / Real entre cero = " + ((entero / real) / 0));
			System.out.println("Real / Entero entre cero = " + ((real / entero) / 0));
			System.out.println("Real / Real entre cero = " + ((real / real) / 0));
		} catch (ArithmeticException ae) {
			System.out.println("Error de aritmética");
		}

	}

}
