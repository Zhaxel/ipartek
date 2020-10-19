package com.ipartek.pojo;

public class Perro {

	private String name;
	private String race;
	private float weight;
	private boolean isVaccinated;

	public Perro() {
		super();
		this.name = "Desconocido";
		this.race = "Mestizo";
		this.weight = 0.0f;
		this.isVaccinated = false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		if (weight < 0) {
			this.weight = 0;
		} else {
			this.weight = weight;
		}

	}

	public boolean isVaccinated() {
		return isVaccinated;
	}

	public void setVaccinated(boolean isVaccinated) {
		this.isVaccinated = isVaccinated;
	}

}
