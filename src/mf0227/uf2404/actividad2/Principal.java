/**
 * 
 */
package mf0227.uf2404.actividad2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * Realizar un programa que nos cree una lista de coches, para ello deber�
 * almacenarse dentro de esta lista los objetos de tipo coche que crearemos La
 * clase coche tendr� los siguientes atributos: matricula, marca, modelo, color,
 * potencia, cilindrada <br>
 * <br>
 * Para rellenar la lista se creara un men� que nos solicitara introducir los
 * datos por teclado, y una vez le�dos todos, se guardaran en un objeto que se
 * a�adir� a la lista y nos pedir� que indiquemos si queremos introducir un
 * veh�culo m�s o no. <br>
 * <br>
 * Una vez que no queramos introducir m�s coches, nos mostrara todo el contenido
 * en pantalla Realizar el ejercicio en base a las reglas de programaci�n
 * orientada a objetos
 * 
 * @author Joaqu�n Ruiz Mor�n
 *
 */
public class Principal {

	// Opciones del men� principal. Est�ticas por legibilidad.
	static private final String OPCION_A = "A";
	static private final String OPCION_B = "B";
	static private final String OPCION_C = "C";
	static private final String OPCION_D = "D";
	// Lista de coches que simula la base de datos
	static private ArrayList<Coche> listaCoches = new ArrayList<Coche>();
	// Ojeto Scanner para la recogida de datos.
	static private Scanner sc = new Scanner(System.in);
	static private String opcion = "";

	/**
	 * Hilo del programa principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("******* PROGRAMA EJERCICIO ENTREGA 2 *******");
		mostrarMenu();
		System.out.println("******* FIN DEL PROGRAMA EJERCICIO 2 *******");

		sc.close();

	}

	/**
	 * Muestra el menu principal del programa y lo repite hasta que el usuario desea
	 * salir.
	 */
	public static void mostrarMenu() {
		boolean salir = false;

		do {
			System.out.println(
					"�Qu� desea hacer?\n A .- A�adir coche\n B .- Eliminar coche\n C .- Ver lista de coches\n D .- Salir");
			opcion = sc.nextLine().toUpperCase();// Transformamos a mayusculas para que coincida con el switch

			switch (opcion) {
			case OPCION_A:
				a�adirCoche();
				break;

			case OPCION_B:
				eliminarCoche();
				break;

			case OPCION_C:
				mostrarCoches();
				break;

			case OPCION_D:
				System.out.println("Cerrando programa. Mostrando lista de coches actual");
				mostrarCoches();
				salir = true;
				break;

			default:
				System.out.println("Ha ocurrido algo inesperado.");
				break;
			}
		} while (!salir);
	}

	/**
	 * M�todo para a�adir un coche a la {@code listaCoches} . Utiliza los Strings
	 * {@code formatoDecimal, formatoNumerico, formatoTexto, texto, cilindrada, potencia}
	 * para validar los datos, y el boolean {@code error} para controlar los
	 * errores.
	 * 
	 */
	private static void a�adirCoche() {
		Coche c = new Coche();
		String formatoDecimal = "([0-9]+)\\.*([0-9]*)";
		String formatoNumerico = "([0-9]+)";
		String formatoTexto = "([a-zA-Z]+)";
		String texto;
		String cilindrada;
		String potencia;
		boolean error = false;

		// Pedimos los datos textuaes y los v�lidamos. Repetimos si no son correctos

		do {
			System.out.println("Introduzca un color para el coche");
			texto = sc.nextLine();

			if (texto.matches(formatoTexto)) {
				c.setColor(texto);
				error = false;
			} else {
				System.out.println("Dato introducido no v�lido.");
				error = true;
			}
		} while (error);

		System.out.println("Introduzca la matr�cula del coche");
		c.setMatricula(sc.nextLine().toUpperCase());

		do {
			System.out.println("Introduzca la marca del coche");
			texto = sc.nextLine();
			if (texto.matches(formatoTexto)) {
				c.setMarca(texto);
				error = false;
			} else {
				System.out.println("Dato introducido no v�lido.");
				error = true;
			}
		} while (error);

		do {
			System.out.println("Introduzca el modelo del coche");
			texto = sc.nextLine();
			if (texto.matches(formatoTexto)) {
				c.setModelo(texto);
				error = false;
			} else {
				System.out.println("Dato introducido no v�lido.");
				error = true;
			}
		} while (error);

		// Pedimos datos num�ricos y los v�lidamos. Si son erroneos repetimos.
		do {
			System.out.println("Introduzca la potencia del coche"); // POTENCIA
			potencia = sc.nextLine();

			if (potencia.matches(formatoDecimal)) {
				c.setPotencia(Double.parseDouble(potencia));
				error = false;
			} else {
				System.out.println("Valor de potencia inv�lido.");
				error = true;
			}
		} while (error);

		do {
			System.out.println("Introduzca la cilindrada del coche"); // CILINDRADA
			cilindrada = sc.nextLine();

			if (cilindrada.matches(formatoNumerico)) {
				c.setCilindrada(Integer.parseInt(cilindrada));
				error = false;
			} else {
				System.out.println("Valor de la cilindrada no v�lido.");
				error = true;
			}
		} while (error);

		listaCoches.add(c);

		System.out.println(
				"El coche " + c.toString() + " ha sido a�adido a la base de datos.\n Pulse enter para volver al men�");
		sc.nextLine();

	}

	/**
	 * M�todo para eliminar coches de {@code listaCoches}. Utiliza un array
	 * {@code listaCochesTemporal} para guardar los coches no borrados y
	 * posteriormente a�adirlos a {@code listaCoches}. Utiliza el string
	 * {@code matricula} para identificar el coche a borrar y el boolean
	 * {@code encontrado} para controlar si existe o no en la lista.
	 * 
	 */
	private static void eliminarCoche() {
		ArrayList<Coche> listaCochesTemporal = new ArrayList<Coche>();
		String matricula;
		boolean encontrado = false;

		System.out.println("Introduzca la matr�cula del coche a eliminiar");
		matricula = sc.nextLine().toUpperCase();

		for (Coche coche : listaCoches) {
			if (coche.getMatricula().equalsIgnoreCase(matricula)) {
				encontrado = true;
			} else {
				listaCochesTemporal.add(coche);
			}
		}

		// Limpiamos la lista y a�adimos el listado de coches arreglado
		listaCoches.clear();
		listaCoches.addAll(listaCochesTemporal);

		if (encontrado) {
			System.out.println("Coche con matr�cula " + matricula + " eliminado.");
		} else {
			System.out.println("El coche con matr�cula " + matricula + " no xiste en nuestra base de datos.");
		}

		System.out.print("Pulse enter para volver al men�");
		sc.nextLine();
	}

	/**
	 * M�todo que recorre la {@code listaCoches} y los muestra por pantalla. En caso
	 * de no existir mostrar� un mensaje adecuado.
	 */
	private static void mostrarCoches() {

		if (listaCoches.isEmpty()) {
			System.out.println("Todav�a no hay disponible ning�n coche en la lista");
		} else {
			for (Coche coche : listaCoches) {
				System.out.println("> " + coche);
			}
		} // end-if

		// Si la opcion no es la OPCION_D (salida) ense�amos este mensaje por usabilidad
		// del programa.
		if (!opcion.equalsIgnoreCase(OPCION_D)) {
			System.out.print("Pulse enter para volver al men�");
			sc.nextLine();
		}

	}

}
