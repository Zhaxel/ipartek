/**
 * 
 */
package com.ipartek.abstractas;

/**
 * 
 * 
 * @author Joaquín Ruiz Morín
 *
 */
public abstract class GraphicObject {

	int x;
	int y;

	/**
	 * Todos los objetos gráficos heredarán este método
	 * 
	 * @param x
	 * @param y
	 */
	void mover(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Si el método sólo debe estar declarado hay que hacerlo abstracto.
	 */
	abstract void draw();
}
