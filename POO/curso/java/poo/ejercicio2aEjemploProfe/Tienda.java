package curso.java.poo.ejercicio2aEjemploProfe;

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
		Maniqui[] maniquis = tienda1.crearTienda();
		System.out.println("Numero de maniquis "+maniquis.length);
		tienda1.calculaPrecioRopaManiquis(maniquis);
		

	}
	
	private void calculaPrecioRopaManiquis(Maniqui[] maniquis) {
		double totalPrecio=0;
		for (Maniqui maniqui : maniquis) {
			if(maniqui.getCamisas()!=null) {
				totalPrecio+=maniqui.getCamisas().getPrecio();
			}
			if(maniqui.getPantalones()!=null) {
				totalPrecio+=maniqui.getPantalones().getPrecio();
			}
			if(maniqui.getVestidos()!=null) {
				totalPrecio+=maniqui.getVestidos().getPrecio();
			}
		}
		System.out.println("El precio de toda la ropa que llevan los maniquis es de "+totalPrecio);
	}
	
	private Maniqui[] crearTienda() {
		Boton boton1 = new Boton("negro","redondo");
		Boton boton2 = new Boton("negro","redondo");
		Boton boton3 = new Boton("negro","redondo");
		Boton boton4 = new Boton("negro","redondo");
		Boton boton5 = new Boton("negro","redondo");
		Boton boton6 = new Boton("negro","redondo");
		
		//Segunda forma de incluir los botones -- Creando stock de botones
//		Boton[] stockBotones= {null, boton1,.boton1..boton1.}
		
		Boton [] botonesCamisa1= {boton1,boton2};
		Boton [] botonesCamisa2= {boton3,boton4,boton5};
		
		Camisa camisa1 = new Camisa("negra", "L",40,botonesCamisa1 );
		Camisa camisa2 = new Camisa("negra", "M",60 );
		camisa2.setBotones(botonesCamisa2);
		
		Pantalon pantalon = new Pantalon("Vaquero", "40", 50, boton6);
		
		Vestido vestido = new Vestido("Verde", "38", 60);
		
		Maniqui maniqui1 = new Maniqui(1);
		Maniqui maniqui2 = new Maniqui(2,vestido);
		
		maniqui1.vestirManiqui(camisa1, pantalon);
		
		Maniqui[] maniquis= {maniqui1,maniqui2};
		return maniquis;
	}

}
