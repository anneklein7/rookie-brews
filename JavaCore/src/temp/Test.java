package temp;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
	 Scanner scn = new Scanner(System.in);
			System.out.println("Please enter your name");
			String name=scn.next();
			System.out.println("Please enter your surname");
			String surname=scn.next();
			System.out.println("Please enter your year of birth");
			int year=scn.nextInt();
			System.out.println("Hello "+name+" "+surname+"! Welcome to the world of Java... you were born in "+year);
	}

}
