package curso.java.poo.herencia.ejercicio1;

public class Instrumento {
	
	private String nombre;
	private String tipo;
	private String marca;
	private double precio;
	
	public Instrumento(String nombre, String tipo, String marca, double precio) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.marca = marca;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void afinar() {
		boolean afinado = false;
		int tirada= (int)Math.random()*10+1;
		if (tirada>8) {
			System.out.println("Instrumento"+this.nombre+" no afinado correctamente");
			afinado=false;
			tocar(afinado);
		}else {
			System.out.println("Instrumento"+this.nombre+" afinado correctamente");
			afinado=true;
			tocar(afinado);
		}
	}
	
	public void tocar(boolean afinado) {
		if (afinado==true) {
			System.out.println("El instrumento "+this.nombre+" esta tocando correctamente");
		}else {
			System.out.println("El instrumento "+this.nombre+" NO esta tocando correctamente");
		}
	}

	@Override
	public String toString() {
		return "Instrumento [nombre=" + nombre + ", tipo=" + tipo + ", marca=" + marca + ", precio=" + precio + "]";
	}

}