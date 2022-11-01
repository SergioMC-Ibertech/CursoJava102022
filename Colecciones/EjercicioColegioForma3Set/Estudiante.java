package EjercicioColegioForma3Set;

import java.util.Set;

public class Estudiante extends Persona{

	Set<Asignatura> asignaturas;

	public Estudiante(String nombre, String apellidos, String dni, Set<Asignatura> asignaturas) {
		super(nombre, apellidos, dni);
		this.asignaturas = asignaturas;
	}

	public Set<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(Set<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}

	@Override
	public String toString() {
		return "El estudiante "+getNombre()+" "+getApellidos()+" con dni "+getDni();
	}
	
}
