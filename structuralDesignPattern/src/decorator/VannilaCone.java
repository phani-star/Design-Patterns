package decorator;

public class VannilaCone implements Icecream{
	private Icecream ic;
	private int cost;
	
	public VannilaCone() {
		this.ic = null;
		this.cost =15;
	}

	public VannilaCone(Icecream ic) {
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
			return "vannila cone";
		else
			return ic.getDescription()+" ,vannila cone";
	}

}
