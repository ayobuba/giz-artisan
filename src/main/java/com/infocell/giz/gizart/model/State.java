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
@Table(name = "state")
public class State {

	@Id
	@GeneratedValue
	@Column(name = "state_id")
	private int stateId;

	@Column(name = "state_name")
	private String stateName;

	@OneToMany(mappedBy = "state", cascade = CascadeType.ALL)
	private List<Lga> lgaList = new ArrayList<>();

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public List<Lga> getLgaList() {
		return lgaList;
	}

	public void setLgaList(List<Lga> lgaList) {
		this.lgaList = lgaList;
	}

}
