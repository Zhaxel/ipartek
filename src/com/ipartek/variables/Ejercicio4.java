package com.ipartek.variables;

/**
 * Realizar un programa que realice la siguiente operaci�n: crear tres variables
 * de tipo Byte, llamadas num1, num2, resultado. Asignar los valores 255 y 223.
 * Sumarlas y guardarlo en resultado.<br>
 * <br>
 * Comprueba si el resultado da 478. Si no lo da, buscar una soluci�n al
 * problema para solucionarlo
 * 
 * @author Joaqu�n Ruiz Mor�n
 *
 */
public class Ejercicio4 {

	public static void main(String[] args) {

		byte num1 = (byte) 255;
		byte num2 = (byte) 233;
		byte resultado = (byte) (num1 + num2);

		if (resultado == (byte) 478) {
			System.out.println("Resultado correcto.");
		} else {
			System.out.println("El resultado incorrecto. A�ada " + (byte) (478 - resultado) + " para arreglarlo.");
		}

	}

}
