package methodstesting;

public class TeleTest {
	
	public static void main(String[] args) {
		Television tele=new Television();
		tele.brand="Samsung";
		tele.price=1200;
		tele.screenSize=55;
		tele.turnOn();
		int x=tele.switchToAChannel();
		System.out.println(x);
		System.out.println(tele.switchToAChannel());
		
		double discount=tele.getDiscount();
		System.out.println(discount);
		
		double discountOnBlackFriday=tele.discountOnBlackFriday(30);
		System.out.println(discountOnBlackFriday);

		double discountAtTheEnd=tele.discountOnBlackFriday(50);
		System.out.println(discountAtTheEnd);
		
		double totalDiscount=tele.dicountWithCityBank(30, 25);
		System.out.println(totalDiscount);
	}

}
