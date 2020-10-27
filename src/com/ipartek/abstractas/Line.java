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

	/**
	 * Método del padre. Clase {@link GraphicObject}
	 */
	@Override
	void draw() {
		System.out.println("Dibujamos una linea de longitud: " + longitud);
	}

}
