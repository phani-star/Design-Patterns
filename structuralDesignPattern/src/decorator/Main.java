package decorator;

public class Main {

	public static void main(String[] args) {
		Icecream i= new Toppings(new
				ChocoSyrup(new 
						VannilaScoop(new 
								ChocoScoop(new 
										ChocoSyrup(new 
												VannilaCone())))));
		
		System.out.println(i.getDescription());
		System.out.println(i.getPrice());

	}

}
