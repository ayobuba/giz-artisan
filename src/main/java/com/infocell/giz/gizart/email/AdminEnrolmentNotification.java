package com.infocell.giz.gizart.email;

import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.infocell.giz.gizart.model.Admin;

public class AdminEnrolmentNotification implements MailService {

	public void sendToAllAdmins(List<Admin> adminList) {
		for (Admin a : adminList) {
			sendEmail(a);

		}

	}

	public void sendEmail(Object object) {
		final String username = "artisanjobcenter@gmail.com";
		final String password = "Artisan@79";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {

			Admin admin = (Admin) object;

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("update@artisanjobcenter.ng"));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(admin.getBioData().getEmail().getEmailAddress()));
			message.setSubject("New Artisan Enrolled");
			message.setText("Hello Admin," + admin.getBioData().getLastName()
					+ "\n\n We have a new artisan that has enrolled with us");

			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void sendEmail(String from, String to, String subject, String msg) {
		final String username = "update@artisanjobcenter.ng";
		final String password = "Artisan@79";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "mail.artisanjobcenter.ng");
		props.put("mail.smtp.port", "465");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
			message.setSubject(subject);
			message.setText(msg);

			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}

}
