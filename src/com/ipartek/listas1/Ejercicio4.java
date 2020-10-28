/**
 * 
 */
package com.ipartek.listas1;

import java.util.ArrayList;
import java.util.Collections;

import com.ipartek.pojo.Card;

/**
 * 
 * Crear una lista que contenga las cuarenta cartas de una baraja. Para crear
 * dicha lista se creara una clase de tipo carta, que tendrá un número entero
 * para el valor de la carta, así como un string con el palo de la baraja
 * (copas, espadas, oros, bastos).<br>
 * <br>
 * Crear la baraja con las cartas ordenadas por palos, y luego por números.
 * Barajar dicha baraja y mostrar las cartas.
 * 
 * @author Joaquín Ruiz Morín
 *
 */
public class Ejercicio4 {

	static private final String[] SUITES_OF_DECKS = { "Copas", "Bastos", "Espadas", "Oros" };
	static private final int MAXIMUM_VALUE_CARD = 12;

	static private ArrayList<Card> deck = new ArrayList<Card>();

	public static void main(String[] args) {

		for (int i = 0; i < SUITES_OF_DECKS.length; i++) {
			for (int j = 0; j < MAXIMUM_VALUE_CARD; j++) {

				// deck.add(new Card(SUITES_OF_DECKS[i], (j + 1)));

			} // end-j-for
		} // end-i-for

		Collections.shuffle(deck); // Barajamos

		for (Card c : deck) {
			System.out.println(c.toString());
		} // end-for-each
	}// end-main
}// end-class
