package curso.java.poo.ejercicio3Forma2;

public class Caballo {

	private int dorsal;
	private String nombre;
	private int velocidad;
	private int experiencia;
	private int edad;
	
	public Caballo(int dorsal, String nombre, int velocidad, int experiencia, int edad) {
		super();
		this.dorsal = dorsal;
		this.nombre = nombre;
		this.velocidad = velocidad;
		this.experiencia = experiencia;
		this.edad = edad;
	}
	
	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int correr() {
		int distancia=0;
		int random = (int)(Math.random()*10+1);
		
		distancia=((getVelocidad()+getExperiencia())-(getEdad()+random));
		
		return distancia;
	}
	
}
