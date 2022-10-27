package curso.java.inicio;

import curso.java.funciones.Utils;
import curso.java.funciones.Utils_Ejercicio2;

public class Ejercicio2 {

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
		int aulas = Utils_Ejercicio2.pedirNumero("¿Cuantas aulas tiene tu colegio?: \n");
		if (aulas <= 0) {
			System.err.println("Error un colegio no puede tener 0 o un numero negativo de aulas\n");
		}else {
			// Pedimos al usuario cuantos alumnos por aula, en concreto
			String[][] colegio=new String[aulas][];
			int alumnos = 0;
			for (int i = 0; i<aulas; i++) {
				do{
					alumnos = Utils_Ejercicio2.pedirNumero("¿Cuantos alumnos en el aula "+i+"?: \n");
					if (alumnos <=0) {
						System.err.println("Error un colegio no puede tener 0 o un numero negativo de alumnos\n");
					}else {
						colegio[i]=new String[alumnos];
					}
				}while(alumnos <= 0);
			}
			
			int opcion=0;
			do {
				Utils_Ejercicio2.menuEjercicio2();
				opcion = Utils_Ejercicio2.pedirNumero("Selecciona una opcion: ");
				
				switch (opcion) {
				case 1: 
					int insertarAula = Utils_Ejercicio2.pedirNumero("¿En que aula quieres asignar al nuevo alumno?");
					boolean aulaCompleta=false;
					if (insertarAula > aulas) {
						System.out.println("No existe el aula "+ insertarAula);
					}else {
						for (int i = 0; i < colegio[insertarAula].length; i++) {
							if (colegio[insertarAula][i]==null) {
								String nombre = Utils.pideValor("Introduce el nombre del alumno: ");
								colegio[insertarAula][i]=nombre;
								break;
							}else if(i==colegio[insertarAula].length-1){
								aulaCompleta=true;
							}
								
						}
						
						if (aulaCompleta == true){
							System.out.println("No hay huecos disponibles en el aula "+insertarAula);
						}
						
					}
					break;
				case 2: 
					boolean alumnoEncontrado = false;
					String nombre = Utils.pideValor("Dime el nombre del alumno que quieres"
							+ " buscar en el centro: ");
					for (int i = 0; i<colegio.length; i++) {
						for(int j=0; j < colegio[i].length; j++) {
							if(colegio[i][j]!=null && colegio[i][j].equals(nombre)) {
								System.out.println("El alumno "+nombre+" Se encuentra en el aula "+ i);
								alumnoEncontrado=true;
								break;
							}
						}
						if (alumnoEncontrado==true) {
							break;
						}
					}
					if(alumnoEncontrado==false) {
						System.out.println("El alumno "+nombre+" no se encuentra en este centro"
								+ " educativo");
					}
					break;
				case 3: 
					boolean alumnoBorrar=false;
					String alu = Utils.pideValor("Dime el nombre del alumno que quieres"
							+ " buscar en el centro: ");
					for (int i = 0; i<colegio.length; i++) {
						for(int j=0; j<colegio[i].length; j++) {
							if(colegio[i][j]!=null && colegio[i][j].equals(alu)) {
								colegio[i][j]=null;
								alumnoBorrar=true;
								break;
							}
						}
						if(alumnoBorrar==true) {
							System.out.println("El alumno "+alu+" se ha borrado existosamente.");
							break;
						}
					}
					if (alumnoBorrar==false) System.out.println("El alumno "+alu+" no se encuentra en este centro"
							+ " educativo");
					break;
				case 4: 
					int mostrarAula = Utils_Ejercicio2.pedirNumero("¿En que aula quieres asignar al nuevo alumno?");
					for (int i = 0; i<colegio[mostrarAula].length; i++) {
						System.out.println("\tAula "+mostrarAula+"\t"+colegio[mostrarAula][i]);
					}
					break;
				case 5: 
					for (int i = 0; i<colegio.length; i++) {
						System.out.println("Aula "+i);
						for(int j=0; j < colegio[i].length; j++) {
							System.out.println("\t "+colegio[i][j]);
						}
						System.out.println();
					}
					break;
				case 6:
					int contador=0;
					
					for (int i = 0; i<colegio.length; i++) {
						for(int j=0; j < colegio[i].length; j++) {
							if(colegio[i][j]==null) {
								contador++;
							}
						}
					}
					System.out.println("Tu colegio tiene este numero "+contador+" de"
							+ " plazas libres.");
					break;
				case 7: System.out.println("Se acabo el cole, a CASA!!!"); break;
				}
			}while(opcion != 7);
		}

	}

}
