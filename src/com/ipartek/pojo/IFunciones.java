/**
 * 
 */
package com.ipartek.pojo;

/**
 * 
 * Una interfaz () es sintácticamente similar a una clase abstracta, en la que
 * puede especificar uno o más métodos que no tienen cuerpo ({}).Esos métodos
 * deben ser implementados por una clase para que se definan sus acciones.<br>
 * 
 * Por lo tanto, una interfaz especifica qué se debe hacer, pero no cómo
 * hacerlo. Una vez que se define una interfaz, cualquier cantidad de clases
 * puede implementarla. Además, una clase puede implementar cualquier cantidad
 * de interfaces.<br>
 * 
 * Para implementar una interfaz, una clase debe proporcionar cuerpos
 * (implementaciones) para los métodos descritos por la interfaz. Cada clase es
 * libre de determinar los detalles de su propia implementación. Dos clases
 * pueden implementar la misma interfaz de diferentes maneras, pero cada clase
 * aún admite el mismo conjunto de métodos. Por lo tanto, el código que tiene
 * conocimiento de la interfaz puede usar objetos de cualquier clase, ya que la
 * interfaz con esos objetos es la misma.
 * 
 * @author Joaquín Ruiz Morín
 *
 */
public interface IFunciones {

	final int LOTTERY_EUROMILLON = 1;
	final int LOTTERY_QUINIELA = 2;
	final int LOTTERY_BONOLOTO = 3;

	/**
	 * pedir name por Scanner
	 * 
	 * @throws si el name es menor de una letra o contiene numeros
	 * @return name escrito
	 */
	String askName() throws Exception;

	/**
	 * imprime los numeros de la Loteria<br>
	 * 
	 * @param lotteryType int Mirar las constantes que tenemos definidas:
	 * 
	 *                    <pre>
	 *                    final int LOTTERY_EUROMILLON = 1;
	 *                    final int LOTTERY_QUINIELA = 2;
	 *                    final int LOTTERY_BONOLOTO = 3;
	 *                    </pre>
	 * 
	 * @throws si el tipoLoteria no existe
	 */
	void printLottery(int lotteryType) throws Exception;

	/**
	 * calcula las vueltas
	 * 
	 * @param delivered    float
	 * @param productPrice float
	 * @return float son las vueltas
	 * @throws Exception si precioProducto > dineroEntregado
	 */
	float calcDevolution(float delivered, float productPrice) throws Exception;

	/**
	 * Pedimos todos los datos de una serie por consola
	 * 
	 * @return Serie
	 */
	Serie pedirDatosPorConsola();

}
