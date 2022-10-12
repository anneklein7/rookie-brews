package staticfinalexample;

public class TestFinal {
	public static void main(String[] args) {
		SampleFinal obj=new SampleFinal();
		System.out.println(obj.x);
		System.out.println(obj.y);
		
		SampleFinal obj1=new SampleFinal(444);
		System.out.println(obj1.x);
		System.out.println(obj1.y);
		
		SampleFinal obj2=new SampleFinal(111, 666);
		System.out.println(obj2.x);
		System.out.println(obj2.y);
		
		Country India=new Country(30);
		Country USA=new Country(40);
		Country UK=new Country(20);
		Country xx=new Country();
		
		System.out.println(India);
		System.out.println(USA);
		System.out.println(UK);
		System.out.println(xx);
	}

}
