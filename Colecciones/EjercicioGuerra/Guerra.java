package EjercicioGuerra;

import java.util.ArrayList;
import java.util.List;

import curso.java.funciones.Utils_EjercicioGuerra;

public class Guerra {
	
	private List<Orcos> orcos;
	private List<NavesOrcos> navesOrcos;
	private List<Gnomos> gnomos;
	private List<NavesGnomos> navesGnomos;
	private List<Elfos> elfos;
	private List<NavesElfos> navesElfos;
	private List<Vampiros> vampiros;
	private List<NavesVampiros> navesVampiros;
	private List<HombresLobo> hombresLobo;
	private List<NavesHombresLobo> navesHombresLobo;
	private List<Marines> marines;
	private List<NavesMarines> navesMarines;
	
	public Guerra() {
		super();
		this.orcos = new ArrayList<Orcos>();
		this.navesOrcos = new ArrayList<NavesOrcos>();
		this.gnomos = new ArrayList<Gnomos>();
		this.navesGnomos = new ArrayList<NavesGnomos>();
		this.elfos = new ArrayList<Elfos>();
		this.navesElfos = new ArrayList<NavesElfos>();
		this.vampiros = new ArrayList<Vampiros>();
		this.navesVampiros = new ArrayList<NavesVampiros>();
		this.hombresLobo = new ArrayList<HombresLobo>();
		this.navesHombresLobo = new ArrayList<NavesHombresLobo>();
		this.marines = new ArrayList<Marines>();
		this.navesMarines = new ArrayList<NavesMarines>();
		
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
		
		 Guerra guerra = new Guerra();
		 int opcion1=0;
		 boolean validar1=false;
		 System.out.println("Seleccionamos el equipo 1:\n");
		 do {
			 Utils_EjercicioGuerra.menuEjercicioGuerraEquipos();
			 opcion1=Utils_EjercicioGuerra.pedirNumero("Selecciona un equipo: ");
			 switch (opcion1) {
			 	case 1:
			 		guerra.crearOrcos();
			 		validar1=true;
			 		break;
			 	case 2:
			 		guerra.crearGnomos();
			 		validar1=true;
			 		break;
			 	case 3:
			 		guerra.crearElfos();
			 		validar1=true;
			 		break;
			 	case 4:
			 		guerra.crearVampiros();
			 		validar1=true;
			 		break;
			 	case 5:
			 		guerra.crearHombresLobo();
			 		validar1=true;
			 		break;
			 	case 6:
			 		guerra.crearMarines();
			 		validar1=true;
			 		break;
			 	default:
			 		System.out.println("Opcion incorrecta, selecciona una opcion correcta.");
			 		break;
			 }
		 }while (validar1!=true);
		 
		 int opcion2=0;
		 boolean validar2=false;
		 System.out.println("Seleccionamos el equipo 2:\n");
		 do {
			 Utils_EjercicioGuerra.menuEjercicioGuerraEquipos();
			 opcion2=Utils_EjercicioGuerra.pedirNumero("Selecciona un equipo: ");
			 if(opcion2!=opcion1) {
				 switch (opcion2) {
				 	case 1:
				 		guerra.crearOrcos();
				 		validar1=true;
				 		break;
				 	case 2:
				 		guerra.crearGnomos();
				 		validar1=true;
				 		break;
				 	case 3:
				 		guerra.crearElfos();
				 		validar1=true;
				 		break;
				 	case 4:
				 		guerra.crearVampiros();
				 		validar1=true;
				 		break;
				 	case 5:
				 		guerra.crearHombresLobo();
				 		validar1=true;
				 		break;
				 	case 6:
				 		guerra.crearMarines();
				 		validar1=true;
				 		break;
				 	default:
				 		System.out.println("Opcion incorrecta, selecciona una opcion correcta.");
				 		break;
				 }
			 }else {
				 System.out.println("Error, debes de seleccionar un equipo diferente.");
			 }
		 }while (validar2!=true);
		 
	}
	
	private void crearOrcos() {
		Orcos orco1 = new Orcos("Orco1", "oscuro1", puntosAtaque(), puntosDefensa());
		Orcos orco2 = new Orcos("Orco2", "oscuro2", puntosAtaque(), puntosDefensa());
		Orcos orco3 = new Orcos("Orco3", "oscuro3", puntosAtaque(), puntosDefensa());
		Orcos orco4 = new Orcos("Orco4", "oscuro4", puntosAtaque(), puntosDefensa());
		Orcos orco5 = new Orcos("Orco5", "oscuro5", puntosAtaque(), puntosDefensa());
		orcos.add(orco1);
		orcos.add(orco2);
		orcos.add(orco3);
		orcos.add(orco4);
		orcos.add(orco5);
		
		NavesOrcos naveOrco1 = new NavesOrcos("NaveOrco1", "Tenebroso1", puntosAtaque(), puntosDefensa());
		
	}
	
	private void crearGnomos() {
			
	}
	
	private void crearElfos() {
		
	}
	
	private void crearVampiros() {
		
	}
	
	private void crearHombresLobo() {
		
	}
	
	private void crearMarines() {
		
	}
	
	private int puntosAtaque() {
		int ataque=(int)(Math.random()*100+1);
		return ataque;
	}
	
	private int puntosDefensa() {
		int defensa=(int)(Math.random()*100+1);
		return defensa;
	}
	
}