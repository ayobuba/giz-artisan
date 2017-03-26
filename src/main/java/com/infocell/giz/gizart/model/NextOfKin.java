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
@Table(name = "next_of_kin")
public class NextOfKin {

	@Id
	@GeneratedValue
	@Column(name = "kin_id")
	private int kinId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bio_id")
	private BioData bioData;

	@OneToOne(mappedBy = "nok")
	private Enrolment enrolment;

	public int getKinId() {
		return kinId;
	}

	public void setKinId(int kinId) {
		this.kinId = kinId;
	}

	public BioData getBioData() {
		return bioData;
	}

	public void setBioData(BioData bioData) {
		this.bioData = bioData;
	}

	public Enrolment getEnrolment() {
		return enrolment;
	}

	public void setEnrolment(Enrolment enrolment) {
		this.enrolment = enrolment;
	}

}
