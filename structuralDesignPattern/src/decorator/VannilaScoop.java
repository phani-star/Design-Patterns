package decorator;

public class VannilaScoop implements Icecream {
	
	private Icecream ic;
	private int cost;
	
	public VannilaScoop(Icecream ic){
		this.ic=ic;
		this.cost=ic.getPrice()+15;
	}

	@Override
	public int getPrice() {
		return ic.getPrice()+15;
	}

	@Override
	public String getDescription() {
		if(ic==null)
		return "vannila scoop";
		else
		return ic.getDescription()+" ,vannila scoop";
	}

}
