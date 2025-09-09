package strategyDesignPattern;

public class PaymentContext {

	private PaymentStrategy strategy; 
	
	public PaymentContext(PaymentStrategy strategy) {
		this.strategy = strategy; 
		} 
	
	public void setStrategy(PaymentStrategy strategy) { 
		this.strategy = strategy; 
		}
	
	public void processPayment(int amount) {
		strategy.pay(amount); 
		}
}
