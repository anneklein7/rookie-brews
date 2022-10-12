package functionalInterface;

import java.util.function.Function;

public class FunctionTestt {
	public static void main(String[] args) {
		Function<Integer, Integer> fun=(x) -> (x+100);
		System.out.println(fun.apply(200));
	}

}
