package com.ipartek.repetitivas;

import java.util.Scanner;

/**
 * Realizar la modificación pertinente al ejercicio 4 para que una vez que el
 * usuario haya escogido una de las opciones y muestre la operación, desea
 * continuar? Si escoje la opción si volverá a mostrar el menú, si escoge no,
 * saldrá de la ejecución del programa
 * 
 * @author Joaquín Ruiz Morín
 *
 */
public class Ejercicio3Condicionales {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char option = 'D';

		// MENU
		System.out.println("Por favor escoja una opción:\n" + "A - calcular área de un triángulo\n"
				+ "B - calcular área de un cuadrado\n" + "C - calcular área de un círculo\n"
				+ "D - calcular área de un pentágono\n");
		option = Character.toUpperCase(sc.next().charAt(0)); // Recogemos carácter y aseguramos mayúscula
		System.out.println(); // Salto de línea

		switch (option) {
		case 'A':
			System.out.println("El área de un triángulo es ((base * altura) / 2).");
			break;
		case 'B':
			System.out.println("El área de un cuadrado es (base * altura)");
			break;
		case 'C':
			System.out.println("El área de un círculo es ( π * radio²)");
			break;
		case 'D':
			System.out.println(
					"El área de un pentágono regular es (1/2 * 5 * Longitud * apotema), donde la longitud es la medida de uno de sus lados"
							+ " \ny la apotema es la distancia más corta entre el centro del pentágono y uno de sus lados. ");
			break;
		default:
			System.err.println("Opción no válida. Finalizando programa.");
			break;
		}// end-switch

	}// end-main
}
