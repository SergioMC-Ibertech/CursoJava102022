package curso.java.funciones;

import java.util.Scanner;

public class Utils {

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
	
	/*
	 * Funcion que devuelve el menu del Ejercicio 1 del curso
	 * @param String del menu
	 */
	public static void menuEjercicio1(String menu) {
		System.out.println(menu);
	}
	
	/*
	 * Funcion que devuelve el menu del Ejercicio 1 del curso
	 */
	public static void menuEjercicio1() {
		menuEjercicio1("***********/n	MENU	/n1. Pintar un cuadrado/n2. Validar email/n"
				+ "3. Serie Fibonacci/n4. Insertar Nombres/n5. Salir/n***********");
	}
	
	/*
	 * Funcion que devuelve el menu del Ejercicio 1 del curso, elemento por elemento
	 * @param Array de String
	 */
	public static void menuEjercicio1(String[] menu) {
		for (String opcion : menu) {
			menuEjercicio1(opcion);
		}
	}
	
}
