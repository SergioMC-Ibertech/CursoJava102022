package curso.java.poo.ejercicio.practica3;

public class Linea {
	
	private double puntoA;
	private double puntoB;
	
	public Linea() {
		super();
	}

	public Linea(double puntoA, double puntoB) {
		super();
		this.puntoA = puntoA;
		this.puntoB = puntoB;
	}

	public double getPuntoA() {
		return puntoA;
	}

	public void setPuntoA(double puntoA) {
		this.puntoA = puntoA;
	}

	public double getPuntoB() {
		return puntoB;
	}

	public void setPuntoB(double puntoB) {
		this.puntoB = puntoB;
	}
	
	public void mueveDerecha(Linea punto) {
		
	}
	
	public void mueveIzquierda(Linea punto) {
			
	}
	
	public void mueveArriba(Linea punto) {
		
	}
	
	public void mueveAbajo(Linea punto) {
		
	}
	
	public void mostrarInformacionPuntos(Linea puntoA, Linea puntoB) {
		Linea[] puntos= {puntoA,puntoB};
		
		for (int i=0; i<puntos.length; i++) {
			System.out.print(puntos[i]);
		}
	}
}
