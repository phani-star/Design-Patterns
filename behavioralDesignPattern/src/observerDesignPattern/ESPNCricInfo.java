package observerDesignPattern;

public class ESPNCricInfo implements Subscriber{

	@Override
	public void notifyScore(int s) {
		System.out.println("score on ESPNCricInfo:"+s);
	}
}
