package Ejercicio2;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main2 {

	public static void main(String[] args) {

		/*
		 * Enunciado: Se desea leer el fichero alumno-colegio.txt, siendo necesario
		 * 			  utilizar una estructura para que guarde todos los datos del fichero
		 * 			  , es decir, estructura = mapa.
		 * 
		 * 			  Implementar un metodo o funcion que determine que colegio tiene mas
		 * 			  alumnos.
		 */
		
		String archivo = "./Ficheros/Recursos/alumnos-colegio.txt";
		LeerTXT2 datos = new LeerTXT2();
		
		Map<String,List<Alumno2>> mapaFichero = datos.ordenarDatos(archivo);
		Set<Entry<String,List<Alumno2>>> fichero = mapaFichero.entrySet();
		
		int numeroMaximo=0;
		String colegioMasAlumnos="";
		
		for (Entry<String, List<Alumno2>> entry : fichero) {
			String colegio = entry.getKey();
			System.out.println("Colegio "+colegio);
			System.out.println(entry.getValue());
			List<Alumno2> alumnos = entry.getValue();
			int numMaximo=alumnos.size();
			if(numMaximo>numeroMaximo) {
				numeroMaximo=numMaximo;
				colegioMasAlumnos=colegio;
			}
		}
		System.out.println("\nEl colegio "+colegioMasAlumnos+" tiene el mayor numero de alumnos "+numeroMaximo);
		

	}

}
