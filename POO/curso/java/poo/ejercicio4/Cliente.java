package curso.java.poo.ejercicio4;

public class Cliente {

	private String nombre;

	public Cliente(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + "]";
	}
	
	public void tomarCafe(CoffeCup taza) throws TemperatureException{
		
		if(taza.getTemperature() > 80) {
			throw new TooHotTemperatureExcepcion("Cafe muy caliente "+taza.getTemperature());
		}else if(taza.getTemperature() < 20) {
			throw new TooColdTemperatureExcepcion("Cafe muy frio "+taza.getTemperature());
		}else {
			System.out.println("El cliente se esta tomando el cafe a su gusto "+taza.getTemperature());
		}
	}
}
