package curso.java.poo;

public class EjemploClaseA {

	// Variables de instancia o atributos
	private int numero1;
	private int numero2;
	private String nombre;
	private EjemploClaseB claseb;
	
	//Constructor con un parametro de los atributos
	public EjemploClaseA(String nombre) {
		this.nombre=nombre;
	}
	
	//Constructor con 3 parametros
	public EjemploClaseA(int numero1, int numero2, String nombre) {
		this.numero1=numero1;
		this.numero2=numero2;
		this.nombre=nombre;
	}
	
	//Constructor vacio o constructor por defecto, sino, se crea un constructor con parametros
	public EjemploClaseA() {
		
	}
	
	
	
	public EjemploClaseA(String nombre, EjemploClaseB claseb) {
		super();
		this.nombre = nombre;
		this.claseb = claseb;
	}

	// Metodos Getter & Setter -> Permite el cambio del valor de los atributos
	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public EjemploClaseB getClaseb() {
		return claseb;
	}

	public void setClaseb(EjemploClaseB claseb) {
		this.claseb = claseb;
	}

	//Metodos o funciones
	void funcion1 () {
		System.out.println("Funcion 1.");
	}
	
}
