package EjercicioColegioForma3Set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class Colegio {
	
	private List<Estudiante> estudiantes;

	public Colegio() {
		super();
		this.estudiantes= new CopyOnWriteArrayList<Estudiante>();
	}

	public static void main(String[] args) {

		/*
		 * Enunciado: Se desea hacer un listado de los nombres de un centro educativo. Pidiendo lo siguiente
		 * 				- Clase Estudiante con los atributos -> nombre, apellidos, dni, asignaturasFavoritas de tipo Set
		 * 				- Clase Asignatura con los atributos -> nombre y nota. 
		 * 				
		 * 
		 * 				- En el bloque main, se desea crear 5 estudiantes y meterlos en una coleccion.
		 * 					* Mostrando la informacion de todos los estudiantes(nombre, apellidos) en una linea y en otra linea
		 * 					sus asignaturas favoritas y sus notas.
		 * 					* Mostrando unicamente los nombre y apellidos de los alumnos que hayan cursado de la asignatura
		 * 					de "Matematicas".
		 * 					* Mostrando unicamente los nombre y apellidos de los alumnos que hayan aprobado el curso. Basandonos
		 * 					en el calculo de la media de todas las asignaturas, es decir, si saca mayor de 5 aprobado, sino
		 * 					suspendido.
		 * 					* Se desea eliminar todos los alumnos que hayan suspendido la asignatura de "lengua".
		 * 
		 * 				Una vez terminado y que funcione, subirlo a GitHub
		 * 					
		 */
			
		Colegio colegio = new Colegio();
		colegio.iniciarColegio();
		
	}
	
	// Metodos que ejecuta las funciones que contiene el colegio
	private void iniciarColegio() {
		crearEstudiantesAsignaturas();
		System.out.println();
		mostrarEstudiantes();
		System.out.println();
		mostrarEstudiantesMatematicas();
		System.out.println();
		balanceAlumnos();
		System.out.println();
		eliminarAlumnosSuspendidos();
		System.out.println();
		mostrarEstudiantes();
	}
	
	// metodo para crear las asignaturas y los estudiantes que las cursan
	private void crearEstudiantesAsignaturas() {
		
		// Asignaturas y alumno 1
		Asignatura asignatura1Alumno1 = new Asignatura("Lengua", nota());
		Asignatura asignatura2Alumno1 = new Asignatura("Matematicas", nota());
		Asignatura asignatura3Alumno1 = new Asignatura("Biologia", nota());
		Asignatura asignatura4Alumno1 = new Asignatura("Fisica", nota());
		
		Set<Asignatura> asignaturasAlumno1 = new HashSet<Asignatura>();
		asignaturasAlumno1.add(asignatura1Alumno1);
		asignaturasAlumno1.add(asignatura2Alumno1);
		asignaturasAlumno1.add(asignatura3Alumno1);
		asignaturasAlumno1.add(asignatura4Alumno1);
		
		Estudiante estudiante1 = new Estudiante("Guillermo", "Toretto", "125689A", asignaturasAlumno1);
		estudiantes.add(estudiante1);
		
		// Asignaturas y alumno 2
		Asignatura asignatura1Alumno2 = new Asignatura("Lengua", nota());
		Asignatura asignatura2Alumno2 = new Asignatura("Matematicas", nota());
		Asignatura asignatura3Alumno2 = new Asignatura("Biologia", nota());
		Asignatura asignatura4Alumno2 = new Asignatura("Fisica", nota());
		
		Set<Asignatura> asignaturasAlumno2 = new HashSet<Asignatura>();
		asignaturasAlumno2.add(asignatura1Alumno2);
		asignaturasAlumno2.add(asignatura2Alumno2);
		asignaturasAlumno2.add(asignatura3Alumno2);
		asignaturasAlumno2.add(asignatura4Alumno2);
		
		Estudiante estudiante2 = new Estudiante("Sergio", "Toretto", "984532M", asignaturasAlumno2);
		estudiantes.add(estudiante2);
		
		// Asignaturas y alumno 3
		Asignatura asignatura1Alumno3 = new Asignatura("Lengua", nota());
		Asignatura asignatura2Alumno3 = new Asignatura("Matematicas", nota());
		Asignatura asignatura3Alumno3 = new Asignatura("Biologia", nota());
		Asignatura asignatura4Alumno3 = new Asignatura("Fisica", nota());
		
		Set<Asignatura> asignaturasAlumno3 = new HashSet<Asignatura>();
		asignaturasAlumno3.add(asignatura1Alumno3);
		asignaturasAlumno3.add(asignatura2Alumno3);
		asignaturasAlumno3.add(asignatura3Alumno3);
		asignaturasAlumno3.add(asignatura4Alumno3);
		
		Estudiante estudiante3 = new Estudiante("Carlos", "Sainz", "654578L", asignaturasAlumno3);
		estudiantes.add(estudiante3);
		
		// Asignaturas y alumno 4
		Asignatura asignatura1Alumno4 = new Asignatura("Lengua", nota());
		Asignatura asignatura2Alumno4 = new Asignatura("Historia", nota());
		Asignatura asignatura3Alumno4 = new Asignatura("Biologia", nota());
		Asignatura asignatura4Alumno4 = new Asignatura("Fisica", nota());
		
		Set<Asignatura> asignaturasAlumno4 = new HashSet<Asignatura>();
		asignaturasAlumno4.add(asignatura1Alumno4);
		asignaturasAlumno4.add(asignatura2Alumno4);
		asignaturasAlumno4.add(asignatura3Alumno4);
		asignaturasAlumno4.add(asignatura4Alumno4);
		
		Estudiante estudiante4 = new Estudiante("Fernando", "Alonso", "459812R", asignaturasAlumno4);
		estudiantes.add(estudiante4);
		
		
	}
	
	// Metodo que muestra los datos de cada estudiante
	private void mostrarEstudiantes() {
		for (Estudiante estudiante : estudiantes) {
			if(estudiantes.isEmpty()) {
				System.out.println("Alumno vacio");
			}else {
				System.out.println(estudiante);
				for (Asignatura asignatura : estudiante.getAsignaturas()) {
					System.out.println(asignatura);
				}
			}
		}
	}
	
	// Metodo que muestra los datos de cada estudiante
	private void mostrarEstudiantesMatematicas() {
		boolean tieneMatematicas = false;
		System.out.println("Alumnos que cursan la asignatura de matematicas: ");
		for (Estudiante estudiante : estudiantes) {
			for (Asignatura asignatura : estudiante.getAsignaturas()) {
				if (asignatura.getNombre().equals("Matematicas")) {
					tieneMatematicas = true;
				} else {
					tieneMatematicas = false;
				}
				if (tieneMatematicas) {
					System.out.println(estudiante);
				}
			}
		}
		
	}
	
	// Metodo que nos dice si un alumno ha suspendido o aprobado
	private void balanceAlumnos() {
		System.out.println("Balance del curso: ");
		for (Estudiante estudiante : estudiantes) {
			double sumaNotas=0;
			double media=0;
			for (Asignatura asignatura : estudiante.getAsignaturas()) {
				sumaNotas += asignatura.getNota();
			}
			media = sumaNotas/estudiante.getAsignaturas().size();
			if (media >=5) {
				System.out.println("El alumno "+estudiante+" ha aprobado el curso con una media de "+media);
			}else {
				System.out.println("El alumno "+estudiante+" no ha aprobado el curso con una media de "+media);
			}
		}
	}
	
	// Metodo para eliminar a los alumnos de la asignatura de lengua
	private void eliminarAlumnosSuspendidos() {
		boolean suspendido=false;
		for (Estudiante estudiante : estudiantes) {
			for (Asignatura asignatura : estudiante.getAsignaturas()) {
				if(asignatura.getNombre().equals("Lengua") && asignatura.getNota() <5) {
					System.out.println("El alumno "+estudiante+ " ha sido eliminado");
					estudiantes.remove(estudiante);
					suspendido=true;
				}
			}
		}
		if (suspendido==false) {
			System.out.println("Ningun alumno ha suspendido Lengua.");
		}
	}
	
	// metodo que genera una nota aleatoriamente
	private double nota() {
		double nota = Math.round(Math.random()*10+1);
		return nota;
	}
}
