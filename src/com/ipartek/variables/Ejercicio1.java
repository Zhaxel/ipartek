package com.ipartek.variables;

/**
 * Realizar un programa que cree una variable de cada uno de los tipos de datos
 * simples que podemos encontrar en el lenguaje de programaci�n Java,
 * asign�ndoles un valor Una vez creadas, se mostraran por pantalla los valores
 * de cada una de ellas De manera adicional, se buscara por internet o otras
 * fuentes, los valores m�ximos y m�nimos que pueden albergar
 * 
 * @author Joaqu�n Ruiz Mor�n
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		System.out.println("DATOS DE TIPO PRIMITIVOS");
		System.out.println("-------------------------");

		// tipos de numeros enteros
		byte numeroByte = 1;
		short numeroCorto = 3;
		int numeroEntero = 2;
		long numeroDoble = 6;

		System.out.println("(byte) numeroByte = " + numeroByte);
		System.out.println("(short) numeroCorto = " + numeroCorto);
		System.out.println("(int) numeroEntero = " + numeroEntero);
		System.out.println("(long) numeroDoble = " + numeroDoble);

		// wrappers => son clases que envuelven a las variables primitivas con ciertas
		// utilidades
		// int => Integer
		// float => Float
		// char => Character
		// boolean => Boolean

		System.out.println("-------- int ----------------------");
		System.out.println("Valor maximo = " + Integer.MAX_VALUE);
		System.out.println("Valor minimo = " + Integer.MIN_VALUE);

		System.out.println("1 int = " + Integer.SIZE + " bits");
		System.out.println("1 short = " + Short.SIZE + " bits");
		System.out.println("1 byte = " + Byte.SIZE + " bits");
		System.out.println("1 long = " + Long.SIZE + " bits");

	}

}
