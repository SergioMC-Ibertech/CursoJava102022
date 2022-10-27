package curso.java.funciones;

import java.util.Scanner;

public class Utils_EjercicioCaballos {

	/*
	 * Funcion que pinta el menu del ejercicio 2 - Cole
	 * @param String con menu
	 */
	public static void menuEjercicioTienda(String menu) {
		System.out.println(menu);
	}
	
	/*
	 * Funcion que pinta el menu del ejercicio 2, sin parametro - Cole
	 */
	public static void menuEjercicioTienda() {
		menuEjercicioTienda("1.Maniqui con Camisa y Pantalon\n2º.Maniqui con solo Camisa\n3.Maniqui "
				+ "con solo Pantalon\n4.Maniqui con Vestido\n5.Maniqui desnudo");
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
	
	/*
	 * Funcion que devuelve un valor booleano por consola
	 * @param String texto o pregunta
	 * @return Devuelve verdadero o falso
	 */
	public static boolean responderPregunta(String texto) {
		Scanner scan = new Scanner(System.in);
		boolean respuesta=false;
		
		if (pedirNumero(texto)==1) {
			respuesta=true;
		}else if(pedirNumero(texto)==0){
			respuesta=false;
		}
		return respuesta;
	}
	
}
