package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class IngredientModel extends IngredientClass{
	
	ArrayList<IngredientClass> ingredient =new ArrayList<IngredientClass>();

	//Constructor
	/**
	 * 
	 */
	public IngredientModel() {
		super();
	}

	/**
	 * @param id
	 * @param nombre
	 * @param calories
	 * @param flats
	 * @param ingredient
	 */
	public IngredientModel(int id, String nombre, int calories, double flats, ArrayList<IngredientClass> ingredient) {
		super(id, nombre, calories, flats);
		this.ingredient = ingredient;
	}

	//Getter y Setter
	/**
	 * @return the ingredient
	 */
	public ArrayList<IngredientClass> getIngredient() {
		return ingredient;
	}

	/**
	 * @param recipe the recipe to set
	 */
	public void setIngredient(ArrayList<IngredientClass> ingredient) {
		this.ingredient = ingredient;
	}

	//Method
	
	public void loadData()
	{
		this.createConnection();
		
		Statement st;
		try {
			
			st = this.con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM ingredients");

			while (rs.next()) // reads the table line by line
			{
				IngredientModel newIngredient = new IngredientModel();
				newIngredient.id=Integer.parseInt(rs.getString("id"));
				newIngredient.nombre=rs.getString("nombre");
				newIngredient.calories=Integer.parseInt(rs.getString("calories"));
				newIngredient.flats=Double.parseDouble(rs.getString("flats"));

				
				this.ingredient.add(newIngredient);
			
			} 
		}catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		this.disconnect();
	}

	public void foundIngredient() {
		this.createConnection();
		
		Statement st;
		try {
			
			st = this.con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM ingredients ingredients.nombre=");

			while (rs.next()) // reads the table line by line
			{
				IngredientModel newIngredient = new IngredientModel();
				newIngredient.id=Integer.parseInt(rs.getString("id"));
				newIngredient.nombre=rs.getString("nombre");
				newIngredient.calories=Integer.parseInt(rs.getString("calories"));
				newIngredient.flats=Double.parseDouble(rs.getString("flats"));

				
				this.ingredient.add(newIngredient);
			
			} 
		}catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		this.disconnect();
		
	}
	
}
