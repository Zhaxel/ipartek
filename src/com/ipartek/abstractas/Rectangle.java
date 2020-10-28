/**
 * 
 */
package com.ipartek.abstractas;

/**
 * @author Joaqu�n Ruiz Mor�n
 *
 */
public abstract class Rectangle extends GraphicObject {

	int side;
	int height;

	int calcArea() {
		return (side * height);
	}

}
