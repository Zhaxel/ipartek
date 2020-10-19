package com.ipartek.excepciones;

import java.util.Scanner;

/**
 * 
 * Implemente un programa que lea un n�mero �a� y otro n�mero �b� y luego
 * calcule �a/b�. Pruebe a introducir b=0 y ver que hace el programa con la
 * divisi�n por cero. Pruebe a introducir b=�Carlos� para ver c�mo se comporta
 * el programa. A�ada excepciones para recoger estas excepciones y avisar del
 * problema al usuario
 * 
 * @author Joaqu�n Ruiz Mor�n
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Introduce n�mero a:");
			a = Integer.parseInt(sc.nextLine());

			System.out.println("Introduce n�mero b:");
			b = Integer.parseInt(sc.nextLine());

			System.out.println("Calculando (a / b)\n..................\nResultado: " + (a / b));
		} catch (NumberFormatException nfe) {
			System.err.println("Lo introducido no es un n�mero v�lido. Finalizando programa");
		} catch (ArithmeticException ae) {
			System.err.println("La operaci�n no es aritm�ticamente posible. Finalizando programa");
		} catch (Exception e) {
			System.err.println("Ha ocurrido algo inesperado. Finalizando programa");
		} finally {
			sc.close();
		}

	}

}
