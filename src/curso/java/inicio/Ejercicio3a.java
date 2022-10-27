package curso.java.inicio;

import java.util.Arrays;  
import curso.java.funciones.Utils;

public class Ejercicio3a {

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
		 *  		  NOTA: Se empleara un dado de 6 caras
		 */
		
		int numCaras=6;
		int numTiradas = Integer.parseInt(Utils.pideValor("¿Cuantas veces debo tirar el dado?: "));
		int[] tiradasDado = new int[numTiradas];
		int numMasAlto=0;
		int numMasBajo=numCaras;
		int total=0;
		
		for(int i=0; i<tiradasDado.length; i++) {
			int tirada = tirarDado(numCaras);
			tiradasDado[i]=tirada;
			total += tirada;
			numMasAlto =Math.max(tirada, numMasAlto);
			numMasBajo =Math.min(tirada, numMasBajo);
		}
		
		System.out.println(Arrays.toString(tiradasDado));
		System.out.println("La media es "+(total/numTiradas));
		System.out.println("La numero mas alto es "+numMasAlto);
		System.out.println("La numero mas bajo es "+numMasBajo);
		

	}
	
	static int tirarDado(int num) {
		double random = Math.random();
		int tirada = (int)Math.ceil((num*random));
//		System.out.println(tirada);
		return tirada;
	}

}
