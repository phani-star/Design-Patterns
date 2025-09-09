package strategyDesignPattern;

public class CreditCardPayment implements PaymentStrategy {

	@Override
	public void pay(int a) {
		System.out.println(a+" rupees paid successfully using credit card");
		
	}
}
