package com.infocell.giz.gizart.dao;

import java.util.List;

import com.infocell.giz.gizart.model.Skill;

public interface SkillDao {
	void create(Skill s);

	Skill get(int id);

	Skill getWithSid(String name);

	List<Skill> getList();

	void update(Skill s);

	void delete(int id);

}
