package com.infocell.giz.gizart.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "sub_skill")
public class SubSkill {

	@Id
	@GeneratedValue
	@Column(name = "sub_skill_id")
	private int id;

	@Column(name = "name")
	private String name;

	@ManyToOne
	@JoinColumn(name = "skill_id")
	private Skill skill;

	@OneToMany(mappedBy = "subSkill", cascade = CascadeType.ALL)
	private List<Artisan> artisanList = new ArrayList<>();

	@OneToMany(mappedBy = "subSkill", cascade = CascadeType.ALL)
	private List<ServiceRequestMade> serviceList = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public List<Artisan> getArtisanList() {
		return artisanList;
	}

	public void setArtisanList(List<Artisan> artisanList) {
		this.artisanList = artisanList;
	}

	public List<ServiceRequestMade> getServiceList() {
		return serviceList;
	}

	public void setServiceList(List<ServiceRequestMade> serviceList) {
		this.serviceList = serviceList;
	}

}
