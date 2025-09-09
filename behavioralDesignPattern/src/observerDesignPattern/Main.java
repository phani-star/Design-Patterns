package observerDesignPattern;

public class Main {

	public static void main(String[] args) {
        Publisher p= new LiveScore();
        Subscriber s1= new Cricbuzz();
        Subscriber s2= new ESPNCricInfo();
        
        p.addSubscriber(s1);
        p.addSubscriber(s2);
        
        p.updateScore(10);
        
        p.updateScore(20);
	}

}
