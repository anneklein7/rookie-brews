package unit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RunTest {
	@Test  // check if FindBig() method returns right results
	public void runFindBig() {
		//assertequals check if first argument is equal to 2nd args
		assertEquals(500,Calculator.findBig(500, 200));
	}
	
	@Test  // check if FindBig() method returns right results
	public void runFindSmall() {
		//assertequals check if first argument is equal to 2nd args
		assertEquals(10,Calculator.findSmall(10, 20));
	}
	
	@Test  // check if FindBig() method returns right results
	public void runFindBiggest() {
		//assertequals check if first argument is equal to 2nd args
		assertEquals(20,Calculator.findBiggest(10,20,15));
	}
	
	@Test  // check if FindBig() method returns right results
	public void runFindMax() {
		int[] myArray= {100,20,30,1500,400};
		assertEquals(1500,Calculator.findMax(myArray));
	}
}
//assertEquals(expected value,actual value)



















