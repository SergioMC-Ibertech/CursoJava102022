package Ejemplo;

import java.util.HashSet;
import java.util.Set;

import curso.java.poo.ejercicio2aEjemploProfe.Boton;

public class Conjuntos {

	public static void main(String[] args) {

		// Generamos una coleccion de elementos con el metodo Set y constructor HashSet
		Set<String> colores = new HashSet<String>();
		
		colores.add("Amarillo");
		colores.add("Azul");
		colores.add("Amarillo");
		
		String color= "Amarillo";
		boolean added = colores.add("Amarillo");
		System.out.println(added);
		
		colores.add("Azul");
		String color2 = new String("Amarillo");
		System.out.println(color.hashCode());
		added = colores.add(color2);
		System.out.println(added);
		colores.add("Rojo");
		colores.add("Blanco");
		
		// Imprimimos por pantalla todos los colores con el bucle for each
		for (String colorin : colores) {
			System.out.println(colorin);
		}
		colores.remove("Rojo");
		System.out.println("*********************");
		for (String colorin : colores) {
			System.out.println(colorin);
		}
		
		colores.contains("Blanco");
		
		
		// Generamos una coleccion de elementos con el metodo Set y constructor HashSet
//		Set<Boton> botones = new HashSet<Boton>();
//		Boton boton1 = new Boton("Rojo","Redondo");
//		Boton boton2 = new Boton("Rojo","Cuadrado");
//		
//		
//		System.out.println(botones.add(boton1));
//		System.out.println(botones.add(boton1));
//		System.out.println(botones.size());
//		
//		for (Boton boton : botones) {
//			System.out.println(boton.getColor());
//		}
		

		
	}

}
