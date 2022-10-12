package polymorphism;

public class Test {
	public static void main(String[] args) {
		Liquid x = new Liquid();
		Milk m = new Milk();
		Tea t = new Tea();
		Coffee c = new Coffee();
		Mug mg = new Mug();
		mg.addLiquid(c);
		mg.addLiquid(x);
		mg.addLiquid(t);
		mg.addLiquid(m);
	}

}
