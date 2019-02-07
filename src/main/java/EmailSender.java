
public class EmailSender {

	public static void main(String[] args) {
		final String fromEmail = "cgtamaral@gmail.com";
		final String password = "password";
		final String toEmail = "cgtamaral@gmail.com";
		
		System.out.println("Initializing email send.");
		
		EmailConfig config = new EmailConfig();
		
		config.sendEmail(fromEmail, password, toEmail, "Subject", "Email Body");
	}
}
