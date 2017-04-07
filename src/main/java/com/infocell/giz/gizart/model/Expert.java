package com.infocell.giz.gizart.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "expert")
public class Expert {

	@Id
	@GeneratedValue
	@Column(name = "expert_id")
	private int expertId;

	@DateTimeFormat(pattern = "yyyy-mmm-dd")
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	@Column(name = "date")
	private LocalDate date;

	@Column(name = "image")
	private String image;

	@OneToOne
	@JoinColumn(name = "interview_id")
	private Interview interview;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "availability_id")
	private AvailabilityStatus availabilityStatus;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "experts_requested", joinColumns = @JoinColumn(name = "expert_id"), inverseJoinColumns = @JoinColumn(name = "request_made_id"))
	private List<ServiceRequestMade> requestMadeList = new ArrayList<>();

	public int getExpertId() {
		return expertId;
	}

	public void setExpertId(int expertId) {
		this.expertId = expertId;
	}

	public Interview getInterview() {
		return interview;
	}

	public void setInterview(Interview interview) {
		this.interview = interview;
	}

	public List<ServiceRequestMade> getRequestMadeList() {
		return requestMadeList;
	}

	public void setRequestMadeList(List<ServiceRequestMade> requestMadeList) {
		this.requestMadeList = requestMadeList;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public AvailabilityStatus getAvailabilityStatus() {
		return availabilityStatus;
	}

	public void setAvailabilityStatus(AvailabilityStatus availabilityStatus) {
		this.availabilityStatus = availabilityStatus;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}
