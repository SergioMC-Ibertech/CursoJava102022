package curso.java.poo.ejercicio.practica1;

import curso.java.funciones.Utils_EjercicioCaballos;

public class NumerosComplejos {
	
	private String nombre;

	public NumerosComplejos(String nombre) {
		super();
		this.nombre = nombre;
	}



	public static void main(String[] args) {

		/*
		 * Enunciado: Crea una clase Complejo que permita trabajar con números complejos (parte real y
					  parte imaginaria). Incluye los siguientes métodos: constructores (por defecto y
					  parametrizado), accedentes, mutadores, suma, resta, multiplicación, división,
					  acumulación y print().
		 */
		
		NumerosComplejos numComplejo = new NumerosComplejos("numeroComplejo");
		numComplejo.crearOperacionesComplejos();

	}
	
	private void crearOperacionesComplejos() {
		int opcion=0;
		Complejo c=new Complejo();
		
		do {
			double parteReal1=Utils_EjercicioCaballos.pedirNumeroDecimal("Escribe la parte real del primer numero: ");
			double parteImaginaria1 =Utils_EjercicioCaballos.pedirNumeroDecimal("Escribe la parte imaginaria del primer numero: ");
			Complejo c1 = new Complejo(parteReal1, parteImaginaria1);
			double parteReal2=Utils_EjercicioCaballos.pedirNumeroDecimal("Escribe la parte real del primer numero: ");
			double parteImaginaria2 =Utils_EjercicioCaballos.pedirNumeroDecimal("Escribe la parte imaginaria del primer numero: ");
			Complejo c2 = new Complejo(parteReal2, parteImaginaria2);
			
			if(c.verificarSiSonComplejos(c1,c2)==true) {
				System.out.println("***************\n\tOperaciones\t\n1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n5.Salir");
				opcion=Utils_EjercicioCaballos.pedirNumero("Selecciona una de las opciones");
				switch(opcion) {
					case 1:c.sumarNumerosComplejos(c1, c2);break;
					case 2:c.restarNumerosComplejos(c1, c2);break;
					case 3:c.multiplicarNumerosComplejos(c1, c2);break;
					case 4:c.dividirNumerosComplejos(c1, c2);break;
					case 5:System.out.println("Hasta la proxima amig@ !!!!");break;
					default: System.out.println("Opcion incorrecta, selecciona una de las opciones del menu.");break;
				}
			}else {
				System.err.println("Ocurrio un error a la hora de crear los numeros complejos. Vuelve a crearlos porfavor");
			}
			
		}while(opcion!=5);
		
	}

}
