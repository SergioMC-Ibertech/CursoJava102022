package curso.java.poo.ejercicio.practica2;

import curso.java.funciones.Utils_EjercicioCaballos;
import curso.java.poo.ejercicio.practica1.Complejo;

public class NumerosRacionales {
	
	private String nombre;

	public NumerosRacionales(String nombre) {
		super();
		this.nombre = nombre;
	}



	public static void main(String[] args) {

		/*
		 * Enunciado: Crea una clase Racional que permita trabajar con números racionales (fracciones).
					  Incluye los siguientes métodos: constructores (por defecto y parametrizado), accedentes,
					  leer(), suma, resta, multiplicación, división, comparaciones, copia() y print().
		 */
		
		NumerosRacionales racional = new NumerosRacionales("Numeros Racionales");
		racional.realizarOperaciones();

	}
	
	private void realizarOperaciones() {
		int opcion=0;
		Racional r=new Racional();
		
		do {
			int enumarador1=Utils_EjercicioCaballos.pedirNumero("Escribe el enumerador del primer numero: ");
			int denominador1 =Utils_EjercicioCaballos.pedirNumero("Escribe el denominador del primer numero: ");
			Racional r1=new Racional(enumarador1, denominador1);
			int enumarador2=Utils_EjercicioCaballos.pedirNumero("Escribe el enumerador del primer numero: ");
			int denominador2 =Utils_EjercicioCaballos.pedirNumero("Escribe el denominador del primer numero: ");
			Racional r2=new Racional(enumarador2, denominador2);
			
			if(r.compararRacionales(r1, r2)==true) {
				System.out.println("***************\n\tOperaciones\t\n1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n5.Comparar\6.Salir");
				opcion=Utils_EjercicioCaballos.pedirNumero("Selecciona una de las opciones");
				switch(opcion) {
					case 1:r.sumaRacionales(r1, r2);break;
					case 2:r.restaRacionales(r1, r2);break;
					case 3:r.multiplicacionRacionales(r1, r2);break;
					case 4:r.dividirRacionales(r1, r2);break;
					case 5:r.compararRacionales(r1, r2); break;
					case 6:System.out.println("Hasta la proxima amig@ !!!!");break;
					default: System.out.println("Opcion incorrecta, selecciona una de las opciones del menu.");break;
				}
			}else {
				System.err.println("Ocurrio un error a la hora de crear los numeros complejos. Vuelve a crearlos porfavor");
			}
			
		}while(opcion!=6);
	}

}
