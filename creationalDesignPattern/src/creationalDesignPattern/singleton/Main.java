package creationalDesignPattern.singleton;

public class Main {

	public static void main(String[] args) {
       Animal a1= Dog.getInstance("Browny");
       System.out.println(a1);
       Animal a2= Dog.getInstance("Potti");
       System.out.println(a2);
	}

}
