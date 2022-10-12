package exception;

public class Shopping {
	
	public void addToCart()
	{
		// handling exception, taking responsibility for fixing issues
		try {
			String[] cart = new String[5];
			cart[5] = "Mobile";
		} catch (Exception e) {}
	}
	// declaring the exception, passing ownership to calling environment
	public void makePayment() throws Exception
	{
		int x = 10;
		int y = 0;
		int z = x/y;
	}
}
