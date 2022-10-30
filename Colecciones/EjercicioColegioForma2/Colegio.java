package EjercicioColegioForma2;

import java.util.ArrayList;
import java.util.Iterator;

import curso.java.funciones.Utils_ejerciciocolegio;

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
		int opcion=0;
		ArrayList<Asignatura> asignaturas = new ArrayList<Asignatura>();
		Asignatura[] asignatura = colegio.crearAsignatura();
		for (Asignatura asig : asignatura){
			asignaturas.add(asig);
		}
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
		Estudiante[] estudiante = colegio.crearEstudiante(asignaturas);
		for (Estudiante estu : estudiante) {
			estudiantes.add(estu);
		}
		do {
			Utils_ejerciciocolegio.menuEjercicioColegio();
			opcion=Utils_ejerciciocolegio.pedirNumero("Selecciona una opcion: ");
			switch(opcion) {
			case 1:colegio.mostrarAlumnos(estudiantes); break;
			case 2:colegio.mostrarAlumnosMatematicas(estudiantes); break;
			case 3:colegio.alumnosAprobados(estudiantes); break;
			case 4:colegio.eliminarAlumnos(estudiantes); break;
			case 5:System.out.println("Adios !!!");break;
			}
			System.out.println();
		}while(opcion!=5);
		
		
		

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
		int asig1,asig2,asig3,asig4,asig5,asig6,asig7,asig8,asig9,asig10;
		asig1=numAsignatura();
		asig2=numAsignatura2(asig1);
		Estudiante estudiante1 = new Estudiante("Guillermo", "Toretto", 89453245, asignaturas.get(asig1), asignaturas.get(asig2));
		asig3=numAsignatura();
		asig4=numAsignatura2(asig3);
		Estudiante estudiante2 = new Estudiante("Sergio", "Toretto", 56781298, asignaturas.get(asig3), asignaturas.get(asig4));
		asig5=numAsignatura();
		asig6=numAsignatura2(asig5);
		Estudiante estudiante3 = new Estudiante("Carlos", "Sainz", 45129878, asignaturas.get(asig5), asignaturas.get(asig6));
		asig7=numAsignatura();
		asig8=numAsignatura2(asig7);
		Estudiante estudiante4 = new Estudiante("Fernando", "Alonso", 32459878, asignaturas.get(asig7), asignaturas.get(asig8));
		asig9=numAsignatura();
		asig10=numAsignatura2(asig9);
		Estudiante estudiante5 = new Estudiante("Alex", "Palou", 21984532, asignaturas.get(asig9), asignaturas.get(asig10));
		
		Estudiante[] estudiantes= {estudiante1,estudiante2,estudiante3,estudiante4,estudiante5};
		return estudiantes;
	}
	
	// Metodo para recorrer los estudiantes del colegio
	private void mostrarAlumnos(ArrayList<Estudiante> estudiantes) {
		System.out.println("Alumnos del centro:");
		for (Estudiante estudiante : estudiantes) {
			System.out.println(estudiante.toString());
		}
	}
	
	// Metodo para mostrar los alumnos que cursan la asignatura de matematicas
	private void mostrarAlumnosMatematicas(ArrayList<Estudiante> estudiantes) {
		System.out.println("Alumnos que cursan la asignatura de matematicas:");
		for (Estudiante estudiante : estudiantes) {
			if (estudiante.asignatura.getNombre()=="Matematicas" || estudiante.asignatura2.getNombre()=="Matematicas") {
				System.out.println(estudiante.toString());
			}
		}
	}
	
	// Metodo para averiguar que alumnos han aprobado el curso, basandonos en un calculo de la nota media
	private void alumnosAprobados(ArrayList<Estudiante> estudiantes) {
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
	public void eliminarAlumnos(ArrayList<Estudiante> estudiantes) {
		boolean eliminado=false;
		System.out.println("Alumnos eliminados por haber suspendido la asignatura de lengua: ");
		for (int i=0; i<=estudiantes.size(); i++) {
			if ((estudiantes.get(i).getAsignatura().getNombre()=="Lengua" && estudiantes.get(i).getAsignatura().getNota()<5)
				|| (estudiantes.get(i).getAsignatura2().getNombre()=="Lengua" && estudiantes.get(i).getAsignatura2().getNota()<5)) {			
				eliminado=true;
			}
			if (eliminado==true) {
				System.out.println(estudiantes.get(i).toString()+" ha sido eliminado.");
				estudiantes.remove(estudiantes.get(i));
			}		
		}
		if (eliminado==false) {
			System.out.println("No ha suspendido ningun alumno la asignatura de Lengua.");
		}
		System.out.println();
		// Mostramos los alumnos restantes
		for (Estudiante estudiante : estudiantes) {
			if (estudiantes.isEmpty()) {
				System.out.println("Vacante estudiante vacia");
			}else
				System.out.println(estudiante.toString());
		}
	}
	
	private double nota() {
		double nota = Math.floor(Math.random()*10+1);
		return nota;
	}
	
	private int numAsignatura() {
		int asignatura = (int)(Math.random()*4);
		return asignatura;
	}
	
	private int numAsignatura2(int num) {
		int asignatura=0;
		boolean valido = false;
		do {
			asignatura = (int)(Math.random()*4);
			if (asignatura!=num) {
				valido=true;
			}
		}while(valido!=true);
		return asignatura;
	}
}
