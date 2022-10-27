package curso.java.poo.ejercicio4;

public class CoffeCup {

	private int temperature;

	public CoffeCup(int temperature) {
		super();
		this.temperature = temperature;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "CoffeCup [temperature=" + temperature + "]";
	}
	
}
