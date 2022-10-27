package curso.java.poo.herencia.ejercicio1;

public class PianoElectrico extends Instrumento{

	private int numOctavas;
	private int numPedales;
	
	public PianoElectrico(String nombre, String tipo, String marca, double precio, int numOctavas, int numPedales) {
		super(nombre, tipo, marca, precio);
		this.numOctavas = numOctavas;
		this.numPedales = numPedales;
	}
	public int getNumOctavas() {
		return numOctavas;
	}
	public void setNumOctavas(int numOctavas) {
		this.numOctavas = numOctavas;
	}
	public int getNumPedales() {
		return numPedales;
	}
	public void setNumPedales(int numPedales) {
		this.numPedales = numPedales;
	}
	
	@Override
	public String toString() {
		return "PianoElectrico [numOctavas=" + numOctavas + ", numPedales=" + numPedales + "]";
	}
	
}
