package curso.java.funciones;

import java.util.Scanner;

public class Utils_Ejercicio2 {

	/*
	 * Funcion que pinta el menu del ejercicio 2 - Cole
	 * @param String con menu
	 */
	public static void menuEjercicio2(String menu) {
		System.out.println(menu);
	}
	
	/*
	 * Funcion que pinta el menu del ejercicio 2, sin parametro - Cole
	 */
	public static void menuEjercicio2() {
		menuEjercicio2("***************************\n\tColegio "
				+ "Ibertch\t\n***************************\n1.Insertar Alumno por "
				+ "Aula\n2.Buscar Alumno\n3.Borrar Alumno\n4.Mostrar Alumnos por "
				+ "Aula\n5.Mostrar Alumnos\n6.Mostrar plazas libres\n7.Salir");
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
	 * Funcion que pide un valor con el texto por defecto "introduce una opcion"
	 * @return String con el valor introducido
	 */
	public static String pideValor() {
		return pideValor("Introduce una opcion");
	}
	
}
