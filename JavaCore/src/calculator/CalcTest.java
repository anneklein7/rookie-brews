package calculator;

import java.util.Scanner;

public class CalcTest {
	
	public static void main(String[] args) {
		CalculatorOne calc=new CalculatorOne();
		System.out.println(calc.add(10, 20));
		System.out.println(calc.minus(10, 20));
		System.out.println(calc.div(10, 20));
		System.out.println(calc.multi(10, 20));
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your choice:");
		System.out.println("1 Addition");
		System.out.println("2 Subtraction");
		System.out.println("3 Division");
		System.out.println("4 Multiplication");
		
		int ans=scn.nextInt();
		
		switch (ans) {
		case 1:
			System.out.println(calc.add(10, 20));
			break;
		case 2:
			System.out.println(calc.minus(10, 20));
			break;
		case 3:
			System.out.println(calc.div(10, 20));
			break;
		case 4:
			System.out.println(calc.multi(10, 20));
			break;
		default:
			System.out.println("Please select a valid input.");
		}
		
		scn.close();
	}

}
