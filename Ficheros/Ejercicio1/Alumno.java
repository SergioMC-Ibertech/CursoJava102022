package Ejercicio1;

import java.util.Set;

public class Alumno {
	
	private String nombre;
	private String apellido;
	private String dni;
	private Set<String> asignatura;
	
	public Alumno(String nombre, String apellido, String dni, Set<String> asignatura) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.asignatura = asignatura;
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
	
	public Set<String> getAsignatura() {
		return asignatura;
	}
	
	public void setAsignatura(Set<String> asignatura) {
		this.asignatura = asignatura;
	}
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + "]";
	}

}
