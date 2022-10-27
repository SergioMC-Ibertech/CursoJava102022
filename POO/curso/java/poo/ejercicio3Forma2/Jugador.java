package curso.java.poo.ejercicio3Forma2;

public class Jugador {
	
	private String nombre;
	private int saldo;
	private Apuesta apuesta;
	
	public Jugador(String nombre, int saldo, Apuesta apuesta) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;
		this.apuesta = apuesta;
	}
	
	public Jugador() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public Apuesta getApuesta() {
		return apuesta;
	}

	public void setApuesta(Apuesta apuesta) {
		this.apuesta = apuesta;
	}
	
	public boolean apostar(int num) {
		boolean apostar=false;
		
		if (num>getSaldo()) {
			System.err.println("No puedes apostar, porque no tienes suficiente saldo"+getSaldo());
		}else {
			apostar=true;
		}
		
		return apostar;
	}
	
	public void jugadorGanador(Apuesta apuesta) {
		System.out.println("El jugador ganador de la apuesta es: "+getNombre());
		if (this.nombre.equals(getNombre())) {
			aumentoSaldo(getSaldo());
		}
	}
	
	private int aumentoSaldo(int saldo) {
		saldo*=5;
		return saldo;
	}
}
