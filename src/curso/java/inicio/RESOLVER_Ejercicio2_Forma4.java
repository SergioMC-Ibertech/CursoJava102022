package curso.java.inicio;

import curso.java.funciones.Utils;
import curso.java.funciones.Utils_Ejercicio2;

public class RESOLVER_Ejercicio2_Forma4 {

	//Generamos las constantes para la agilizacion de las operaciones
	private static final String INSERCCION="insertar";
	private static final String BUSQUEDA="buscar";
	private static final String BORRADO="borrar";
	private static final String MOSTRARAULA="mostrarAula";
	private static final String COLEGIO="alumnos";
	private static final String LIBRE="libre";

	public static void main(String[] args) {

		/*
		 * Enunciado: ¿Cuantas aulas tiene el colegio?. Por cada aula ¿Cuantos alumnos caben en el aula?.
		 * 			  El colegio debe de tener un menu, en el que debe contener y redactar el codigo:
		 * 				- 1.Insertar Alumno por Aula:
		 * 						* En que aula quieres meter al alumno
		 * 						* Pedir nombre y guardar en la primera posicion vacia
		 * 						** Si el aula esta llena indicarlo
		 * 				- 2.Buscar Alumno:
		 * 						* Pedir nombre del alumno
		 * 						* Indicar en que aula se encuentra.Si hay coincidencias, cortar la busqueda
		 * 						** Si no se encuentra el alumno, indicar que no pertenece al colegio
		 * 				- 3.Borrar Alumno
		 * 						* Pedir nombre del alumno
		 * 						* Si lo encuentra, borrar.
		 * 				- 4.Mostrar Alumnos por Aula
		 * 						* Pedir de que aula se quiere mostrar
		 * 						* Mostrar los alumnos de ese aula
		 * 				- 5.Mostrar Alumnos
		 * 						* Muestre todos los alumnos del colegio por aula
		 * 				- 6.Mostrar plazas libres
		 * 				- 7.Salir
		 * 
		 * 			   Para ello, redactarlo por una matriz bidimensional 3x??(A criterio de cada colegio)
		 */

		String[][] colegio=null;
		int aulas = Utils_Ejercicio2.pedirNumero("¿Cuantas aulas tiene tu colegio?: ");
		if (validarAulaPupitres(aulas)==false) {
			System.err.println("Error amig@, un aula no puede ser un numero negativo");
		}else {
			colegio=new String[aulas][];
			int pupitres = 0;
			for (int i=0; i<aulas; i++) {
				do {
					pupitres=Utils_Ejercicio2.pedirNumero("¿Cuantos alumnos tendra el aula "+i+"?: ");
					if (validarAulaPupitres(pupitres)==false) {
						System.err.println("Error amig@, un aula no puede tener pupitres negativos");
					}else {
						colegio[i]=new String[pupitres];
					}
				}while(validarAulaPupitres(pupitres)==false);
			}
			
			Utils_Ejercicio2.menuEjercicio2();
			int opcion = Utils_Ejercicio2.pedirNumero("Selecciona una opcion: ");
			do {
				switch (opcion) {
					case 1:operarAlumnos(colegio,INSERCCION);break;
					case 2:gestionAlumnos(colegio,BUSQUEDA);break;
					case 3:operarAlumnos(colegio,BORRADO);break;
					case 4:gestionAlumnos(colegio,MOSTRARAULA);break;
					case 5:gestionAlumnos(colegio,COLEGIO);break;
					case 6:gestionAlumnos(colegio,LIBRE);break;
					case 7:System.out.println("Todos a casa!!!");break;
					default:System.err.println("Opcion incorrecta, selecciona una de las opciones del menu.");
				}
			}while(opcion!=7);
		}
		
	}
	
	//Metodo para validar si el numero metido de aulas y numero de pupitres son correctos
	static boolean validarAulaPupitres(int num) {
		boolean aulaPupitres=false;
		
		if (num < 0) {
			return aulaPupitres=false;
		}else {
			return aulaPupitres=true;
		}
	}
	
