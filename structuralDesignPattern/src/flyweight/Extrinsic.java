package flyweight;

public class Extrinsic {
	Intrinsic intrinsic;

	String filling;
	String addOn;
	
	public Extrinsic(Intrinsic intrinsic, String filling, String addOn) {
		this.intrinsic = intrinsic;
		this.filling = filling;
		this.addOn = addOn;
	}
	
	public Intrinsic getIntrinsic() {
		return intrinsic;
	}
	public void setIntrinsic(Intrinsic intrinsic) {
		this.intrinsic = intrinsic;
	}
	public String getFilling() {
		return filling;
	}
	public void setFilling(String filling) {
		this.filling = filling;
	}
	public String getaddOn() {
		return addOn;
	}
	public void setaddOn(String toppings) {
		this.addOn = toppings;
	}
	
	
	
}
