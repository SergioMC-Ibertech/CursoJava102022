package LambdaInterfaz;

@FunctionalInterface
public interface InterfazOperacionesMatematicas {

	String COLOR = "Azul";
	
	// Ejemplo con metodo abstracto
	int operar(int a, int b);
//	int operar(int a);
//	int operar();
	
	public default void test2() {
		System.out.println("prueba");
	}
	
	public default void test3() {
		System.out.println("prueba");
	}
}
