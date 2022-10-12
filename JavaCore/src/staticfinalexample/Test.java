package staticfinalexample;

public class Test {
	public static void main(String[] args) {
		MySample obj1 = new MySample(); //++101
		obj1.x = 10;
		obj1.x++;
		System.out.println(obj1.x);
		System.out.println(MySample.staticx++); //102
		System.out.println(MySample.staticx++); //103
		
		MySample obj2=new MySample(); //++ 104
		obj2.x=20;
		System.out.println(obj2.x);
		obj2.x++;
		System.out.println(obj2.x);
		System.out.println(MySample.staticx++); // 105
		
		MySample obj3 = new MySample(); //++ 106
		System.out.println(MySample.staticx++);
	}
}
