package curso.java.poo.ejercicio.practica3;

import curso.java.funciones.Utils_EjercicioCaballos;

public class EspacioBidimensional {
	
	private String nombre;

	public EspacioBidimensional(String nombre) {
		super();
		this.nombre = nombre;
	}



	public static void main(String[] args) {

		/*
		 * Enunciado: Define una clase Linea con dos atributos: _puntoA y _puntoB. Son dos puntos por
					  los que pasa la línea en un espacio de dos dimensiones. La clase dispondrá de los
					  siguientes métodos:
						 Linea()
						  Constructor predeterminado que crea una línea con sus dos puntos como (0,0) y (0,0).
						 Linea(Punto, Punto)
						  Constructor que recibe como parámetros dos objetos de la clase Punto,
						  que son utilizados para inicializar los atributos.
						 mueveDerecha(double)
						  Desplaza la línea a la derecha la distancia que se indique.
						 mueveIzquierda(double)
						  Desplaza la línea a la izquierda la distancia que se indique.
						 mueveArriba(double)
						  Desplaza la línea hacia arriba la distancia que se indique.
						 mueveAbajo(double)
						  Desplaza la línea hacia abajo la distancia que se indique.
						 Accedentes y mutadores.
						 Método que nos permita mostrar la información de la línea de la siguiente forma:
						  [puntoA,puntoB]. Por ejemplo: [(0.0,0.0),(1.0,1.0)].
		 */
		
		EspacioBidimensional espbidim = new EspacioBidimensional("Espacio Bidimensional primero");
		espbidim.crearEspacio();

	}
	
	private void crearEspacio() {
		int opcion=0;
		Linea punto=new Linea();
		
		do {
			double coordenadaXA=Utils_EjercicioCaballos.pedirNumeroDecimal("Escribe el enumerador del primer numero: ");
			double coordenadaYA =Utils_EjercicioCaballos.pedirNumeroDecimal("Escribe el denominador del primer numero: ");
			Linea puntoA = new Linea(coordenadaXA, coordenadaYA);
			double coordenadaXB=Utils_EjercicioCaballos.pedirNumeroDecimal("Escribe el enumerador del primer numero: ");
			double coordenadaYB=Utils_EjercicioCaballos.pedirNumeroDecimal("Escribe el denominador del primer numero: ");
			Linea puntoB = new Linea(coordenadaXB, coordenadaYB);
			
			System.out.println("***************\n\tOperaciones\t\n1.Mover a la Derecha\n2.Mover a la Izquierda\n3.Mover hacia Arriba\n4.Mover hacia Abajo\n5.Informacion de los Puntos\6.Salir");
			opcion=Utils_EjercicioCaballos.pedirNumero("Selecciona una de las opciones");
			switch(opcion) {
				case 1:
					boolean valido1=false;
					do {
						String selPunto = Utils_EjercicioCaballos.pideValor("Elige un punto, selecciona a o b: ");
						if(selPunto=="A" || selPunto=="a") {
							valido1 = true;
							punto.mueveDerecha(puntoA);
						} else if (selPunto=="B" || selPunto=="b") {
							valido1 = true;
							punto.mueveDerecha(puntoB);
						} else {
							System.err.println("Opcion incorrecta, selecciona uno de los dos puntos a elegir.");
						}
					}while(valido1==false);
					break;
				case 2:
					boolean valido2=false;
					do {
						String selPunto = Utils_EjercicioCaballos.pideValor("Elige un punto, selecciona a o b: ");
						if(selPunto=="A" || selPunto=="a") {
							valido2 = true;
							punto.mueveIzquierda(puntoA);;
						} else if (selPunto=="B" || selPunto=="b") {
							valido2 = true;
							punto.mueveIzquierda(puntoB);
						} else {
							System.err.println("Opcion incorrecta, selecciona uno de los dos puntos a elegir.");
						}
					}while(valido2==false);
					break;
				case 3:
					boolean valido3=false;
					do {
						String selPunto = Utils_EjercicioCaballos.pideValor("Elige un punto, selecciona a o b: ");
						if(selPunto=="A" || selPunto=="a") {
							valido3 = true;
							punto.mueveArriba(puntoA);;
						} else if (selPunto=="B" || selPunto=="b") {
							valido3 = true;
							punto.mueveArriba(puntoB);
						} else {
							System.err.println("Opcion incorrecta, selecciona uno de los dos puntos a elegir.");
						}
					}while(valido3==false);
					break;
				case 4:
					boolean valido4=false;
					do {
						String selPunto = Utils_EjercicioCaballos.pideValor("Elige un punto, selecciona a o b: ");
						if(selPunto=="A" || selPunto=="a") {
							valido4 = true;
							punto.mueveAbajo(puntoA);;
						} else if (selPunto=="B" || selPunto=="b") {
							valido4 = true;
							punto.mueveAbajo(puntoB);
						} else {
							System.err.println("Opcion incorrecta, selecciona uno de los dos puntos a elegir.");
						}
					}while(valido4==false);
					break;
				case 5:punto.mostrarInformacionPuntos(puntoA, puntoB);break;
				case 6:System.out.println("Hasta la proxima amig@ !!!!");break;
				default: System.out.println("Opcion incorrecta, selecciona una de las opciones del menu.");break;
			}
			
		}while(opcion!=6);
	}

}
