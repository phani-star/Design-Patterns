package flyweight;

public interface Registry {
	
	public void addDosa(Extrinsic e);
	
	public Extrinsic getDosa(String name);

}
