package observerDesignPattern;
import java.util.*;
public class LiveScore implements Publisher{
	List<Subscriber> l;
	

	public LiveScore() {
		this.l = new ArrayList<>();
	}

	@Override
	public void addSubscriber(Subscriber s) {
		l.add(s);
	}
	
	@Override
	public void removeSubscriber(Subscriber s) {
		l.remove(s);
	}

	@Override
	public void updateScore(int s) {
		for(Subscriber sub: l) {
			sub.notifyScore(s);
		}
	}
	

}
