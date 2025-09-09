package creationalDesignPattern.factory;

public class Main {

	public static void main(String[] args) {
		Flutter f= new Flutter(SupportedType.ANDROID);
		UIFactory factory= Flutter.type();
        System.out.println(factory.createButton());
        System.out.println(factory.createDropdown());
        System.out.println(factory.createMenu());
	}

}
