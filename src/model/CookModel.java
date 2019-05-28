package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CookModel extends CookClass{

	ArrayList<CookClass> cook =new ArrayList<CookClass>();

	//Constructor
	/**
	 * 
	 */
	public CookModel() {
		super();
	}

	/**
	 * @param id_recipe
	 * @param id_ingredient
	 * @param grams
	 * @param recipe
	 */
	public CookModel(int id_recipe, int id_ingredient, int grams, ArrayList<CookClass> cook) {
		super(id_recipe, id_ingredient, grams);
		this.cook = cook;
	}

	//Getter y Setter
	/**
	 * @return the recipe
	 */
	public ArrayList<CookClass> getCook() {	
		return cook;
	}

	/**
	 * @param recipe the recipe to set
	 */
	public void setCook(ArrayList<CookClass> recipe) {
		this.cook = cook;
	}
	
	//Method
	
	public void loadData()
	{
		this.createConnection();
		
		Statement st;
		try {
			
			st = this.con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM cook");

			while (rs.next()) // reads the table line by line
			{
				CookModel cook = new CookModel();
				cook.id_recipe=Integer.parseInt(rs.getString("id_recipe"));
				cook.id_ingredient=Integer.parseInt(rs.getString("id_ingredient"));
				cook.grams=Integer.parseInt(rs.getString("grams"));
				
				this.cook.add(cook);
			
			} 
		}catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		this.disconnect();
	}
	
}
