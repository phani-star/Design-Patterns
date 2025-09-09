package creationalDesignPattern.builder;

public class Student {

	private String name;
	private int id;
	private String mail;
	private String phno;
	private String univ;
	private int gpa;
	
	private Student(Builder b) {
		if(b.getGpa()<7) {
			throw new CandidateInEligibleException("GPA should be >=7");
		}
		this.gpa=b.getGpa();
		this.id=b.getId();
		this.mail=b.getMail();
		this.name=b.getName();
		this.phno=b.getPhno();
		this.univ=b.getUniv();
	}
	
	public static Student getStudent(Builder b) {
		return new Student(b);
	}
}
