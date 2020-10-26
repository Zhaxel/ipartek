package com.ipartek.pojo;

public class Persona {

	final int MINIMUM_AGE = 1;
	final int MAXIMUM_AGE = 120;

	protected String name;
	protected int age;

	public Persona() {
		super();
		this.name = "Desconocido";
		this.age = 1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		if (age < MINIMUM_AGE || age > MAXIMUM_AGE) {
			this.age = age;
			throw new Exception("Edad fuera del rango permitido.");
		} else {
			this.age = age;
		}

	}

}
