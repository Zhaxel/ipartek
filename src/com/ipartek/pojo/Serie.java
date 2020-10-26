/**
 * 
 */
package com.ipartek.pojo;

/**
 * Clase que especifica las caracter�sticas de un objeto serie. El name es
 * obligatorio, mientras que el n� de temporadas y la duraci�n de los cap�tulos
 * vendr� por defecto a 0. La platform ser� por defecto internet.
 * 
 * @author Joaqu�n Ruiz Mor�n
 *
 */

public class Serie {

	private String name;
	private int seasons;
	private int duration;
	private String platform;

	/**
	 * Constructor por defecto con atributo obligatorio
	 * 
	 * @param name
	 */
	public Serie(String name) {
		super(); // Constructor padre que es java.lang.Object
		this.name = name;
		this.seasons = 0;
		this.duration = 0;
		this.platform = "internet";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSeasons() {
		return seasons;
	}

	public void setSeasons(int seasons) {
		this.seasons = seasons;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getPlataform() {
		return platform;
	}

	public void setPlataform(String plataform) {
		this.platform = plataform;
	}

	@Override
	public String toString() {
		return "Serie [name=" + name + ", seasons=" + seasons + ", duration=" + duration + ", platform=" + platform
				+ "]";
	}

}
