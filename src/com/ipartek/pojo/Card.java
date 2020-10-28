/**
 * 
 */
package com.ipartek.pojo;

/**
 * Clase que representa una carta de una baraja.
 * 
 * @author Joaquín Ruiz Morín
 *
 */

public class Card {

	private String suit;
	private String value;

	public Card() {
		super();
	}

	public Card(String suit, String value) {
		this();
		this.suit = suit;
		this.value = value;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value + " de " + suit;
	}

}
