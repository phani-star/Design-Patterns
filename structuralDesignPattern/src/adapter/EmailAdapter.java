package adapter;

public class EmailAdapter implements Notification {
	Email mail;
	String mail1, mail2;
	

	public EmailAdapter(Email mail, String mail1, String mail2) {
		this.mail = mail;
		this.mail1 = mail1;
		this.mail2 = mail2;
	}


	@Override
	public void sendNotification() {
		mail.sendMail(mail1, mail2);
	}

}
