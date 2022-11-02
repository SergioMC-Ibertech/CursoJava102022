package MapEjercicio2FormaProfe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import MapEjercicio2.Alumno;
import MapEjercicio2Forma2.Colegio;
import curso.java.funciones.Utils_EjercicioGuerra;

public class MainColegio {	

	public static void main(String[] args) {

		MainColegio main = new MainColegio();
		Map<Colegio,List<Alumno>> colegios = main.crearColegio();
		main.mostrarDatosAlumnos(colegios);
		main.buscarAlumno(colegios, Utils_EjercicioGuerra.pideValor("Introduce DNI del alumno a buscar"));

	}
	
	private void buscarAlumno(Map<Colegio,List<Alumno>> colegios, String dni) {
		for (Colegio cole : colegios.keySet()) {
			List<Alumno> alumnos = colegios.get(cole);
			for (Alumno alumno : alumnos) {
				if (alumno.getDni().equals(dni)) {
					System.out.println(cole);
					System.out.println(alumno);
				}
			}
		}
	}
	
	private void mostrarDatosAlumnos(Map<Colegio,List<Alumno>> colegios) {
		//Primero por clave y a partir de la clave obtenemos su valor
		for (Colegio cole : colegios.keySet()) {
			System.out.println(cole);
			List<Alumno> alumnos = colegios.get(cole);
			for (Alumno alumno : alumnos) {
				System.out.println(alumno);
			}
		}
		
		System.out.println("====================================");
		
		//Acceder directamente a la clave y al valor
		Set<Entry<Colegio, List<Alumno>>> colegiosEntry = colegios.entrySet();
		for( Entry<Colegio, List<Alumno>> colegioEntry  :  colegiosEntry) {
			Colegio cole = colegioEntry.getKey();
			System.out.println(cole);
			List<Alumno> alumnos = colegioEntry.getValue();
			for (Alumno alumno : alumnos) {
				System.out.println(alumno);
			}
		}
	}
	
	// Metodo paraq crear los colegios y los alumnos e incluirlos en el mapa
	private Map<Colegio,List<Alumno>> crearColegio(){
		Colegio colegio1 = new Colegio("colegio1", "Calle de la oportunidad 13");
		Colegio colegio2 = new Colegio("colegio2", "Paseo del progreso 25");
		
		Alumno alumno1cole1 = new Alumno("Guillermo", "Toretto", "785623P");
		Alumno alumno2cole1 = new Alumno("Sergio", "Toretto", "542398B");
		Alumno alumno3cole1 = new Alumno("Carlos", "Sainz", "129865G");
		List<Alumno> alumnosCole1 = new ArrayList<Alumno>();
		alumnosCole1.add(alumno1cole1);
		alumnosCole1.add(alumno2cole1);
		alumnosCole1.add(alumno3cole1);
		
		Alumno alumno1cole2 = new Alumno("Fernando", "Alonso", "549812L");
		Alumno alumno2cole2 = new Alumno("Alex", "Palou", "657821D");
		Alumno alumno3cole2 = new Alumno("Pedro", "De La Rosa", "321278T");
		List<Alumno> alumnosCole2 = new ArrayList<Alumno>();
		alumnosCole2.add(alumno1cole2);
		alumnosCole2.add(alumno2cole2);
		alumnosCole2.add(alumno3cole2);
		
		Map<Colegio, List<Alumno>> colegios = new HashMap<Colegio,List<Alumno>>();
		colegios.put(colegio1, alumnosCole1);
		colegios.put(colegio2, alumnosCole2);
		
		return colegios;
	}

}
