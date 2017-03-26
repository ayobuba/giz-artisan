package com.infocell.giz.gizart.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "guarantor")
public class Guarantor {

	@Id
	@GeneratedValue
	@Column(name = "guarantor_id")
	private int guarantorId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bio_id")
	private BioData bioData;

	@OneToMany(mappedBy = "guarantor")
	private List<Enrolment> enrolmentList = new ArrayList<>();

	public int getGuarantorId() {
		return guarantorId;
	}

	public void setGuarantorId(int guarantorId) {
		this.guarantorId = guarantorId;
	}

	public BioData getBioData() {
		return bioData;
	}

	public void setBioData(BioData bioData) {
		this.bioData = bioData;
	}

	public List<Enrolment> getEnrolmentList() {
		return enrolmentList;
	}

	public void setEnrolmentList(List<Enrolment> enrolmentList) {
		this.enrolmentList = enrolmentList;
	}

}
