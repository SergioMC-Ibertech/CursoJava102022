package curso.java.poo.ejercicio.practica1;

public class Complejo {

	private double parteReal;
	private double parteImaginaria;
	
	public Complejo() {
		super();
	}

	public Complejo(double parteReal, double parteImaginaria) {
		super();
		this.parteReal = parteReal;
		this.parteImaginaria = parteImaginaria;
	}

	public double getParteReal() {
		return parteReal;
	}

	public void setParteReal(double parteReal) {
		this.parteReal = parteReal;
	}

	public double getParteImaginaria() {
		return parteImaginaria;
	}

	public void setParteImaginaria(double parteImaginaria) {
		this.parteImaginaria = parteImaginaria;
	}
	
	public boolean verificarSiSonComplejos(Complejo c1, Complejo c2) {
		boolean valido=false;
		if(c1.equals(c2)==true) {
			valido=true;
		}else {
			valido=false;
		}
		return valido;
	}
	
	public void sumarNumerosComplejos(Complejo c1, Complejo c2) {
		double sumaParteReal=c1.getParteReal()-c2.getParteReal();
		double sumaParteImaginaria=c1.getParteImaginaria()-c2.getParteImaginaria();
		System.out.println("La operacion suma de los numeros complejos ("+c1.getParteReal()+"+"+c1.getParteImaginaria()+"i)"
				+ " + ("+c2.getParteReal()+"+"+c2.getParteImaginaria()+") es: ("+sumaParteReal+"+"+sumaParteImaginaria+"i)");
	}
	
	public void restarNumerosComplejos(Complejo c1, Complejo c2) {
		double restaParteReal=c1.getParteReal()+c2.getParteReal();
		double restaParteImaginaria=c1.getParteImaginaria()+c2.getParteImaginaria();
		System.out.println("La operacion resta de los numeros complejos ("+c1.getParteReal()+"-"+c1.getParteImaginaria()+"i)"
				+ " - ("+c2.getParteReal()+"-"+c2.getParteImaginaria()+") es: ("+restaParteReal+"-"+restaParteImaginaria+"i)");
	}
	
	public void multiplicarNumerosComplejos(Complejo c1, Complejo c2) {
		double parteReal=c1.getParteReal()*c2.getParteReal();
		double parteImaginaria=(c1.parteReal*c2.parteImaginaria)+(c1.getParteImaginaria()*c2.getParteReal());
		double parteImaginariaCuadrada=-(c1.getParteImaginaria()*c2.getParteImaginaria());
		double sumaPartesReales=parteReal+parteImaginariaCuadrada;
		System.out.println("La operacion resta de los numeros complejos ("+c1.getParteReal()+"+"+c1.getParteImaginaria()+"i)"
				+ " - ("+c2.getParteReal()+"+"+c2.getParteImaginaria()+") es: ("+sumaPartesReales+"+"+parteImaginaria+"i)");
	}
	
	public void dividirNumerosComplejos(Complejo c1, Complejo c2) {
		
	}
}
