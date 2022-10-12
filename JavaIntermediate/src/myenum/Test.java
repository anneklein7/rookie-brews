package myenum;

public class Test {

	public static void main(String[] args) {
		Colors myColor=Colors.RED;
		System.out.println(myColor);
		
		MsgStatus mObj=MsgStatus.READ;
		System.out.println(mObj.getMsg());

	}

}
