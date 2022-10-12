package userdefinedException;

public class ElectionDay {
	public static void main(String[] args) {
		Election obj = new Election();
		try {
			obj.checkEligibility(12);
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		CheckCC obj1 = new CheckCC();
		try {
			obj1.check("14892089503853932");
		} catch (CreditCardException e) {
			System.out.println(e.getMessage());
		}
	}

}
