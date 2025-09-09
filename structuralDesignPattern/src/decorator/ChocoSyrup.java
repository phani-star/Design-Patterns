package decorator;

public class ChocoSyrup implements Icecream {
	
	private Icecream ic;
	private int cost;
	
	public ChocoSyrup(Icecream ic){
		this.ic=ic;
		this.cost=ic.getPrice()+10;
	}

	@Override
	public int getPrice() {
		return ic.getPrice()+10;
	}

	@Override
	public String getDescription() {
		return ic.getDescription()+" ,choco syrup";
	}

}
