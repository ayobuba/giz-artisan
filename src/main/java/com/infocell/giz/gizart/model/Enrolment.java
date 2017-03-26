package com.infocell.giz.gizart.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "enrolment")
public class Enrolment {

	@Id
	@GeneratedValue
	@Column(name = "enrolment_id")
	private int enrolmentId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "artisan_id")
	private Artisan artisan;

	@ManyToOne
	@JoinColumn(name = "marital_status_id")
	private MaritalStatus maritalStatus;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "guarantor_id")
	private Guarantor guarantor;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "kin_id")
	private NextOfKin nok;

	@OneToOne(mappedBy = "enrolment")
	private Interview interview;

	@Column(name = "years_of_experience")
	private int yearsOfExperience;

	@ManyToOne
	@JoinColumn(name = "status_id")
	private EnrolmentStatus enrolmentStatus;

	public int getEnrolmentId() {
		return enrolmentId;
	}

	public void setEnrolmentId(int enrolmentId) {
		this.enrolmentId = enrolmentId;
	}

	public Artisan getArtisan() {
		return artisan;
	}

	public void setArtisan(Artisan artisan) {
		this.artisan = artisan;
	}

	public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public Guarantor getGuarantor() {
		return guarantor;
	}

	public void setGuarantor(Guarantor guarantor) {
		this.guarantor = guarantor;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public Interview getInterview() {
		return interview;
	}

	public void setInterview(Interview interview) {
		this.interview = interview;
	}

	public EnrolmentStatus getEnrolmentStatus() {
		return enrolmentStatus;
	}

	public void setEnrolmentStatus(EnrolmentStatus enrolmentStatus) {
		this.enrolmentStatus = enrolmentStatus;
	}

	public NextOfKin getNok() {
		return nok;
	}

	public void setNok(NextOfKin nok) {
		this.nok = nok;
	}

}
