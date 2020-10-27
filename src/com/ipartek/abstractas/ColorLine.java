/**
 * 
 */
package com.ipartek.abstractas;

/**
 * 
 * Clase final que NO se puede heredar en ninguna otra clase
 * 
 * @author Joaqu�n Ruiz Mor�n
 *
 */
public final class ColorLine extends Line {

	String color;

	@Override
	void draw() {
		// super(); Copia al padre
		System.out.println("El color de esta l�nea es: " + color);
	}
}
