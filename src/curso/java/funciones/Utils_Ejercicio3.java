package curso.java.funciones;

public class Utils_Ejercicio3 {

	/*
	 * Funcion que nos obtiene un numero aleatori, definido en el parametro
	 * num, siendo num un integer
	 * @param num, numero integer
	 * @return devuelve un numero aleatorio entre 0 y el valor num
	 */
	public static int tirarDado(int num) {
		double random = Math.random();
		int tirada = (int)Math.ceil((num*random));
//		System.out.println(tirada);
		return tirada;
	}
}
