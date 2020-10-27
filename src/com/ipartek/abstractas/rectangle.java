/**
 * 
 */
package com.ipartek.abstractas;

/**
 * @author Joaquín Ruiz Morín
 *
 */
public abstract class rectangle extends GraphicObject {

	int side;
	int height;

	int calcArea() {
		return (side * height);
	}

}
