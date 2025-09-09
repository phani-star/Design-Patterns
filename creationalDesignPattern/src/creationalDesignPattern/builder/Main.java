package creationalDesignPattern.builder;

public class Main {

	public static void main(String[] args) {
		Builder b= new Builder();
		
		b.setGpa(7);
		b.setId(1);
		b.setMail("abc@gmail.com");
		b.setName("Abc");
		b.setPhno("1234567890");
		b.setUniv("JNTUH");
		
		Student s= Student.getStudent(b);
		
		
	

	}

}
