package com.infocell.giz.gizart.service;

import java.util.List;

import com.infocell.giz.gizart.model.Skill;
import com.infocell.giz.gizart.model.SubSkill;

public interface SubSkillService {

	void create(SubSkill s);

	SubSkill get(int id);

	SubSkill getWithSid(String sid);

	List<SubSkill> getList();

	void update(SubSkill s);

	void delete(String id);

	List<SubSkill> getListFromSkill(Skill id);

	List<SubSkill> getListFromSkill(int id);

}
