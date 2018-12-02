package com.noithatchatluong.utils;


import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class SendConfirmInformationAccountCustomerUtils {

	public static void sendEnableAccountMail(String fullname, String inactiveCustomerEmail, String urlContextConfirmCustomerInformation) {
		final String fromEmail = "trong.tn203@gmail.com"; // requires valid gmail id
		final String password = "endless203"; // correct password for gmail id
		final String toEmail = inactiveCustomerEmail;

		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com"); // SMTP Host
		props.put("mail.smtp.socketFactory.port", "465"); // SSL Port
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory"); // SSL Factory Class
		props.put("mail.smtp.auth", "true"); // Enabling SMTP Authentication
		props.put("mail.smtp.port", "465"); // SMTP Port
		Authenticator auth = new Authenticator() {
			// override the getPasswordAuthentication method
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);
			}
		};
		Session session = Session.getDefaultInstance(props, auth);
		try {
			MimeMessage msg = new MimeMessage(session);

			// set message headers
			msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
			msg.addHeader("format", "flowed");
			msg.addHeader("Content-Transfer-Encoding", "8bit");
			msg.setFrom(new InternetAddress("no_reply@noithatchatluong", "NoReply-NOITHATCHATLUONG"));

			msg.setReplyTo(InternetAddress.parse("no_reply@noithatchatluong", false));

			msg.setSubject("Thư xác nhận tài khoản email từ NOITHATCHATLUONG", "UTF-8");
			String content = "<html>"
					+ "<title>Thư xác nhận tài khoản từ NOITHATCHATLUONG</title>"
					+ "<body>"
					+ "<p>Xin chào " + fullname
					+ ", cảm ơn bạn đã đăng ký tài khoản tại NOITHATCHATLUONG</p>"
					+ "<br />"
					+ "Chân thành cảm ơn bạn đã kiên nhẫn tạo tài khoản, chỉ còn một bước để kích hoạt tài khoản của bạn."
					+ "<br/>"
					+ "<p>Vui lòng click "
					+ "<a href = '"+ urlContextConfirmCustomerInformation + "'> vào đây </a>"
					+ " để xác nhận tài khoản của bạn ."
					+ ""
					+ "</p>"
					+ "</body>"
					+ "</html>"
					+ "";		
			msg.setContent(content, "text/html; charset=utf-8");
			msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
			Transport.send(msg);
			System.out.println("Đã gửi tin nhắn xác thức tài khoản !");
		} catch (Exception ex) {
			System.out.println("Lỗi khi gửi mail !");
			System.out.println(ex.getMessage());
		}
	}

}
