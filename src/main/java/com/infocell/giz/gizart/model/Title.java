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
@Table(name = "title")
public class Title {
	@Id
	@GeneratedValue
	@Column(name = "title_id")
	private int titleId;

	@Column(name = "title_name")
	private String titleName;

	@OneToMany(mappedBy = "title", cascade = CascadeType.ALL)
	private List<BioData> bioDataList1 = new ArrayList<>();

	public int getTitleId() {
		return titleId;
	}

	public List<BioData> getBioDataList1() {
		return bioDataList1;
	}

	public void setBioDataList1(List<BioData> bioDataList1) {
		this.bioDataList1 = bioDataList1;
	}

	public void setTitleId(int titleId) {
		this.titleId = titleId;
	}

	public String getTitleName() {
		return titleName;
	}

	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

}
