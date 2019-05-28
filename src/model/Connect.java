package model;

import java.sql.*;

//--- To connect to a database Download the https://dev.mysql.com/downloads/connector/j/5.1.html library
//and copy the jar archive in  web-inf/lib folder

public class Connect {

	// ---- variables ----- //

	protected Connection con = null;

	public Connect() {
		super();
		
	}

	public Connection createConnection() {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/1aw3_recipes_book";
		String userBbdd = "root";
		String passBbdd = "";
		try {
			// ----- connecting procedure ----//
			Class.forName(driver);
			con = DriverManager.getConnection(url, userBbdd, passBbdd);

		} catch (Exception ex) {
			con = null;
			System.out.println("La vida es una lenteja");

		}
		return this.con;
	}

	public Connection getConnection()
	/*
	 * this function return the connection itself
	 */
	{
		return this.con;
	}

	// ---------------------------------------------
	public void disconnect() {
		this.con = null;
	}
	
}