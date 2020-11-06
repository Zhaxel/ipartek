/**
 * 
 */
package com.ipartek.entregas.cuarta;

import java.util.Scanner;

/**
 * @author Joaquín Ruiz Morín
 *
 */
public class AppLibreria extends AppGestion {

	private static final String FORMATO_NUMERICO = "[1-9]+(\\d*)";

	private static LibroHashMap lista;
	private static Libro l;
	private static Scanner sc;
	private static String respuesta;
	private static boolean isOK = true;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		respuesta = "";
		lista = LibroHashMap.getInsHashMap();
		lista.inicializarLista();

		do {
			pintarMenu(lista.NOMBRE_RECURSO);
			respuesta = sc.nextLine().toLowerCase();

			switch (respuesta) {

			case OP_LISTAR:
				listar();
				break;

			case OP_CREAR:
				crear();
				break;

			case OP_ELIMINAR:
				eliminar();
				break;

			case OP_MODIFICAR:
				modificar();
				break;

			case OP_SALIR:
				System.out.println("Gracias por usar nuestros servicios");
				break;

			default:
				System.out.println("Opción escogida no válida.");
				break;
			}
		} while (!OP_SALIR.equalsIgnoreCase(respuesta));

	}

	/**
	 * 
	 * Lista todos los recursos
	 */
	protected static void listar() {
		for (Libro l : lista.getAll()) {
			System.out.println(l);
		}
	}

	/**
	 * Pide por los datos por pantalla y crea un nuevo Libro en el HashMap. El
	 * identificador del libro será añadido en el propio método insert
	 */
	protected static void crear() {
		l = new Libro();

		do {
			isOK = true;
			System.out.println("Introduca el nombre del libro:");
			respuesta = sc.nextLine();
			l.setNombre(respuesta);

			for (Libro item : lista.getAll()) {
				if (l.getNombre().equalsIgnoreCase(item.getNombre())) {
					System.out.println("El libro ya existe");
					isOK = false;
					break;
				}
			}
		} while (!isOK);

		do {
			System.out.println("Introduzca el número de páginas:");
			respuesta = sc.nextLine();
			if (!respuesta.matches(FORMATO_NUMERICO)) {
				System.out.println("Número de paginas introducido no válido.");
				isOK = false;
			} else {
				isOK = true;
			}
		} while (!isOK);
		l.setNumberoDePaginas(Integer.parseInt(respuesta));

		if (lista.insert(l)) {
			System.out.println("Libro añadido a la base de datos");
		} else {
			System.out.println("El libro no se ha podido añadir");
		}
	}

	/**
	 * Modifica el Recurso
	 */
	protected static void modificar() {
		l = new Libro();
		int id = 0;

		do {
			System.out.println("Introduca el nombre del libro a modificar:");
			respuesta = sc.nextLine();

			for (Libro item : lista.getAll()) {
				if (respuesta.equalsIgnoreCase(item.getNombre())) {
					id = item.getId();
				}
			}

			if (lista.getById(id) == null) {
				System.out.println("El libro no existe en la base de datos");
			}
		} while (lista.getById(id) == null);

		l.setId(id);

		do {
			System.out.println("Introduzca el número de páginas:");
			respuesta = sc.nextLine();
			if (!respuesta.matches(FORMATO_NUMERICO)) {
				System.out.println("Número de paginas introducido no válido.");
				isOK = false;
			} else {
				isOK = true;
			}
		} while (!isOK);
		l.setNumberoDePaginas(Integer.parseInt(respuesta));

		lista.modificar(lista.getById(id), l);

	}

	/**
	 * Elimina un Recurso
	 */
	protected static void eliminar() {
		int id = 0;
		System.out.println("Introduzca el nombre de el libro a eliminar");
		respuesta = sc.nextLine();

		for (Libro item : lista.getAll()) {
			if (respuesta.equalsIgnoreCase(item.getNombre())) {
				id = item.getId();
			}
		}

		if (lista.delete(id)) {
			System.out.println("Libro existente. Eliminado");
		} else {
			System.out.println("No se ha encontrado el libro a eliminar");
		}

	}

}
