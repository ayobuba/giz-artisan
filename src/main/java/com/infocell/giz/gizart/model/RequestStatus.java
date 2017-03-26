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
@Table(name = "request_status")
public class RequestStatus {

	@Id
	@GeneratedValue
	@Column(name = "status_id")
	private int statusId;

	@Column(name = "name")
	private String name;

	@OneToMany(mappedBy = "requestStatus", cascade = CascadeType.ALL)
	private List<ServiceRequestMade> serviceRequestMadeStatusList = new ArrayList<>();

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ServiceRequestMade> getServiceRequestMadeStatusList() {
		return serviceRequestMadeStatusList;
	}

	public void setServiceRequestMadeStatusList(List<ServiceRequestMade> serviceRequestMadeStatusList) {
		this.serviceRequestMadeStatusList = serviceRequestMadeStatusList;
	}

}
