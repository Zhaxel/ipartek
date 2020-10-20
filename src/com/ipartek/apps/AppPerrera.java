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
	static Perro dog = null; // Variable para ir creando y recogiendo los perros
	static String option = ""; // Variable para recoger la opción escogida por el usuario
	static String tmp = ""; // Variable temporal para recoger datos
	static boolean on = true; // Variable para controlar si el programa se mantiene encendido
	static int badWay = 0; // Variable-contador para comprobar búsquedas erróneas

	public static void main(String[] args) {
		initApp();

		do {
			System.out.println("********* APP PERRERA *********");
			sc = new Scanner(System.in);
			showMenu();

			// TODO Utilizar constantes
			switch (option) {
			case "1": // READ
				showDogs();
				break;

			case "2": // CREATE
				createDog();
				break;

			case "3": // DELETE
				deleteDog();
				break;

			case "4": // UPDATE
				updateDog();
				break;
			case "5":
				on = false;
				break;
			default:
				System.err.println("Ha pasado algo inesperado. Cerrando aplicación");
				on = false;
				break;
			}
		} while (on);

		System.out.println("****** ¡HASTA LA PRÓXIMA! *****");

	}// end-main

	/**
	 * Inicializa perros de prueba. A futuro lo haremos con una base de datos
	 */
	private static void initApp() {
		final String[] DOGS_NAMES = { "Laika", "Hachiko", "Balto", "Rin tin tin", "Stubby", "Pancho", "Greyfiars Bobby",
				"Smoky", };

		for (int i = 0; i < DOGS_NAMES.length; i++) {
			dog = new Perro();
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
				+ "3.- Dar de baja un perro\n" + "4.- Actualizar perro \n" + "5.- Salir");
		System.out.println("*******************************");
		// TODO gestionar errores
		option = sc.nextLine();

	}// end-showMenu

	private static void showDogs() {
		for (Perro perro : list) {
			System.out.println(perro.toString());
		}
		System.out.println("\nPulse enter para volver al menú");
		sc.nextLine();
	}// end-showDogs

	private static void updateDog() {
		boolean located = false; // Varia para comprobar si se ha localizado el perro
		badWay = 0; // Ponemos a 0 para la nueva búsqueda
		dog = new Perro();

		System.out.println("Introduzca el nombre del perro ha modificar:");
		tmp = sc.nextLine();

		for (Perro perro : list) {
			if (perro.getName().equals(tmp)) {
				located = true;
				System.out.println("¿Desea cambiarle el nombre?\n" + "Sí\n" + "No");
				tmp = sc.nextLine().toUpperCase();

				// MODIFICACIÓN NOMBRE
				if (tmp.equals("SI") || tmp.equals("SÍ")) {
					System.out.println("Introduzca el nuevo nombre del animal");
					tmp = sc.nextLine();
					// TODO Modificar el objeto perro.
				} else if (tmp.equals("NO")) {
					badWay++;
					// TODO Pensar que syso meter aquí.
				} else {
					System.out.println("Respuesta introducida no válida. Siguiente campo");
				} // end-if

				// MODIFICACIÓN RAZA
				System.out.println("¿Desea modificar la raza?\n" + "Sí\n" + "No");
				tmp = sc.nextLine().toUpperCase();
				if (tmp.equals("SI") || tmp.equals("SÍ")) {
					System.out.println("Introduzca la raza del animal");
					tmp = sc.nextLine();
					// TODO Modificar el objeto perro.
				} else if (tmp.equals("NO")) {
					badWay++;
					// TODO Pensar que syso meter aquí.
				} else {
					System.out.println("Respuesta introducida no válida. Siguiente campo");
				} // end-if

				// MODIFICACIÓN PESO
				System.out.println("¿Desea actualizar el peso?\n" + "Sí\n" + "No");
				tmp = sc.nextLine().toUpperCase();
				if (tmp.equals("SI") || tmp.equals("SÍ")) {
					System.out.println("Introduzca el peso del animal");
					tmp = sc.nextLine();
					// TODO Modificar el objeto perro.
				} else if (tmp.equals("NO")) {
					badWay++;
					// TODO Pensar que syso meter aquí.
				} else {
					System.out.println("Respuesta introducida no válida. Siguiente campo");
				} // end-if

				// MODIFICACIÓN VACUNA
				System.out.println("¿Está vacunado el perro?\n" + "Sí\n" + "No");
				tmp = sc.nextLine().toUpperCase();
				if (tmp.equals("SI") || tmp.equals("SÍ")) {
					// TODO Modificar el objeto perro.
				} else if (tmp.equals("NO")) {
					badWay++;
					// TODO Pensar que syso meter aquí.
				} else {
					System.out.println("Respuesta introducida no válida. Siguiente campo");
				} // end-if

				// MENSAJE DEL SISTEMA TRAS LA ACTUALIZACIÓN
				if (badWay >= 4) {
					System.out.println("Ninguna modificación realizada");
				} else {
					// TODO Reemplazar el perro de la lista por el nuevo Object
					System.out.println("Perro actualizado correctamente.");
				} // end-if

			} // end-if
		} // end-for

		// MENSAJE DE ERROR
		if (!located) {
			System.out.println("El perro buscado no existe en nuestra base de datos");
		} // end-if

		System.out.println("\nPulse enter para volver al menú");
		sc.nextLine();
	}// end-updateDog

	private static void deleteDog() {
		int badWay = 0; // Ponemos a 0 para la nueva búsqueda
		System.out.println("Introduzca el nombre del perro que desea eliminar del sistema");
		tmp = sc.nextLine().toUpperCase(); // Ponemos todo a mayúsculas para evitar errores de usuario

		for (Perro perro : list) {
			if (perro.getName().toUpperCase().equals(tmp)) {
				System.out.println("Procediendo a eliminar a " + perro.getName() + " del sistema.");
				list.remove(perro.getName());
				System.out.println("Operacion completada");
			} else {
				// PERRO NO ENCONTRADO
				badWay++;
			} // end-if
		} // end-for
		if (badWay >= list.size()) {
			System.out.println("El perro no ha sido encontrado");
		} // end-if

		System.out.println("\nPulse enter para volver al menú");
		sc.nextLine();
	}// end-deleteDog

	private static void createDog() {
		dog = new Perro();

		System.out.println("Introduzca el nombre del animal");
		tmp = sc.nextLine();
		dog.setName(tmp);

		System.out.println("Introduzca la raza del animal");
		tmp = sc.nextLine();
		dog.setRace(tmp);

		System.out.println("Introduzca el peso del animal");
		tmp = sc.nextLine();
		// TODO CONTROLAR EXCEPCIÓN
		dog.setWeight(Float.parseFloat(tmp));

		System.out.println("¿Está vacunado el perro?");
		tmp = sc.nextLine().toUpperCase();

		if (tmp.equals("SI") || tmp.equals("SÍ")) {
			dog.setVaccinated(true);
		} else if (tmp.equals("NO")) {
			dog.setVaccinated(false);
		} else {
			System.out.println("La respuesta introducido no es correcta. Puede modificar este apartado más adelante");
		} // end-if

		list.add(dog);

		System.out.println("Tu perro " + dog.getName() + " ha sido añadido al sistema.");
		System.out.println("\nPulse enter para volver al menú");
		sc.nextLine();

	}// end-createDog

}// end-class
