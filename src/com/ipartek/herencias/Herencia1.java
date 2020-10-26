/**
 * 
 */
package com.ipartek.herencias;

import java.util.Scanner;

import com.ipartek.pojo.FlatTelevision;

/**
 * 
 * Realizar las siguientes jerarquías de herencia: tendremos una clase padre que
 * se llamara Electrodoméstico. Dicha clase contara con los atributos nombre y
 * precio. Se realizaran todos los constructores, métodos get y set necesarios.
 * <br>
 * <br>
 * Una vez creada dicha clase, se creara una serie de clases hijas. La primera
 * será la clase televisor. Dicha clase contara con el atributo pulgadas, así
 * como con todos los constructores y métodos necesarios para rellenar sus
 * atributos, incluidos los del padre.<br>
 * <br>
 * También se creara una clase televisionPlana, que heredara de televisión,
 * tendrá el atributo string tipo de pantalla ( tft, plasma,..) y constructores,
 * métodos get y set para rellenar los datos de los objetos que se creen,
 * incluyendo todos los atributos de los objetos de las clases padres de las que
 * heredan.<br>
 * <br>
 * Una vez creado esta jerarquía de herencia, realizar un programa que nos pida
 * insertar televisiones planas dentro de un array de electrodomésticos. Dicho
 * array constara de 5 electodomesticos, pero lo rellenaremos con objetos de
 * tipo televisiónPlana.
 * 
 * @author Joaquín Ruiz Morín
 *
 */
public class Herencia1 {

	// String name, double price, double inch, String screenType
	static FlatTelevision[] flatTelevisionList = new FlatTelevision[5];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		FlatTelevision ft;

		for (int i = 0; i < flatTelevisionList.length; i++) {
			ft = new FlatTelevision();

			System.out.println("Introduzca el nombre de la televisión nº" + (i + 1));
			ft.setName(sc.nextLine());

			System.out.println("Introduzca el tipo de pantalla (tft, plasma..):");
			ft.setScreenType(sc.nextLine());

			try {
				System.out.println("Introduzca el precio de la televisión:");
				ft.setPrice(Double.parseDouble(sc.nextLine()));

				System.out.println("Introduzca el tamaño de la pantalla en pulgadas:");
				ft.setInch(Double.parseDouble(sc.nextLine()));
			} catch (NumberFormatException e) {
				System.err.println(
						"Valor introducido no válido. Se impodrán los valores por defecto al precio y el tamaño de pantalla.");
			} catch (Exception e) {
				System.err.println(
						"Ha ocurrido algo inesperado. Se impodrán los valores por defecto al precio y el tamaño de pantalla");
			} // end-try-catch

			flatTelevisionList[i] = ft;

		} // end-for

		sc.close();

	}// end-main

}
