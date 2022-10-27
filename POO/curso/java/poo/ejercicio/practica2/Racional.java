package curso.java.poo.ejercicio.practica2;

public class Racional {
	
	private int enumarador;
	private int denominador;
	
	public Racional() {
		super();
	}

	public Racional(int enumarador, int denominador) {
		super();
		this.enumarador = enumarador;
		this.denominador = denominador;
	}

	public int getEnumarador() {
		return enumarador;
	}

	public void setEnumarador(int enumarador) {
		this.enumarador = enumarador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	public void sumaRacionales(Racional r1, Racional r2) {
		if(r1.getDenominador()==r2.getDenominador()) {
			int sumaEnumeradores=r1.getEnumarador()+r2.getEnumarador();
			System.out.println("La suma entre los numeros "+r1.getEnumarador()+"/"+r1.getDenominador()+" + "+r2.getEnumarador()+"/"+r2.getDenominador()+" es: "+sumaEnumeradores+"/"+r1.getDenominador());
		}else {
			int denominadorComun=r1.getDenominador()*r2.getDenominador();
			int sumaEnumeradores=r1.getEnumarador()+r2.getEnumarador();
			System.out.println("La suma entre los numeros "+r1.getEnumarador()+"/"+r1.getDenominador()+" + "+r2.getEnumarador()+"/"+r2.getDenominador()+" es: "+sumaEnumeradores+"/"+denominadorComun);
		}
	}
	
	public void restaRacionales(Racional r1, Racional r2) {
		if(r1.getDenominador()==r2.getDenominador()) {
			int restaEnumeradores=r1.getEnumarador()-r2.getEnumarador();
			System.out.println("La resta entre los numeros "+r1.getEnumarador()+"/"+r1.getDenominador()+" - "+r2.getEnumarador()+"/"+r2.getDenominador()+" es: "+restaEnumeradores+"/"+r1.getDenominador());
		}else {
			int denominadorComun=r1.getDenominador()*r2.getDenominador();
			int restaEnumeradores=r1.getEnumarador()-r2.getEnumarador();
			System.out.println("La resta entre los numeros "+r1.getEnumarador()+"/"+r1.getDenominador()+" - "+r2.getEnumarador()+"/"+r2.getDenominador()+" es: "+restaEnumeradores+"/"+denominadorComun);
		}
	}

	public void multiplicacionRacionales(Racional r1, Racional r2) {
		int totalEnumerador=r1.getEnumarador()*r2.getEnumarador();
		int totalDenominador=r1.getDenominador()*r2.getDenominador();
		System.out.println("El producto de los numeros "+r1.getEnumarador()+"/"+r1.getDenominador()+" x "+r2.getEnumarador()+"/"+r2.getDenominador()+" es: "+totalEnumerador+"/"+totalDenominador);
	}

	public void dividirRacionales(Racional r1, Racional r2) {
		int totalEnumerador=r1.getEnumarador()*r2.getDenominador();
		int totalDenominador=r1.getDenominador()*r2.getEnumarador();
		System.out.println("La division de los numeros "+r1.getEnumarador()+"/"+r1.getDenominador()+" : "+r2.getEnumarador()+"/"+r2.getDenominador()+" es: "+totalEnumerador+"/"+totalDenominador);
	}
	
	public boolean compararRacionales(Racional r1, Racional r2) {
		boolean comparar=false;
		
		if(r1.equals(r2)==true) {
			comparar=true;
			return comparar;
		}else {
			return comparar;
		}
	}
}