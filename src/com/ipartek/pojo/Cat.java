/**
 * 
 */
package com.ipartek.pojo;

/**
 * @author Joaqu�n Ruiz Mor�n
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
