package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class RecipeModel extends RecipeClass{

	ArrayList<RecipeClass> recipe =new ArrayList<RecipeClass>();

	//Constructor
	/**
	 * 
	 */
	public RecipeModel() {
		super();
	}

	/**
	 * @param id
	 * @param tipo
	 * @param nombre
	 * @param recipe
	 */
	public RecipeModel(int id, String tipo, String nombre, ArrayList<RecipeClass> recipe) {
		super(id, tipo, nombre);
		this.recipe = recipe;
	}
	
	//Getter y Setter
	/**
	 * @return the recipe
	 */
	public ArrayList<RecipeClass> getRecipe() {
		return recipe;
	}

	/**
	 * @param recipe the recipe to set
	 */
	public void setRecipe(ArrayList<RecipeClass> recipe) {
		this.recipe = recipe;
	}
	
	//Method
	
	public void loadData()
	{
		this.createConnection();
		
		Statement st;
		try {
			
			st = this.con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM recipes");

			while (rs.next()) // reads the table line by line
			{
				RecipeModel newRecipe = new RecipeModel();
				newRecipe.id=Integer.parseInt(rs.getString("id"));
				newRecipe.nombre=rs.getString("nombre");
				newRecipe.tipo=rs.getString("tipo");
				
				this.recipe.add(newRecipe);
			
			} 
		}catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		this.disconnect();
	}
	
	
}
