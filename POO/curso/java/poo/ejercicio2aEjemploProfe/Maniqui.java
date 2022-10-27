package curso.java.poo.ejercicio2aEjemploProfe;

public class Maniqui {

	private long id;
	private Camisa camisas;
	private Pantalon pantalones;
	private Vestido vestidos;
	
	public Maniqui(long id) {
		super();
		this.id = id;
		System.out.println("Creando un maniqui desnudo");
	}

	public Maniqui(long id, Vestido vestidos) {
		super();
		this.id = id;
		this.vestidos = vestidos;
		System.out.println("Vistiendo al maniqui con in id"+this.getId()+" con un vestido de color"+vestidos.getColor());
	}

	public Maniqui(long id, Camisa camisas, Pantalon pantalones) {
		super();
		this.id = id;
		this.camisas = camisas;
		this.pantalones = pantalones;
		System.out.println("Vistiendo al maniqui con in id"+this.getId()+" con un pantalon y una camisa");
	}

	public long getId() {
		return id;
	}

	public Camisa getCamisas() {
		return camisas;
	}

	public void setCamisas(Camisa camisas) {
		this.camisas = camisas;
	}

	public Pantalon getPantalones() {
		return pantalones;
	}

	public void setPantalones(Pantalon pantalones) {
		this.pantalones = pantalones;
	}

	public Vestido getVestidos() {
		return vestidos;
	}

	public void setVestidos(Vestido vestidos) {
		this.vestidos = vestidos;
	}
	
	public void vestirManiqui(Camisa camisa,Pantalon pantalon) {
		desvertirManiqui();
		this.camisas=camisa;
		this.pantalones=pantalon;
	}
	
	public void vestirManiqui(Vestido vestido) {
		desvertirManiqui();
		this.vestidos=vestido;
	}
	
	public void desvertirManiqui() {
		System.out.println("Desvistiendo al maniqui "+this.getId());
		if(tieneCamisa()) quitarCamisa();
		if(tienePantalon()) quitarPantalon();
		if(tieneVestido()) quitarVestido();
	}
	
	private void quitarCamisa() {
		setCamisas(null);
	}
	
	private boolean tieneCamisa() {
		return camisas!=null;
	}
	
	private void quitarPantalon() {
		setPantalones(null);
	}
	
	private boolean tienePantalon() {
		return pantalones!=null;
	}
	
	private void quitarVestido() {
		setVestidos(null);
	}
	
	private boolean tieneVestido() {
		return vestidos!=null;
	}
	
}
