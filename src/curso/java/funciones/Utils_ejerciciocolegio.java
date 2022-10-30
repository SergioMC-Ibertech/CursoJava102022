package curso.java.funciones;

import java.util.Scanner;

public class Utils_ejerciciocolegio {

	/*
	 * Funcion que pinta el menu del ejercicio del Cole
	 * @param String con menu
	 */
	public static void menuEjercicioColegio(String menu) {
		System.out.println(menu);
	}
	
	/*
	 * Funcion que pinta el menu del ejercicio 2, sin parametro - Cole
	 */
	public static void menuEjercicioColegio() {
		menuEjercicioColegio("1.Mostrar alumnos del colegio\n2.Mostrar alumnos que cursen la asignatura de matetimaticas"
				+ "\n3.Balance del curso\n4.Eliminar alumnos de la asignatura Lengua\n5.Salir");
	}
	
	/*
	 * Funcion que devuelve un valor integer por consola
	 * @param String texto 
	 * @return Devuelve el valor escrito por el usuario
	 */
	public static int pedirNumero(String text) {
		Scanner scan = new Scanner(System.in);
		int numero;
		
		System.out.print(text);
		numero = scan.nextInt();
		
		return numero;
	}
	
	/*
	 * Funcion para solicitar un valor por consola
	 * @param texto
	 * @return
	 */
	public static String pideValor(String texto) {
		String replay="";
		
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		replay = scan.nextLine();
		
		return replay;
	}
	
	/*
	 * Funcion que devuelve un valor integer por consola
	 * @param String texto 
	 * @return Devuelve el valor escrito por el usuario
	 */
	public static double pedirNumeroDecimal(String text) {
		Scanner scan = new Scanner(System.in);
		double numero;
		
		System.out.print(text);
		numero = scan.nextInt();
		
		return numero;
	}
	
	/*
	 * Funcion que devuelve un valor integer por consola
	 * @param String texto 
	 * @return Devuelve el valor escrito por el usuario
	 */
	public static long pedirNumeroLargo(String text) {
		Scanner scan = new Scanner(System.in);
		long numero;
		
		System.out.print(text);
		numero = scan.nextInt();
		
		return numero;
	}
	
}
