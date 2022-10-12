package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateRecord {
	public static void main(String[] args) {
		
		try {
			String url = "jdbc:mysql://localhost:3306/javadb";
			String userName = "root";
			String password = "Eltherelar18!";
			Connection con = DriverManager.getConnection(url, userName, password);
			System.out.println("Connected successfully");
			
			// importing content from SQL database
			String query = "update customers set phone=111111 where id=106;"; //query to be executed
			Statement stmt = con.createStatement(); // creates sql statement
			stmt.executeUpdate(query); // executes it
			System.out.println("One record updated successfully.");
			
			
		} catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Something went wrong...");
			}
		}

}
