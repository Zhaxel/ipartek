/**
 * 
 */
package com.ipartek.pojo;

/**
 * 
 * Clase espec�fica para televisores planos
 * 
 * 
 * @author Joaqu�n Ruiz Mor�n
 *
 */
public class FlatTelevision extends Television {

	private String screenType;

	public FlatTelevision() {
		super();
	}

	public FlatTelevision(String name, double price, double inch) {
		super(name, price, inch);
	}

	public FlatTelevision(String screenType) {
		super();
		this.screenType = screenType;
	}

	public FlatTelevision(String name, double price, double inch, String screenType) {
		super(name, price, inch);
		this.screenType = screenType;
	}

	public String getScreenType() {
		return screenType;
	}

	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}

	@Override
	public String toString() {
		return "FlatTelevision [screenType=" + screenType + ", inch=" + inch + ", name=" + name + ", price=" + price
				+ "]";
	}

}
