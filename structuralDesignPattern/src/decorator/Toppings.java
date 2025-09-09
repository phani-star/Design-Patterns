package decorator;

public class Toppings implements Icecream {
	
	private Icecream ic;
	private int cost;
	
	public Toppings(Icecream ic) {
		this.ic=ic;
		this.cost=ic.getPrice()+10;
	}

	@Override
	public int getPrice() {
		return ic.getPrice()+10;
	}

	@Override
	public String getDescription() {
		return ic.getDescription()+", toppings";
	}

}
