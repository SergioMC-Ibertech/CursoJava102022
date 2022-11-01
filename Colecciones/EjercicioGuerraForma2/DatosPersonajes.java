package EjercicioGuerraForma2;

public abstract class DatosPersonajes {
	
	private String nombre;
	private String apellidos;
	private String identificacion;
	private int puntosAtaque;
	private int puntosDefensa;
	private int vida;
	
	public DatosPersonajes(String nombre, String apellidos, String identificacion, int puntosAtaque, int puntosDefensa,
			int vida) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.identificacion = identificacion;
		this.puntosAtaque = puntosAtaque;
		this.puntosDefensa = puntosDefensa;
		this.vida = vida;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getIdentificacion() {
		return identificacion;
	}
	
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	
	public int getPuntosAtaque() {
		return puntosAtaque;
	}
	
	public void setPuntosAtaque(int puntosAtaque) {
		this.puntosAtaque = puntosAtaque;
	}
	
	public int getPuntosDefensa() {
		return puntosDefensa;
	}
	
	public void setPuntosDefensa(int puntosDefensa) {
		this.puntosDefensa = puntosDefensa;
	}
	
	public int getVida() {
		return vida;
	}
	
	public void setVida(int vida) {
		this.vida = vida;
	}
	
}
