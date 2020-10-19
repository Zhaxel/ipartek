package com.ipartek.condicionales;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Pedir por teclado al usuario que introduzca una distancia en cm.<br>
 * Una vez introducida, se solicitará que escoja a que unidad se van a
 * convertir, introduciendo la opción por teclado
 * <ul>
 * <li>A convertir a metros</li>
 * <li>B: convertir a pulgadas</li>
 * <li>C: convertir a pies</li>
 * <li>D:convertir a yardas</li>
 * </ul>
 * 
 * @author Alienator
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		float cm;
		Scanner sc = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("###.##");

		System.out.println("Introduce una distancia en centímetros");
		cm = sc.nextFloat();

		System.out.println("Tus " + formatter.format(cm) + " cm son:\n" + (cm / 100) + "\t\tmetros\n" + (cm / 2.54f)
				+ "\tpulgadas\n" + (cm / 30.48f) + "\t\tpies\n" + (cm / 91.44f) + "\tyardas");

		sc.close();
	}

}
