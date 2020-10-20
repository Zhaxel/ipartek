package com.ipartek.colecciones;

import java.util.ArrayList;

public class EjercicioPaises {

	public static void main(String[] args) {

		// Son dinámicos
		ArrayList<String> paises = new ArrayList<String>();
		paises.add("Brasil");
		paises.add("España");
		paises.add("Andorra");
		paises.add("Barakaldo");
		paises.add("Repelega");
		paises.add("Guinea Bisau");

		paises.remove(1);
		paises.remove("Guinea Bisau");

		String s = paises.get(0);

	}

}
