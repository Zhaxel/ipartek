/**
 * 
 */
package com.ipartek.entregas.primera;

import java.util.Scanner;

/**
 * 
 * Crear un proyecto en modo consola que nos muestre un menú de 3 opciones<br>
 * <ul>
 * <li>Calcular la letra del dni</li>
 * <li>Calcular medida de cm a pulgadas</li>
 * <li>Salir</li>
 * </ul>
 * Hacer que dicho menú se ejecute en bucle hasta que se pulse salir, y si el
 * usuario escoge cada una de las funciones, que permita introducir los datos
 * correspondientes por teclado para poder dar el resultado
 * 
 * @author Joaquín Ruiz Morín
 *
 */
public class EjercicioB {

	static final String OPT_DNI = "1";
	static final String OPT_INCH = "2";
	static final String OPT_EXIT = "3";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String opt = "";
		String dni = "";
		String regex = "[0-9]{8}";
		float cm = 0;
		boolean on = true;
		boolean correct = true;

		System.out.println("********** PROGRAMA APARTADO B **********");

		do {
			System.out.println(
					"Escoja una opción entre las siguientes:\n 1.- Calcular la letra del DNI\n 2.- Calcular medida de cm a pulgadas \n 3.- Salir");
			opt = sc.nextLine();

			switch (opt) {
			case OPT_DNI:
				// Comprobamos en bucle el formato del DNI introducido
				do {
					System.out.println("Introduzca los 7 dígitos de su DNI");
					dni = sc.nextLine();
					if (!dni.matches(regex)) {
						System.out.println("Formato DNI incorrecto.");
					}
				} while (!dni.matches(regex));
				// Una vez comprobado, obtenemos la letra y mostrado el DNI completo por
				// pantalla
				System.out.println("Su DNI completo es: " + dni + getLetterOfDNI(dni));

				System.out.println("Pulse enter para volver al menú");
				sc.nextLine();

				break;

			case OPT_INCH:
				// Comprobamos en bucle que el formato de la medida es correcto
				do {
					System.out.println("Introduzca una medida en cm");
					try {
						cm = Float.parseFloat(sc.nextLine());
						correct = true;
					} catch (NumberFormatException e) {
						System.out.println("Medida introducida no válida.");
						correct = false;
					} catch (Exception e) {
						System.out.println("Medida introducida no válida.");
						correct = false;
					}
				} while (!correct);
				// Una vez comprobada, hacemos el cálculo a pulgadas y lo mostramos por pantalla
				System.out.println(cm + " cm equivalen a " + (cm / 2.54) + " pulgadas");
				System.out.println("Pulse enter para volver al menú");
				sc.nextLine();

				break;

			case OPT_EXIT:
				System.out.println("Hasta la próxima");
				on = false;

				break;

			default:
				System.out.println("Opción no válida.");
				System.out.println("Pulse enter para volver al menú");
				sc.nextLine();

				break;
			}
		} while (on);
	}

	/**
	 * Recibe un string deseable de 8 caracteres numéricos de extensión.<br>
	 * Ejemplo: 72087772
	 */
	private static char getLetterOfDNI(String dni) {
		String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";

		int resto = Integer.parseInt(dni) % 23;
		return caracteres.charAt(resto);

	}

}
