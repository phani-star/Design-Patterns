package creationalDesignPattern.prototypeAndRegistry;

public class Main {

	public static void main(String[] args) {
	        PrototypeRegistry registry = new PrototypeRegistry();

	        // Create and register prototypes
	        ConcretePrototype original = new ConcretePrototype("Original");
	        registry.addPrototype("OriginalPrototype", original);

	        // Clone prototypes from the registry
	        ConcretePrototype cloned1 = (ConcretePrototype) registry.getPrototype("OriginalPrototype");
	        ConcretePrototype cloned2 = (ConcretePrototype) registry.getPrototype("OriginalPrototype");

	        // Display the fields of the clones
	        System.out.println("Cloned1: " + cloned1.getField());
	        System.out.println("Cloned2: " + cloned2.getField());

	        // Modify the cloned objects
	        cloned1.setField("Cloned 1");
	        cloned2.setField("Cloned 2");

	        // Display the fields again to show that they are different
	        System.out.println("Original: " + original.getField());
	        System.out.println("Cloned1 after modification: " + cloned1.getField());
	        System.out.println("Cloned2 after modification: " + cloned2.getField());
	    }
	}
	


