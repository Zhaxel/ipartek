/**
 * 
 */
package com.ipartek.excepciones;

/**
 * 
 * Realizar una clase personalizada llamada ExcepcionListaNegra que extienda la
 * clase Exception Dicha clase constara con un atributo de tipo int llamado
 * codigoError, asi como un constructor completo solamente (sin métodos get ni
 * set ni constructores vacíos). De manera adicional se implementaran los
 * métodos abstractos heredados de la clase, en este caso getMessage().
 * getMessage comprobara el valor del atributo codigoError con una sentencia
 * switch, mostrando el mensaje adecuado al código de error, siguiendo la
 * siguiente tabla:
 * <ul>
 * <li>1. Persona demasiado baja (altura menor de 1.60m)</li>
 * <li>2. Persona demasiado alta (altura mayor de 2.10m)</li>
 * <li>3. Persona en exceso delgada (peso inferior a 35kg)</li>
 * <li>4. Persona en exceso obesa (peso superior a 160kg)</li>
 * <li>5. Persona con los pies planos</li>
 * </ul>
 * En el programa principal, se creara una lista de Pacientes y se solicitara
 * los datos de cada uno de ellos por teclado. Introducir 4 pacientes dentro de
 * los parámetros de salud aceptables e intentar meter 2 de ellos con datos que
 * no permitan las excepciones (por ejemplo peso =225kg y altura = 1.20m)
 * 
 * @author Joaquín Ruiz Morín
 *
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
