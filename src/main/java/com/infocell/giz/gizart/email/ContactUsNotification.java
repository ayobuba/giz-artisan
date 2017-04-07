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

import org.springframework.beans.factory.annotation.Autowired;

import com.infocell.giz.gizart.model.Admin;
import com.infocell.giz.gizart.model.ContactUs;
import com.infocell.giz.gizart.serviceimpl.ContactUsServiceImpl;

public class ContactUsNotification implements MailService {

	@Autowired
	private ContactUsServiceImpl contactUsServiceImpl;

	public void sendToAllAdmins(List<Admin> adminList, ContactUs c) {
		for (Admin a : adminList) {
			sendEmail(a, c);

		}

	}

	public void sendEmail(Object object, ContactUs c) {
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
			System.out.println("email is " + admin.getBioData().getEmail().getEmailAddress());

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("artisanjobcenter@gmail.com"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("info@artisanjobcenter.ng"));
			message.setSubject("Contact @AJC");
			message.setText("Hello, " + "\n\n You have a new contact. See message below:\n\n" + c.getMessage()
					+ "\n\n From:\n\n" + "Name:" + c.getName() + "\n\n" + "Email:" + c.getEmail().getEmailAddress());

			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void sendEmail(String from, String to, String subject, String msg) {
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
