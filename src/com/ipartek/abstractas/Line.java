/**
 * 
 */
package com.ipartek.abstractas;

/**
 * @author Joaquín Ruiz Morín
 *
 */
public class Line extends GraphicObject {

	int longitud;

	@Override
	void draw() {
		System.out.println("Dibujamos una linea de longitud: " + longitud);
	}

}
