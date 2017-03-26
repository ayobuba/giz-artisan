package com.infocell.giz.gizart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "work_experience")
public class WorkExperience {

	@Id
	@GeneratedValue
	@Column(name = "work_id")
	private int workId;

	@Column(name = "work_place")
	private String workPlace;

	@ManyToOne
	@JoinColumn(name = "year_id")
	private Year year;

	@ManyToOne
	@JoinColumn(name = "month_id")
	private Month month;

	@ManyToOne
	@JoinColumn(name = "artisan_id")
	private Artisan artisan;

	public int getWorkId() {
		return workId;
	}

	public void setWorkId(int workId) {
		this.workId = workId;
	}

	public String getWorkPlace() {
		return workPlace;
	}

	public void setWorkPlace(String workPlace) {
		this.workPlace = workPlace;
	}

	public Year getYear() {
		return year;
	}

	public void setYear(Year year) {
		this.year = year;
	}

	public Month getMonth() {
		return month;
	}

	public void setMonth(Month month) {
		this.month = month;
	}

	public Artisan getArtisan() {
		return artisan;
	}

	public void setArtisan(Artisan artisan) {
		this.artisan = artisan;
	}

}
