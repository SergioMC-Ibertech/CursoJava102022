package REVISAR.TERMINARcurso.java.poo.ejercicio2aForma2;

import curso.java.funciones.Utils_EjercicioTienda;

public class Tienda {
	
	private String nombreTienda;
	

	public Tienda(String nombreTienda) {
		super();
		this.nombreTienda = nombreTienda;
	}



	public static void main(String[] args) {

		/*
		 * Enunciado: Se requiere un programa redactando y codificando los siguiente requisitos:
		 * 				- Clase Boton:
		 * 					* Color y forma -> como atributos
		 * 				- Clase Camisa:
		 * 					* color, talla, precio y botones -> como atributos
		 * 				- Clase Pantalon:
		 * 					* color, talla, precio y boton. -> como atributos.
		 * 				- Clase Vestido:
		 * 					* color, talla, precio.
		 * 				- Clase Maniqui:
		 * 					* id, camisa, pantalon, vestido -> como atributos.
		 * 					* vestir, desvestir -> como metodos o funciones.
		 * 					* El metodo vestir puede admitir camisa y pantalon o un vestido.
		 * 					* El metodo desvestir es quitar la ropa que lleva.
		 * 				- Clase tienda: -> como main
		 * 					* nombre -> como atributos.
		 * 					* Crear 2 maniquies fuera del metodo main
		 * 					* Crear una funcion o metodo que calcule el precio de la ropa de todos los maquinies
		 */
		
		Tienda tienda1 = new Tienda("modaIbertech");
		Maniqui[] maniquies = tienda1.crearManiqui();

	}
	
	private Maniqui[] crearManiqui() {
		
		int numManiquies=Utils_EjercicioTienda.pedirNumero("¿Cuantos maniquies quieres tener en tu tienda?: ");
		for(int i=0; i<numManiquies; i++) {
			do {
				Utils_EjercicioTienda.menuEjercicioTienda();
				int opcion=Utils_EjercicioTienda.pedirNumero("Selecciona una de las opciones:");
				switch(opcion) {
					case 1:
						String colorCamisa=Utils_EjercicioTienda.pideValor("Dime el color de la camisa: ");
						String tallaCamisa=Utils_EjercicioTienda.pideValor("Dime el color de la camisa: ");
						double precioCamisa=Utils_EjercicioTienda.pedirNumeroDecimal("Dime el precio de la camisa: ");
						int numBotonesCamisa=Utils_EjercicioTienda.pedirNumero("Cuantos botones de la camisa: ");
						Camisa camisa1 = new Camisa(colorCamisa, tallaCamisa, precioCamisa, numBotonesCamisa);
						
						String colorPantalon=Utils_EjercicioTienda.pideValor("Dime el color de la pantalon: ");
						String tallaPantalon=Utils_EjercicioTienda.pideValor("Dime el color de la pantalon: ");
						double precioPantalon=Utils_EjercicioTienda.pedirNumeroDecimal("Dime el precio de la pantalon: ");
						boolean botonPantalon=Utils_EjercicioTienda.responderPregunta("Tiene boton el pantalon, 1 si es SI y 0 si es NO: ");
						Pantalon pantalon1 = new Pantalon(colorPantalon, tallaPantalon, precioPantalon, botonPantalon);
						
						long id=
						Maniqui[i] maniquiCamiPant= new Maniqui(i, null, null)
						break;
					case 2:
						break;
					case 3:
						break;
					case 4:
						break;
					case 5:
						break;
					default:
						System.err.println("opcion incorrecta, seleecciona una de las opciones.");
				}
			while(opcion <0 && opcion>5);
		}
		
		return maniquies;
	}

}
