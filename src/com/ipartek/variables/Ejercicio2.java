package com.ipartek.variables;

import java.text.DecimalFormat;

/**
 * Realizar una pequeña calculadora. Para ello se crearan 10 variables de
 * distintos tipos numéricos. Una vez creadas dichas variables y asignadas desde
 * código valores (se recomienda valores entre -10 y 10) realizar las siguientes
 * operaciones:
 * <ul>
 * <li>La suma de todos los números</li>
 * <li>La resta de todos los números</li>
 * <li>La media de todos los números</li>
 * </ul>
 * 
 * @author Joaquín Ruiz Morín
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {

		int a, b, c, d, e, f, g, h, i, j, suma, resta;
		int array[] = { 10, 5, 1, 2, 9, -10, -5, -1, -2, -9 };
		double media = 0.0;
		a = 10;
		b = 5;
		c = 1;
		d = 2;
		e = 9;
		f = -10;
		g = -5;
		h = -1;
		i = -2;
		j = -9;
		suma = a + b + c + d + e + f + g + h + i + j;
		resta = a - b - c - d - e - f - g - h - i - j;

		for (int k = 0; k < array.length; k++) {
			media = media + array[k];
		}
		media = media / array.length;

		System.out.println("La suma total es: " + suma);
		System.out.println("La resta total es: " + resta);
		System.out.println("La media es: " + media);

		int temperaturaSemana[] = { 10, 16, 19, 20, 23, 21, 20 };
		String diasSemana[] = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };
		float mediaSemana = 0;

		for (int k = 0; k < temperaturaSemana.length; k++) {

			System.out.println(diasSemana[k] + " hace " + temperaturaSemana[k] + " grados");
			mediaSemana += temperaturaSemana[k]; // mediaSemana = mediaSemana + mediaSemana se abrevia +=

		} // end-for
			// FIXME marca para indicar arreglos necesarios.

		DecimalFormat formatter = new DecimalFormat("###.##");
		String value = formatter.format((mediaSemana / temperaturaSemana.length));
		System.out.println("Media de la semana es: " + value);

	}

}
