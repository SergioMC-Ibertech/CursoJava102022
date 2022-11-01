package EjercicioGuerraForma2;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Guerra {
	
	private List<Humanos> humanos;
	private List<Zombies> zombies;
	
	

	public Guerra() {
		super();
		this.humanos = new CopyOnWriteArrayList<Humanos>();
		this.zombies = new CopyOnWriteArrayList<Zombies>();
	}



	public static void main(String[] args) {

		Guerra guerra = new Guerra();
		guerra.previoGuerra();
		guerra.listaDeParticipantes();
		guerra.iniciarGuerra();

	}
	
	// Metodo para crear a los dos equipos
	private void previoGuerra() {
		crearHumanos();
		crearZombies();
	}
	
	//metodo que creamos a los humanos
	private void crearHumanos() {
		Humanos humano1 = new Humanos("Guillermo", "Toretto", "Humano1", puntosAtaque(), puntosDefensa(), vida());
		Humanos humano2 = new Humanos("Sergio", "Toretto", "Humano2", puntosAtaque(), puntosDefensa(), vida());
		Humanos humano3 = new Humanos("Carlos", "Sainz", "Humano3", puntosAtaque(), puntosDefensa(), vida());
		Humanos humano4 = new Humanos("Fernando", "Alonso", "Humano4", puntosAtaque(), puntosDefensa(), vida());
		Humanos humano5 = new Humanos("Alex", "Palou", "Humano5", puntosAtaque(), puntosDefensa(), vida());
		humanos.add(humano1);
		humanos.add(humano2);
		humanos.add(humano3);
		humanos.add(humano4);
		humanos.add(humano5);
		
	}
	
	//metodo que creamos a los zombies
	private void crearZombies() {
		Zombies zombie1 = new Zombies("Pedro", "De La Rosa", "Zombie1", puntosAtaque(), puntosDefensa(), vida());
		Zombies zombie2 = new Zombies("Roberto", "Mehri", "Zombie2", puntosAtaque(), puntosDefensa(), vida());
		Zombies zombie3 = new Zombies("Jaime", "Alguersuari", "Zombie3", puntosAtaque(), puntosDefensa(), vida());
		Zombies zombie4 = new Zombies("Marc", "Gene", "Zombie4", puntosAtaque(), puntosDefensa(), vida());
		Zombies zombie5 = new Zombies("Adrian", "Campos", "Zombie5", puntosAtaque(), puntosDefensa(), vida());
		zombies.add(zombie1);
		zombies.add(zombie2);
		zombies.add(zombie3);
		zombies.add(zombie4);
		zombies.add(zombie5);
	}
	
	// Metodo que muestra por pantalla los participantes de la guerra
	private void listaDeParticipantes() {
		System.out.println("Humanos participantes: ");
		for (Humanos humano : humanos) {
			System.out.println(humano);
		}
		System.out.println("Zombies participantes: ");
		for (Zombies zombie : zombies) {
			System.out.println(zombie);
		}
	}
	
	// Metodo que da comienzo a la guerra y se desarrolla la misma
	private void iniciarGuerra() {
		System.out.println("Comienza la guerra !!!\n");
		int hum = turno();
		int zom = turno();
		while(humanos.isEmpty() || zombies.isEmpty()) {
			Humanos humano;
			Zombies zombie;
			int vidaZ=0;
			int vidaH=0;
			if (hum > zom) {
				humano = humanos.get(jugador());
				vidaH=humano.getVida();
				zombie = zombies.get(jugador());
				vidaZ=zombie.getVida();
				vidaZ = vidaZ - humano.atacar(humano,zombie);
				vidaH = vidaH - zombie.defender(humano, zombie);
				vidaH=humano.getVida();
				vidaZ=zombie.getVida();
				if (vidaZ <= 0) {
					zombies.remove(zombie);
				}
			}else {
				humano = humanos.get(jugador());
				vidaH=humano.getVida();
				zombie = zombies.get(jugador());
				vidaZ=zombie.getVida();
				vidaZ = vidaZ - humano.defender(humano,zombie);
				vidaH = vidaH - zombie.atacar(humano, zombie);
				vidaH=humano.getVida();
				vidaZ=zombie.getVida();
				if (vidaH<=0) {
					humanos.remove(humano);
				}
			}
		}
		int contH=0;
		int contZ=0;
		for (Humanos humano : humanos) {
			if (humanos.contains(humano)) {
				contH++;
			}
		}
		for (Zombies zombie : zombies) {
			if (zombies.contains(zombie)) {
				contZ++;
			}
		}
		if (contH > 0) {
			System.out.println("La guerra la ha ganado los humanos");
		} else if (contZ > 0) {
			System.out.println("La guerra la ha ganado los zombies");
		} else if (contZ==contH){
			System.out.println("Ocurre un error, revisalo");
		}
		
		System.out.println("Fin de la guerra");
	}

	// Metodo que asigna un determinado numero de puntos de ataque del 1 al 10
	private int puntosAtaque() {
		int ataque = (int)(Math.random()*10+1);
		return ataque;
	}
	
	// Metodo que asigna un determinado numero de puntos de defensa del 1 al 10
	private int puntosDefensa() {
		int defensa = (int)(Math.random()*10+1);
		return defensa;
	}
	
	// Metodo que asigna la cantidad de vida que participa en la guerra del 1 al 100
	private int vida() {
		int vida = (int)(Math.random()*100+1);
		return vida;
	}
	
	// Metodo para determinar los turnos determinando con un numero al azar entre 1 y 10
	private int turno() {
		int num = (int)(Math.random()*10+1);
		return num;
	}
	
	// Metodo que selecciona al azar un participante de cada bando del 1 al 5
	private int jugador() {
		int num = (int)(Math.random()*5);
		return num;
	}

}
