package flyweight;

public class Main {

	public static void main(String[] args) {
		Extrinsic e= new Extrinsic(new Intrinsic("rava", "peanut chutney"), "masala", "onions");
		Registry r= new RegistryImpl();
		r.addDosa(e);
        System.out.println(r.getDosa("masala"));
	}

}
