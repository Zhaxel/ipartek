/**
 * 
 */
package com.ipartek.pojo;

/**
 * 
 * 
 * @author Joaqu�n Ruiz Mor�n
 *
 */
public class Student extends Persona {

	public Student() {
		super();

	}

	public Student(String name) {
		this();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [MINIMUM_AGE=" + MINIMUM_AGE + ", MAXIMUM_AGE=" + MAXIMUM_AGE + "]";
	}

}
