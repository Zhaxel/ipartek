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

	@Override
	void draw() {
		System.out.println("Dibujamos una linea de longitud: " + longitud);
	}

}
