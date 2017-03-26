package com.infocell.giz.gizart.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client {

	@Id
	@GeneratedValue
	@Column(name = "client_id")
	private int clientId;

	@ManyToOne
	@JoinColumn(name = "client_type_id")
	private ClientType clientType;

	@OneToOne(mappedBy = "client")
	private Organization organization;

	@OneToOne(mappedBy = "client")
	private ClientIndividual clientIndividual;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "login_id")
	private Login login;

	@OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
	private List<ServiceRequestMade> serviceRequestMadeList = new ArrayList<>();

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public ClientType getClientType() {
		return clientType;
	}

	public void setClientType(ClientType clientType) {
		this.clientType = clientType;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + clientId;
		result = prime * result + ((clientType == null) ? 0 : clientType.hashCode());
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
		Client other = (Client) obj;
		if (clientId != other.clientId)
			return false;
		if (clientType == null) {
			if (other.clientType != null)
				return false;
		} else if (!clientType.equals(other.clientType))
			return false;
		return true;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public ClientIndividual getClientIndividual() {
		return clientIndividual;
	}

	public void setClientIndividual(ClientIndividual clientIndividual) {
		this.clientIndividual = clientIndividual;
	}

	public List<ServiceRequestMade> getServiceRequestMadeList() {
		return serviceRequestMadeList;
	}

	public void setServiceRequestMadeList(List<ServiceRequestMade> serviceRequestMadeList) {
		this.serviceRequestMadeList = serviceRequestMadeList;
	}

}
