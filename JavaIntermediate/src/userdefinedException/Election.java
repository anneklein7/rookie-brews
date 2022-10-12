package userdefinedException;

public class Election {
	public void checkEligibility(int age) throws InvalidAgeException
	{
		if(age<18)
			throw new InvalidAgeException("You should be at least 18 to vote");
		else
			System.out.println("Please cast your vote");
	}

}
