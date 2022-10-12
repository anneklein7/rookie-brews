package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertRecord {
	public static void main(String[] args) {
		
	try {
		String url = "jdbc:mysql://localhost:3306/javadb";
		String userName = "root";
		String password = "Eltherelar18!";
		Connection con = DriverManager.getConnection(url, userName, password);
		System.out.println("Connected successfully");
		
		// importing content from SQL database
		String query = "insert into customers values(106, 'Rob', 99999, 'r@gmail.com')"; //query to be executed
		Statement stmt = con.createStatement(); // creates sql statement
		stmt.executeUpdate(query); // executes it
		System.out.println("One record inserted successfully.");
		
		
	} catch(Exception e)
	{
		System.out.println(e.getMessage());
		System.out.println("Something went wrong...");
		}
	}
}
