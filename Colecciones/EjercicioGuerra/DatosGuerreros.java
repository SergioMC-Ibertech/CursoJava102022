package EjercicioGuerra;

public abstract class DatosGuerreros implements ITurnos{

	private String nombre;
	private String apellido;
	private int puntosAtaque;
	private int puntosDefensa;
	
	public DatosGuerreros(String nombre, String apellido, int puntosAtaque, int puntosDefensa) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.puntosAtaque = puntosAtaque;
		this.puntosDefensa = puntosDefensa;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
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
	@Override
	public String toString() {
		return "DatosGuerreros [nombre=" + nombre + ", apellido=" + apellido + ", puntosAtaque=" + puntosAtaque
				+ ", puntosDefensa=" + puntosDefensa + "]";
	}
	
}
