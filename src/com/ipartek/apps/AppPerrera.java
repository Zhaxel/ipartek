/**
 * 
 */
package com.ipartek.apps;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.Perro;

/**
 * @author Joaquín Ruiz Morín
 *
 */
public class AppPerrera {

	static Scanner sc = null;
	static ArrayList<Perro> list = new ArrayList<Perro>();
	static String option = ""; // Variable para recoger la opción escogida por el usuario

	public static void main(String[] args) {

		initApp();

		System.out.println("********* APP PERRERA *********");
		sc = new Scanner(System.in);
		showMenu();

		// TODO Añadir resto de opciones y utilizar constantes
		switch (option) {
		case "1":
			showDogs();
			break;

		case "2":

			break;

		case "3":

			break;

		case "4":

			break;

		default:
			break;
		}

		System.out.println("****** ¡HASTA LA PRÓXIMA! *****");

	}// end-main

	/**
	 * Inicializa perros de prueba. A futuro lo haremos con una base de datos
	 */
	private static void initApp() {
		final String[] DOGS_NAMES = { "Laika", "Hachiko", "Balto", "Rin tin tin", "Stubby", "Pancho", "Greyfiars Bobby",
				"Smoky", };

		// int count = 1;
		Perro dog = new Perro();

		for (int i = 0; i < DOGS_NAMES.length; i++) {

			dog.setName(DOGS_NAMES[i]);
			list.add(dog);

		}

	}// end-initApp

	/**
	 * Método encargado de pintar las opciones del Menú.<br>
	 * <br>
	 * Al ser void no aparece {@code @return}
	 */
	private static void showMenu() {
		System.out.println("*******************************");
		System.out.println("1.- Listar todos los perros\n" + "2.- Registrar un perro nuevo\n"
				+ "3.- Dar de baja un perro\n" + "4.- Salir");
		System.out.println("*******************************");
		// TODO gestionar errores
		option = sc.nextLine();

	}// end-showMenu

	private static void showDogs() {
		for (Perro perro : list) {
			System.out.println(perro.toString());
		}

	}// end-showDogs

}// end-class
