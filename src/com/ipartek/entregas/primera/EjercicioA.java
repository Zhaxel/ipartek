/**
 * 
 */
package com.ipartek.entregas.primera;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 
 * A) Realizar un programa en java que realice la siguiente función: Crear un
 * array de 5 notas que almacenara en formato double. Una vez creado dicho array
 * se rellenaran dichos elementos leyéndolo desde el teclado. Una vez creado el
 * contenido, se calculara la media de las notas así como se mostraran las notas
 * más altas y más bajas de dicho array.
 * 
 * @author Joaquín Ruiz Morín
 *
 */
public class EjercicioA {

	static final double MINIMUM = 0.0d;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<Double>();
		DecimalFormat formatter = new DecimalFormat("##.##");
		double number = 0;
		double total = 0;
		boolean correct = true;

		System.out.println("********** PROGRAMA APARTADO A **********");

		for (int i = 0; i < 5; i++) {

			System.out.println("Por favor, introduzca la nota nº" + (i + 1));

			do {
				try {
					number = Double.parseDouble(sc.nextLine());
					correct = true;
				} catch (NumberFormatException e) {
					correct = false;
					System.out.println("Formato de número no válido. Por favor, vuelva a introducirlo.");
				} catch (Exception e) {
					correct = false;
					System.out.println("Ha ocurrido algo inesperado. Por favor, vuelva a introducir la nota.");
				}
				// Comprobamos si el número no es negativo
				if (number < MINIMUM && correct) {
					System.out.println("Formato de número no válido. Introduzca un número mayor o igual a 0");
					correct = false;
				}
			} while (!correct);

			list.add(number);
			total += number;
		}

		// Ordenamos de mayor a menor
		Collections.sort(list);
		Collections.reverse(list);

		// Mostramos la media formateada y la lista ordenada
		System.out.println("\nMedia de las notas: " + formatter.format(total / list.size()));
		System.out.println("Notas ordenadas de mayor a menor: " + (list));

		sc.close();
	}

}
