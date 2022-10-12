package exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sample {
	public static void main(String[] args) {
		try {
			int x = 10;
			int y = 2;
			int z = x/y; // logical issue: you can't divide something by 0
			int[] nums = new int[5];
			nums[4] = 200;
			Connection con=DriverManager.getConnection("", "", "");
			
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("We cannot divide a number by zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("Element cannot be placed outside of array boundaries");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("Could not connect to the database");
		}
		finally {
			System.out.println("I will always get executed!");
		}
		
	}

}
