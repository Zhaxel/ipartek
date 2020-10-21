/**
 * 
 */
package com.ipartek.excepciones;

import java.util.Scanner;

/**
 * 
 * Realice un programa que nos solicite por teclado dos n�meros, y leerlos
 * usando la clase Scanner mediante la funci�n nextLine(). <br>
 * <br>
 * Transformar ambos strings a n�meros enteros usando la siguiente sentencia
 * Integer.parseInt(numeroLeido). Agrupar el c�digo entre un bloque try catch y
 * procesar para que no se produzca una interrupci�n y finalizaci�n del programa
 * si alguno de los n�meros le�dos no puede convertirse, retomando el control en
 * el punto del fallo, hasta que se solucione
 * 
 * @author Joaqu�n Ruiz Mor�n
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
				System.out.println("Introduce n�mero a:");
				numeroLeidoA = sc.nextLine();

				System.out.println("Introduce n�mero b:");
				numeroLeidoB = sc.nextLine();

				numeroAConvertido = Integer.parseInt(numeroLeidoA);
				numeroAConvertido = Integer.parseInt(numeroLeidoA);
			}
		} catch (NumberFormatException nfe) {
			System.err.println("Lo introducido no es un n�mero v�lido.");
		} catch (Exception e) {
			System.err.println("Ha ocurrido algo inesperado. ");
		} finally {

		}

		if (!on) {
			System.out.println("Ejecuci�n correcta. ");
			sc.close();
		}

	}

}
