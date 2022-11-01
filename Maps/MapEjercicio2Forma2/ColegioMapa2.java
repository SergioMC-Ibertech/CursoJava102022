package MapEjercicio2Forma2;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import MapEjercicio2.Alumno;

public class ColegioMapa2 {

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
		
		ColegioMapa2 colegio = new ColegioMapa2();
		Colegio[] colegios = colegio.crearColegios();
		Set<Alumno> alumnosCole1 = colegio.crearAlumnos1();
		Set<Alumno> alumnosCole2 = colegio.crearAlumnos2();
		Map<Colegio,Set<Alumno>> mapaCole1 = new HashMap<Colegio,Set<Alumno>>();
		mapaCole1.put(colegios[0], alumnosCole1);
		mapaCole1.put(colegios[1], alumnosCole2);
		colegio.mostrarInformacionAlumnos(mapaCole1.keySet(),mapaCole1.values());
		colegio.mostrarInformacionColegioAlumno(mapaCole1.keySet(),mapaCole1.values());
		
		
		
	}
	
	// Metodo para crear colegios
	private Colegio[] crearColegios() {
		Colegio colegio1 = new Colegio("colegio1", "Calle de la oportunidad 13");
		Colegio colegio2 = new Colegio("colegio2", "Paseo del progreso 25");
		Colegio[] colegios= {colegio1,colegio2};
		return colegios;
	}
	
	// Metodo para crear una coleccion de alumnos del primer colegio
	private Set<Alumno> crearAlumnos1(){
		Set<Alumno> alumnos = new HashSet<Alumno>();
		Alumno alumno1cole1 = new Alumno("Guillermo", "Toretto", "785623P");
		Alumno alumno2cole1 = new Alumno("Sergio", "Toretto", "542398B");
		Alumno alumno3cole1 = new Alumno("Carlos", "Sainz", "129865G");
		alumnos.add(alumno1cole1);
		alumnos.add(alumno2cole1);
		alumnos.add(alumno3cole1);
		return alumnos;
	}
	
	// Metodo para crear una coleccion de alumnos del segundo colegio
	private Set<Alumno> crearAlumnos2(){
		Set<Alumno> alumnos = new HashSet<Alumno>();
		Alumno alumno1cole2 = new Alumno("Fernando", "Alonso", "549812L");
		Alumno alumno2cole2 = new Alumno("Alex", "Palou", "657821D");
		Alumno alumno3cole2 = new Alumno("Pedro", "De La Rosa", "321278T");
		alumnos.add(alumno1cole2);
		alumnos.add(alumno2cole2);
		alumnos.add(alumno3cole2);
		return alumnos;
	}
	
	// Metodo que muestra la informacion de los alumnos por colegio
	private void mostrarInformacionAlumnos(Set<Colegio> colegios, Collection<Set<Alumno>> alumnos) {
		for (Colegio cole : colegios) {
			for (Set<Alumno> alumno : alumnos) {
				System.out.println(cole+" "+alumno);
			}
		}
	}
	
	// Metodo para encontrar los datos del colegio donde se encuentre el dni de un alumno en concreto
	private void mostrarInformacionColegioAlumno(Set<Colegio> colegios, Map alumnos) {
		for (Colegio colegio : colegios) {
			for(Alumno alumno : alumnos) {
				if(alumno.getDni().equals("129865G")) {
					System.out.println("El alumno "+alumno+" esta en el colegio "+colegio);
				}
			}
		}
	}
}
