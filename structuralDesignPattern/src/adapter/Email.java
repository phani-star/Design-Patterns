package adapter;

public class Email {
	String senderMail, receiverMail, msg;

	public Email(String senderMail, String receiverMail, String msg) {
		this.senderMail = senderMail;
		this.receiverMail = receiverMail;
		this.msg = msg;
	}
	
	public void sendMail(String senderMail,String receiverMail) {
		System.out.println("Mail");
	}
	
}
