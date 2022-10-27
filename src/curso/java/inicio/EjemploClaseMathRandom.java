package curso.java.inicio;

import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

//        String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};
//
//        // Generamos un numero aleatorio decimal 0.0 al 1.0
//        double random = Math.random();
//        System.out.println("random = " + random);
//        // El rango de valores del numero aleatorio se modifica de 0.0 a 6.0
//        random *= colores.length;
//
//        System.out.println("random = " + random);
//        
//        System.out.println("random = " + random);
//        System.out.println("random = " + Math.ceil(random));
//        
//        System.out.println("floor = " + Math.floor(Math.PI));
//        System.out.println("ceil = " + Math.ceil(Math.PI));
//
//        System.out.println("colores = " + colores[(int) random]);
//        
//        Random randomObj = new Random();
//        int randomInt = 15 + randomObj.nextInt(25-15+1);
//        System.out.println("randomInt = " + randomInt);
//
//        randomInt = randomObj.nextInt(colores.length);
//        System.out.println("randomInt = " + randomInt);
//        System.out.println("colores = " + colores[randomInt]);
        
        
        // Codigo para llamar al metodo de tirar dados
        for(int i=0; i<=5; i++) {
        	tirarDado(6);
        }
        
    }
    
    static void tirarDado(int numCaras) {
    	double random = Math.random();
    	int tirada =  (int)Math.ceil((numCaras *random));
    	System.out.println(tirada);
    }
}
