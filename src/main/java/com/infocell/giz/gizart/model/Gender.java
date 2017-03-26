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
@Table(name = "gender")
public class Gender {

	@Id
	@GeneratedValue
	@Column(name = "gender_id")
	private int genderId;

	@Column(name = "gender_name")
	private String genderName;

	@OneToMany(mappedBy = "gender", cascade = CascadeType.ALL)
	private List<BioData> bioDataList = new ArrayList<>();

	public int getGenderId() {
		return genderId;
	}

	public void setGenderId(int genderId) {
		this.genderId = genderId;
	}

	public String getGenderName() {
		return genderName;
	}

	public void setGenderName(String genderName) {
		this.genderName = genderName;
	}

	public List<BioData> getBioDataList() {
		return bioDataList;
	}

	public void setBioDataList(List<BioData> bioDataList) {
		this.bioDataList = bioDataList;
	}

}
