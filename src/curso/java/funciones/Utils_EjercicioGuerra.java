package curso.java.funciones;

import java.util.Scanner;

public class Utils_EjercicioGuerra {

	/*
	 * Funcion que pinta el menu del ejercicio para elegir personajes de la guerra
	 * @param String con menu
	 */
	public static void menuEjercicioGuerraEquipos(String menu) {
		System.out.println(menu);
	}
	
	/*
	 * Funcion que pinta el menu del ejercicio de la guerra, sin parametro - Guerra
	 */
	public static void menuEjercicioGuerraEquipos() {
		menuEjercicioGuerraEquipos("Elige un equipo:\n1.Orcos\n2.Gnomos\n3.Elfos\n4.Vampiros\n5.Hombres Lobo\n6.Marines");
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
