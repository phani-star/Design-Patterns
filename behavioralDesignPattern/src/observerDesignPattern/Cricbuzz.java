package observerDesignPattern;

public class Cricbuzz implements Subscriber {

	@Override
	public void notifyScore(int s) {
		System.out.println("score on cricbuzz:"+s);
		
	}

}
