/**
 * 
 */
package com.ipartek.apps;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.modelos.PerroDAOArrayList;
import com.ipartek.pojo.Perro;

/**
 * @author Joaquín Ruiz Morín
 * @version 1.1
 *
 */
public class AppPerrera {

	// FINAL VARIABLES
	final private static String OPT_SHOW_DOGS = "1";
	final private static String OPT_CREATE_DOG = "2";
	final private static String OPT_DELETE_DOG = "3";
	final private static String OPT_UPDATE_DOG = "4";
	final private static String OPT_CLOSE_APP = "5";
	final private static boolean VACCINATED = true;

	// VARIABLES DEL PROGRAMA
	static private Scanner sc = null;
	static private PerroDAOArrayList dogList = new PerroDAOArrayList();
	static private ArrayList<Perro> list = new ArrayList<Perro>(); // Temporal. Ayuda a simular BBDD
	static private Perro dog = null; // Variable para ir creando y recogiendo los perros
	static private String option = ""; // Variable para recoger la opción escogida por el usuario
	static private String answer = ""; // Variable temporal para recoger datos
	static private int badWay = 0; // Variable-contador para comprobar búsquedas erróneas
	static private int id = -1; // V
	static private boolean located = false; // Variable para comprobar si se ha localizado el perro

	public static void main(String[] args) {
		initApp();
		sc = new Scanner(System.in);

		do {
			System.out.println("********* APP PERRERA *********");

			showMenu();

			switch (option) {
			case OPT_SHOW_DOGS: // IMPLEMENTADA
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
	 * Inicializa la App con datos de ejemplo en un {@code ArrayList<Perro>}
	 */
	private static void initApp() {
		/*
		 * final String[] DOGS_NAMES = { "Laika", "Hachiko", "Balto", "Rin tin tin",
		 * "Stubby", "Pancho", "Greyfiars Bobby", "Smoky", };
		 * 
		 * for (int i = 0; i < DOGS_NAMES.length; i++) { dog = new Perro();
		 * dog.setName(DOGS_NAMES[i]); list.add(dog); }
		 */
	}// end-initApp

	/**
	 * Muestra por pantalla las opciones escogibles en el menú principal.s
	 */
	private static void showMenu() {
		System.out.println("*******************************");
		System.out.println(OPT_SHOW_DOGS + ".- Listar todos los perros\n" + OPT_CREATE_DOG
				+ ".- Registrar un perro nuevo\n" + OPT_DELETE_DOG + ".- Dar de baja un perro\n" + OPT_UPDATE_DOG
				+ ".- Modificar datos perro \n" + OPT_CLOSE_APP + ".- Salir");
		System.out.println("*******************************");

		option = sc.nextLine();

	}// end-showMenu

	/**
	 * Muestra por pantalla el listado de perros contenidos en la variable
	 * {@code list}
	 */
	private static void showDogs() {
		list = dogList.getDogsList();
		for (Perro perro : list) {
			System.out.println(perro.toString());
		}
		System.out.println("\nPulse enter para volver al menú");
		sc.nextLine();
	}// end-showDogs

	/**
	 * Permite modificar un sólo perro de la lista, pasando por todos sus atributos.
	 */
	private static void updateDog() {
		located = false;
		badWay = 0; // Ponemos a 0 para la nueva búsqueda

		System.out.println("Introduzca el nombre del perro ha modificar:");
		answer = sc.nextLine();

		for (Perro perro : dogList.getDogsList()) {
			if (perro.getName().equalsIgnoreCase(answer)) {
				located = true;
				System.out.println("¿Desea cambiarle el nombre?\n" + "Sí\n" + "No");
				answer = sc.nextLine();

				// MODIFICACIÓN NOMBRE
				if (answer.equalsIgnoreCase("SI") || answer.equalsIgnoreCase("SÍ")) {
					System.out.println("Introduzca el nuevo nombre del animal");
					perro.setName(sc.nextLine()); // Recogemos el nombres
				} else if (!answer.equalsIgnoreCase("NO")) {
					badWay++;
					System.out.println("Respuesta introducida no válida. Siguiente campo");
				} // end-if

				// MODIFICACIÓN RAZA
				System.out.println("¿Desea modificar la raza?\n" + "Sí\n" + "No");
				answer = sc.nextLine();
				if (answer.equalsIgnoreCase("SI") || answer.equalsIgnoreCase("SÍ")) {
					System.out.println("Introduzca la raza del animal");
					perro.setRace(sc.nextLine());// Recogemos la raza
				} else if (!answer.equalsIgnoreCase("NO")) {
					badWay++;
					System.out.println("Respuesta introducida no válida. Siguiente campo");
				} // end-if

				// MODIFICACIÓN PESO
				System.out.println("¿Desea actualizar el peso?\n" + "Sí\n" + "No");
				answer = sc.nextLine();
				if (answer.equalsIgnoreCase("SI") || answer.equalsIgnoreCase("SÍ")) {
					System.out.println("Introduzca el peso del animal");
					try {
						perro.setWeight(Float.parseFloat(sc.nextLine())); // Recogemos el peso
					} catch (NumberFormatException e) {
						System.err.println("Formato de número no válido. El peso no se ha modificado");
					} catch (Exception e) {
						System.out.println("Ha ocurrido algo inesperado.");
					}
				} else if (!answer.equalsIgnoreCase("NO")) {
					badWay++;
					System.out.println("Respuesta introducida no válida. Siguiente campo");
				} // end-if

				// MODIFICACIÓN VACUNA
				System.out.println("¿Está vacunado el perro?\n" + "Sí\n" + "No");
				answer = sc.nextLine();
				if (answer.equalsIgnoreCase("SI") || answer.equalsIgnoreCase("SÍ")) {
					perro.setVaccinated(VACCINATED); // Recogemos si está vacunado o no
				} else if (!answer.equalsIgnoreCase("NO")) {
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

	/**
	 * Selecciona un perro de {@code list} y lo elimina. Filtra por {@code name}
	 */
	private static void deleteDog() {
		System.out.println("Introduzca el identificador del perro que desea eliminar del sistema");
		id = Integer.parseInt(sc.nextLine());

		for (Perro perro : dogList.getDogsList()) {
			try {
				if (dogList.deleteDog(id)) {
					System.out.println(perro.getName() + " ha sido eliminado del sistema.");
					break;
				} else {
					System.out.println("El perro no ha sido encontrado");
				}
			} catch (Exception e) {
				e.printStackTrace();
			} // end-if
		} // end-for

		System.out.println("\nPulse enter para volver al menú");
		sc.nextLine();
	}// end-deleteDog

	/**
	 * Crea un perro de la clase {@code Perro}
	 */
	private static void createDog() {
		dog = new Perro();

		System.out.println("Introduzca un identificador numérico para el animal");
		id = Integer.parseInt(sc.nextLine());

		// Si el perro no existe procedemos a crearlo
		if (dogList.getDog(id) == null) {
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

			System.out.println("¿Está vacunado el perro?");
			answer = sc.nextLine();

			if (answer.equalsIgnoreCase("SI") || answer.equalsIgnoreCase("SÍ")) {
				dog.setVaccinated(VACCINATED);
			} else if (!answer.equalsIgnoreCase("NO")) {
				System.out
						.println("La respuesta introducida no es correcta. Puede modificar este apartado más adelante");
			} // end-if

			try {
				dogList.createDog(dog);
			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println("Tu perro " + dog.getName() + " ha sido añadido al sistema.");

		} else {
			System.out.println("El perro " + dogList.getDog(id).getName() + " ya está registrado en el sistema.");
		} // end-if

		System.out.println("\nPulse enter para volver al menú");
		sc.nextLine();
	}// end-createDog
}// end-class
