package EjercicioPractico;

import java.util.ArrayList;

import curso.java.funciones.Utils_EjercicioGuerra;

public class Guerra {
	
	private String nombre;

	public Guerra(String nombre) {
		super();
		this.nombre = nombre;
	}

	public static void main(String[] args) {

		/*
		 * Enunciado: Se pide declarar, codificar y que funcione, un juego de Guerra, teniendo en cuenta los siguientes
		 * 			  detalles:
		 * 				- Interfaz con metodos atacar y defender.
		 * 				- Crear clases de los dos contendientes (Terricolas y Marcianos), (Marines y Sovieticos), (Aliados y Nazis)
		 * 				- Crear clases de las naves de los contendientes.
		 * 				- Metodo main, generar los turnos. Gana quien se quede con menos efectivos.
		 */
		
		 Guerra guerra = new Guerra("Guerra Ibertech");
		 int opcion1=0;
		 boolean validar1=false;
		 do {
			 Utils_EjercicioGuerra.menuEjercicioGuerraEquipos();
			 opcion1=Utils_EjercicioGuerra.pedirNumero("Selecciona un equipo: ");
			 switch (opcion1) {
			 	case 1:
			 		ArrayList<Orcos> orcos = new ArrayList<Orcos>();
			 		Orcos[] orco = guerra.crearOrcos();
			 		break;
			 	case 2:
			 		ArrayList<Gnoms> gnomos = new ArrayList<Gnomos>();
			 		Gnomos[] gnomo = guerra.crearGnomos();
			 		break;
			 	case 3:
			 		ArrayList<Elfos> elfos = new ArrayList<Elfos>();
			 		Elfos[] elfo = guerra.crearElfos();
			 		break;
			 	case 4:
			 		ArrayList<Vampiros> vampiros = new ArrayList<Vampiros>();
			 		Vampiros[] vampiro = guerra.crearVampiros();
			 		break;
			 	case 5:
			 		ArrayList<HombresLobo> hombresLobo = new ArrayList<HombresLobo>();
			 		HombresLobo[] hombreLobo = guerra.crearHombresLobo();
			 		break;
			 	case 6:
			 		ArrayList<Marines> marines = new ArrayList<Marines>();
			 		Marines[] marine = guerra.crearMarines();
			 		break;
			 	default:
			 		System.out.println("Opcion incorrecta, selecciona una opcion correcta.");
			 		break;
			 }
		 }(while validar!1=true);
		 
	}
	
	private Orcos[] crearOrcos() {
		
	}
	
	private Gnomos[] crearGnomos() {
		
	}
	
	private Elfos[] crearElfos() {
		
	}
	
	private Elfos[] crearVampiros() {
		
	}
	
	private Elfos[] crearHombresLobo() {
		
	}
	
	private Elfos[] crearMarines() {
		
	}

}
