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
	private int value;

	public Card() {
		super();
	}

	public Card(String suit, int value) {
		super();
		this.suit = suit;
		this.value = value;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value + " de " + suit;
	}

}
