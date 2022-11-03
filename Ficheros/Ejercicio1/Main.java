package Ejercicio1;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
	
	private final static String FICHERO1 = "./ficheros/Recursos/alumnos.txt";
	private final static String FICHERO2 = "./ficheros/Recursos/alumnos.txt";

	public static void main(String[] args) {

		/*
		 * Enunciado: Se pide leer el fichero alumnos.txt. Donde se pide al mismo
		 * 			  tiempo crear un objeto de tipo alumno, donde se guardara toda
		 * 			  la informacion que contiene el archivo.
		 * 
		 * 			  Para finalizar se desea saber cuantos alumnos hay dentro del fichero
		 */
		
		LeerFiechros lecturaFichero = new LeerFiechros();
		String datos;
		try {
			datos = lecturaFichero.mostrarDatos(FICHERO1);
			lecturaFichero.leerArchivoEjercicio1(FICHERO2);
//			System.out.println(datos);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}