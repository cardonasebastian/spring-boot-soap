package com.ipartek.formacion.soap.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Alumno {

	/**
	 * 
	 */
	private String nif;
	/**
	 * 
	 */
	private String nombre;
	/**
	 * 
	 */
	private String apellidos;
	/**
	 * 
	 */
	private String email;

	@Override
	public String toString() {
		return "Alumno [nif=" + nif + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + "]";
	}
}
