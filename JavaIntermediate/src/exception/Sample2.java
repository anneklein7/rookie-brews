package exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sample2 {
	public static void main(String[] args) {
		try {
			int x = 10;
			int y = 2;
			int z = x/y; // logical issue: you can't divide something by 0
			int[] nums = new int[5];
			nums[5] = 200;
			Connection con=DriverManager.getConnection("", "", "");
			
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException | SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("We cannot divide a number by zero");
		}
		
	}

}
