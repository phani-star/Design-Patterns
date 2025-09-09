package strategyDesignPattern;

public class BitCoinPayment implements PaymentStrategy {

	@Override
	public void pay(int a) {
		System.out.println(a+" rupees paid successfully using bitcoin");
		
	}
}
