package model;

public class RecipeClass extends Connect{

	protected int id;
	protected String tipo;
	protected String nombre;
	
	//Constructor
	/**
	 * 
	 */
	public RecipeClass() {
		super();
	}
	/**
	 * @param id
	 * @param tipo
	 * @param nombre
	 */
	public RecipeClass(int id, String tipo, String nombre) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.nombre = nombre;
	}
	
	//Getter y Setter
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
