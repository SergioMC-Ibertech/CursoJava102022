package EjercicioPractico;

public class NavesHombresLobo extends Naves {

	public NavesHombresLobo(String nombre, String tipoNave, int puntosAtaque, int puntosDefensa) {
		super(nombre, tipoNave, puntosAtaque, puntosDefensa);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "NavesHombresLobo [getNombre()=" + getNombre() + ", getTipoNave()=" + getTipoNave()
				+ ", getPuntosAtaque()=" + getPuntosAtaque() + ", getPuntosDefensa()=" + getPuntosDefensa() + "]";
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
