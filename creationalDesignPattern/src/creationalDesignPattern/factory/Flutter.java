package creationalDesignPattern.factory;

public class Flutter {
	
	private static SupportedType type;
	
	Flutter(SupportedType type){
		this.type=type;
	}
	
	public void refreshRate() {
		System.out.println("displays Refresh rate");
	}
	
	public void version() {
		System.out.println("displays version");
	}
	
	public static UIFactory type() {
		if(type.equals(type.ANDROID)) {
			return new AndroidFactory();
		}
		else if(type.equals(type.IOS)) {
			return new IOSFactory();
		}
		else {
			return new WindowsFactory();
		}
	}

}
