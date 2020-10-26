package com.ipartek.pojo;

public class SoccerPlayer extends Persona {

	private int dorsal;

	public SoccerPlayer() {
		super();

	}

	public SoccerPlayer(String name, int dorsal) {
		super();
		this.name = name;
		this.dorsal = dorsal;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	@Override
	public String toString() {
		return "SoccerPlayer [dorsal=" + dorsal + ", name=" + name + ", age=" + age + "]";
	}

}
