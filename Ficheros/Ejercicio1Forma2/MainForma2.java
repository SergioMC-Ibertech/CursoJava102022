package Ejercicio1Forma2;

import java.util.List;

public class MainForma2 {

	public static void main(String[] args) {

		/*
		 * Enunciado: Se pide leer el fichero alumnos.txt. 
		 * 
		 * 			  Donde se pide al mismo tiempo crear un objeto de tipo alumno, donde se guardara toda
		 * 			  la informacion que contiene el archivo.
		 * 
		 * 			  Para finalizar se desea saber cuantos alumnos hay dentro del fichero
		 */

		String archivo = "./Ficheros/Recursos/alumnos.txt";
		LeerTXT datos = new LeerTXT();
		
		System.out.println("El archivo contiene: ");
		System.out.println(datos.mostrarContenidoArchivo(archivo));
		List<Alumno> alumnos = datos.mostrarCadaAlumno(archivo);
		System.out.println("Mostramos los datos de cada alumno: ");
		for (Alumno alumno : alumnos) {
			System.out.println(alumno);
		}
		System.out.println();
		int numeroAlumnos = alumnos.size();
		System.out.println("Dentro del fichero "+archivo+" contiene "+numeroAlumnos+" de alumnos.");
		
	}

}
