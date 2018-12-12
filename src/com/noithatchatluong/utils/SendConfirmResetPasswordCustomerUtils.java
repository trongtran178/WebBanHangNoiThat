package com.noithatchatluong.utils;


import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class SendConfirmResetPasswordCustomerUtils {

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

			msg.setSubject("Thư xác nhận reset mật khẩu từ NOITHATCHATLUONG", "UTF-8");
			String content = "<html>"
					+ "<title>Thư xác nhận reset mật khẩu tài khoản từ NOITHATCHATLUONG</title>"
					+ "<body>"
					+ "<p>Xin chào " + fullname
					+ ", chúng tôi nhận được yêu cầu khôi phục mật khẩu cho tài khoản của bạn tại NOITHATCHATLUONG</p>"
					+ "<br />"
					+ "Vì lý do bảo mật, nếu đúng bạn là người yêu cầu khôi phục mật khẩu cho tài khoản "
					+ toEmail
					+ "<br/>"
					+ "<p>Vui lòng click "
					+ "<a href = '"+ urlContextConfirmCustomerInformation + "'> vào đây </a>"
					+ " để khôi phục mật khẩu cho  tài khoản của bạn ."
					+ ""
					+ "</p>"
					+"<p>Nếu bạn không yêu cầu đổi mật khẩu vui lòng bỏ qua thư này.</p>"
					+"<p>Xin cám ơn!</p>"
					+ "</body>"
					+ "</html>"
					+ "";		
			msg.setContent(content, "text/html; charset=utf-8");
			msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
			Transport.send(msg);
			System.out.println("Đã gửi tin xác nhận reset mật khẩu !");
		} catch (Exception ex) {
			System.out.println("Lỗi khi gửi mail !");
			System.out.println(ex.getMessage());
		}
	}

}
