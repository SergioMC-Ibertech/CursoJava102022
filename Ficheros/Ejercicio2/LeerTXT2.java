package Ejercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LeerTXT2 {

	public Map<String, List<Alumno2>> ordenarDatos(String archivo){
		// Creamos el objeto fichero, para decirle donde esta
		File file = new File(archivo);
		
		// Creamos el mapa
		Map<String,List<Alumno2>> colegios = new HashMap<String,List<Alumno2>>();

		try {
			// Abrimos la conexion con el archivo
			FileReader fr = new FileReader(file);
			BufferedReader reader = new BufferedReader(fr);
			
			// Generamos un limitador
			Scanner scan = new Scanner(file);
			scan.useDelimiter("\n");
			
			// Bucle "while" para recorrer linea a linea del archivo abierto
			while(scan.hasNext()) {
				String linea=scan.next();
				
				// Generamos array para recoger todas las palabras delimitadas por "|"
				String[] alumnos = linea.split("\\|");
				
				// Asignamos cada valor que se obtenga del array a una variable de tipo String
					String colegio = alumnos[0];
				String nombreAlumno = alumnos[1];
				String apellidoAlumno = alumnos[2];
				String dniAlumno = alumnos[3];
				String asignaturasAlumno = alumnos[4];
				
				// Generamos array para recoger todas las palabras delimitadas por ";"
				String[] asignaturas = asignaturasAlumno.split(";");
				
				// Creamos una lista para recoger las asignaturas
				List<String> asignaturaAlumno = new ArrayList<String>();
				
				// Recorremos el array y asignamos cada valor que se obtenga a una variable de tipo String a la lista
				for (String asig : asignaturas) {
					// Añadimos cada palabra extraida a la lista
					asignaturaAlumno.add(asig);
				}
				
				// Creamos un objeto tipo Alumno para asignarle los parametros extraidos por los bucles y por el caracter de separacion
				Alumno2 alumno = new Alumno2(nombreAlumno, apellidoAlumno, dniAlumno, asignaturaAlumno);
				// Indicamos si el mapa contiene como clave el valor de "colegio" extraido en el primer bucle for each
				// En el caso de encontrarlo, creamos una lista de alumnos para agregarselo como valor a esa key
				if(colegios.containsKey(colegio)) {
					List<Alumno2> colegioAlumnos = colegios.get(colegio);
					colegioAlumnos.add(alumno);
				// En el caso de no encontrar el colegio en la key, generamos la lista
				}else {
					List<Alumno2> colegioAlumnos = new ArrayList<Alumno2>();
					colegioAlumnos.add(alumno);
					colegios.put(colegio, colegioAlumnos);
				}
				
			}
			scan.close();
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return colegios;
	}
}
