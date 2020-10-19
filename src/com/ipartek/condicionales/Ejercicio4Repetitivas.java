package com.ipartek.condicionales;

import java.util.Scanner;

/**
 * Realiza el siguiente menú:<br>
 * Introduzca una opción:<br>
 * <ul>
 * <li>A: calcular el área de un cuadrado</li>
 * <li>B: calcular el área de un triángulo equilatero</li>
 * <li>C: calcular el perímetro de un círculo</li>
 * <li>D: calcular el área de un círculo</li>
 * </ul>
 * Hacer que se repita este menú de manera indefinida
 * 
 * @author Joaquín Ruiz Morín
 *
 */
public class Ejercicio4Repetitivas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char option = 'D';

		// MENU
		while (true) {

			System.out.println("Introduzca escoja una opción:\n" + "A - calcular el área de un cuadrado\n"
					+ "B - calcular el área de un triánglo equilatero\n" + "C - calcular el perímetro de un círculo\n"
					+ "D - calcular el área de un círculo\n");
			option = Character.toUpperCase(sc.next().charAt(0)); // Recogemos carácter y aseguramos mayúscula
			System.out.println(); // Salto de línea

			switch (option) {
			case 'A':
				System.out.println("El área de un cuadrado es (base * altura)");

				break;
			case 'B':
				System.out.println("El área de un triángulo equilatero es ((base * altura) / 2).");
				break;
			case 'C':
				System.out.println("El perímetro de un círculo es (2 * (π * radio))");
				break;
			case 'D':
				System.out.println("El área de un círculo es ( π * radio²)");

				break;
			default:
				System.err.println("Opción no válida.");
				break;
			}// end-switch
		} // end-while
	}// end-main
}
