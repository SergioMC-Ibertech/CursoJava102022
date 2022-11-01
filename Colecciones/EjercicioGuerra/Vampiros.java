package EjercicioGuerra;

public class Vampiros extends DatosGuerreros {

	public Vampiros(String nombre, String apellido, int puntosAtaque, int puntosDefensa) {
		super(nombre, apellido, puntosAtaque, puntosDefensa);
		// TODO Auto-generated constructor stub
	}	

	@Override
	public String toString() {
		return "Vampiros [getNombre()=" + getNombre() + ", getApellido()=" + getApellido() + ", getPuntosAtaque()="
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
