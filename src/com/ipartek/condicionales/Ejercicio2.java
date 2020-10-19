package com.ipartek.condicionales;

import java.util.Scanner;

/**
 * Realiza un programa que pida un numero por consola. <br>
 * En caso de que el numero sea mayor que 50, o menor que 0, indicar que el
 * numero introducido no es valido
 * 
 * <b> Ampliaci�n</b>
 * 
 * @author Joaqu�n Ruiz Mor�n
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		String number = "-1";
		int tmp = Integer.parseInt(number);
		int count = 0;
		Scanner sc = new Scanner(System.in);

		while (tmp > 50 || tmp < 0) {
			System.out.println("Introduzca un n�mero entre 50 y 0");
			number = sc.nextLine();
			tmp = Integer.parseInt(number);
			// Comprobaci�n orientativa
			if (tmp > 50 || tmp < 0) {
				count++;
				if (count == 3) {
					System.out.println("Eres retrasado");
				} else if (count > 3) {
					System.out.println("Muy retrasado");
				} // end-if
				System.out.println("Valor fuera del rango permitido");
				// En caso de acertar, se informe y saldr� del bucle
			} else {
				System.out.println("Buen trabajo. Tu n�mero est� en el rango permitido.");
			} // end-if
		}

		sc.close();

	}// end-main

}// end-class