	//Metodo para realizar operaciones de datos con los alumnos
	static void operarAlumnos(String colegio[][], String accion) {
		int aula = Utils_Ejercicio2.pedirNumero("Dime en que aula quieres insertar al alumno/a: ");
		//Verificamos que el aula existe
		if(verificarAulaEscrita(colegio,aula)==false) {
			System.err.println("Aula incorrecta.");
		}else {
			//Buscamos si existe un hueco vacio en el aula inidicado
			for(int i=0; i<colegio.length; i++) {
				if(colegio[aula][i]==null) {
					if(accion.equals(INSERCCION)) {
						String nomAlu = Utils.pideValor("Dime el nombre del Alumno/a: ");
						colegio[aula][i]=nomAlu;
						break;
					}
				}else if(i==colegio.length-1) {
					System.out.println("El aula "+aula+" esta completa y no admite mas alumnos");
				}if(accion.equals(BUSQUEDA)) {
					String nomAlu = Utils.pideValor("Dime el nombre del Alumno/a: ");
					System.out.println("El alumno "+nomAlu+" esta en el aula "+i);
				}
			}
		}
		if(accion.equals(LIBRE)){
			plazasLibres(colegio);
		}
		
	}
	
	//Metodo para obtener informacion de los alumnos del centro educativo
	static void gestionAlumnos(String colegio[][], String accion) {
		boolean alumnoEncontrado=false;
		String nomAlu = Utils.pideValor("Dime el nombre del Alumno/a a buscar: ");
		//Buscamos si existe coincidencia
		for(int i=0; i<colegio.length; i++) {
			for(int j=0; j<colegio[i].length; j++) {
				if(colegio[i][j]!=null && colegio[i][j].equals(nomAlu)) {
					
					System.out.println("El alumno "+nomAlu+" esta en el aula "+i);
					alumnoEncontrado=true;
					break;
				}
			}
			if(alumnoEncontrado==true) {
				break;
			}
		}
		//En el caso de que no se encuentre el alumno dentro del centro educativo
		if (alumnoEncontrado==false) {
			System.out.println("El alumno "+nomAlu+" no pertenece al centro educativo");
		}
	
	}
	
	static boolean verificarAulaEscrita(String colegio[][], int num) {
		
		if (num > colegio.length && num < 0) {
			return false;
		}else {
			return true;
		}
	}
	
	static void borrarAlumno(String colegio[][]) {
		boolean alumnoBorrado = false;
		String nomAlu = Utils.pideValor("Dime el nombre del Alumno/a: ");
		//Buscamos si existe coincidencia
		for(int i=0; i<colegio.length; i++) {
			for(int j=0; j<colegio[i].length; j++) {
				if(colegio[i][j]!=null && colegio[i][j].equals(nomAlu)) {
					colegio[i][j]=null;
					alumnoBorrado=true;
					break;
				}
			}
			if(alumnoBorrado==true) {
				System.out.println("El alumno "+nomAlu+" fue borrado exitosamente.");
				break;
			}
		}
		
		if(alumnoBorrado==false) {
			System.out.println("El alumno "+nomAlu+" no pertenece al centro educativo");
		}
	}
	
	static void plazasLibres(String colegio[][]) {
		int numPlazasLibres=0;		
		for(int i=0; i<colegio.length; i++) {
			for(int j=0; j<colegio.length; j++) {
				if(colegio[i][j]==null) {
					numPlazasLibres++;
				}
			}
		}
		System.out.println("El colegio dispone de "+numPlazasLibres+" libres.");
	}
	
	static void todosAlumnos(String colegio[][]) {
		for(int i=0; i<colegio.length; i++) {
			for(int j=0; j<colegio.length; j++) {
				System.out.println("El alumno "+(j+1)+" del aula "+(i+1)+" es: "+colegio[i][j]);
			}
		}
	}
	
	static void buscarAlumno(String colegio[][]) {
		boolean alumnoEncontrado=false;
		String nomAlu = Utils.pideValor("Dime el nombre del Alumno/a a buscar: ");
		//Buscamos si existe coincidencia
		for(int i=0; i<colegio.length; i++) {
			for(int j=0; j<colegio[i].length; j++) {
				if(colegio[i][j]!=null && colegio[i][j].equals(nomAlu)) {
					System.out.println("El alumno "+nomAlu+" esta en el aula "+i);
					alumnoEncontrado=true;
					break;
				}
			}
			if(alumnoEncontrado==true) {
				break;
			}
		}
		//En el caso de que no se encuentre el alumno dentro del centro educativo
		if (alumnoEncontrado==false) {
			System.out.println("El alumno "+nomAlu+" no pertenece al centro educativo");
		}
	}

}
