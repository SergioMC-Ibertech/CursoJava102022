package curso.java.inicio;

import java.util.Scanner;

public class Ejercicio1 {

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
		
		try {
			
			System.out.println("***************************");
			System.out.println("Bienvenido");
			System.out.println("***************************");
			System.out.println();
			
			int opcion=0;
			
			do {
				
				System.out.println("***********");
				System.out.println("	MENU	");
				System.out.println("");
				System.out.println("1. Pintar un cuadrado");
				System.out.println("2. Validar email");
				System.out.println("3. Serie Fibonacci");
				System.out.println("4. Insertar Nombres");
				System.out.println("5. Salir");
				System.out.println("***********");
				System.out.print("Selecciona una opcion: ");
				opcion = teclado.nextInt();
				
				if (opcion < 0 || opcion > 5) {
					System.out.println("Opcion invalidada, selecciona una opcion del menu");
					System.out.println("");
				} else {
					switch (opcion) {
					case 1:
						int i,j,num;
						
						System.out.println("");
						System.out.print("Dime el cuadrado que quieres que te pinte: ");
						num = teclado.nextInt();
						System.out.println("");
						
						if (opcion < 0) {
							System.out.println("Error, un cuadrado de 0 o menor de 0,"
									+ "no se puede pintar.");
							break;
						} else {
							for (i = 0; i < num; i++) {
								for (j = 0; j < num; j++) {
									if ((i > 0 && i < (num - 1)) && (j > 0 && j < (num - 1))) {
										System.out.print(" ");
									} else  {
										System.out.print("+");
									}
								}
								System.out.println("");
							}
						}
						System.out.println("");
						break;
					case 2:
						String email, mensajeError="";
						
						System.out.println("");
						System.out.print("Dime tu email: ");
						email = teclado.next();
						System.out.println("");
						
						email = email.trim().toLowerCase();
						
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
						
						break;
					case 3:
						int fibonacci,h;
						long resultado;
						
						System.out.println("");
						System.out.print("Dime el numero de la sucesion de Fibonacci: ");
						fibonacci = teclado.nextInt();
						System.out.println();
						
						resultado=0;
						
						if(fibonacci < 0) {
							System.out.println("/nError, no se admiten numeros negativos");
						}else{
							System.out.println("/nEl resultado de la sucesion de Fibonacci/n");
							for (h = 0; h == fibonacci; h++) {
								resultado+=h;
								if (h == fibonacci) {
									System.out.print(resultado);
								}else {
									System.out.print(resultado +",");
								}
							}
						}
						
						System.out.println("/nEl resultado de la sucesion es: "+ resultado);
						break;
					case 4:
						
						int numAlu;
						String alumnos[];
						
						System.out.println("");
						System.out.print("Dime el numero de la sucesion de Fibonacci: ");
						numAlu = teclado.nextInt();
						System.out.println("");
						
						if (numAlu < 0) {
							System.out.println("En una clase no puede haber un numero negativo"
									+ " de alumnos, introduce un numero positivo");
							break;
						} else {
						
							alumnos = new String[numAlu];
							
							for (int l = 0; l <= numAlu; l++) {
								System.out.println("");
								System.out.print("Dime el nombre del alumno "+ l +" de la clase: ");
								alumnos[l] = teclado.next();
								System.out.println("");
							}
							
							for (int l = 0; l <= numAlu; l++) {
								
								System.out.println("El alumno "+l+" es "+ alumnos[l]);
								
							}
						}
					
						break;
					case 5:
						System.out.println("");
						System.out.println("Hasta la proxima AMIG@");
						break;
					}
				}
			}while (opcion != 5);
			
		} finally {
			teclado.close();
		}

	}

}