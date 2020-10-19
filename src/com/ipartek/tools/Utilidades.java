package com.ipartek.tools;

public class Utilidades {

	static public String calcularDNI(String DNI) throws Exception {
		String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";

		int resto = Integer.parseInt(DNI) % 23;
		return DNI + caracteres.charAt(resto);
	}

}
