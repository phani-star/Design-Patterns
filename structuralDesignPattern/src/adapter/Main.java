package adapter;

public class Main {

	public static void main(String[] args) {
		Notification n= new TextMsgAdapter(new TextMsg());
		n.sendNotification();

	}

}
