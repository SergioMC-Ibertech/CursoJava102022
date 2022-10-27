package REVISAR.TERMINARcurso.java.poo.ejercicio2aForma2;

public class Pantalon {

	private String color;
	private String talla;
	private double precio;
	private boolean boton;
	public Pantalon(String color, String talla, double precio, boolean boton) {
		super();
		this.color = color;
		this.talla = talla;
		this.precio = precio;
		this.boton = boton;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean isBoton() {
		return boton;
	}
	public void setBoton(boolean boton) {
		this.boton = boton;
	}
	
	
}
