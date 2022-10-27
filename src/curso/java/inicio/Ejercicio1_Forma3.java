package curso.java.inicio;

import java.util.Scanner;

import curso.java.funciones.Utils;

public class Ejercicio1_Forma3 {

	public static void main(String[] args) {

		/**
		 *  Ejercicio de practica: Crear un menu, que contiene:
		 *  	- 1. Pintar un cuadrado.
		 *  		El usuario debe de introducir el tamanio del cuadrado y que lo pinte con *
		 *  		o con otro caracter que no sea letras.
		 *  	- 2. Validar un email.
		 *  		El usuario debe de introducir un email y validar que ese email sea valido,
		 *  		usando las siguientes validaciones:
		 *  			+ No puede haber espacios en blancos.
		 *  			+ Solo tiene que haber una @.
		 *  			+ Despues de la arroba, debe de contener al menos solo .
		 *  			+ Despues del ultimo punto tiene que haber entre 2 y 6 caracteres.
		 *  	- 3. Serie Fibonacci.
		 *  		El usuario debe de introducir un numero del cual quiera conocer, la serie fibonacci
		 *  	- 4. Insertar nombres.
		 *  		El usuario debe introducir cuantos alumnos debe tener una clase, guardar los nombres
		 *  		y mediante un Array, recorrer todos los nombres.
		 *  	- 5. Salir.
		 *  
		 *  	Selecciona una opcion:
		 *  
		 *    OJO, mientras la que la opcion sea diferente a 5 tiene que seguir
		 *    mostrando el menu.
		 */
		
		Scanner teclado = new Scanner(System.in);
				
		System.out.println("/n***************************/nBienvenido/n***************************/n");	
		int opcion=0;
		
		do {			
			Utils.menuEjercicio1();
			
			opcion=Integer.parseInt(Utils.pideValor("Selecciona una opcion: "));
			
			if (opcion < 0 || opcion > 5) {
				System.out.println("/nOpcion invalidada, selecciona una opcion del menu/n");
			} else {
				switch (opcion) {
				case 1:	PintarCuadrado(); break;
				case 2:	validarEmail();	break;
				case 3:	SucesionFibonacci();break;
				case 4:	RecorrerAlumnos(); break;
				case 5:	System.out.println("/nHasta la proxima AMIG@");	break;
				}
			}
		}while (opcion != 5);
		
		teclado.close();
	}
	
	static void PintarCuadrado() {		
		int num = Integer.parseInt(Utils.pideValor("/nDime el cuadrado que quieres que te pinte: /n"));
			
		if (num < 0) {
			System.out.println("Error, un cuadrado de 0 o menor de 0,"
					+ "no se puede pintar.");
		} else {
			for (int i = 0; i < num; i++) {
				for (int j = 0; j < num; j++) {
					if ((i > 0 && i < (num - 1)) && (j > 0 && j < (num - 1))) {
						System.out.print(" ");
					} else {
						System.out.print("+");
					}
				}
				System.out.println("");
			}
		}
		System.out.println("");
		
	}
	
	static void validarEmail() {
		String mensajeError = "";
		
		String email=Utils.pideValor("/nDime tu email: /n");
		
		if (email.contains(" ")) {
			mensajeError="El email no puede contener espacios en blanco.";
		}
		
		if (email.indexOf("@") == -1 || (email.lastIndexOf("@")!=email.indexOf("@"))) {
			mensajeError="El email no puede contener mas de una @.";
		}
		
		if (!email.substring(email.indexOf("@")).contains(".")) {
			mensajeError="El email tiene que contener un punto, despues de la @.";
		}
		
		int tamanioDominio = email.substring(email.lastIndexOf(".")+1).length();
		
		if (tamanioDominio < 2 || tamanioDominio > 6) {
			mensajeError="El tamaño del dominio tiene que estar entre 2 y 6 caracteres";
		}
		
		if (mensajeError.equals("")) {
			System.out.println("El email "+ email +" es correcto");
		} else {
			System.out.println("El email "+ email +" es incorrecto. "+ mensajeError);
		}
		
	}
	
	static void SucesionFibonacci () {
		long resultado=0;
		
		int fibonacci = Integer.parseInt(Utils.pideValor("/nDime el numero de la sucesion de Fibonacci: "));
		
		if(fibonacci < 0) {
			System.out.println("/nError, no se admiten numeros negativos");
		}else{
			System.out.println("/nEl resultado de la sucesion de Fibonacci/n");
			for (int h = 0; h == fibonacci; h++) {
				resultado+=h;
				if (h == fibonacci) {
					System.out.print(resultado);
				}else {
					System.out.print(resultado +",");
				}
			}
		}
	}
	
	static void RecorrerAlumnos() {
		String alumnos[];
		
		int numAlu = Integer.parseInt(Utils.pideValor("/nDime el numero de la sucesion de Fibonacci: "));
		System.out.println("");
		
		alumnos = new String[numAlu];
		
		for (int l = 0; l <= numAlu; l++) {
			alumnos[l] = Utils.pideValor("/nDime el nombre del alumno "+ l +" de la clase: ");
			System.out.println("");
		}
		
		for (int l = 0; l <= numAlu; l++) {
			
			System.out.println("El alumno "+l+" es "+ alumnos[l]);
			
		}
		
	}

}