package curso.java.poo.excepciones;

import java.io.IOException;

public class ExcepcionesMain {

	public static void main(String[] args) {

		System.out.println("Inicio");
		
		
		ClaseErrorA cea = new ClaseErrorA();
		try {
			cea.metodo1();
		} catch (CrearMiPropiaExcepcion e1) {
			e1.printStackTrace();
			System.out.println(e1.getMessage());
		}
		
		try {
			
			String texto=null;
//			if(texto==null) {
//				// Llamada a la base de datos
//			}else {
//				texto.toUpperCase();
//			}
			String[] colores= {"Blanco","Azul"};
			System.out.println(colores[colores.length]);
			int num = 7/0;
			
		// OJO, con usar el catch(Exception), ya que si se pone la primera dara los demas catch los omitira
			// El camino correcto, es hacer los catch especifico y por ultimo el exception.
		}catch(ArithmeticException | ClassCastException ae) {			
//			e.printStackTrace();
			System.out.println("Ha habido un problema con la division:  "+ae.getMessage());			
		}catch(ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("Ha habido un problema con el array has cogido un elemento que no existe; "+aiobe.getMessage());
		}catch(NullPointerException npe){
			System.out.println("Ha habido un problema con el objeto (es nulo): "+npe.getMessage());
			// Llamada a la base de datos
		}catch(Exception e) {
			System.out.println("Se ha producido un error "+e.getMessage());
		}finally {
			System.out.println("Continua");
		}
		
		
		System.out.println("Fin");
		
		/*
		 * Hay dos tipos de excepciones:
		 * 		- checked  ->  Requiere que se genere un try - catch para generar la excepcion
		 * 			Exception
		 * 			IOException
		 * 		- unchecked  ->  No nos obliga ha generar un try - catch para generar la excepcion
		 * 			AritmeticException
		 * 			
		 */			

	}

}
