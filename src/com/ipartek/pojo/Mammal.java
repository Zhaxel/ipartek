/**
 * 
 */
package com.ipartek.pojo;

/**
 * @author Joaquín Ruiz Morín
 *
 */
public class Mammal {

	protected String name;
	protected int legs;

	public Mammal(String name) {
		super();
		this.name = name;
		this.legs = 0;
	}

	public String getNombre() {
		return name;
	}

	public void setNombre(String nombre) {
		this.name = nombre;
	}

	public int getPatas() {
		return legs;
	}

	public void setPatas(int patas) {
		this.legs = patas;
	}

	// sobreescribimos al padre que es java.lnag.Object
	@Override
	public String toString() {
		return "Mamifero [Nombre=" + name + ", Patas=" + legs + "]";
	}

}
