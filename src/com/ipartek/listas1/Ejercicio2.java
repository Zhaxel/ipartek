/**
 * 
 */
package com.ipartek.listas1;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.SoccerPlayer;

/**
 * 
 * Crear una lista de jugadores de futbol. En dicha lista se guardaran objetos
 * de la clase Jugador, que tendrá los atributos nombre, de tipo Sting y dorsal
 * de tipo int.<br>
 * <br>
 * Solicitar los datos de los jugadores por teclado, y una vez introducido el
 * primero, se insertara en la lista y se preguntara si se desea introducir otro
 * más, para lo cual el usuario escribirá S o N. En caso afirmativo se volverá a
 * pedir otro más, hasta que el usuario escriba N
 * 
 * @author Joaquín Ruiz Morín
 *
 */
public class Ejercicio2 {

	static private ArrayList<SoccerPlayer> soccerPlayerList = new ArrayList<SoccerPlayer>();
	static private boolean on = true;
	static private String answer;

	static protected String name;
	static protected int dorsal;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("********** PROGRAMA EJERCICIO 2 LISTAS **********");

		do {
			System.out.println("Introduzca el nombre del jugador");
			name = sc.nextLine();

			System.out.println("Introduzca el dorsal del jugador");
			dorsal = Integer.parseInt(sc.nextLine());

			soccerPlayerList.add(new SoccerPlayer(name, dorsal));

			do {
				System.out.println("¿Desea continuar añadiendo jugadores? (S o N) ");
				answer = sc.nextLine();

				if (answer.equalsIgnoreCase("S")) {
					System.out.println("Continuamos");
				} else if (answer.equalsIgnoreCase("N")) {
					System.out.println("Cerrando programa");
					on = false;
				} else {
					System.out.println("Respuesta introducida no válida");
				}
			} while (!answer.equalsIgnoreCase("S") || !answer.equalsIgnoreCase("N"));

		} while (on);

		sc.close();
	}

}
