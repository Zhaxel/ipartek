/**
 * 
 */
package com.ipartek.apps.cartas;

import java.util.ArrayList;
import java.util.Collections;

import com.ipartek.pojo.Card;

/**
 * 
 * 
 * Crear baraja de naipes españoles<br>
 * <br>
 * 
 * Ordenar por palo y mostrar<br>
 * <br>
 * 
 * Ordenar por numero y mostrar<br>
 * <br>
 * 
 * Barajar y mostrar<br>
 * <br>
 * 
 * Repetir con baraja francesa
 * 
 * @author Joaquín Ruiz Morín
 *
 */
public class Ejercicio {

	static public final String[] SPANISH_SUITES = { "Copas", "Bastos", "Espadas", "Oros" };
	static public final String[] SPANISH_FIGURES = { "As", "Sota", "Caballo", "Rey" };
	static public final String[] FRENCH_SUITES = { "Picas", "Diamantes", "Tréboles", "Corazones" };
	static public final String[] FRENCH_FIGURES = { "As", "Caballero", "Dama", "Rey" };
	static public final int MAXIMUM_SPANISH_NUMBER = 10;
	static public final int MAXIMUM_FRENCH_NUMBER = 13;

	static private ArrayList<Card> spanishDeck = new ArrayList<Card>();
	static private ArrayList<Card> frenchDeck = new ArrayList<Card>();

	public static void main(String[] args) {

		System.out.println("******** BARAJA DE NAIPES ESPAÑOLA ********");
		createAndShowSpanishDeck();
		System.out.println("******** BARAJA DE NAIPES FRANCESA ********");
		createAndShowFrenchDeck();

	}

	private static void createAndShowFrenchDeck() {

		for (int i = 0; i < FRENCH_SUITES.length; i++) {
			for (int j = 0; j < MAXIMUM_FRENCH_NUMBER; j++) {

				frenchDeck.add(new Card(FRENCH_SUITES[i], parseFrenchCard(String.valueOf((j + 1)))));

			}
		}

		Collections.shuffle(frenchDeck); // Barajamos

		for (Card c : frenchDeck) {
			System.out.println(c.toString());
		}

	}

	private static void createAndShowSpanishDeck() {

		for (int i = 0; i < SPANISH_SUITES.length; i++) {
			for (int j = 0; j < MAXIMUM_SPANISH_NUMBER; j++) {

				spanishDeck.add(new Card(SPANISH_SUITES[i], parseSpanishCard(String.valueOf((j + 1)))));

			}
		}

		Collections.shuffle(spanishDeck); // Barajamos

		for (Card c : spanishDeck) {
			System.out.println(c.toString());
		}

	}

	private static String parseSpanishCard(String value) {

		switch (value) {
		case "1":
			return SPANISH_FIGURES[0];
		case "8":
			return SPANISH_FIGURES[1];
		case "9":
			return SPANISH_FIGURES[2];
		case "10":
			return SPANISH_FIGURES[3];
		default:
			return value;
		}

	}

	private static String parseFrenchCard(String value) {

		switch (value) {
		case "1":
			return FRENCH_FIGURES[0];
		case "11":
			return FRENCH_FIGURES[1];
		case "12":
			return FRENCH_FIGURES[2];
		case "13":
			return FRENCH_FIGURES[3];
		default:
			return value;
		}

	}

}
