package curso.java.poo.herencia;

public class ClaseHeredada extends Herencia {
	
	private String asignaturaFavorita;
	
	// Metodo conctructor Heredando del metodo constructor de la clase heredada
	public ClaseHeredada(String nombre, int edad, boolean mayorEdad) {
		super(nombre, edad, mayorEdad);
	}
	
	// Metodo constructor propio, pero con los atributos y metodo super de los atributos de la clase heredada
	public ClaseHeredada (String nombre, int edad, boolean mayorEdad,String asignaturaFavorita) {
		super(nombre, edad, mayorEdad);
		System.out.println("Constructor de la clase heredada");
		this.asignaturaFavorita=asignaturaFavorita;
	}


	public String getAsignaturaFavorita() {
		return asignaturaFavorita;
	}

	public void setAsignaturaFavorita(String asignaturaFavorita) {
		this.asignaturaFavorita = asignaturaFavorita;
	}
	
	// Sobreescribir un metodo heredado correctamente y exactamente igual
	@Override
	public void metodo1() {
		// TODO Auto-generated method stub
		super.metodo1();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
//	@Override
//	public void metodo1() {
//		System.out.println("Llamando metodo 1 desde la Clase Heredada");
//	}
}
