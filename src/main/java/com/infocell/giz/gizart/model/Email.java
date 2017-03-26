package com.infocell.giz.gizart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "email")
public class Email {

	@Id
	@GeneratedValue
	@Column(name = "email_id")
	private int emailId;

	@Column(name = "email_address")
	private String emailAddress;

	@OneToOne(mappedBy = "email")
	private BioData bioData;

	@OneToOne(mappedBy = "email")
	private Organization organization;

	@OneToOne(mappedBy = "email")
	private ContactUs contactUs;

	public int getEmailId() {
		return emailId;
	}

	public void setEmailId(int emailId) {
		this.emailId = emailId;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public BioData getBioData() {
		return bioData;
	}

	public void setBioData(BioData bioData) {
		this.bioData = bioData;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public ContactUs getContactUs() {
		return contactUs;
	}

	public void setContactUs(ContactUs contactUs) {
		this.contactUs = contactUs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bioData == null) ? 0 : bioData.hashCode());
		result = prime * result + emailId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Email other = (Email) obj;
		if (bioData == null) {
			if (other.bioData != null)
				return false;
		} else if (!bioData.equals(other.bioData))
			return false;
		if (emailId != other.emailId)
			return false;
		return true;
	}

}
