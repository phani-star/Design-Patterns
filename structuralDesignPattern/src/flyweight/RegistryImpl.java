package flyweight;
import java.util.*;
public class RegistryImpl implements Registry {
	HashMap<String, Extrinsic> m= new HashMap<>();

	@Override
	public Extrinsic getDosa(String filling) {
		return m.get(filling);
	}



	@Override
	public void addDosa(Extrinsic e) {
		m.put(e.getFilling(), e);
	}

}
