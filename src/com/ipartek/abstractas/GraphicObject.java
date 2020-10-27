/**
 * 
 */
package com.ipartek.abstractas;

/**
 * 
 * 
 * @author Joaqu�n Ruiz Mor�n
 *
 */
public abstract class GraphicObject {

	int x;
	int y;

	/**
	 * Todos los objetos gr�ficos heredar�n este m�todo
	 * 
	 * @param x
	 * @param y
	 */
	void mover(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Si el m�todo s�lo debe estar declarado hay que hacerlo abstracto.
	 */
	abstract void draw();
}
