package curso.java.poo.ejercicio1;

public class Supermercado {

	private String nombre;
	
	public Supermercado(String nombre) {
		super();
		this.nombre=nombre;
	}

	public static void main(String[] args) {

		/*
		 * Enunciado: Se va ha crear una aplicacion, utilizando clases, metodos y constructores,
		 * 			  teniendo en cuenta los siguientes datos:
		 * 				- Clase Cliente:
		 * 					*Nombre.
		 * 					*Apellidos
		 * 					*DNI
		 * 					*importeCompra=0
		 * 					* Metodp -> comprar(importe) y actualice el campo importeCompra.
		 * 
		 * 				- Main o cuerpo:
		 * 					*4 objetos de tipo cliente, donde se guardaran en un array.
		 * 					*Crear un array donde se registre los importes total de cada cliente.
		 */
		
		
		Supermercado super1=new Supermercado("Supermercado1");
		Cliente[] clientes = super1.crearClientes();
		super1.importeTotalClientes(clientes);
	}
	
	private Cliente[] crearClientes() {
		Cliente c1 = new Cliente("Guilerrmo","Martinez Nieto","47397080X");
		Cliente c2 = new Cliente("Sergio","Toretto","56128978M");
		Cliente c3 = new Cliente("Perico","de los Palotes","789123456L");
		Cliente c4 = new Cliente("Guilerrmo","Martinez Nieto","47397080X");
		
		c1.comprar(150);
		c1.comprar(50);
		c2.comprar(160);
		c3.comprar(40);
		c4.comprar(20);
		
		Cliente[] clientes= {c1,c2,c3,c4};
		
		for (Cliente cliente : clientes) {
			System.out.println(cliente.getNombre());
		}
		
		return clientes;
	}
	
	private void importeTotalClientes(Cliente[] clientes) {
		double totalImporte=0.0;
		for (Cliente cliente : clientes) {
			totalImporte += cliente.getImporteCompra();
		}
		System.out.println("El importe total de la compra de todos los clientes"
				+ " en el supermercado"+this.nombre+" es: "+totalImporte);;
	}

}
