package com.ipartek.tools;

import java.util.Scanner;

import com.ipartek.pojo.IFunciones;
import com.ipartek.pojo.Serie;

public class Utilidades implements IFunciones {

	static public String calcularDNI(String DNI) throws Exception {
		String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";

		int resto = Integer.parseInt(DNI) % 23;
		return DNI + caracteres.charAt(resto);
	}

	@Override
	public String askName() throws Exception {
		String resul = "";

		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu name:");
		resul = sc.nextLine();
		sc.close();

		if (resul.length() <= 1) {
			throw new Exception("El name es muy corto");
		}

		for (int i = 0; i < resul.length(); i++) {
			char letra = resul.charAt(i);
			boolean isNumber = Character.isDigit(letra);
			if (isNumber) {
				throw new Exception("El name no puede contener numeros");
			}
		}

		return resul;
	}

	@Override
	public void printLottery(int lotteryType) throws Exception {

		switch (lotteryType) {
		case LOTTERY_BONOLOTO:
			System.out.println("01 04 05 16 23 43 15 00");
			break;
		case LOTTERY_EUROMILLON:
			System.out.println("6 - 15 - 37 - 42 Estrellas: 3 - 4");
			break;
		case LOTTERY_QUINIELA:
			System.out.println("2 - 2 - X - 1 - 1 - 2 - 1 - X - 1 - 1 - 2 - 2 Pleno al 15: X");
			break;

		default:
			throw new Exception("No existe ese tipo de loteria");
		}

	}

	@Override
	public float calcDevolution(float dineroEntregado, float precioProducto) throws Exception {
		if (dineroEntregado < precioProducto) {
			throw new Exception("Dinero insuficiente");
		}
		return dineroEntregado - precioProducto;
	}

	@Override
	public Serie pedirDatosPorConsola() {
		Serie serie = new Serie("");
		Scanner sc = new Scanner(System.in);

		System.out.println("Nombre:");
		serie.setName((sc.nextLine()));

		System.out.println("Duración en minutos:");
		serie.setDuration(Integer.parseInt(sc.nextLine()));

		System.out.println("Número de temporadas:");
		serie.setSeasons(Integer.parseInt(sc.nextLine()));

		System.out.println("Plataforma en la que esta disponble:");
		serie.setPlataform(sc.nextLine());

		sc.close();
		return serie;
	}

}
