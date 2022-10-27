package curso.java.poo.ejercicio.practica4;

import curso.java.funciones.Utils_EjercicioCaballos;

public class Banco {
	
	private String nombre;

	public Banco(String nombre) {
		super();
		this.nombre = nombre;
	}

	public static void main(String[] args) {

		/*
		 * Enunuciado: Crea una clase Cuenta (bancaria) con atributos para el número de cuenta (un entero
					   largo), el DNI del cliente (otro entero largo), el saldo actual y el interés anual que se
					   aplica a la cuenta (porcentaje). Define en la clase los siguientes métodos:
							 Constructor por defecto y constructor con DNI, saldo e interés
							 Accedentes y mutadores. Para el número de cuenta no habrá mutador.
							 actualizarSaldo(): actualizará el saldo de la cuenta aplicándole el interés diario
							  (interés anual dividido entre 365 aplicado al saldo actual).
							 ingresar(double): permitirá ingresar una cantidad en la cuenta.
							 retirar(double): permitirá sacar una cantidad de la cuenta (si hay saldo).
							 Método que nos permita mostrar todos los datos de la cuenta.
								El número de cuenta se asignará de forma correlativa a partir de 100001, asignando
								el siguiente número al último asignado.
		 */
		
		Banco banco = new Banco("Banco Toretto");
		banco.gestionCuenta();
		

	}
	
	private void gestionCuenta() {
		Cuenta[] cuentas= new Cuenta[3];
		Cuenta c= new Cuenta();
		int opcion=0;
		for (int i=0; i<cuentas.length; i++) {
			long numCuenta=c.getNumCuenta();
				if (i != 0) {
					numCuenta++;
				}
			long dni=Utils_EjercicioCaballos.pedirNumeroLargo("Dime tu DNI por favor, sin letra: ");
			double saldo = Utils_EjercicioCaballos.pedirNumeroDecimal("Dime tu saldo inicial: ");
			double interes = Utils_EjercicioCaballos.pedirNumeroDecimal("Dime el interes anual de la cuenta (entre 0.0 - 1.0)<: ");
			cuentas[i] = new Cuenta(numCuenta,dni, saldo, interes);
		}
		
		do {
			System.out.println("***************ªnªtMENU BANCO\t\n******************\n1.Actualizar Saldo\n2.ingresar\n3.retirar\n4.Informacion de la cuenta\n5.Salir");
			opcion = Utils_EjercicioCaballos.pedirNumero("Selecciona una opcion: ");
			switch (opcion) {
				case 1:
					int selCuenta1=Utils_EjercicioCaballos.pedirNumero("Selecciona una de las cuentas, del 0 al 2: ");
					c.actualizacionSaldo(cuentas[selCuenta1]);
					break;
				case 2:
					int selCuenta2=Utils_EjercicioCaballos.pedirNumero("Selecciona una de las cuentas, del 0 al 2: ");
					double ingreso=Utils_EjercicioCaballos.pedirNumeroDecimal("¿Cuanto dinero quieres ingresar?: ");
					c.ingresar(cuentas[selCuenta2],ingreso);
					break;
				case 3:
					int selCuenta3=Utils_EjercicioCaballos.pedirNumero("Selecciona una de las cuentas, del 0 al 2: ");
					double retirar=Utils_EjercicioCaballos.pedirNumeroDecimal("¿Cuanto dinero quieres retirar?: ");
					c.retirar(cuentas[selCuenta3], retirar);
					break;
				case 4:
					int selCuenta4=Utils_EjercicioCaballos.pedirNumero("Selecciona una de las cuentas, del 0 al 2: ");
					c.informacionCuenta(cuentas[selCuenta4]);
				case 5:System.out.println("Que tenga un buen día, adios.");break;
				default:
					System.err.println("Opcion incorrecta, selecciona una de las opciones correctas.");
					break;
			}
		}while(opcion!=5);
		
	}

}
