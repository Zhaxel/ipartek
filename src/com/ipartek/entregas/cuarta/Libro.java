/**
 * 
 */
package com.ipartek.entregas.cuarta;

/**
 * @author Joaquín Ruiz Morín
 *
 */
public class Libro implements Comparable<Libro> {

	private int id;
	private int numberoDePaginas;
	private String nombre;

	public Libro() {
		super();
	}

	public Libro(int id, int numberoDePaginas, String nombre) {
		this();
		this.id = id;
		this.numberoDePaginas = numberoDePaginas;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumberoDePaginas() {
		return numberoDePaginas;
	}

	public void setNumberoDePaginas(int numberoDePaginas) {
		this.numberoDePaginas = numberoDePaginas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", numberoDePaginas=" + numberoDePaginas + ", nombre=" + nombre + "]";
	}

	@Override
	public int compareTo(Libro l) {
		return (int) (this.id - l.getId());
	}
}
