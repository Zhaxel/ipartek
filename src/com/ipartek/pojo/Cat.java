/**
 * 
 */
package com.ipartek.pojo;

/**
 * @author Joaquín Ruiz Morín
 *
 */
public class Cat extends Mammal {

	public Cat(String name) {
		super(name);

	}

	@Override
	public String toString() {
		return "Cat [Nombre=" + name + "Patas" + legs + "]";
	}

}
