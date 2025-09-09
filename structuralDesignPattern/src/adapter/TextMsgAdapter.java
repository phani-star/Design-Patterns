package adapter;

public class TextMsgAdapter implements Notification {

	TextMsg text;
	
	public TextMsgAdapter(TextMsg text) {
		this.text = text;
	}


	@Override
	public void sendNotification() {
		text.sendMessage();
	}

}
