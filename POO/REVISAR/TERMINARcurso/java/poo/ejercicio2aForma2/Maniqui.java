package REVISAR.TERMINARcurso.java.poo.ejercicio2aForma2;

public class Maniqui {

	private long id;
	private Camisa[] camisas;
	private Pantalon[] pantalones;
	private Vestido[] vestidos;
	
	public Maniqui(long id, Camisa[] camisas, Pantalon[] pantalones) {
		super();
		this.id = id;
		this.camisas = camisas;
		this.pantalones = pantalones;
	}
	
	public Maniqui(long id, Camisa[] camisas) {
		super();
		this.id = id;
		this.camisas = camisas;
	}
	
	public Maniqui(long id, Pantalon[] pantalones) {
		super();
		this.id = id;
		this.pantalones = pantalones;
	}

	public Maniqui(long id,Vestido[] vestidos) {
		super();
		this.id=id;
		this.vestidos = vestidos;
	}

	public Maniqui() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Camisa[] getCamisas() {
		return camisas;
	}

	public void setCamisas(Camisa[] camisas) {
		this.camisas = camisas;
	}

	public Pantalon[] getPantalones() {
		return pantalones;
	}

	public void setPantalones(Pantalon[] pantalones) {
		this.pantalones = pantalones;
	}

	public Vestido[] getVestidos() {
		return vestidos;
	}

	public void setVestidos(Vestido[] vestidos) {
		this.vestidos = vestidos;
	}
	
	//Metodo o funcion para vestir un maniqui con un pantalon y camisa
	public void vestirManiquiCamisaPantalon(Camisa[] camisa,Pantalon[] pantalon) {
		
	}
	
	//Metodo o funcion para vestir un maniqui con un vestido
	public void vestirManiquiVestido(Vestido[] vestido) {
		
	}
	
	//Metodo o funcion para desvestir un maniqui con pantalon y camisa
	public void desvestirManiquiCamisaPantalon(Camisa[] camisa,Pantalon[] pantalon) {
		
	}
	
	//Metodo o funcion para desvestir un maniqui con un vestido
	public void desvestirManiquiVestido(Vestido[] vestido) {
		
	}
	
}
