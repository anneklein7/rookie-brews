package lambda;

public class Test {

	public static void main(String[] args) {
		//Person p=new Person();
		//p.greet();
		//Greeting gr=new Greeting();//not allowed
		//Greeting gr=new Person();//dependency on class person
		
		//Anonymous class
		Greeting gr=new Greeting(){
			public void greet()
			{
				System.out.println("Hello world");
			}			
		};
		gr.greet();
		
		//lambda expression
		//leftside -> rightside
		//arguments -> body
		//() -> { printing/calculation}
		//Lambda without any args and no return type
		Greeting gr1=()->{System.out.println("Helloworld");};
		gr1.greet();
		
		//Lambda with args and no return type
		GreetingWithName grName=(x)->{System.out.println("Hello "+x);};
		grName.greet("Kevin");
		
		//Lambda with args and with return type
		GreetingWithReturn grReturn=(x)->{ return "Hello "+x ;};
		System.out.println(grReturn.greet("Hasan"));
		
	}

}
