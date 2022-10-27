package TERMINARcurso.java.poo.claseabstracta.ejemplo;

public class BandaMusical {

	public static void main(String[] args) {

		/*
		 * Enunciado: Deseamos crear un programa para una banda de musica, se pide redactar y codificar:
		 * 				- Crear la Clase (Padre) INSTRUMENTO teniendo como atributos ->
		 * 					nombre
		 * 					tipo
		 * 					precio
		 * 					marca
		 * 					* Metodos:
		 * 						afinar() -> creando un numero aleatorio entre 0 y 10. Si sale un numero 8
		 * 									o superior, dira que no esta bien afinado. guardando el numero
		 * 									que salga.
		 * 						tocar() -> Si el instrumento esta bien afinado, diremos que el nombre del
		 * 								   intrumento esta tocando correctamente. Caso contrario esta tocando
		 * 								   fatal.
		 * 
		 * 				- Crear la clase GUITARRA teniendo como atributos ->
		 * 					numero de cuerdas.
		 * 					material.
		 * 					* sobreescriba el metodo tocar("Se esta tocando la guitarra, diciendo si esta tocando bien o mal")
		 * 				- Crear la clase GUITARRA ELECTRICA heredando de la clase GUITARRA, teniendo como atributos->
		 * 					potencia.
		 * 					* sobreescriba el metodo tocar("Se esta tocando la guitarra, diciendo si esta tocando bien o mal
		 * 					  procedente de su clase padre") y concatenar electrica con la potencia descrita de la guitarra
		 * 				- Crear la clase BATERIA teniendo como atributos ->
		 * 					numTimbales
		 * 					numPlatos
		 * 					tipoMembrana
		 * 					* Metodos:
		 * 						aporrear() o golpear() similar al metodo tocar()
		 * 				- Crear la clase PIANO ELECTRICO teniendo como atributos ->
		 * 					numOctavas
		 * 					numPedales
		 * 
		 * 				Se crea una banda de musica con 1 guitarra, 1 guitarra electrica, 1 bateria y 1 piano y los
		 * 				agrupamos dentro de un array
		 * 				Creamos una funcion de iniciarConcierto() -> Donde primero se afinan los instrumentos y
		 * 				ponemos los instrumentos a Tocar[cuando el instrumento sea la bateria se aporrear() o golpear()]
		 */

		
		BandaMusical banda = new BandaMusical();
		Instrumento[] instrumentos = banda.crearBanda();
		banda.iniciarConcierto(instrumentos);
	}
	
	public Instrumento[] crearBanda() {
		// Crear una guitarra
		//Guitarra guitarra = new Guitarra("guitarra", "cuerda", "marca1", 80, 5, "madera");
		// Crear una guitarra electrica
		GuitarraElectrica guitarrae = new GuitarraElectrica("guitarrae", "cuerda", "marca4", 90, 700);
		// Crear una bateria
		Bateria bateria = new Bateria("bateria", "percusion", "marca2", 500, 5, 4, "sintetica");
		// Crear un piano
		PianoElectrico piano = new PianoElectrico("pianoe", "percusion", "marca3", 600, 6, 2);
		// Creamos el array donde englobamos todos los instrumentos
		Instrumento[] instrumentos = {//guitarra,guitarrae,bateria,piano};
		
		return instrumentos;
	}
	
	private void iniciarConcierto(Instrumento[] instrumentos) {
		for (Instrumento instrumento : instrumentos) {
			instrumento.afinar();
		}
		for (Instrumento instrumento : instrumentos) {
			if(instrumento instanceof Bateria) {
				// Opcion 1 - ((Bateria)instrumento).aporrear(false);
				// Opcion 2 - Realizar el cast (casting)
				Bateria b = (Bateria)instrumento;
				b.aporrear(false);
			}else {
				instrumento.tocar(false);
			}
		}
	}

}
