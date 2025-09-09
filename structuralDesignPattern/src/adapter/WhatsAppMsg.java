package adapter;

public class WhatsAppMsg {
     String sender, msg;

	public WhatsAppMsg(String sender, String msg) {
		this.sender = sender;
		this.msg = msg;
	}
	
	public void sendMessage() {
		System.out.println("WhatsApp message");
	}
     
}
