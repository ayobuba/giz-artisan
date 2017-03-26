package com.infocell.giz.gizart.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "skill")
public class Skill {

	@Id
	@GeneratedValue
	@Column(name = "skill_id")
	private int skillId;

	@Column(name = "skill_name")
	private String name;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "skill")
	private List<SubSkill> subSkill;

	public List<SubSkill> getSubSkill() {
		return subSkill;
	}

	public void setSubSkill(List<SubSkill> subSkill) {
		this.subSkill = subSkill;
	}

	public int getSkillId() {
		return skillId;
	}

	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
