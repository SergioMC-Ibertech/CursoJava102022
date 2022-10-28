package Ejemplo;

import java.util.ArrayList;

import curso.java.poo.ejercicio2aEjemploProfe.Boton;

public class ListasJava {

	public static void main(String[] args) {

		ArrayList<String> lista1 = new ArrayList<String>();
		
		lista1.add("Hola");
//		lista1.add(1);					Da error, ya que el tipo generico (tipo de dato) no son el mismo. Por tanto la lista tiene que ser del mismo tipo con ArrayList
//		lista1.add(new Boton("",""));	Da error, ya que el tipo generico (tipo de dato) no son el mismo. Por tanto la lista tiene que ser del mismo tipo con ArrayList
		lista1.add("que");
		lista1.add("tal");
		lista1.add(1,"Hoy es viernes por fin!!!");
		
		// Imprimimos el contenido de la lista
		for (String texto : lista1) {
			System.out.println(texto);
		}
		
		/*
		 * METODOS
		 */
		// Devuelve el tamaño de la lista
		System.out.println(lista1.size());
		
		// Metodo que devuelve si la lista si esta vacia o no, devuelve un booleano
		System.out.println(lista1.isEmpty());
		
		// Metodo que añade elementos de otra lista
//		System.out.println(lista1.addAll(null));
		
		// Metodo para saber si contiene un determinado elemento dentro de la lista, devuelve un booleano
		System.out.println(lista1.contains("Hola"));
		
		// metodo que devuelve un elemento en una posicion determinada
		System.out.println(lista1.get(2));
		
		// Metodo que sustituye el valor de un elemento en una determinada posicion, donde se encuentre ese elemento
		System.out.println(lista1.set(0, "hey"));
		
		// Metodo eliminar un elemento, segun en la posicion que se encuentre dentro de la lista o un elemento en concreto
		lista1.remove(0);
		lista1.remove("Hola");
		
	}

}
