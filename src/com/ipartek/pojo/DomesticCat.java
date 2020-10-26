/**
 * 
 */
package com.ipartek.pojo;

/**
 * @author Joaquín Ruiz Morín
 *
 */
public class DomesticCat extends Cat {

	private boolean vaccinated;
	private boolean castrated;

	public DomesticCat(String name) {
		super(name);
		this.castrated = false;
		this.vaccinated = true;
	}

	public boolean isVaccinated() {
		return vaccinated;
	}

	public void setVaccinated(boolean vaccinated) {
		this.vaccinated = vaccinated;
	}

	public boolean isCastrated() {
		return castrated;
	}

	public void setCastrated(boolean castrated) {
		this.castrated = castrated;
	}

	@Override
	public String toString() {
		return "DomesticCat [vaccinated=" + vaccinated + ", castrated=" + castrated + ", name=" + name + ", legs="
				+ legs + "]";
	}

}
