package com.infocell.giz.gizart.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "service_request_made")
public class ServiceRequestMade {

	@Id
	@GeneratedValue
	@Column(name = "request_made_id")
	private int requestMadeId;

	@Column(name = "num_of_artisan_request")
	private int numOfExpertRequest;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "request_status_id")
	private RequestStatus requestStatus;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "comment_id")
	private Comment comment;

	@ManyToMany(mappedBy = "requestMadeList", cascade = CascadeType.ALL)
	private List<Expert> expertList = new ArrayList<>();

	@ManyToOne
	@JoinColumn(name = "sub_skill_id")
	private SubSkill subSkill;

	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;

	@DateTimeFormat(pattern = "yyyy-mmm-dd")
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	@Column(name = "date_from")
	private LocalDate startDate;

	@DateTimeFormat(pattern = "yyyy-mmm-dd")
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	@Column(name = "date_to")
	private LocalDate endDate;

	@DateTimeFormat(pattern = "yyyy-mmm-dd")
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	@Column(name = "date")
	private LocalDate dateOfRequest;

	public int getRequestMadeId() {
		return requestMadeId;
	}

	public void setRequestMadeId(int requestMadeId) {
		this.requestMadeId = requestMadeId;
	}

	public RequestStatus getRequestStatus() {
		return requestStatus;
	}

	public void setRequestStatus(RequestStatus requestStatus) {
		this.requestStatus = requestStatus;
	}

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	public int getNumOfExpertRequest() {
		return numOfExpertRequest;
	}

	public void setNumOfExpertRequest(int numOfExpertRequest) {
		this.numOfExpertRequest = numOfExpertRequest;
	}

	public List<Expert> getExpertList() {
		return expertList;
	}

	public void setExpertList(List<Expert> expertList) {
		this.expertList = expertList;
	}

	public SubSkill getSubSkill() {
		return subSkill;
	}

	public void setSubSkill(SubSkill subSkill) {
		this.subSkill = subSkill;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public LocalDate getDateOfRequest() {
		return dateOfRequest;
	}

	public void setDateOfRequest(LocalDate dateOfRequest) {
		this.dateOfRequest = dateOfRequest;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

}
