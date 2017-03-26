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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "artisan")
public class Artisan {

	@Id
	@GeneratedValue
	@Column(name = "artisan_id")
	private int artisanId;

	@Column(name = "image")
	private String imagePath;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bio_Id")
	private BioData artisanBioData;

	@OneToOne(mappedBy = "artisan")
	private Enrolment enrolment;

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public Enrolment getEnrolment() {
		return enrolment;
	}

	public void setEnrolment(Enrolment enrolment) {
		this.enrolment = enrolment;
	}

	@ManyToOne
	@JoinColumn(name = "qualification_id")
	private Qualification qualification;

	@ManyToOne
	@JoinColumn(name = "availability_id")
	private AvailabilityStatus availabilityStatus;

	@ManyToMany(mappedBy = "artisanEducationLevel", cascade = CascadeType.ALL)
	private List<Education> artisanEduList = new ArrayList<Education>();

	@ManyToOne
	@JoinColumn(name = "sub_skill_id")
	private SubSkill subSkill;

	@OneToMany(mappedBy = "artisan", cascade = CascadeType.ALL)
	private List<Training> trainingList = new ArrayList<>();

	@OneToMany(mappedBy = "artisan", cascade = CascadeType.ALL)
	private List<WorkExperience> workExperienceList = new ArrayList<>();

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "artisan_language", joinColumns = @JoinColumn(name = "artisan_id"), inverseJoinColumns = @JoinColumn(name = "language_id"))
	private List<Language> artisanLanguageList = new ArrayList<>();

	public int getArtisanId() {
		return artisanId;
	}

	public void setArtisanId(int artisanId) {
		this.artisanId = artisanId;
	}

	public BioData getArtisanBioData() {
		return artisanBioData;
	}

	public void setArtisanBioData(BioData artisanBioData) {
		this.artisanBioData = artisanBioData;
	}

	public Qualification getQualification() {
		return qualification;
	}

	public void setQualification(Qualification qualification) {
		this.qualification = qualification;
	}

	public AvailabilityStatus getAvailabilityStatus() {
		return availabilityStatus;
	}

	public void setAvailabilityStatus(AvailabilityStatus availabilityStatus) {
		this.availabilityStatus = availabilityStatus;
	}

	public List<Education> getArtisanEduList() {
		return artisanEduList;
	}

	public void setArtisanEduList(List<Education> artisanEduList) {
		this.artisanEduList = artisanEduList;
	}

	public List<Training> getTrainingList() {
		return trainingList;
	}

	public void setTrainingList(List<Training> trainingList) {
		this.trainingList = trainingList;
	}

	public List<WorkExperience> getWorkExperienceList() {
		return workExperienceList;
	}

	public void setWorkExperienceList(List<WorkExperience> workExperienceList) {
		this.workExperienceList = workExperienceList;
	}

	public List<Language> getArtisanLanguageList() {
		return artisanLanguageList;
	}

	public void setArtisanLanguageList(List<Language> artisanLanguageList) {
		this.artisanLanguageList = artisanLanguageList;
	}

	public SubSkill getSubSkill() {
		return subSkill;
	}

	public void setSubSkill(SubSkill subSkill) {
		this.subSkill = subSkill;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artisanBioData == null) ? 0 : artisanBioData.hashCode());
		result = prime * result + artisanId;
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
		Artisan other = (Artisan) obj;
		if (artisanBioData == null) {
			if (other.artisanBioData != null)
				return false;
		} else if (!artisanBioData.equals(other.artisanBioData))
			return false;
		if (artisanId != other.artisanId)
			return false;
		return true;
	}

}
