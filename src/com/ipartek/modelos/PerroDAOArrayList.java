package com.ipartek.modelos;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.Perro;

public class PerroDAOArrayList implements PerroDAO {

	final private boolean VACCINATED = true;

	private ArrayList<Perro> list = new ArrayList<Perro>();
	private String[] DOGS_NAMES = { "Laika", "Hachiko", "Balto", "Rin tin tin", "Stubby", "Pancho", "Greyfiars Bobby",
			"Smoky" };

	private Scanner sc = new Scanner(System.in);
	private Perro dog = new Perro();
	private String answer = "";
	private boolean located = false; // Variable para comprobar si se ha localizado el perro

	@Override
	public ArrayList<Perro> getDogsList() {
		if (list != null && list.isEmpty()) {

			for (int i = 0; i < DOGS_NAMES.length; i++) {

				list.add(new Perro(DOGS_NAMES[i]));
			}
		}
		return list;
	}

	@Override
	public Perro createDog(Perro p) throws Exception {

		list.add(p);

		return p;
	}

	@Override
	public Perro getDog(int id) {
		for (Perro perro : this.getDogsList()) {
			if (perro.getId() == id) {
				System.out.println("El perro " + perro.getName() + " ya está registrado en el sistema.");
				return perro;
			}
		}
		return null;
	}

	@Override
	public Perro updateDog(Perro p) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteDog(int id) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
