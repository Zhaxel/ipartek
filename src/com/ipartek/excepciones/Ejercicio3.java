/**
 * 
 */
package com.ipartek.excepciones;

import java.util.Scanner;

/**
 * 
 * Realice un método que reciba como argumento un String y un número y muestre
 * la letra de la posición indicada. Llámelo pasando como parámetro un String
 * sin inicializar. Dicha llamada se encontrara dentro de un bloque try catch,
 * que en caso de producirse una excepción por un paso de parámetros a null, no
 * acabe con la ejecución del programa. <br>
 * <br>
 * Así mismo, se controlara también que si el numero pasado es mayor que el
 * tamaño del string, capturara el error y nos solicitara meter un numero
 * valido, indicándonos los valores en los que puede estar comprendido (para
 * este apartado se le pasa como string la cadena de texto “La lluvia en Sevilla
 * no es una maravilla”)
 * 
 * @author Joaquín Ruiz Morín
 *
 */
public class Ejercicio3 {

	public static boolean isOK = false;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = null;

		int position = 0;

		// MENU
		do {
			do {
				System.out.println("Introduzca una frase cualquiera");
				sentence = sc.nextLine();
			} while (sentence.length() <= 0);
			try {
				do {
					System.out.println("Introduzca la posición de la letra a buscar.");
					position = Integer.parseInt(sc.nextLine());
					if (position <= 0) {
						System.out.println("El número debe ser superior a 0.");
					}
				} while (position <= 0);
			} catch (Exception e) {
				System.err.println("No ha introducido un número válido");
			} // end-try-catch

			try {
				showChar(sentence, position);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
			break;

		} while (!isOK);// end-do-while
	}// end-main

	public static void showChar(String word, int number) throws Exception {
		try {
			char character = word.charAt(number - 1);
			System.out.print("El cáracter buscado ha sido: " + character + " . ");
		} catch (StringIndexOutOfBoundsException sioobe) {
			throw new Exception("Posición buscada incorrecta. Longitud de la frase entre 1 y " + word.length());

		} catch (Exception e) {
			throw new Exception("Ha ocurrido algo inesperado");
		}

		if (word != null && word.length() > number - 1) {
			isOK = true;
			System.out.print("Finalizando programa");
		} else {
			System.out.print("\n"); // Añadimos salto de carro para claridad del mensaje
		}

	}// end-method

}
