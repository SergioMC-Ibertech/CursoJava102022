package TERMINARcurso.java.poo.claseabstracta.ejemplo;

public class Bateria extends Instrumento{

	private int numTimbales;
	private int NumPlatos;
	private String tipoMembrana;
	
	
	public Bateria(String nombre, String tipo, String marca, double precio, int numTimbales, int numPlatos,
			String tipoMembrana) {
		super(nombre, tipo, marca, precio);
		this.numTimbales = numTimbales;
		this.NumPlatos = numPlatos;
		this.tipoMembrana = tipoMembrana;
	}


	public int getNumTimbales() {
		return numTimbales;
	}


	public void setNumTimbales(int numTimbales) {
		this.numTimbales = numTimbales;
	}


	public int getNumPlatos() {
		return NumPlatos;
	}


	public void setNumPlatos(int numPlatos) {
		NumPlatos = numPlatos;
	}


	public String getTipoMembrana() {
		return tipoMembrana;
	}


	public void setTipoMembrana(String tipoMembrana) {
		this.tipoMembrana = tipoMembrana;
	}


	public void aporrear(boolean afinado) {
		super.tocar(afinado);
		if (afinado==true) {
			System.out.println("Se esta tocando BIEN la bateria "+this.getNombre());
		}else {
			System.out.println("Se esta tocando MAL la bateria "+this.getNombre());
		}
	}


	@Override
	public String toString() {
		return "Bateria [numTimbales=" + numTimbales + ", NumPlatos=" + NumPlatos + ", tipoMembrana=" + tipoMembrana
				+ "]";
	}


	@Override
	public void limpiar() {
		System.out.println("Limpiando bateria");
	}


	@Override
	public void recoger() {
		// TODO Auto-generated method stub
		
	}
	
}
