package curso.java.poo.ejercicio3Forma2;

import curso.java.funciones.Utils_EjercicioCaballos;

public class Hipodromo {
	
	private String nombre;

	public Hipodromo(String nombre) {
		super();
		this.nombre = nombre;
	}



	public static void main(String[] args) {

		/*
		 * Enunciado: Se pide redactar el siguiente programa y codificarlo para su uso:
		 * 				- Clase Caballo:
		 * 					*dorsal, nombre, int velocidad(1-10), int experiencia(1-10), edad(1-20) -> Como atributos.
		 * 					* Crear el metodo o funcion Correr -> Basandonos en un calculo matematico:
		 * 						Velocidad + Experiencia - Edad + un numero random(rango 1 a 10) -> Devolviendo
		 * 						los metros avanzados hasta llegar a 100 (distancia).
		 * 				- Clase Carrera:
		 * 					* nombreCarrera, distanciaCarrera, caballos participantes -> Como atributos
		 * 					* Crear el metodo iniciarCarrera, consistiendo en que cada caballo participante se pone a
		 * 					  correr, no se detendra el metodo hasta que uno de los caballos complete la distancia
		 * 					  de la carrera -> devolviendo el dorsal del caballo ganador
		 * 				- Clase Apuesta:
		 * 					* cantidad, caballo como atributos
		 * 				- Clase Jugador:
		 * 					* nombre, saldo, apuesta, caballoApuesta como atributos
		 * 					* Creamos el metodo apostar, donde le preguntamos:
		 * 						¿Cuanto quieres apostar?
		 * 						¿Por cual caballo apostar?
		 * 				- Clase Hipodromo: o clase principal con metodo main
		 * 					* Crear 2 jugadores, crear 3 caballos, crear 1 carrera
		 * 					* Por cada jugador apostar
		 * 					* Crear un metodo o la logica que -> Una vez que TODO los jugadores
		 * 					  hayan apostado -> Comienza la carrera. El jugador que acierte el caballo ganador
		 * 					  aumentar el saldo de ese jugador y tenga una ganancia x5.
		 */
		
		Hipodromo hipodromo1 = new Hipodromo("Hipodromo Ibertech");
		Carrera carrera = hipodromo1.crearCarrera();
		System.out.println(carrera);
		

	}
	
	private Carrera crearCarrera() {
		Carrera carrera=null;
		
		Caballo caballo1 = new Caballo(asignarDorsal(), asignarNombre(), verificarVelocidadExperiencia(), verificarVelocidadExperiencia(), verificarEdad());
		Caballo caballo2 = new Caballo(asignarDorsal(), asignarNombre(), verificarVelocidadExperiencia(), verificarVelocidadExperiencia(), verificarEdad());
		Caballo caballo3 = new Caballo(asignarDorsal(), asignarNombre(), verificarVelocidadExperiencia(), verificarVelocidadExperiencia(), verificarEdad());
		
		Caballo[] caballos= {caballo1,caballo2,caballo3};
		
		Apuesta apuesta1 = new Apuesta(verificarApuesta(), caballos[0]);
		Apuesta apuesta2 = new Apuesta(verificarApuesta(), caballos[1]);
		Apuesta apuesta3 = new Apuesta(verificarApuesta(), caballos[2]);
		
		Apuesta[] apuestas = {apuesta1,apuesta2};
		
		Jugador jugador1 = new Jugador(asignarNombre(), saldoInicial(), apuesta1);
		Jugador jugador2 = new Jugador(asignarNombre(), saldoInicial(), apuesta2);
		Jugador jugador3 = new Jugador(asignarNombre(), saldoInicial(), apuesta3);
		
		Jugador[] jugadores = {jugador1,jugador2};
		
		
		carrera = new Carrera(asignarNombre(), distancia(), caballos, apuestas, jugadores);
		carrera.iniciarCarrera(caballos, apuestas, jugadores);
		
		return carrera;
	}
	
	private int asignarDorsal() {
		int num=0;
		double random=(int)(Math.random()*1000+1);
		num=(int)random;
		return num;
	}
	
	private String asignarNombre() {
		String nombre=null;
		do {
			nombre=Utils_EjercicioCaballos.pideValor("Dime el nombre del caballo: ");
			if(nombre==null) System.err.println("No puede estar el caballo sin nombre, escribelo por favor");
		}while(nombre==null);
		return nombre;
	}
	
	private int verificarVelocidadExperiencia() {
		int num=0;
		boolean valido=false;
		do {
			num = Utils_EjercicioCaballos.pedirNumero("Escribe un numero del 1 al 10: ");
			if (num < 0 || num >10) { 
				System.err.println("Numero incorrecto, escribe un numero del 1 al 10");
			} else {
				valido=true;
			}
		}while(valido==false);
		return num;
	}
	
	private int verificarEdad() {
		int num=0;
		boolean valido=false;
		do {
			num = Utils_EjercicioCaballos.pedirNumero("Escribe un numero del 1 al 20: ");
			if (num < 0 || num >20) { 
				System.err.println("Numero incorrecto, escribe un numero del 1 al 20");
			} else {
				valido=true;
			}
		}while(valido==false);
		return num;
	}
	
	private int verificarApuesta() {
		int num=0;
		boolean valido=false;
		Jugador apuesta=null;
		
		do {
			num = Utils_EjercicioCaballos.pedirNumero("Escribe una cantidad: ");
			if (num < 0) { 
				System.err.println("Cantidad incorrecto, escribe una cantidad positiva");
			} else {
				if (apuesta.apostar(num)==true) {
				valido=true;
				}else {
					System.out.println("Apuesta invalida, revisa tu apuesta.");
				}
			}
		}while(valido==false && apuesta.apostar(num)==false);
		return num;
	}
	
	private int saldoInicial() {
		int num=0;
		boolean valido=false;
		do {
			num = Utils_EjercicioCaballos.pedirNumero("Escribe un saldo de inicio: ");
			if (num < 0) { 
				System.err.println("Saldo incorrecto, escribe un saldo positivo");
			} else {
				valido=true;
			}
		}while(valido==false);
		return num;
	}
	
	private int distancia() {
		int num=0;
		boolean valido=false;
		do {
			num = Utils_EjercicioCaballos.pedirNumero("Escribe un saldo de inicio: ");
			if (num < 0) { 
				System.err.println("Saldo incorrecto, escribe un saldo positivo");
			} else {
				valido=true;
			}
		}while(valido==false);
		return num;
	}

}
