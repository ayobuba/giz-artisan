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
@Table(name = "qualification")
public class Qualification {

	@Id
	@GeneratedValue
	@Column(name = "qualification_id")
	private int qualificationId;

	@Column(name = "qualification")
	private String qualification;

	@OneToMany(mappedBy = "qualification", cascade = CascadeType.ALL)
	private List<Artisan> artisanQualificationList = new ArrayList<>();

	public int getQualificationId() {
		return qualificationId;
	}

	public void setQualificationId(int qualificationId) {
		this.qualificationId = qualificationId;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public List<Artisan> getArtisanQualificationList() {
		return artisanQualificationList;
	}

	public void setArtisanQualificationList(List<Artisan> artisanQualificationList) {
		this.artisanQualificationList = artisanQualificationList;
	}

}
