package curso.java.poo.ejercicio.practica4;

public class Cuenta {

	private long numCuenta=100001;
	private long dniCliente;
	private double saldo;
	private double interes;
	
	public Cuenta() {
		super();
	}

	public Cuenta(long numCuenta,long dniCliente, double saldo, double interes) {
		super();
		this.numCuenta = numCuenta;
		this.dniCliente = dniCliente;
		this.saldo = saldo;
		this.interes = interes;
	}

	public long getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(long numCuenta) {
		this.numCuenta = numCuenta;
	}

	public long getDniCliente() {
		return dniCliente;
	}

	public void setDniCliente(long dniCliente) {
		this.dniCliente = dniCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}
	
	public void actualizacionSaldo(Cuenta cuenta) {
		double actual=cuenta.getSaldo()*(cuenta.getInteres()/365);
		System.out.println("Tu saldo actua es: "+actual);
	}
	
	public void ingresar(Cuenta cuenta,double ingreso) {
		double saldoNuevo = cuenta.getSaldo()+ingreso;
		System.out.println("Tu saldo actual seria: "+saldoNuevo);
	}
	
	public void retirar(Cuenta cuenta,double retirar) {
		if (retirar > cuenta.getSaldo()) {
			System.err.println("Error, no puedes retirar mas dinero del que dispones "+cuenta.getSaldo());
		}else {
			double retirarDinero=saldo-retirar;
		}
	}
	
	public void informacionCuenta(Cuenta cuenta) {
		System.out.println("Información de la cuenta\n"+cuenta.getNumCuenta()+"\n"+cuenta.getDniCliente()+"\n"+cuenta.getSaldo()+"\n"+cuenta.getInteres()+" % anual");
	}
}












