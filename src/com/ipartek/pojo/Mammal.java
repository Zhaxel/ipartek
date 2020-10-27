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

	public Mammal() {
		super();
		this.name = "Desconocido";
	}

	public Mammal(String name) {
		this();
		this.name = name;
		this.legs = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int patas) {
		this.legs = patas;
	}

	// sobreescribimos al padre que es java.lnag.Object
	@Override
	public String toString() {
		return "Mamifero [Nombre=" + name + ", Patas=" + legs + "]";
	}

}
