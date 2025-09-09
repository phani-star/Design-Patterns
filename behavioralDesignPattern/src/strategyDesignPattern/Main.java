package strategyDesignPattern;

public class Main {

	public static void main(String[] args) {
		PaymentContext p= new PaymentContext(new CreditCardPayment());
		
		p.processPayment(100);
		
		p.setStrategy(new DebitCardPayment());
		p.processPayment(50);
		
		p.setStrategy(new BitCoinPayment());
		p.processPayment(10);

	}

}
