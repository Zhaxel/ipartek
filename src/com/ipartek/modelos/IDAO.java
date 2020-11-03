/**
 * 
 */
package com.ipartek.modelos;

import java.util.ArrayList;

import com.ipartek.pojo.Perro;

/**
 * @author Joaquín Ruiz Morín
 *
 */
public interface IDAO<P> {

	/**
	 * Retorna un {@code ArrayList} con todos los perros de la "base de datos". Si
	 * no existe ninguno devuelve un {@code ArrayList} vacío
	 */
	ArrayList<P> getList();

	/**
	 * Crea un {@code Perro} asignándole una id
	 * 
	 * @param p Perro con los datos a guardar
	 * @throws Exception si el name del perro ya existe
	 * @return Perro con ID actualizado
	 */
	Perro create(P p) throws Exception;

	/**
	 * Recupera el detalle de un {@code Perro}
	 * 
	 * @param id identificador
	 * @return {@code Perro} con sus datos o null de no encontrarlo
	 */
	Perro get(int id);

	/**
	 * Modifica un perro
	 * 
	 * @param p Perro con los nuevos datos
	 * @return {@code Perro} modificado
	 * @throws Exception si el Perro no es encontrado o el name ya existe.
	 */
	Perro update(P p) throws Exception;

	/**
	 * Elimina el {@code Perro} segun identificador
	 * 
	 * @param id identificador
	 * @throws Exception TODO hasta que veamos la BBDD
	 * @return true si elimina, false sino eliminada nada.
	 */

	boolean delete(int id) throws Exception;
}
