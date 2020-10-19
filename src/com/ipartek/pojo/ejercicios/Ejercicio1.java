/**
 * 
 */
package com.ipartek.pojo.ejercicios;

import com.ipartek.pojo.Perro;

/**
 * @author Joaquín Ruiz Morín
 *
 */
public class Ejercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Perro p1 = new Perro();

		p1.setName("Snoopy");
		p1.setWeight(50);

		Perro p2 = new Perro();
		p2.setName("Laika");
		p2.setWeight(-13);
		System.out.println(p1.getName() + "\t" + p1.getWeight());
	}

}
