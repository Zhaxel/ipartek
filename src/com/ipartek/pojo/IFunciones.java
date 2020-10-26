/**
 * 
 */
package com.ipartek.pojo;

/**
 * 
 * Una interfaz () es sint�cticamente similar a una clase abstracta, en la que
 * puede especificar uno o m�s m�todos que no tienen cuerpo ({}).Esos m�todos
 * deben ser implementados por una clase para que se definan sus acciones.<br>
 * 
 * Por lo tanto, una interfaz especifica qu� se debe hacer, pero no c�mo
 * hacerlo. Una vez que se define una interfaz, cualquier cantidad de clases
 * puede implementarla. Adem�s, una clase puede implementar cualquier cantidad
 * de interfaces.<br>
 * 
 * Para implementar una interfaz, una clase debe proporcionar cuerpos
 * (implementaciones) para los m�todos descritos por la interfaz. Cada clase es
 * libre de determinar los detalles de su propia implementaci�n. Dos clases
 * pueden implementar la misma interfaz de diferentes maneras, pero cada clase
 * a�n admite el mismo conjunto de m�todos. Por lo tanto, el c�digo que tiene
 * conocimiento de la interfaz puede usar objetos de cualquier clase, ya que la
 * interfaz con esos objetos es la misma.
 * 
 * @author Joaqu�n Ruiz Mor�n
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
