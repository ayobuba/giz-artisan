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
import javax.persistence.Table;

@Entity
@Table(name = "education")
public class Education {

	@Id
	@GeneratedValue
	@Column(name = "education_id")
	private int educationId;

	@Column(name = "education_level")
	private String educationLevel;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "artisan_education", joinColumns = @JoinColumn(name = "education_id"), inverseJoinColumns = @JoinColumn(name = "artisan_id"))
	private List<Artisan> artisanEducationLevel = new ArrayList<>();

	public int getEducationId() {
		return educationId;
	}

	public void setEducationId(int educationId) {
		this.educationId = educationId;
	}

	public String getEducationLevel() {
		return educationLevel;
	}

	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}

	public List<Artisan> getArtisanEducationLevel() {
		return artisanEducationLevel;
	}

	public void setArtisanEducationLevel(List<Artisan> artisanEducationLevel) {
		this.artisanEducationLevel = artisanEducationLevel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + educationId;
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
		Education other = (Education) obj;
		if (educationId != other.educationId)
			return false;
		return true;
	}

}
