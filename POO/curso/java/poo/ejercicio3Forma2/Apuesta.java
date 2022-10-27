package curso.java.poo.ejercicio3Forma2;

public class Apuesta {

	private int cantidad;
	private Caballo caballo;
	
	public Apuesta(int cantidad, Caballo caballo) {
		super();
		this.cantidad = cantidad;
		this.caballo = caballo;
	}
	
	public Apuesta() {
		super();
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Caballo getCaballo() {
		return caballo;
	}

	public void setCaballo(Caballo caballo) {
		this.caballo = caballo;
	}
	
	public void apuestaGanadora(Caballo caballo) {
		System.out.println("El caballo ganador es "+caballo.getDorsal()+" con el nombre de "+caballo.getNombre());
	}
	
}
