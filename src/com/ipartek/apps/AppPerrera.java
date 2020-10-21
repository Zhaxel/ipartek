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

	// TODO Añadir convenciones java.

	final static String OPT_SHOW_DOGS = "1";
	final static String OPT_CREATE_DOG = "2";
	final static String OPT_DELETE_DOG = "3";
	final static String OPT_UPDATE_DOG = "4";
	final static String OPT_CLOSE_APP = "5";
	final static boolean VACCINATED = true;

	static Scanner sc = null;
	static ArrayList<Perro> list = new ArrayList<Perro>();
	static Perro dog = null; // Variable para ir creando y recogiendo los perros
	static String option = ""; // Variable para recoger la opción escogida por el usuario
	static String tmp = ""; // Variable temporal para recoger datos
	static int badWay = 0; // Variable-contador para comprobar búsquedas erróneas

	public static void main(String[] args) {
		initApp();
		sc = new Scanner(System.in);

		do {
			System.out.println("********* APP PERRERA *********");

			showMenu();

			switch (option) {
			case OPT_SHOW_DOGS: // READ
				showDogs();
				break;

			case OPT_CREATE_DOG: // CREATE
				createDog();
				break;

			case OPT_DELETE_DOG: // DELETE
				deleteDog();
				break;

			case OPT_UPDATE_DOG: // UPDATE
				updateDog();
				break;
			case OPT_CLOSE_APP:
				System.out.println("****** ¡HASTA LA PRÓXIMA! *****");
				break;
			default:
				System.err.println("Opción inesperada. Por favor, escoja un número de la lista.");
				break;
			}
		} while (!OPT_CLOSE_APP.equalsIgnoreCase(option));

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
		System.out.println(OPT_SHOW_DOGS + ".- Listar todos los perros\n" + OPT_CREATE_DOG
				+ ".- Registrar un perro nuevo\n" + OPT_DELETE_DOG + ".- Dar de baja un perro\n" + OPT_UPDATE_DOG
				+ ".- Modificar datos perro \n" + OPT_CLOSE_APP + ".- Salir");
		System.out.println("*******************************");

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

		System.out.println("Introduzca el nombre del perro ha modificar:");
		tmp = sc.nextLine();

		for (Perro perro : list) {
			if (perro.getName().equalsIgnoreCase(tmp)) {
				located = true;
				System.out.println("¿Desea cambiarle el nombre?\n" + "Sí\n" + "No");
				tmp = sc.nextLine();

				// MODIFICACIÓN NOMBRE
				if (tmp.equalsIgnoreCase("SI") || tmp.equalsIgnoreCase("SÍ")) {
					System.out.println("Introduzca el nuevo nombre del animal");
					perro.setName(sc.nextLine());
				} else if (!tmp.equalsIgnoreCase("NO")) {
					badWay++;
					System.out.println("Respuesta introducida no válida. Siguiente campo");
				} // end-if

				// MODIFICACIÓN RAZA
				System.out.println("¿Desea modificar la raza?\n" + "Sí\n" + "No");
				tmp = sc.nextLine();
				if (tmp.equalsIgnoreCase("SI") || tmp.equalsIgnoreCase("SÍ")) {
					System.out.println("Introduzca la raza del animal");
					perro.setRace(sc.nextLine());
				} else if (!tmp.equalsIgnoreCase("NO")) {
					badWay++;
					System.out.println("Respuesta introducida no válida. Siguiente campo");
				} // end-if

				// MODIFICACIÓN PESO
				System.out.println("¿Desea actualizar el peso?\n" + "Sí\n" + "No");
				tmp = sc.nextLine();
				if (tmp.equalsIgnoreCase("SI") || tmp.equalsIgnoreCase("SÍ")) {
					System.out.println("Introduzca el peso del animal");
					try {
						perro.setWeight(Float.parseFloat(sc.nextLine()));
					} catch (NumberFormatException e) {
						System.err.println("Formato de número no válido. El peso no se ha modificado");
					} catch (Exception e) {
						System.out.println("Ha ocurrido algo inesperado.");
					}
				} else if (!tmp.equalsIgnoreCase("NO")) {
					badWay++;
					System.out.println("Respuesta introducida no válida. Siguiente campo");
				} // end-if

				// MODIFICACIÓN VACUNA
				System.out.println("¿Está vacunado el perro?\n" + "Sí\n" + "No");
				tmp = sc.nextLine();
				if (tmp.equalsIgnoreCase("SI") || tmp.equalsIgnoreCase("SÍ")) {
					perro.setVaccinated(VACCINATED);
				} else if (!tmp.equalsIgnoreCase("NO")) {
					badWay++;
					System.out.println("Respuesta introducida no válida. Siguiente campo");
				} // end-if

				// MENSAJE DEL SISTEMA TRAS LA ACTUALIZACIÓN
				if (badWay >= 4) {
					System.out.println("Ninguna modificación realizada");
				} else {
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
		tmp = sc.nextLine(); // Ponemos todo a mayúsculas para evitar errores de usuario

		for (Perro perro : list) {
			if (perro.getName().equalsIgnoreCase(tmp)) {
				System.out.println("Procediendo a eliminar a " + perro.getName() + " del sistema.");
				list.remove(perro);
				System.out.println("Operacion completada");
				break;
			} else {
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
		dog.setName(sc.nextLine());

		System.out.println("Introduzca la raza del animal");
		dog.setRace(sc.nextLine());

		System.out.println("Introduzca el peso del animal");
		try {
			dog.setWeight(Float.parseFloat(sc.nextLine()));
		} catch (NumberFormatException e) {
			System.err.println(
					"Formato de número no válido. Peso no añadido. Puede modificar este apartado más adelante.");
		} catch (Exception e) {
			System.out.println("Ha ocurrido algo inesperado. Puede modificar este apartado más adelante.");
		}
		/*
		 * TODO Buscar forma de que este mensaje se muestra tras la excepción y no
		 * antes.
		 */
		System.out.println("¿Está vacunado el perro?");
		tmp = sc.nextLine();

		if (tmp.equalsIgnoreCase("SI") || tmp.equalsIgnoreCase("SÍ")) {
			dog.setVaccinated(VACCINATED);
		} else if (!tmp.equalsIgnoreCase("NO")) {
			System.out.println("La respuesta introducido no es correcta. Puede modificar este apartado más adelante");
		} // end-if

		list.add(dog);

		System.out.println("Tu perro " + dog.getName() + " ha sido añadido al sistema.");
		System.out.println("\nPulse enter para volver al menú");
		sc.nextLine();

	}// end-createDog

}// end-class
