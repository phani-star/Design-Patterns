package strategyDesignPattern;

public class DebitCardPayment implements PaymentStrategy {

	@Override
	public void pay(int a) {
		System.out.println(a+" rupees paid successfully using debit card");
		
	}

}
