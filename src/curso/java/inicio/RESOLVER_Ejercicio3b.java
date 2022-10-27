package curso.java.inicio;

import java.util.Arrays;

import curso.java.funciones.Utils;

public class RESOLVER_Ejercicio3b {

	public static void main(String[] args) {

		/*
		 * Enunciado: Pedir al usuario que introduzca el numero de veces
		 * 			  que se va a lanzar el dado. Se pide el siguiente
		 * 			  redactar y codificar:
		 * 				- 1.Mostrar los resultados
		 * 				- 2.Numero mas alto
		 * 				- 3.Numero mas bajo
		 * 				- 4.La media.
		 * 
		 *  		  NOTA: Se empleara dos dado de 6 caras
		 */
		
		int numCaras1=6;
		int numCaras2=6;
		int numTiradas = Integer.parseInt(Utils.pideValor("¿Cuantas veces debo tirar el dado?: "));
		int[] tiradasDado1 = new int[numTiradas];
		int[] tiradasDado2 = new int[numTiradas];
		int numMasAltoDado1=0;
		int numMasBajoDado1=0;
		int numMasAltoDado2=0;
		int numMasBajoDado2=0;
		int totalDado1=0;
		int totalDado2=0;
		
		for(int i=0; i<tiradasDado1.length; i++) {
			int tirada1 = tirarDado(numCaras1);
			tiradasDado1[i]=tirada1;
			totalDado1 += tirada1;
			for(int j=0; j<tiradasDado2.length; j++) {
				int tirada2 = tirarDado(numCaras2);
				tiradasDado2[i]=tirada2;
				totalDado2 += tirada2;
				numMasAltoDado2 =Math.max(tirada2, numMasAltoDado2);
				numMasBajoDado2 =Math.min(tirada2, numMasBajoDado2);
			}
			numMasAltoDado1 =Math.max(tirada1, numMasAltoDado1);
			numMasBajoDado1 =Math.min(tirada1, numMasBajoDado1);		
		}
		
		System.out.println(Arrays.toString(tiradasDado1));
		System.out.println(Arrays.toString(tiradasDado2));
		System.out.println("La media del dado 1 es "+(totalDado1/numTiradas));
		System.out.println("La media del dado 2 es "+(totalDado2/numTiradas));
		System.out.println("La numero mas alto del dado 1 es "+numMasAltoDado1);
		System.out.println("La numero mas bajo del dado 1 es "+numMasBajoDado1);
		System.out.println("La numero mas alto del dado 2 es "+numMasAltoDado2);
		System.out.println("La numero mas bajo del dado 2 es "+numMasBajoDado2);
		

	}
	
	static int tirarDado(int num) {
		double random = Math.random();
		int tirada = (int)Math.ceil((num*random));
//		System.out.println(tirada);
		return tirada;
	}

	
	
}
