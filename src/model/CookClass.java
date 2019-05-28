package model;

public class CookClass extends Connect{

	protected int id_recipe;
	protected int id_ingredient;
	protected int grams;
	
	//Constructor
	/**
	 * 
	 */
	public CookClass() {
		super();
	}
	/**
	 * @param id_recipe
	 * @param id_ingredient
	 * @param grams
	 */
	public CookClass(int id_recipe, int id_ingredient, int grams) {
		super();
		this.id_recipe = id_recipe;
		this.id_ingredient = id_ingredient;
		this.grams = grams;
	}
	
	//Getter y Setter
	/**
	 * @return the id_recipe
	 */
	public int getId_recipe() {
		return id_recipe;
	}
	/**
	 * @param id_recipe the id_recipe to set
	 */
	public void setId_recipe(int id_recipe) {
		this.id_recipe = id_recipe;
	}
	/**
	 * @return the id_ingredient
	 */
	public int getId_ingredient() {
		return id_ingredient;
	}
	/**
	 * @param id_ingredient the id_ingredient to set
	 */
	public void setId_ingredient(int id_ingredient) {
		this.id_ingredient = id_ingredient;
	}
	/**
	 * @return the grams
	 */
	public int getGrams() {
		return grams;
	}
	/**
	 * @param grams the grams to set
	 */
	public void setGrams(int grams) {
		this.grams = grams;
	}
	
	
}
