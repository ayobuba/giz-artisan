package com.infocell.giz.gizart.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "contactus")
public class ContactUs {

	@Id
	@GeneratedValue
	@Column(name = "contact_id")
	private int contactId;

	@Column(name = "name")
	private String name;

	@Column(name = "message")
	private String message;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "email_id")
	private Email email;

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

}
