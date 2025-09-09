package adapter;

public class WhatsAppAdapter implements Notification {
	WhatsAppMsg w;

	
	public WhatsAppAdapter(WhatsAppMsg w) {
		this.w = w;
	}



	@Override
	public void sendNotification() {
		w.sendMessage();
	}

}
