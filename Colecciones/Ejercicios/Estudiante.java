package Ejercicios;

public class Estudiante extends Persona{

	Asignatura asignatura;
	Asignatura asignatura2;

	public Estudiante(String nombre, String apellidos, long dni, Asignatura asignatura,Asignatura asignatura2) {
		super(nombre, apellidos, dni);
		this.asignatura = asignatura;
		this.asignatura2 = asignatura2;
	}
	
	public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	public Asignatura getAsignatura2() {
		return asignatura2;
	}

	public void setAsignatura2(Asignatura asignatura2) {
		this.asignatura2 = asignatura2;
	}

	@Override
	public String toString() {
		return "El estudiante "+getNombre()+" "+getApellidos()+" con dni "+getDni();
	}
	
}
