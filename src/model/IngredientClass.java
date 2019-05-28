package model;

public class IngredientClass extends Connect{

	protected int id;
	protected String nombre;
	protected int calories;
	protected double flats;
	
	//Constructor
	/**
	 * 
	 */
	public IngredientClass() {
		super();
	}
	/**
	 * @param id
	 * @param nombre
	 * @param calories
	 * @param flats
	 */
	public IngredientClass(int id, String nombre, int calories, double flats) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.calories = calories;
		this.flats = flats;
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
	/**
	 * @return the calories
	 */
	public int getCalories() {
		return calories;
	}
	/**
	 * @param calories the calories to set
	 */
	public void setCalories(int calories) {
		this.calories = calories;
	}
	/**
	 * @return the flats
	 */
	public double getFlats() {
		return flats;
	}
	/**
	 * @param flats the flats to set
	 */
	public void setFlats(double flats) {
		this.flats = flats;
	}
	
	
}
