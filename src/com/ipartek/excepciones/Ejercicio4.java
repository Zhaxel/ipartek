/**
 * 
 */
package com.ipartek.excepciones;

import java.util.Scanner;

import com.ipartek.pojo.Persona;

/**
 * 
 * * Crea una clase Persona con los atributos nombre y edad. En el método
 * setEdad lanzar una excepción si la edad introducida es menor que 0 o mayor
 * que 120. <br>
 * <br>
 * Realiza un programa que al comienzo cree una lista de personas haciendo uso
 * del constructor vacío, y lea los datos por teclado y los asigne a los objetos
 * creados. Solo introducirá las personas en la lista si están en el rango de
 * edad indicado, comprobándolo mediante el uso de excepciones
 * 
 * @author Joaquín Ruiz Morín
 *
 */
public class Ejercicio4 {

	/**
	 * 
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int numberOfPeople = 0;
		Persona[] people;
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("¿Cuántas personas deseas crear?");
			numberOfPeople = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException nbe) {
			System.err.println("Número introducido no válido");
		} catch (Exception e) {
			System.err.println("Ha ocurrido algo inesperado");
		}
		// Creamos la lista una vez tenemos los datos validados
		people = new Persona[numberOfPeople];

		for (int i = 0; i < people.length; i++) {
			// Instaciamos el objeto para evitar NullPointerException
			people[i] = new Persona();
			// Configuramos el nombre
			System.out.println("Introduzca el nombre de la persona nº " + (i + 1));
			people[i].setName(sc.nextLine());

			System.out.println("Introduzca la edad de la persona nº " + (i + 1));
			// Añadimos bucle para insertar edad correctamente
			do {
				try {
					people[i].setAge(Integer.parseInt(sc.nextLine()));
				} catch (NumberFormatException nfe) {
					System.err.println("Edad introducida no válida.");
					System.out.println("Introduzca la edad de la persona nº " + (i + 1));
				} catch (Exception e) {
					System.err.println(e.getMessage()); // Mensaje de error del método del Object.
					System.out.println("Introduzca la edad de la persona nº " + (i + 1));
				}
			} while (people[i].getAge() < 1 || people[i].getAge() > 120);
		} // end-i-for

		// Bucle para enseñar el listado.
		for (int j = 0; j < people.length; j++) {
			System.out.println(
					"Persona nº" + (j + 1) + ":\nNombre:\t" + people[j].getName() + "\nEdad:\t" + people[j].getAge());
		} // end-j-for

		sc.close();

	}

}
