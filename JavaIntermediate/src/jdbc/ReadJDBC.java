package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadJDBC {
	
	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost:3306/javadb";
			String userName = "root";
			String password = "Eltherelar18!";
			Connection con = DriverManager.getConnection(url, userName, password);
			System.out.println("Connected successfully");
			
			// importing content from SQL database
			String query = "select * from customers"; //query to be executed
			Statement stmt = con.createStatement(); // creates sql statement
			ResultSet rs = stmt.executeQuery(query); // executes it
			
			while(rs.next())
			{
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int phone = rs.getInt(3);
				String email = rs.getString(4);
				System.out.println(id + " " + name + " " + phone + " " + email);
			}
			
			
		} catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Something went wrong...");
		}
	}

}
