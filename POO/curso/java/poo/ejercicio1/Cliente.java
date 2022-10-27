package curso.java.poo.ejercicio1;

public class Cliente {

	//Variables de instancia
	private String nombre;
	private String apellidos;
	private String dni;
	private double importeCompra=0;
	
	public Cliente(String nombre, String apellidos, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getImporteCompra() {
		return importeCompra;
	}

	public void setImporteCompra(double importeCompra) {
		this.importeCompra = importeCompra;
	}
	
	
	void comprar(double importe) {
		this.importeCompra+=importe;
	}
	
	
}
