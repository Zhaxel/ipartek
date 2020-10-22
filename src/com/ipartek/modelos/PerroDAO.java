/**
 * 
 */
package com.ipartek.modelos;

import java.util.ArrayList;

import com.ipartek.pojo.Perro;

/**
 * 
 * DAO que define las operaciones relativas al Object Perro
 * 
 * @author Joaquín Ruiz Morín
 *
 */
public interface PerroDAO {

	/**
	 * Retorna un {@code ArrayList} con todos los perros de la "base de datos". Si
	 * no existe ninguno devuelve un {@code ArrayList} vacío
	 */
	ArrayList<Perro> getDogsList();

	/**
	 * Crea un {@code Perro} asignándole una id
	 * 
	 * @param p Perro con los datos a guardar
	 * @throws Exception si el nombre del perro ya existe
	 * @return Perro con ID actualizado
	 */
	Perro createDog(Perro p) throws Exception;

	/**
	 * Recupera el detalle de un {@code Perro}
	 * 
	 * @param id identificador
	 * @return {@code Perro} con sus datos o null de no encontrarlo
	 */
	Perro getDog(int id);

	/**
	 * Modifica un perro
	 * 
	 * @param p Perro con los nuevos datos
	 * @return {@code Perro} modificado
	 * @throws Exception si el Perro no es encontrado o el nombre ya existe.
	 */
	Perro updateDog(Perro p) throws Exception;

	/**
	 * Elimina el {@code Perro} segun identificador
	 * 
	 * @param id identificador
	 * @throws Exception TODO hasta que veamos la BBDD
	 * @return true si elimina, false sino eliminada nada.
	 */

	boolean deleteDog(int id) throws Exception;

}
