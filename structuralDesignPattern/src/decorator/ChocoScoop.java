package decorator;

public class ChocoScoop implements Icecream {
	private Icecream ic;
	private int cost;
	
	public ChocoScoop(Icecream ic){
		this.ic=ic;
		this.cost=ic.getPrice()+20;
	}

	@Override
	public int getPrice() {
		return ic.getPrice()+20;
	}

	@Override
	public String getDescription() {
		return ic.getDescription()+" ,choco scoop";
	}

}
