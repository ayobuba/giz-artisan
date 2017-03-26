package com.infocell.giz.gizart.service;

import java.util.List;

import com.infocell.giz.gizart.model.Skill;

public interface SkillService {
	void create(Skill s);

	Skill get(int id);

	Skill getWithSid(String sid);

	List<Skill> getList();

	void update(Skill s);

	void delete(int id);

}
