package curso.java.inicio;

import java.util.Arrays;

import curso.java.funciones.Utils_Ejercicio3;

public class ResolverEjercicio3bForma2 {

	public static void main(String[] args) {

		/*
		 * Enunciado: Se lanzan los dado 5 veces. Se pide el siguiente
		 * 			  redactar y codificar:
		 * 				- 1.Mostrar los resultados
		 * 				- 2.Numero mas alto
		 * 				- 3.Numero mas bajo
		 * 				- 4.La media.
		 * 
		 *  		  NOTA: Se empleara dos dado de 6 caras
		 */
		
		int numTiradas=5;
		int numDados=2;
		int numCaras=6;
		int sumaTiradasMasAlta=0;
		int tiradaMasAlta=0;
		int[] tiradasDado1 = new int[numTiradas];
		int[] tiradasDado2 = new int[numTiradas];
		
		for (int i=0; i<numTiradas; i++) {
			int tiradaDado1=Utils_Ejercicio3.tirarDado(numCaras);
			int tiradaDado2=Utils_Ejercicio3.tirarDado(numCaras);
			
			tiradasDado1[i]=tiradaDado1;
			tiradasDado2[i]=tiradaDado2;
			
			if (sumaTiradasMasAlta<(tiradaDado1+tiradaDado2)) {
				sumaTiradasMasAlta=tiradaDado1+tiradaDado2;
				tiradaMasAlta=i+1;
			}
		}
		
		System.out.println(Arrays.toString(tiradasDado1));
		System.out.println(Arrays.toString(tiradasDado2));
		System.out.println("");
		System.out.println("");
		
		

	}

}
