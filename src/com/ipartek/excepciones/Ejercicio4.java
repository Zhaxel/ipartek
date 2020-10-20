/**
 * 
 */
package com.ipartek.excepciones;

import java.util.Scanner;

import com.ipartek.pojo.Persona;

/**
 * 
 * * Crea una clase Persona con los atributos nombre y edad. En el m�todo
 * setEdad lanzar una excepci�n si la edad introducida es menor que 0 o mayor
 * que 120. <br>
 * <br>
 * Realiza un programa que al comienzo cree una lista de personas haciendo uso
 * del constructor vac�o, y lea los datos por teclado y los asigne a los objetos
 * creados. Solo introducir� las personas en la lista si est�n en el rango de
 * edad indicado, comprob�ndolo mediante el uso de excepciones
 * 
 * @author Joaqu�n Ruiz Mor�n
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
			System.out.println("�Cu�ntas personas deseas crear?");
			numberOfPeople = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException nbe) {
			System.err.println("N�mero introducido no v�lido");
		} catch (Exception e) {
			System.err.println("Ha ocurrido algo inesperado");
		}
		// Creamos la lista una vez tenemos los datos validados
		people = new Persona[numberOfPeople];

		for (int i = 0; i < people.length; i++) {
			// Instaciamos el objeto para evitar NullPointerException
			people[i] = new Persona();
			// Configuramos el nombre
			System.out.println("Introduzca el nombre de la persona n� " + (i + 1));
			people[i].setName(sc.nextLine());

			System.out.println("Introduzca la edad de la persona n� " + (i + 1));
			// A�adimos bucle para insertar edad correctamente
			do {
				try {
					people[i].setAge(Integer.parseInt(sc.nextLine()));
				} catch (NumberFormatException nfe) {
					System.err.println("Edad introducida no v�lida.");
					System.out.println("Introduzca la edad de la persona n� " + (i + 1));
				} catch (Exception e) {
					System.err.println(e.getMessage()); // Mensaje de error del m�todo del Object.
					System.out.println("Introduzca la edad de la persona n� " + (i + 1));
				}
			} while (people[i].getAge() < 1 || people[i].getAge() > 120);
		} // end-i-for

		// Bucle para ense�ar el listado.
		for (int j = 0; j < people.length; j++) {
			System.out.println(
					"Persona n�" + (j + 1) + ":\nNombre:\t" + people[j].getName() + "\nEdad:\t" + people[j].getAge());
		} // end-j-for

		sc.close();

	}

}
