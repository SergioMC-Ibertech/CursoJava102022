package curso.java.poo.interfaces.ejemplo;

public abstract class ClaseInterfaces extends Instrumento implements ITransporte, ILogistica{

	
	public ClaseInterfaces(String nombre, String tipo, String marca, double precio) {
		super(nombre, tipo, marca, precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void limpiar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recoger() {
		System.out.println(NUM);
		
	}                               

}