package com.ipartek.colecciones;

import java.util.ArrayList;

public class EjercicioPaises {

	public static void main(String[] args) {

		// Son din�micos
		ArrayList<String> paises = new ArrayList<String>();
		paises.add("Brasil");
		paises.add("Espa�a");
		paises.add("Andorra");
		paises.add("Barakaldo");
		paises.add("Repelega");
		paises.add("Guinea Bisau");

		paises.remove(1);
		paises.remove("Guinea Bisau");

		String s = paises.get(0);

	}

}
