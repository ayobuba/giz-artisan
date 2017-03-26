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
@Table(name = "availability_status")
public class AvailabilityStatus {

	@Id
	@GeneratedValue
	@Column(name = "availability_id")
	private int availabilityId;

	@Column(name = "availability")
	private String availability;

	@OneToMany(mappedBy = "availabilityStatus", cascade = CascadeType.ALL)
	private List<Artisan> artisanAvailabilityList = new ArrayList<>();

	public int getAvailabilityId() {
		return availabilityId;
	}

	public void setAvailabilityId(int availabilityId) {
		this.availabilityId = availabilityId;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public List<Artisan> getArtisanAvailabilityList() {
		return artisanAvailabilityList;
	}

	public void setArtisanAvailabilityList(List<Artisan> artisanAvailabilityList) {
		this.artisanAvailabilityList = artisanAvailabilityList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + availabilityId;
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
		AvailabilityStatus other = (AvailabilityStatus) obj;
		if (availabilityId != other.availabilityId)
			return false;
		return true;
	}

}
