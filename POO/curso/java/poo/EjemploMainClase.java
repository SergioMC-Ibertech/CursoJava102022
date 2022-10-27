package curso.java.poo;

public class EjemploMainClase {

	public static void main(String[] args) {

		String nombre="Guillermo";
		EjemploClaseA ca = new EjemploClaseA();
		ca.setNombre(nombre);
		
		System.out.println("**************");
		System.out.println(ca.getNumero1());
		System.out.println(ca.getNombre());
		System.out.println("***************");
		
		EjemploClaseA ca1 = new EjemploClaseA();
		ca1.setNombre("Toretto");
		
		EjemploClaseA ca2 = ca1;
		ca1.setNombre("Sergio");
		ca2.setNombre(ca1.getNombre());
		
		System.out.println("***************");
		System.out.println(ca.getNombre());
		System.out.println(ca);
		System.out.println(ca1);
		System.out.println(ca2);
		System.out.println("***************");
		
		EjemploClaseB cb=new EjemploClaseB("Bueno dias!!!", 13);
		EjemploClaseA ca3 =new EjemploClaseA("Guillermo", cb);
		
		System.out.println(ca3.getClaseb().getNumero3());
		
		

	}

}
