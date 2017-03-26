package com.infocell.giz.gizart.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "marital_status")
public class MaritalStatus {

	@Id
	@GeneratedValue
	@Column(name = "marital_status_id")
	private int maritalStatusId;

	@Column(name = "status")
	private String status;

	@OneToMany(mappedBy = "maritalStatus", cascade = CascadeType.ALL)
	private List<Enrolment> enrolmentList = new ArrayList<>();

	public int getMaritalStatusId() {
		return maritalStatusId;
	}

	public void setMaritalStatusId(int maritalStatusId) {
		this.maritalStatusId = maritalStatusId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Enrolment> getEnrolmentList() {
		return enrolmentList;
	}

	public void setEnrolmentList(List<Enrolment> enrolmentList) {
		this.enrolmentList = enrolmentList;
	}

}
