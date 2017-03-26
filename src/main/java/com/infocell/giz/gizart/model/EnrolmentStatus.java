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
@Table(name = "enrolment_status")
public class EnrolmentStatus {

	@Id
	@GeneratedValue
	@Column(name = "status_id")
	private int statusId;

	@Column(name = "status_name")
	private String statusName;

	@OneToMany(mappedBy = "enrolmentStatus", cascade = CascadeType.ALL)
	private List<Enrolment> enrolmentList = new ArrayList<>();

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public List<Enrolment> getEnrolmentList() {
		return enrolmentList;
	}

	public void setEnrolmentList(List<Enrolment> enrolmentList) {
		this.enrolmentList = enrolmentList;
	}

}
