package curso.java.poo.excepciones;

import java.io.IOException;

public class ClaseErrorA {

	
	public void metodo1() throws CrearMiPropiaExcepcion {
				
		System.out.println("Llamando a metodo1");
		// forzamos un error
		int numerador=9;
		int denominador=0;
		// Controla java la excepcion, mediante un objeto
		if (denominador==0) {
			ArithmeticException ae= new ArithmeticException("Estas dividiendo entre cero y no se puede");
			Exception e= new Exception("Estas dividiendo entre cero y no se puede");
			IOException ioe = new IOException("Mensaje");
			CrearMiPropiaExcepcion cmpe = new CrearMiPropiaExcepcion("Excepcion propia"); 
//			try {
//				throw e;
//			}catch(Exception ex) {
//				System.out.println("Error");
//			}
//			throw e;
			throw cmpe;
		}
		int division=numerador/denominador;
		System.out.println("Voy a realizar la division");
		int num = 9/0;
		
	}
	
	public void metodo1 (String a) {
		
	}
	
	public void metodo1(int a) {
		
	}
}
