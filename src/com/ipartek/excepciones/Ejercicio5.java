/**
 * 
 */
package com.ipartek.excepciones;

import java.io.File;
import java.util.Scanner;

import com.ipartek.pojo.Persona;

/**
 * 
 * Realizar un programa que lance un número aleatorio del 1 al 6. Según el
 * número sacado, se lanzara una excepción u otra de la siguiente lista:
 * <ul>
 * <li>1: ArithmeticException</li>
 * <li>2: NullpointerException</li>
 * <li>3: NumberFormatException</li>
 * <li>4: SecurityException</li>
 * <li>5: NegativeArrayException</li>
 * <li>6: IOException</li>
 * </ul>
 * 
 * Haciendo uso del try y del catch, mostrar un mensaje por pantalla y explicar
 * cuál es la excepción ocurrida. Repetir este proceso de manera indefinida,
 * controlando dichas excepciones y sin dar pie a que el programa se cuelgue
 * 
 * @author Joaquín Ruiz Morín
 *
 */
public class Ejercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Persona p = null;
		int[] array = { 1 };

		try {

			do {
				int r = (int) Math.floor(Math.random() * 6 + 1);
				System.out.println("Se ha obtenido el número: " + r);

				switch (4) {
				case 1: // Arithmetic
					System.out.println(
							"Se va a producir una ArithmeticException, fallo que ocure cuando se produce una condición aritmética excepcional.\nPresione enter para continuar ");
					sc.nextLine();
					r = 5 / 0;
					break;
				case 2: // Nullpointer
					System.out.println(
							"Se va a producir una NullPointerExcption, fallo que ocurre cuando se quiere un objeto de una posición en el que no existe objeto");
					p.getAge();
					break;
				case 3: // NumberFormatException
					System.out.println(
							"Se va a producir una NumberFormatException, fallo que ocurre cuando se intenta transformar un string sin formato numérico a numero. Introduzca una letra para provocarla.");
					r = Integer.parseInt(sc.nextLine());
					break;

				case 4: // SecurityException
					File f = new File(
							System.getProperty("user.home") + System.getProperty("file.separator") + "test_directory");
					f.mkdir();
					break;
				case 5: // NegativeArrayException

					break;
				case 6: // IOException

					break;

				default:
					break;
				}
			} while (true);
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.err.println(e.getMessage());
		}

	}

}
