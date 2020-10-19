package com.ipartek.excepciones;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.ipartek.tools.Utilidades;

/**
 * Realice un programa que solicite los números del DNI y devuelva el DNI con la
 * letra incluida. <br>
 * <br>
 * 
 * Utilice la clase Utilidades
 * 
 * @author Joaquín Ruiz Morín
 *
 */

public class EjercicioThrows {

	public static void main(String[] args) {
		String DNI = "";
		String NIF = "";
		Scanner sc = new Scanner(System.in);

		do {

			try {
				System.out.println("Introduzca su DNI");
				DNI = sc.nextLine();

				NIF = Utilidades.calcularDNI(DNI);
				System.out.println("Su NIF es " + NIF);
			} catch (Exception e) {
				System.out.println("El DNI introducido no es correcto");
			}
		} while (!Pattern.matches("[0-9]{8}", DNI)); // Devuelve true si el patrón coincide.

		sc.close();

	}
}
