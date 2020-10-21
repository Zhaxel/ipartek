/**
 * 
 */
package com.ipartek.excepciones;

import java.util.Scanner;

/**
 * 
 * Realice un programa que nos solicite por teclado dos números, y leerlos
 * usando la clase Scanner mediante la función nextLine(). <br>
 * <br>
 * Transformar ambos strings a números enteros usando la siguiente sentencia
 * Integer.parseInt(numeroLeido). Agrupar el código entre un bloque try catch y
 * procesar para que no se produzca una interrupción y finalización del programa
 * si alguno de los números leídos no puede convertirse, retomando el control en
 * el punto del fallo, hasta que se solucione
 * 
 * @author Joaquín Ruiz Morín
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		String numeroLeidoA, numeroLeidoB;
		int numeroAConvertido, numeroBConvertido;
		boolean on = true;
		Scanner sc = new Scanner(System.in);

		try {
			while (on) {
				System.out.println("Introduce número a:");
				numeroLeidoA = sc.nextLine();

				System.out.println("Introduce número b:");
				numeroLeidoB = sc.nextLine();

				numeroAConvertido = Integer.parseInt(numeroLeidoA);
				numeroAConvertido = Integer.parseInt(numeroLeidoA);
			}
		} catch (NumberFormatException nfe) {
			System.err.println("Lo introducido no es un número válido.");
		} catch (Exception e) {
			System.err.println("Ha ocurrido algo inesperado. ");
		} finally {

		}

		if (!on) {
			System.out.println("Ejecución correcta. ");
			sc.close();
		}

	}

}
