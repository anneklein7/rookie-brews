package staticfinalexample;

public class SampleFinal {
	final int x=100; // declaration
	final int y;
	static final int big=555;
	
	public SampleFinal() { // in the constructor
		this.y=333;
	}
	
	public SampleFinal(int temp) { // in the constructor
		this.y=333;
	}
	
	public SampleFinal(int a, int b) { // in the constructor
		b++;
		this.y=a;
	}

}
