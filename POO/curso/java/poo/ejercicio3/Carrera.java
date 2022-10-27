package curso.java.poo.ejercicio3;

public class Carrera {

	private String nombre;
	private int distancia;
	private Caballo[] caballos;
	private Apuesta[] apuestas;
	private Jugador[] jugadores;
	
	public Carrera(String nombre, int distancia, Caballo[] caballos, Apuesta[] apuestas, Jugador[] jugadores) {
		super();
		this.nombre = nombre;
		this.distancia = distancia;
		this.caballos = caballos;
		this.apuestas = apuestas;
		this.jugadores = jugadores;
	}
	
	

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getDistancia() {
		return distancia;
	}



	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}



	public Caballo[] getCaballos() {
		return caballos;
	}



	public void setCaballos(Caballo[] caballos) {
		this.caballos = caballos;
	}



	public Apuesta[] getApuestas() {
		return apuestas;
	}



	public void setApuestas(Apuesta[] apuestas) {
		this.apuestas = apuestas;
	}



	public Jugador[] getJugadores() {
		return jugadores;
	}



	public void setJugadores(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}

	public Caballo iniciarCarrera(Caballo[] caballos, Apuesta[] apuestas, Jugador[] jugadores) {
		Caballo caballo;
		Apuesta apuesta;
		Jugador jugador;
		System.out.println("Comienza la carrera !!!!");
		int distancia1=0;
		int distancia2=0;
		int distancia3=0;
		
		while(distancia1 < this.distancia || distancia2 < this.distancia || distancia3 < this.distancia) {
			distancia1=caballos[0].correr();
			distancia2=caballos[1].correr();
			distancia3=caballos[2].correr();
		}
		caballoGanador(distancia1,distancia2,distancia3);
		
		if (distancia1 >= this.distancia) {
			caballo=caballos[0];
			apuesta = apuestaGanadora(caballo);
			jugador = jugadorGanadora(apuesta);
		}else if(distancia2 >= this.distancia) {
			caballo=caballos[1];
			apuesta = apuestaGanadora(caballo);
			jugador = jugadorGanadora(apuesta);
		}else {
			caballo=caballos[2];
			apuesta = apuestaGanadora(caballo);
			jugador = jugadorGanadora(apuesta);
		}
		
		return caballo;
	}
	
	private void caballoGanador(int distancia1, int distancia2, int distancia3) {
		if (distancia1 >= this.distancia) {
			System.out.println("El caballo "+caballos[0].getNombre()+" con el dorsal "+caballos[0].getDorsal()+" es el ganador de la carrera");
			if (distancia2 > distancia3) {
				System.out.println("El caballo "+caballos[1].getNombre()+" con el dorsal "+caballos[1].getDorsal()+" ha acabado segundo");
				System.out.println("El caballo "+caballos[2].getNombre()+" con el dorsal "+caballos[2].getDorsal()+" ha acabado tercero");
			}else {
				System.out.println("El caballo "+caballos[2].getNombre()+" con el dorsal "+caballos[2].getDorsal()+" ha acabado segundo");
				System.out.println("El caballo "+caballos[1].getNombre()+" con el dorsal "+caballos[1].getDorsal()+" ha acabado tercero");
			}
		}else if(distancia2 >= this.distancia) {
			System.out.println("El caballo "+caballos[1].getNombre()+" con el dorsal "+caballos[1].getDorsal()+" es el ganador de la carrera");
			if (distancia1 > distancia3) {
				System.out.println("El caballo "+caballos[0].getNombre()+" con el dorsal "+caballos[0].getDorsal()+" ha acabado segundo");
				System.out.println("El caballo "+caballos[2].getNombre()+" con el dorsal "+caballos[2].getDorsal()+" ha acabado tercero");
			}else {
				System.out.println("El caballo "+caballos[2].getNombre()+" con el dorsal "+caballos[2].getDorsal()+" ha acabado segundo");
				System.out.println("El caballo "+caballos[0].getNombre()+" con el dorsal "+caballos[0].getDorsal()+" ha acabado tercero");
			}
		}else {
			System.out.println("El caballo "+caballos[2].getNombre()+" con el dorsal "+caballos[2].getDorsal()+" es el ganador de la carrera");
			if (distancia1 > distancia2) {
				System.out.println("El caballo "+caballos[0].getNombre()+" con el dorsal "+caballos[0].getDorsal()+" ha acabado segundo");
				System.out.println("El caballo "+caballos[1].getNombre()+" con el dorsal "+caballos[1].getDorsal()+" ha acabado tercero");
			}else {
				System.out.println("El caballo "+caballos[1].getNombre()+" con el dorsal "+caballos[1].getDorsal()+" ha acabado segundo");
				System.out.println("El caballo "+caballos[0].getNombre()+" con el dorsal "+caballos[0].getDorsal()+" ha acabado tercero");
			}
		}
	}
	
	private Apuesta apuestaGanadora(Caballo caballo) {
		Apuesta apuesta = apuestaGanadora(caballo);
		return apuesta;
	}
	
	private Jugador jugadorGanadora(Apuesta apuesta) {
		Jugador jugador = jugadorGanadora(apuesta);
		return jugador;
	}
}
