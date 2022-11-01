package MapEjercicio2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ColegioMapa1 {

	public static void main(String[] args) {

		/*
		 * Enunciado: Debemos crear 2 colegios conteniendo 3 alumnos en cada colegio, se pide:
		 * 
		 * 				- Crear un mapa con un listado de alumnos por colegio -> Map<Colegio,List<Alumnos>>
		 * 				- Clase Colegio -> con atributos nombre, direccion.
		 * 				- Clase Alumno -> con atributos nombre, apellidos, dni.
		 * 
		 * 				Se desea pintar por cada colegio el nombre y la direccion y los alumnos que contiene
		 * 				Se pide el DNI de un alumno y debe devolver un mensaje en que colegio se encuentra el alumno
		 */
		
		ColegioMapa1 colegio = new ColegioMapa1();
		
		Colegio colegio1 = new Colegio("colegio1", "calle ibertech 13");
		Colegio colegio2 = new Colegio("colegio2", "calle del progreso 25");
		
		Set<Alumno> alumnosCole1 = new HashSet<Alumno>();
		Alumno alumno1cole1 = new Alumno("Guillermo", "Toretto", "785623P");
		Alumno alumno2cole1 = new Alumno("Sergio", "Toretto", "542398B");
		Alumno alumno3cole1 = new Alumno("Carlos", "Sainz", "129865G");
		alumnosCole1.add(alumno1cole1);
		alumnosCole1.add(alumno2cole1);
		alumnosCole1.add(alumno3cole1);
		
		Set<Alumno> alumnosCole2 = new HashSet<Alumno>();
		Alumno alumno1cole2 = new Alumno("Fernando", "Alonso", "549812L");
		Alumno alumno2cole2 = new Alumno("Alex", "Palou", "657821D");
		Alumno alumno3cole2 = new Alumno("Pedro", "De La Rosa", "321278T");
		alumnosCole2.add(alumno1cole2);
		alumnosCole2.add(alumno2cole2);
		alumnosCole2.add(alumno3cole2);
		
		Map<Colegio, Set<Alumno>> mapaCole1 = new HashMap<Colegio, Set<Alumno>>();
		mapaCole1.put(colegio1, alumnosCole1);
		
		Map<Colegio, Set<Alumno>> mapaCole2 = new HashMap<Colegio, Set<Alumno>>();
		mapaCole2.put(colegio2, alumnosCole2);
		
		colegio.mostrarAlumnos(mapaCole1,mapaCole2);
		
		for (Alumno alumno : alumnosCole1) {
			if (alumno.getDni().equals("321278T")) {
				System.out.println("El alumno con dni "+alumno.getDni()+" pertenece al colegio: ");
				System.out.println(mapaCole1.keySet());
			}
		}
		for (Alumno alumno : alumnosCole2) {
			if (alumno.getDni().equals("321278T")) {
				System.out.println("El alumno con dni "+alumno.getDni()+" pertenece al colegio: ");
				System.out.println(mapaCole2.keySet());
			}
		}
		
	}
	
	// Metodo que permite imprimir por pantalla los datos del alumno
	private void mostrarAlumnos(Map alumnos1, Map alumnos2) {
		System.out.println(alumnos1.values());
		System.out.println();
		System.out.println(alumnos2.values());
	}
	
}
