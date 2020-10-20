package com.ipartek.pojo;

public class Perro {

	private String name;
	private String race;
	private String story;
	private float weight;
	private boolean isVaccinated;

	// Constructor por defecto.
	public Perro() {
		super();
		this.name = "Desconocido";
		this.race = "Mestizo";
		this.story = "Sin historia";
		this.weight = 0.0f;
		this.isVaccinated = false;
	}

	// Constructor sobrecargado
	public Perro(String name) {
		this(); // Llama al constructor por defecto
		this.name = name;
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

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
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

	@Override
	public String toString() {
		return "Perro [name=" + name + ", race=" + race + ", story=" + story + ", weight=" + weight + ", isVaccinated="
				+ isVaccinated + "]";
	}

}
