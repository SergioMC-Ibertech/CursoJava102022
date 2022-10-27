package curso.java.inicio;

import curso.java.funciones.Utils;
import curso.java.funciones.Utils_Ejercicio2;

public class Ejercicio2_Forma2 {

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
		
		//Pedimos al usuario cuantas aulas
		String[][] colegio=null;
		boolean au=false,na=false;
		int aulas = Utils_Ejercicio2.pedirNumero("¿Cuantas aulas tiene tu colegio?: \n");
		if (aulas <= 0) {
			System.err.println("Error un colegio no puede tener 0 o un numero negativo de aulas\n");
		}else{
			au=true;
			colegio = new String[aulas][];
		}
		
		//Pedimos el numero de alumnos por aula
		for (int i=0; i<aulas; i++) {
			int alumnos = Utils_Ejercicio2.pedirNumero("¿Cuantos alumnos quieres en el aula "+(i+1)+" ?");
			if(alumnos <=0) {
				System.err.println("Error un colegio no puede tener 0 o un numero negativo de alumnos\n");
				i-=1;
			}else{
				colegio[i]=new String[alumnos];
			}
		}
		na=true;
		
		//Menu
		if (au==true && na==true) {
			int opcion=0;
			do {
				Utils_Ejercicio2.menuEjercicio2();
				opcion = Utils_Ejercicio2.pedirNumero("Selecciona una opcion: ");
				switch (opcion) {
					case 1:insertarAlumno(colegio); break;
					case 2:buscarAlumno(colegio); break;
					case 3:borrarAlumno(colegio); break;
					case 4:mostarAlumnosAula(colegio); break;
					case 5:mostrarAlumnos(colegio); break;
					case 6:mostrarPlazasLibres(colegio);break;
					case 7:System.out.println("Todo el mundo a casa !!!!");break;
					default:System.err.println("Opcion incorrecta, selecciona una opcion correcta");break;
				}
			}while(opcion != 7);
		}

	}
	
	//Metodo para insertar un alumno en un aula concreto
	static void insertarAlumno(String colegio[][]) {
		int aula = Utils_Ejercicio2.pedirNumero("Dime en que aula quieres insertar al alumno/a: ");
		//Verificamos que el aula existe
		if(aula > colegio.length && aula < 0) {
			System.err.println("Aula incorrecta.");
		}else {
			//Buscamos si existe un hueco vacio en el aula inidicado
			for(int i=0; i<colegio.length; i++) {
				if(colegio[aula][i]==null) {
					String nomAlu = Utils.pideValor("Dime el nombre del Alumno/a: ");
					colegio[aula][i]=nomAlu;
					break;
				}else if(i==colegio.length-1) {
					System.out.println("El aula "+aula+" esta completa y no admite mas alumnos");
				}
			}
		}
	}
	
	//Metodo que busca un alumno en un aula concreta
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
	
	//Metodo que borra un alumno en un aula concreta
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
	
	//Metodo que enseña los nombres de los alumnos de un aula concreta
	static void mostarAlumnosAula(String colegio[][]) {
		int aula = Utils_Ejercicio2.pedirNumero("Dime en que aula quieres insertar al alumno/a: ");
		for(int i=0; i<colegio.length; i++) {
			System.out.println("El alumno "+(i+1)+" del aula "+aula+" es: "+colegio[aula][i]);
		}
	}
	
	//Metodo que enseña todos los alumnos del centro educativo
	static void mostrarAlumnos(String colegio[][]) {
		for(int i=0; i<colegio.length; i++) {
			for(int j=0; j<colegio.length; j++) {
				System.out.println("El alumno "+(j+1)+" del aula "+(i+1)+" es: "+colegio[i][j]);
			}
		}
	}
	
	//Metodo que nos devuelve el numero de plazas libres del centro educativo
	static void mostrarPlazasLibres(String colegio[][]) {
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

}
