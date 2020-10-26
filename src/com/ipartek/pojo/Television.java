/**
 * 
 */
package com.ipartek.pojo;

/**
 * 
 * Clase que define los atributos b�sicos de una televisi�n
 * 
 * @author Joaqu�n Ruiz Mor�n
 *
 */
public class Television extends HouseholdAppliances {

	protected double inch;

	public Television() {
		super();
	}

	public Television(String name, double price) {
		super(name, price);
	}

	public Television(String name, double price, double inch) {
		super(name, price);
		this.inch = inch;
	}

	public double getInch() {
		return inch;
	}

	public void setInch(double inch) {
		this.inch = inch;
	}

	@Override
	public String toString() {
		return "Television [inch=" + inch + ", name=" + name + ", price=" + price + "]";
	}

}
