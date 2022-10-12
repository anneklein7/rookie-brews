package methodstesting;

public class SampleOverloading {
	/* method overloading when we have more than one 
	 * method with the same name but they differ in n.
	 * of arguments, data of arguments or order of arguments */
	
	public void sum(int x,int y) {}
	public void sum(float x,float y) {}
	public void sum(int x , float y) {}
	public void sum(float x, int y) {}
	public void sum(double x, double y, double z) {}
	public void sum(int x, int y, int z) {}

}
