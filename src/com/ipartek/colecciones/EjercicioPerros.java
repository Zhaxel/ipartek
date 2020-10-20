package com.ipartek.colecciones;

import java.util.ArrayList;

import com.ipartek.pojo.Perro;

public class EjercicioPerros {

	static final String[] DOGS_NAMES = { "Laika", "Hachiko", "Balto", "Rin tin tin", "Stubby", "Pancho",
			"Greyfiars Bobby", "Smoky", };

	public static void main(String[] args) {
		ArrayList<Perro> list = new ArrayList<Perro>();
		int count = 1;
		Perro dog = new Perro();

		for (int i = 0; i < DOGS_NAMES.length; i++) {

			dog.setName(DOGS_NAMES[i]);
			list.add(dog);

		}

		for (Perro perro : list) {
			System.out.println("Información Perro nº " + count + ": \n" + perro.getName() + "\t" + perro.getRace()
					+ "\t" + perro.getWeight() + "Kg");
			count++;
		}
	}

}
