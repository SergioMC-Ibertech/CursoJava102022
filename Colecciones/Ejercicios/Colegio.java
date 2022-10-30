package Ejercicios;

import java.util.ArrayList;

public class Colegio {
	
	private String nombre;

	public Colegio(String nombre) {
		super();
		this.nombre = nombre;
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
		
		Colegio colegio = new Colegio("Colegio Ibertech");
		Asignatura[] asignatura = colegio.crearAsignatura();
		ArrayList<Asignatura> asignaturas = new ArrayList<Asignatura>();	
		for (Asignatura asig : asignatura){
			asignaturas.add(asig);
		}
		
		Estudiante[] estudiantes = colegio.crearEstudiante(asignaturas);
		colegio.mostrarAlumnos(estudiantes);
		System.out.println();
		colegio.mostrarAlumnosMatematicas(estudiantes);
		System.out.println();
		colegio.alumnosAprobados(estudiantes);
		System.out.println();
		colegio.eliminarAlumnos(estudiantes);

	}
	
	// Metodo para crear las asignaturas
	private Asignatura[] crearAsignatura() {
		Asignatura asignatura1 = new Asignatura("Matematicas", nota());
		Asignatura asignatura2 = new Asignatura("Fisica", nota());
		Asignatura asignatura3 = new Asignatura("Biologia", nota());
		Asignatura asignatura4 = new Asignatura("Lengua", nota());
		Asignatura[] asignaturas= {asignatura1,asignatura2,asignatura3,asignatura4};
		return asignaturas;
	}
	
	// Metodo para crear a los estudiantes
	private Estudiante[] crearEstudiante(ArrayList<Asignatura> asignaturas) {
		Estudiante estudiante1 = new Estudiante("Guillermo", "Toretto", 89453245, asignaturas.get(numAsignatura()), asignaturas.get(numAsignatura()));
		Estudiante estudiante2 = new Estudiante("Sergio", "Toretto", 56781298, asignaturas.get(numAsignatura()), asignaturas.get(numAsignatura()));
		Estudiante estudiante3 = new Estudiante("Carlos", "Sainz", 45129878, asignaturas.get(numAsignatura()), asignaturas.get(numAsignatura()));
		Estudiante estudiante4 = new Estudiante("Fernando", "Alonso", 32459878, asignaturas.get(numAsignatura()), asignaturas.get(numAsignatura()));
		Estudiante estudiante5 = new Estudiante("Alex", "Palou", 21984532, asignaturas.get(numAsignatura()), asignaturas.get(numAsignatura()));
		Estudiante[] estudiantes= {estudiante1,estudiante2,estudiante3,estudiante4,estudiante5};
		return estudiantes;
	}
	
	// Metodo para recorrer los estudiantes del colegio
	private void mostrarAlumnos(Estudiante[] estudiantes) {
		System.out.println("Alumnos del centro:");
		for (Estudiante estudiante : estudiantes) {
			System.out.println(estudiante.toString());
		}
	}
	
	// Metodo para mostrar los alumnos que cursan la asignatura de matematicas
	private void mostrarAlumnosMatematicas(Estudiante[] estudiantes) {
		System.out.println("Alumnos que cursan la asignatura de matematicas:");
		for (Estudiante estudiante : estudiantes) {
			if (estudiante.asignatura.getNombre()=="Matematicas" || estudiante.asignatura2.getNombre()=="Matematicas") {
				System.out.println(estudiante.toString());
			}
		}
	}
	
	// Metodo para averiguar que alumnos han aprobado el curso, basandonos en un calculo de la nota media
	private void alumnosAprobados(Estudiante[] estudiantes) {
		double media = 0;
		System.out.println("Valoraciones del curso:");
		for (Estudiante estudiante : estudiantes) {
			media=((estudiante.asignatura.getNota()+estudiante.asignatura2.getNota())/2);
			if (media >= 5) {
				System.out.println(estudiante.toString()+" ha aprobado el curso");
			}else {
				System.out.println(estudiante.toString()+" no ha aprobado el curso");
			}
		}
	}
	
	// Metodo para eliminar a todos aquellos alumnos que hayan suspendido la asignatura de lengua
	public void eliminarAlumnos(Estudiante[] estudiantes) {
		boolean eliminado=false;
		Estudiante[] estu=estudiantes;
		System.out.println("Alumnos eliminados por haber suspendido la asignatura de lengua: ");
		for (int i=0; i<estudiantes.length; i++) {
			if (estudiantes[i].asignatura.getNombre()=="Lengua" && estudiantes[i].asignatura.getNota()<5) {
				}else if (estudiantes[i].asignatura2.getNombre()=="Lengua" && estudiantes[i].asignatura2.getNota()<5) {
					System.out.println(estudiantes[i].toString()+" ha sido eliminado.");
					estu[i]=null;
					eliminado=true;
				}
			estu[i]=estudiantes[i];
		}
		
		if (eliminado==false) {
			System.out.println("No ha suspendido ningun alumno la asignatura de Lengua.");
		}
		System.out.println();
		// Mostramos los alumnos
		for (Estudiante estudiante : estu) {
			if (estudiante != null) {
				System.out.println(estudiante.toString());
			}else
				System.out.println("Vacante estudiante vacia");
		}
	}
	
	private double nota() {
		double nota = Math.random()*10+1;
		return nota;
	}
	
	private int numAsignatura() {
		int nota = (int)(Math.random()*4);
		return nota;
	}
}
