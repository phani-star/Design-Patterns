package observerDesignPattern;

public interface Publisher {
   public void addSubscriber(Subscriber s);
   public void removeSubscriber(Subscriber s);
   public void updateScore(int s);
}
