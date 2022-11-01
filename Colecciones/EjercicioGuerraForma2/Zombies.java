package EjercicioGuerraForma2;

public class Zombies extends DatosPersonajes implements ITurnos{

	public Zombies(String nombre, String apellidos, String identificacion, int puntosAtaque, int puntosDefensa,
			int vida) {
		super(nombre, apellidos, identificacion, puntosAtaque, puntosDefensa, vida);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "\tZombies [getNombre()=" + getNombre() + ", getApellidos()=" + getApellidos() + ", getIdentificacion()="
				+ getIdentificacion() + ", getPuntosAtaque()=" + getPuntosAtaque() + ", getPuntosDefensa()="
				+ getPuntosDefensa() + ", getVida()=" + getVida() + "]";
	}

	@Override
	public int atacar(Humanos humano, Zombies zombie) {
		int balance=0;
		int ataque = zombie.getPuntosAtaque();
		int defensa = humano.getPuntosDefensa();
		int enfrentamiento = ataque - defensa;
		if (enfrentamiento > 0) {
			balance=humano.getVida()-enfrentamiento;
		}else {
			balance=humano.getVida();
		}
		return balance;
	}

	@Override
	public int defender(Humanos humano, Zombies zombie) {
		int balance=0;
		int ataque = zombie.getPuntosAtaque();
		int defensa = humano.getPuntosDefensa();
		int enfrentamiento = ataque - defensa;
		if (enfrentamiento > 0) {
			balance=humano.getVida()+enfrentamiento;
		}else {
			balance=humano.getVida();
		}
		return balance;
	}
	
}
