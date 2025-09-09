package creationalDesignPattern.prototypeAndRegistry;
import java.util.*;
public class PrototypeRegistry {
	
	private Map<String, Prototype> prototypes = new HashMap<>();
	
	public void addPrototype(String key, Prototype prototype) 
	{ 
		prototypes.put(key, prototype);
	}
	
	public Prototype getPrototype(String key)
	{ 
		Prototype prototype = prototypes.get(key);
	   return prototype != null ? prototype.clone() : null;
	}
}
