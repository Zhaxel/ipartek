/**
 * 
 */
package com.ipartek.apps;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.Perro;

/**
 * @author Joaqu�n Ruiz Mor�n
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
	static private ArrayList<Perro> list = new ArrayList<Perro>();
	static private Perro dog = null; // Variable para ir creando y recogiendo los perros
	static private String option = ""; // Variable para recoger la opci�n escogida por el usuario
	static private String tmp = ""; // Variable temporal para recoger datos
	static private int badWay = 0; // Variable-contador para comprobar b�squedas err�neas
	static private boolean located = false; // Variable para comprobar si se ha localizado el perro

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
				System.out.println("****** �HASTA LA PR�XIMA! *****");
				break;
			default:
				System.err.println("Opci�n inesperada. Por favor, escoja un n�mero de la lista.");
				break;
			}
		} while (!OPT_CLOSE_APP.equalsIgnoreCase(option));

	}// end-main

	/**
	 * Inicializa la App con datos de ejemplo en un {@code ArrayList<Perro>}
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
	 * Muestra por pantalla las opciones escogibles en el men� principal.s
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
		for (Perro perro : list) {
			System.out.println(perro.toString());
		}
		System.out.println("\nPulse enter para volver al men�");
		sc.nextLine();
	}// end-showDogs

	/**
	 * Permite modificar un s�lo perro de la lista, pasando por todos sus atributos.
	 */
	private static void updateDog() {
		located = false;
		badWay = 0; // Ponemos a 0 para la nueva b�squeda

		System.out.println("Introduzca el nombre del perro ha modificar:");
		tmp = sc.nextLine();

		for (Perro perro : list) {
			if (perro.getName().equalsIgnoreCase(tmp)) {
				located = true;
				System.out.println("�Desea cambiarle el nombre?\n" + "S�\n" + "No");
				tmp = sc.nextLine();

				// MODIFICACI�N NOMBRE
				if (tmp.equalsIgnoreCase("SI") || tmp.equalsIgnoreCase("S�")) {
					System.out.println("Introduzca el nuevo nombre del animal");
					perro.setName(sc.nextLine()); // Recogemos el nombres
				} else if (!tmp.equalsIgnoreCase("NO")) {
					badWay++;
					System.out.println("Respuesta introducida no v�lida. Siguiente campo");
				} // end-if

				// MODIFICACI�N RAZA
				System.out.println("�Desea modificar la raza?\n" + "S�\n" + "No");
				tmp = sc.nextLine();
				if (tmp.equalsIgnoreCase("SI") || tmp.equalsIgnoreCase("S�")) {
					System.out.println("Introduzca la raza del animal");
					perro.setRace(sc.nextLine());// Recogemos la raza
				} else if (!tmp.equalsIgnoreCase("NO")) {
					badWay++;
					System.out.println("Respuesta introducida no v�lida. Siguiente campo");
				} // end-if

				// MODIFICACI�N PESO
				System.out.println("�Desea actualizar el peso?\n" + "S�\n" + "No");
				tmp = sc.nextLine();
				if (tmp.equalsIgnoreCase("SI") || tmp.equalsIgnoreCase("S�")) {
					System.out.println("Introduzca el peso del animal");
					try {
						perro.setWeight(Float.parseFloat(sc.nextLine())); // Recogemos el peso
					} catch (NumberFormatException e) {
						System.err.println("Formato de n�mero no v�lido. El peso no se ha modificado");
					} catch (Exception e) {
						System.out.println("Ha ocurrido algo inesperado.");
					}
				} else if (!tmp.equalsIgnoreCase("NO")) {
					badWay++;
					System.out.println("Respuesta introducida no v�lida. Siguiente campo");
				} // end-if

				// MODIFICACI�N VACUNA
				System.out.println("�Est� vacunado el perro?\n" + "S�\n" + "No");
				tmp = sc.nextLine();
				if (tmp.equalsIgnoreCase("SI") || tmp.equalsIgnoreCase("S�")) {
					perro.setVaccinated(VACCINATED); // Recogemos si est� vacunado o no
				} else if (!tmp.equalsIgnoreCase("NO")) {
					badWay++;
					System.out.println("Respuesta introducida no v�lida. Siguiente campo");
				} // end-if

				// MENSAJE DEL SISTEMA TRAS LA ACTUALIZACI�N
				if (badWay >= 4) {
					System.out.println("Ninguna modificaci�n realizada");
				} else {
					System.out.println("Perro actualizado correctamente.");
				} // end-if
			} // end-if
		} // end-for

		// MENSAJE DE ERROR
		if (!located) {
			System.out.println("El perro buscado no existe en nuestra base de datos");
		} // end-if

		System.out.println("\nPulse enter para volver al men�");
		sc.nextLine();
	}// end-updateDog

	/**
	 * Selecciona un perro de {@code list} y lo elimina. Filtra por {@code name}
	 */
	private static void deleteDog() {
		int badWay = 0; // Ponemos a 0 para la nueva b�squeda
		System.out.println("Introduzca el nombre del perro que desea eliminar del sistema");
		tmp = sc.nextLine(); // Ponemos todo a may�sculas para evitar errores de usuario

		for (Perro perro : list) {
			if (perro.getName().equalsIgnoreCase(tmp)) {
				System.out.println("Procediendo a eliminar a " + perro.getName() + " del sistema.");
				list.remove(perro);
				badWay--;
				System.out.println("Operacion completada");
				break;
			} else {
				badWay++;
			} // end-if
		} // end-for

		if (badWay >= list.size()) {
			System.out.println("El perro no ha sido encontrado");
		} // end-if

		System.out.println("\nPulse enter para volver al men�");
		sc.nextLine();
	}// end-deleteDog

	/**
	 * Crea un perro de la clase {@code Perro}
	 */
	private static void createDog() {
		dog = new Perro();

		System.out.println("Introduzca el nombre del animal");
		tmp = sc.nextLine();

		// Comprobamos si el perro ya existe en el sistema
		for (Perro perro : list) {
			if (perro.getName().equalsIgnoreCase(tmp)) {
				System.out.println("Lo sentimos, ese perro ya est� registrado en el sistema.");
				located = true;
			}
		}

		// Si el perro no existe procedemos a crearlo
		if (!located) {
			dog.setName(tmp);

			System.out.println("Introduzca la raza del animal");
			dog.setRace(sc.nextLine());

			System.out.println("Introduzca el peso del animal");
			try {
				dog.setWeight(Float.parseFloat(sc.nextLine()));
			} catch (NumberFormatException e) {
				System.err.println(
						"Formato de n�mero no v�lido. Peso no a�adido. Puede modificar este apartado m�s adelante.");
			} catch (Exception e) {
				System.out.println("Ha ocurrido algo inesperado. Puede modificar este apartado m�s adelante.");
			}

			System.out.println("�Est� vacunado el perro?");
			tmp = sc.nextLine();

			if (tmp.equalsIgnoreCase("SI") || tmp.equalsIgnoreCase("S�")) {
				dog.setVaccinated(VACCINATED);
			} else if (!tmp.equalsIgnoreCase("NO")) {
				System.out
						.println("La respuesta introducida no es correcta. Puede modificar este apartado m�s adelante");
			} // end-if

			list.add(dog);
			System.out.println("Tu perro " + dog.getName() + " ha sido a�adido al sistema.");

		} // end-if

		System.out.println("\nPulse enter para volver al men�");
		sc.nextLine();
	}// end-createDog
}// end-class
