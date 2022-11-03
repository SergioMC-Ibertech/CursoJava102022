package Ejercicio2;

import java.util.List;

public class Alumno2 {

	private String nombre;
	private String apellido;
	private String dni;
	List<String> asignaturas;
	
	public Alumno2(String nombre, String apellido, String dni, List<String> asignaturas) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.asignaturas = asignaturas;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public List<String> getAsignaturas() {
		return asignaturas;
	}
	
	public void setAsignaturas(List<String> asignaturas) {
		this.asignaturas = asignaturas;
	}
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", asignaturas=" + asignaturas
				+ "]";
	}
		
}
