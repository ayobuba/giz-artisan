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
@Table(name = "client_individual")
public class ClientIndividual {

	@Id
	@GeneratedValue
	@Column(name = "client_individual_id")
	private int clientIndividualId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "client_id")
	private Client client;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bio_id")
	private BioData bioData;

	public int getClientIndividualId() {
		return clientIndividualId;
	}

	public void setClientIndividualId(int clientIndividualId) {
		this.clientIndividualId = clientIndividualId;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public BioData getBioData() {
		return bioData;
	}

	public void setBioData(BioData bioData) {
		this.bioData = bioData;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + clientIndividualId;
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
		ClientIndividual other = (ClientIndividual) obj;
		if (clientIndividualId != other.clientIndividualId)
			return false;
		return true;
	}

}
