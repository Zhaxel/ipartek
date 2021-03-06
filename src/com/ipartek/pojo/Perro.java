package com.ipartek.pojo;

public class Perro extends Mammal {

	private int id; // TODO actualizar constructor, getter y setter
	private String race;
	private String story;
	private float weight;
	private boolean isVaccinated;

	// Constructor por defecto.
	public Perro() {
		super();
		this.id = 0;
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

	public Perro(int id, String name) {
		this(); // Llama al constructor por defecto
		this.id = id;
		this.name = name;
	}

	// GETTERS & SETTERS

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	// OTHER METHODS

	@Override
	public String toString() {
		return "[" + name + "]\n>ID: " + id + "\n> Raza:\t\t" + race + "\n> Peso:\t\t" + weight + "Kg\n> Vacunado:\t"
				+ isVaccinated + "\n> Historia:\t" + story;

	}

}
