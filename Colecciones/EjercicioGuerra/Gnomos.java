package EjercicioGuerra;

public class Gnomos extends DatosGuerreros {

	public Gnomos(String nombre, String apellido, int puntosAtaque, int puntosDefensa) {
		super(nombre, apellido, puntosAtaque, puntosDefensa);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Gnomos [getNombre()=" + getNombre() + ", getApellido()=" + getApellido() + ", getPuntosAtaque()="
				+ getPuntosAtaque() + ", getPuntosDefensa()=" + getPuntosDefensa() + "]";
	}
	
	@Override
	public void atacar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void defender() {
		// TODO Auto-generated method stub

	}

}
