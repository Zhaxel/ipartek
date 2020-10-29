/**
 * 
 */
package mf0227.uf2404.actividad2;

/**
 * @author Joaquín Ruiz Morín
 *
 */
public class Vehiculo implements IConducible {

	protected String color;
	protected String matricula;

	public Vehiculo() {
		super();
		this.color = "blanco";
		this.matricula = "XX-YYYY-ZZ";

	}

	public Vehiculo(String color, String matricula) {
		this();
		this.color = color;
		this.matricula = matricula;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Vehiculo [color=" + color + ", matricula=" + matricula + "]";
	}

	@Override
	public void arrancar() {
		System.out.println("El vehículo ha arrancado.");

	}

	@Override
	public void parar() {
		System.out.println("El vehículo se ha detenido.");

	}

}
