/**
 * 
 */
package com.ipartek.abstractas;

/**
 * 
 * Clase final que NO se puede heredar en ninguna otra clase
 * 
 * @author Joaquín Ruiz Morín
 *
 */
public final class ColorLine extends Line {

	String color;

	@Override
	void draw() {
		// super(); Copia al padre
		System.out.println("El color de esta línea es: " + color);
	}
}
