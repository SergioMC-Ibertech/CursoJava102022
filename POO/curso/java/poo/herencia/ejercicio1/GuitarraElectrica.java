package curso.java.poo.herencia.ejercicio1;

public class GuitarraElectrica extends Guitarra{
	
	private double potencia;

	public GuitarraElectrica(String nombre, String tipo, String marca, double precio, double potencia) {
		super(nombre, tipo, marca, precio);
		this.potencia = potencia;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	@Override
	public void tocar(boolean afinado) {
		super.tocar(afinado);
		
		if (afinado==true) {
			System.out.println("Se esta tocando BIEN la guitarra electrica "+this.getNombre()+" de "+this.potencia+" vatios");
		}else {
			System.out.println("Se esta tocando MAL la guitarra electrica "+this.getNombre()+" de "+this.potencia+" vatios");
		}
	}

	@Override
	public String toString() {
		return "GuitarraElectrica [potencia=" + potencia + "]";
	}
	
}