/**
 * 
 */
package com.ipartek.listas1;

import java.util.ArrayList;

import com.ipartek.pojo.Student;

/**
 * 
 * Crear una lista de nombres de alumnos, donde se guardaran con strings.<br>
 * Insertar diez nombres de alumnos en la lista Mostrar los diez nombres
 * recorriendo la lista con un foreach
 * 
 * @author Joaquín Ruiz Morín
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		ArrayList<Student> studentsList = new ArrayList<Student>();

		for (int i = 0; i < 10; i++) {
			studentsList.add(new Student("Alumno " + i));
		}

		for (Student student : studentsList) {
			System.out.println(student.getName());
		}

		// System.out.println(s.getName());

	}

}
