package com.ipartek.repetitivas;

/**
 * Realizar un ejercicio que nos muestre la tabla de multiplicar del 6
 * 
 * @author Joaqu�n Ruiz Mor�n
 */
public class Ejercicio1 {

	static final int NUMBER = 6;

	public static void main(String[] args) {
		System.out.println("TABLA DE MULTIPLICAR DEL N�MERO " + NUMBER);
		for (int i = 0; i < 11; i++) {
			System.out.println(NUMBER + " x " + i + " = " + (NUMBER * (i + 1)));
		}

	}

}
