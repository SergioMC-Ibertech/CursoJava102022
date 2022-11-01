package EjercicioGuerraForma2;

public class Humanos extends DatosPersonajes implements ITurnos{

	public Humanos(String nombre, String apellidos, String identificacion, int puntosAtaque, int puntosDefensa,
			int vida) {
		super(nombre, apellidos, identificacion, puntosAtaque, puntosDefensa, vida);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String toString() {
		return "\tHumanos [getNombre()=" + getNombre() + ", getApellidos()=" + getApellidos() + ", getIdentificacion()="
				+ getIdentificacion() + ", getPuntosAtaque()=" + getPuntosAtaque() + ", getPuntosDefensa()="
				+ getPuntosDefensa() + ", getVida()=" + getVida() + "]";
	}



	@Override
	public int atacar(Humanos humano, Zombies zombie) {
		int balance=0;
		int ataque = humano.getPuntosAtaque();
		int defensa = zombie.getPuntosDefensa();
		int enfrentamiento = ataque - defensa;
		if (enfrentamiento > 0) {
			balance=zombie.getVida()-enfrentamiento;
		}else {
			balance=zombie.getVida();
		}
		return balance;
	}

	@Override
	public int defender(Humanos humano, Zombies zombie) {
		int balance=0;
		int ataque = humano.getPuntosAtaque();
		int defensa = zombie.getPuntosDefensa();
		int enfrentamiento = ataque - defensa;
		if (enfrentamiento > 0) {
			balance=zombie.getVida()+enfrentamiento;
		}else {
			balance=zombie.getVida();
		}
		return balance;
	}

}
