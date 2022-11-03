package Ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class LeerFiechros {
	
	public String mostrarDatos(String nombre) throws IOException{
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        FileReader fileReader = new FileReader(archivo);
        BufferedReader reader = new BufferedReader(fileReader);
        
        String linea;
	    while ( (linea = reader.readLine()) != null){
          sb.append(linea).append("\n");
	    }
//        try (BufferedReader reader = new BufferedReader(fileReader)){
//
//            String linea;
//            while ( (linea = reader.readLine()) != null){
//                sb.append(linea).append("\n");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        return sb.toString();
    }

	public List<Alumno> leerArchivoEjercicio1(String nombre) throws FileNotFoundException,IOException{
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        FileReader fileReader = new FileReader(archivo);
        BufferedReader reader = new BufferedReader(fileReader);
        Scanner scan = new Scanner(archivo);
        scan.useDelimiter("\n");
    
        // Crear lista de alumnos
        List<Alumno> listadoAlumnos = new ArrayList<Alumno>();
	    while ( scan.hasNext()){
//	    	 sb.append(scan.hasNext()).append("\n");
	    	 String linea = scan.next();
	    	 String[] datos = linea.split("\\|");
	    	 
	    	 // Creacion de objetos
	    	 // Recogemos informaciones
	    	 String nombreAlumno=datos[IFicheros.POSICION_NOMBRE];
	    	 String apellidoAlumno=datos[IFicheros.POSICION_APELLIDO];
	    	 String dniAlumno=datos[IFicheros.POSICION_DNI];
	    	 String asignaturasAlumno = datos[IFicheros.POSICION_ASIGNATURAS];
	    	 
	    	 String [] asignaturas = asignaturasAlumno.split(";");
	    	 
	    	 Set<String> setAsignaturasAlumno = new HashSet<String>();
	    	 for (String asignatura : asignaturas) {
				setAsignaturasAlumno.add(asignatura);
			}
	    	 
	    	// Por cada linea debo generar un objeto
	    	Alumno alumno = new Alumno(nombreAlumno, apellidoAlumno, dniAlumno, setAsignaturasAlumno);
         
          
          // Por cada objeto lo meto en una lista
	    	listadoAlumnos.add(alumno);
	    }

        return listadoAlumnos;
    }

}
