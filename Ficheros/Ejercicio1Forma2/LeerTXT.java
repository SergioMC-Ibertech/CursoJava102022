package Ejercicio1Forma2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeerTXT {

	public String mostrarContenidoArchivo(String nombre) {
		// Invocamos a la clase constructora de Strings
        StringBuilder sb = new StringBuilder();
        // Creamos un objeto de tipo archivo y haciendo referencia al archivo concreto
        File archivo = new File(nombre);
        
        try {
        	// Abrimos comunicacion con el archivo invocado
        	FileReader fileReader = new FileReader(archivo);
            BufferedReader reader = new BufferedReader(fileReader);
            String linea;
            // Recorre e imprime por pantalla el contenido linea a linea del archivo
            while ( (linea = reader.readLine()) != null){
                sb.append(linea).append("\n");
            }
            // Cerramos comunicacion con el archivo invocado
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
	
	public List<Alumno> mostrarCadaAlumno(String nombre) {
		// Creamos un objeto de tipo archivo y asociandolo con el entregado por parametro de la funcion
        File archivo = new File(nombre);
        
        // Creamos una lista vacia de objetos de tipo alumno
        List<Alumno> alumnos = new ArrayList<Alumno>();
        try {
        	// Abrimos comunicacion con el archivo invocado
        	FileReader fileReader = new FileReader(archivo);
            BufferedReader reader = new BufferedReader(fileReader);
            String linea;
            
            // Recorremos el contenido del archivo invocado linea a linea
            while ( (linea = reader.readLine()) != null){
            	
            	// Generamos un array, capturando las cadenas de texto delimitadas por el caracter especial "|"
                String[] datos = linea.split("\\|");
                // Asignamos cada cadena de texto obtenia a cada variable del mismo tipo de dato
				String nombreAlumno = datos[0];
				String apellidoAlumno = datos[1];
				String dniAlumno = datos[2];
				String asignaturasAlumno = datos[3];
				
				// Generamos un array, capturando las cadenas de texto delimitadas por el caracter especial ";"
				String[] asignaturas = asignaturasAlumno.split(";");
				List<String> listAsignaturasAlumnos = new ArrayList<String>();
				for (String asignatura : asignaturas) {
					listAsignaturasAlumnos.add(asignatura);
				}
				Alumno alumno = new Alumno(nombreAlumno, apellidoAlumno, dniAlumno, listAsignaturasAlumnos);
				alumnos.add(alumno);
                          
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return alumnos;
    }
}
