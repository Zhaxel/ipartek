/**
 * 
 */
package com.ipartek.excepciones;

import java.util.Scanner;

/**
 * 
 * Realice un m�todo que reciba como argumento un String y un n�mero y muestre
 * la letra de la posici�n indicada. Ll�melo pasando como par�metro un String
 * sin inicializar. Dicha llamada se encontrara dentro de un bloque try catch,
 * que en caso de producirse una excepci�n por un paso de par�metros a null, no
 * acabe con la ejecuci�n del programa. <br>
 * <br>
 * As� mismo, se controlara tambi�n que si el numero pasado es mayor que el
 * tama�o del string, capturara el error y nos solicitara meter un numero
 * valido, indic�ndonos los valores en los que puede estar comprendido (para
 * este apartado se le pasa como string la cadena de texto �La lluvia en Sevilla
 * no es una maravilla�)
 * 
 * @author Joaqu�n Ruiz Mor�n
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
					System.out.println("Introduzca la posici�n de la letra a buscar.");
					position = Integer.parseInt(sc.nextLine());
					if (position <= 0) {
						System.out.println("El n�mero debe ser superior a 0.");
					}
				} while (position <= 0);
			} catch (Exception e) {
				System.err.println("No ha introducido un n�mero v�lido");
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
			System.out.print("El c�racter buscado ha sido: " + character + " . ");
		} catch (StringIndexOutOfBoundsException sioobe) {
			throw new Exception("Posici�n buscada incorrecta. Longitud de la frase entre 1 y " + word.length());

		} catch (Exception e) {
			throw new Exception("Ha ocurrido algo inesperado");
		}

		if (word != null && word.length() > number - 1) {
			isOK = true;
			System.out.print("Finalizando programa");
		} else {
			System.out.print("\n"); // A�adimos salto de carro para claridad del mensaje
		}

	}// end-method

}
