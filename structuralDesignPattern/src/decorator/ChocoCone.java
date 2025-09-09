package decorator;

public class ChocoCone implements Icecream {

	private Icecream ic;
	private int cost;
	
	public ChocoCone() {
		this.ic = null;
		this.cost = 15;
	}

	public ChocoCone(Icecream ic) {
		this.ic = ic;
		this.cost = ic.getPrice()+15;
	}

	@Override
	public int getPrice() {
		if(ic==null)
		return 15;
		else
		return ic.getPrice()+15;
	}

	@Override
	public String getDescription() {
		if(ic==null)
		return "chocolate cone";
		else
		return ic.getDescription()+" ,chocolate cone";
	}

}
