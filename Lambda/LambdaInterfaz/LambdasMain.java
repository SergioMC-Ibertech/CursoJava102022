package LambdaInterfaz;

import curso.java.funciones.Utils_ejerciciocolegio;

public class LambdasMain {

	public static void main(String[] args) {
		
		// Ejemplo de usos con el operdor LAMBDA (->)
		InterfazOperacionesMatematicas suma = (num1,num2) -> num1+num2;
		InterfazOperacionesMatematicas restar = (num1,num2) -> num1-num2;
		
		System.out.println(suma.operar(9,4));
	}

}
