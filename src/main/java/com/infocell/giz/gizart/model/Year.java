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
@Table(name = "year")
public class Year {

	@Id
	@GeneratedValue
	@Column(name = "year_id")
	private int yearId;

	@Column(name = "year")
	private String year;

	@OneToMany(mappedBy = "year", cascade = CascadeType.ALL)
	private List<Training> trainingYearList = new ArrayList<>();

	@OneToMany(mappedBy = "year", cascade = CascadeType.ALL)
	private List<WorkExperience> workExperienceList = new ArrayList<>();

	public List<Training> getTrainingYearList() {
		return trainingYearList;
	}

	public void setTrainingYearList(List<Training> trainingYearList) {
		this.trainingYearList = trainingYearList;
	}

	public int getYearId() {
		return yearId;
	}

	public void setYearId(int yearId) {
		this.yearId = yearId;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public List<WorkExperience> getWorkExperienceList() {
		return workExperienceList;
	}

	public void setWorkExperienceList(List<WorkExperience> workExperienceList) {
		this.workExperienceList = workExperienceList;
	}

}
