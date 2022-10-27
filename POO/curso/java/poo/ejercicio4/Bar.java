package curso.java.poo.ejercicio4;

public class Bar {
	
	private String nombre;

	public Bar(String nombre) {
		super();
		this.nombre = nombre;
	}

	public static void main(String[] args) throws TemperatureException{
		
		/*
		 * Enunciado: Se desea generar varias excepciones, siguiendo los siguientes datos:
		 * 				- Clase Padre Excepcion -> TemperatureException
		 * 				- Clase hija Excepcion -> TooHotTemperatureException
		 * 				- Clase hija Excepcion -> TooColdTemperatureException
		 * 				- Clase CoffeCup --> atributo -> Temperatura
		 * 				- Clase Cliente --> atributo -> nombre
		 * 					* Metodo de tomarCafe(CoffeCup) --> Si la temperatura es superior a 80, lanzar la excepcion
		 * 														TooHotTemperatureException y si es inferior a 20, lanzar
		 * 														la excepcion TooColdTemperatureException. Si esta entre
		 * 														20 y 80 lanzar un "sysout" - El cliente se toma la taza
		 * 														de cafe.
		 * 				- Clase principal (Main):
		 * 
		 * 					Crear un objeto de tipo CoffeCup -> Darle una temperatura (1-100) mediante un random.
		 * 					Crear un objeto Cliente.
		 * 
		 * 					Cliente tome la taza de café, el cliente se ha quemado/El cliente se ha dejado el cafe
		 */
		
		// Creamos los objetos y generamos la temperatura de la taza de cafe
		Bar bar = new Bar("Bar Ibertech");
		Cliente cliente = new Cliente("Guillermo");
		int temperatura = bar.generarTemperatura();
		CoffeCup taza = new CoffeCup(temperatura);
		
		try {
			cliente.tomarCafe(taza);
		}catch(TooHotTemperatureExcepcion thte) {
			System.out.println("El cliente se ha quemado, "+thte.getMessage());
		}catch(TooColdTemperatureExcepcion tcte) {
			System.out.println("El cliente se ha dejado el cafe, "+tcte.getMessage());
		}

	}
	
	private int generarTemperatura() {
		int random = (int)(Math.random()*100+1);
		return random;
	}

}
