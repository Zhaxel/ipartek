package com.ipartek.excepciones;

import java.util.Scanner;

/**
 * 
 * Implemente un programa que lea un número ‘a’ y otro número ‘b’ y luego
 * calcule “a/b”. Pruebe a introducir b=0 y ver que hace el programa con la
 * división por cero. Pruebe a introducir b=”Carlos” para ver cómo se comporta
 * el programa. Añada excepciones para recoger estas excepciones y avisar del
 * problema al usuario
 * 
 * @author Joaquín Ruiz Morín
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Introduce número a:");
			a = Integer.parseInt(sc.nextLine());

			System.out.println("Introduce número b:");
			b = Integer.parseInt(sc.nextLine());

			System.out.println("Calculando (a / b)\n..................\nResultado: " + (a / b));
		} catch (NumberFormatException nfe) {
			System.err.println("Lo introducido no es un número válido. Finalizando programa");
		} catch (ArithmeticException ae) {
			System.err.println("La operación no es aritméticamente posible. Finalizando programa");
		} catch (Exception e) {
			System.err.println("Ha ocurrido algo inesperado. Finalizando programa");
		} finally {
			sc.close();
		}

	}

}
