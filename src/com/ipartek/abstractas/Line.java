/**
 * 
 */
package com.ipartek.abstractas;

/**
 * @author Joaqu�n Ruiz Mor�n
 *
 */
public class Line extends GraphicObject {

	int longitud;

	/**
	 * M�todo del padre. Clase {@link GraphicObject}
	 */
	@Override
	void draw() {
		System.out.println("Dibujamos una linea de longitud: " + longitud);
	}

}
