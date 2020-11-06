/**
 * 
 */
package com.ipartek.entregas.cuarta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * @author Joaquín Ruiz Morín
 *
 */
public class LibroHashMap implements LibroDao {

	protected final String NOMBRE_RECURSO = "Libros";

	private static LibroHashMap INSTANCE = null;
	private HashMap<Integer, Libro> listaDeLibros = new HashMap<Integer, Libro>();

	public void inicializarLista() {
		listaDeLibros.put(1, new Libro(1, 500, "Memorias de Idhun"));
		listaDeLibros.put(2, new Libro(2, 20, "Caperucita Roja"));
		listaDeLibros.put(3, new Libro(3, 1200, "El Sillmalirion"));
	}

	public LibroHashMap() {
		super();
	}

	public synchronized static LibroHashMap getInsHashMap() {
		if (INSTANCE == null) {
			INSTANCE = new LibroHashMap();
		}
		return INSTANCE;
	}

	/**
	 * Devuelve un ArrayList con todos los Object Libro de listaDeLibros
	 */
	@Override
	public List<Libro> getAll() {

		return new ArrayList<Libro>(listaDeLibros.values());
	}

	/**
	 * Localiza a un libro por su id. En caso de encontrarlo, devuelve el objeto. En
	 * caso contrario devuelve un null
	 */
	@Override
	public Libro getById(int id) {
		Libro libro = null;

		for (Iterator<Integer> it = listaDeLibros.keySet().iterator(); it.hasNext();) {
			if (id == (Integer) it.next()) {
				libro = listaDeLibros.get(id);
			}
		}

		return libro;
	}

	/**
	 * Trata de localizar un libro por su ID y devuelve true o false en caso de
	 * encontrarlo o no. Si lo encuentra, adicionalmente lo elimina.
	 */
	@Override
	public boolean delete(int id) {
		boolean eliminado = false;

		for (Iterator<Integer> it = listaDeLibros.keySet().iterator(); it.hasNext();) {
			if (id == (Integer) it.next()) {

				eliminado = true;
			}
		}

		if (eliminado) {
			listaDeLibros.remove(id);
		}

		return eliminado;
	}

	/**
	 * Inserta un nuevo libro a listaDeLibros. Para ello comprueba los IDs
	 * existentes y le da inmediatamente el siguiente disponible
	 */
	@Override
	public boolean insert(Libro l) {
		HashMap<Integer, Libro> listaLibrosTemporal = new HashMap<Integer, Libro>();
		Libro libroTemporal = new Libro();
		int numeroDeKeys;
		int cont = 0;

		// Reordenamos listaDeLibros usando listaTemporal
		for (Iterator<Integer> iterator = listaDeLibros.keySet().iterator(); iterator.hasNext();) {
			cont++;
			int key = (Integer) iterator.next();
			libroTemporal = listaDeLibros.get(key);
			libroTemporal.setId(cont);
			listaLibrosTemporal.put(cont, libroTemporal);

		}

		numeroDeKeys = listaLibrosTemporal.keySet().size();

		l.setId((numeroDeKeys + 1));

		listaLibrosTemporal.put((numeroDeKeys + 1), l);

		listaDeLibros = listaLibrosTemporal;

		return true;
	}

	@Override
	public void modificar(Libro viejo, Libro nuevo) {

		nuevo.setNombre(viejo.getNombre());

		listaDeLibros.replace(viejo.getId(), viejo, nuevo);

	}

}
