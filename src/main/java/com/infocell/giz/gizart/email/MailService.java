package com.infocell.giz.gizart.email;

public interface MailService {

	public void sendEmail(final String from, final String to, String subject, String message);
}
