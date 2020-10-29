/**
 * 
 */
package mf0227.uf2404.actividad2;

/**
 * 
 * Clase Coche
 * 
 * @author Joaquín Ruiz Morín
 *
 */
public class Coche extends Vehiculo {

	private String marca;
	private String modelo;
	private double potencia;
	private int cilindrada;

	public Coche() {
		super();

	}

	public Coche(String color, String matricula) {
		super(color, matricula);

	}

	public Coche(String color, String matricula, String marca, String modelo, double potencia, int cilindrada) {
		super();
		this.color = color;
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
		this.cilindrada = cilindrada;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public void arrancar() {
		System.out.println("El coche ha arrancado");
	}

	@Override
	public void parar() {
		System.out.println("El coche se ha detenido");
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia + ", cilindrada=" + cilindrada
				+ ", color=" + color + ", matricula=" + matricula + "]";
	}

}
