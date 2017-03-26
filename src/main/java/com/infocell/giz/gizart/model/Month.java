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
@Table(name = "month")
public class Month {

	@Id
	@GeneratedValue
	@Column(name = "month_id")
	private int monthId;

	@Column(name = "month")
	private String month;

	@OneToMany(mappedBy = "month", cascade = CascadeType.ALL)
	private List<Training> trainingMonthList = new ArrayList<>();

	@OneToMany(mappedBy = "month", cascade = CascadeType.ALL)
	private List<WorkExperience> workExperienceMonthList = new ArrayList<>();

	public List<WorkExperience> getWorkExperienceMonthList() {
		return workExperienceMonthList;
	}

	public void setWorkExperienceMonthList(List<WorkExperience> workExperienceMonthList) {
		this.workExperienceMonthList = workExperienceMonthList;
	}

	public int getMonthId() {
		return monthId;
	}

	public List<Training> getTrainingMonthList() {
		return trainingMonthList;
	}

	public void setTrainingMonthList(List<Training> trainingMonthList) {
		this.trainingMonthList = trainingMonthList;
	}

	public void setMonthId(int monthId) {
		this.monthId = monthId;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

}
