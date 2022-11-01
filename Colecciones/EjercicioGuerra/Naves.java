package EjercicioGuerra;

public abstract class Naves implements ITurnos{

	private String nombre;
	private String tipoNave;
	private int puntosAtaque;
	private int puntosDefensa;
	
	public Naves(String nombre, String tipoNave, int puntosAtaque, int puntosDefensa) {
		super();
		this.nombre = nombre;
		this.tipoNave = tipoNave;
		this.puntosAtaque = puntosAtaque;
		this.puntosDefensa = puntosDefensa;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getTipoNave() {
		return tipoNave;
	}
	
	public void setTipoNave(String tipoNave) {
		this.tipoNave = tipoNave;
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
		return "DatosNaves [nombre=" + nombre + ", tipoNave=" + tipoNave + ", puntosAtaque=" + puntosAtaque
				+ ", puntosDefensa=" + puntosDefensa + "]";
	}
	
}
