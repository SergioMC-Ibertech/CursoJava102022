package EjemploMapa;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import EjercicioColegioForma2.Estudiante;


public class UsandoMaps {

	public static void main(String[] args) {

		// Cabecera para invocar a un mapa
		Map<Long, Estudiante> mapa1 = new HashMap<Long, Estudiante>();
		
		// Añadimos informacion al mapa
		Estudiante estudiante1 = new Estudiante("Guillermo", "Toretto", 89452387);
		Estudiante estudiante2 = new Estudiante("Sergio", "Toretto", 56129845);
		mapa1.put(estudiante1.getDni(), estudiante1);
		mapa1.put(estudiante2.getDni(), estudiante2);
		
		/*
		 * Buscamos un dato, comparandolo con una lista
		 */
		
		// Usando Map
		Estudiante estudiante = mapa1.get(89452387);
		System.out.println(estudiante.getNombre());
		
		// Usando una lista
//		List<Estudiante> estudiantes = new ArrayList<Estudiante>();
//		estudiantes.add(estudiante1);
//		estudiantes.add(estudiante2);
//		Long dni = (long) 89452387;
//		for (Estudiante estudiante : estudiantes) {
//			if(estudiante.getDni()==89452387) {
//				System.out.println(estudiante.getNombre());
//			}
//		}
		
//		// Generamos una lista del personal de un hospital
//		Map<String, List<Persona> > colegio = new HashMap<String, List<Persona>>();
//		colegio.put("estudiantes", null);
//		colegio.put("profesores", null);
//		colegio.put("secretaria", null);
//		colegio.put("direccion", null);
		
		// Metodo "containsKey" devuelve true o false si contiene el elemento dentro del mapa
		if (mapa1.containsKey(89452387)) {
			
		}
		
		// Metodo "keySet", devolviendo una coleccion Set con las claves que contiene el mapa
		for (Long clave : mapa1.keySet()) {
			System.out.println(clave);
			System.out.println(mapa1.get(clave).getNombre());
		}
		
		// Metodo para recorrer todos los valores de un mapa
		for (Estudiante estu : mapa1.values()) {
			System.out.println(estu.getNombre());
		}
		
		// Metodo para recorrer todo el mapa completo, tanto claves(key) como valores(value)
		
		
		//
		Set <Entry<Long, Estudiante>> entrySet = mapa1.entrySet();
		for (Entry<Long, Estudiante> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue().getNombre());
		}
		
		// Metodo
		mapa1.containsValue(estudiante1);
		
		// Metodo
		mapa1.size();
		

	}

}
