package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import model.IngredientModel;
import model.RecipeModel;

/**
 * Servlet implementation class BuscarReceta
 */
@WebServlet("/BuscarReceta")
public class BuscarReceta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscarReceta() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RecipeModel receta= new RecipeModel();
		receta.loadData();
		
		IngredientModel ingredientes= new IngredientModel();
		ingredientes.loadData();
		
		String vNuevas="[{ \"nombre\": \"tortilla de atun\", \"tipo\": \"MainDish\" , \"ingredients\" : [ { \"nombre\":\"atun fresco\"},\r\n" + 
				"                                                                        { \"nombre\":\"huevo\"},\r\n" + 
				"                                                                        { \"nombre\":\"aceite de oliva\"},\r\n" + 
				"                                                                        { \"nombre\":\"sal\"},\r\n" + 
				"                                                                        { \"nombre\":\"cebolla\"}\r\n" + 
				"                                                                      ] \r\n" + 
				"  },\r\n" + 
				"  { \"nombre\": \"lentejas con chorizo\", \"tipo\": \"MainDish\" , \"ingredients\" : [ { \"nombre\":\"lentejas\"},\r\n" + 
				"                                                                        { \"nombre\":\"cebolla\"},\r\n" + 
				"                                                                        { \"nombre\":\"sal\"},\r\n" + 
				"                                                                        { \"nombre\":\"chorizo\"},\r\n" + 
				"                                                                        { \"nombre\":\"agua\"},\r\n" + 
				"                                                                        { \"nombre\":\"aceite de oliva\"}\r\n" + 
				"                                                                      ] \r\n" + 
				"  }\r\n" + 
				"]";
		
		int ingDispo=0;
		int ingNoDisp=0;
		
		JSONArray nuevos = new JSONArray(vNuevas);
		//Recorrer el JSON de recetas
		for (int i = 0; i < nuevos.length(); i++) {
			//JSONObject objieto =nuevos.getJSONObject(i);
			//System.out.println(nuevos.getJSONObject(i).get("nombre"));
			
			ingDispo=0;
			//Recorrer la tabla recetas, comprobar si existe
			for (int j = 0; j < receta.getRecipe().size(); j++) {
				
				if (nuevos.getJSONObject(i).getString("nombre").toLowerCase().equals(receta.getRecipe().get(j).getNombre())) {
					
					System.out.println(receta.getRecipe().get(j).getNombre() + " Existe en la base de datos");
				
				}else {
					
					//Recorrer los ingredientes de la receta I
					JSONArray ingNuevos = new JSONArray(nuevos.getJSONObject(i).get("ingredients").toString());
					
					int totalIng=ingNuevos.length();
					
					for(int t=0; t < ingNuevos.length();t++) {
					
						//Recorrer todos los ingredientes, comprobar que existan todos
						for(int z=0; z< ingredientes.getIngredient().size(); z++) {
							
							if(ingNuevos.getJSONObject(t).get("nombre").equals(ingredientes.getIngredient().get(z).getNombre())) {
								ingDispo++;
							}	
	
						}
						System.out.println(ingNuevos.getJSONObject(t).getString("nombre"));
					}
					//ingNoDisp=totalIng - ingDispo;
					
					//Comprobacion que todos los ingredientes de la receta existan
					if(ingDispo==totalIng) {
						System.out.println("Se creara la nueva receta");
						
					}else {
							
						//System.out.println("Tienes "+ ingDispo +" ingredientes");
						//System.out.println("Faltan "+ ingNoDisp);
					}
					

				}
			}
			
		}
		//
}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
