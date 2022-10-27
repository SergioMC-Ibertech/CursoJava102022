package curso.java.poo.interfaces.ejemplo2;

public interface IUpdatatable extends IInsertable{

	/*
	 * Metodo para actualizar el registro de la base de datos
	 */
	
	void update(long id);
}
