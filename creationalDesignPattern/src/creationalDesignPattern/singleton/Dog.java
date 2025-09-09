package creationalDesignPattern.singleton;

public class Dog implements Animal{
  String name;
 private static Dog d;
  
  Dog(String n){
	  this.name=n;
  }

@Override
public void eat() {
	System.out.println(this.name+" is eating");
}

@Override
public void sleep() {
	System.out.println(this.name+" is sleeping");
}

public static Dog getInstance(String s) {
	if(d==null) {
		synchronized(Dog.class) {
			if(d==null) {
				d=new Dog(s);
			}
		}
	}
	return d;
}
}
