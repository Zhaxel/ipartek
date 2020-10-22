package com.ipartek.modelos;

import java.util.ArrayList;

import com.ipartek.pojo.Perro;

public class PerroDAOArrayList implements PerroDAO {

	private ArrayList<Perro> list = new ArrayList<Perro>();
	private String[] DOGS_NAMES = { "Laika", "Hachiko", "Balto", "Rin tin tin", "Stubby", "Pancho", "Greyfiars Bobby",
			"Smoky" };

	@Override
	public ArrayList<Perro> getDogsList() {
		if (list != null && list.isEmpty()) {

			for (int i = 0; i < DOGS_NAMES.length; i++) {
				list.add(new Perro(i, DOGS_NAMES[i]));
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
		for (Perro perro : this.getDogsList()) {
			if (perro.getId() == id) {
				list.remove(perro);
				return true;
			}
		}
		return false;
	}

}
