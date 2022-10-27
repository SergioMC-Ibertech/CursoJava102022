package curso.java.poo.interfaces.ejemplo2;

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
	
	// Estamos obligados a sobrescribir el metodo abstracto, si es la ultima clase hija
	@Override
	public void limpiar() {
		System.out.println("Limpiando el piano electrico");
		
	}
	@Override
	public void recoger() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		
	}
	
	
}
