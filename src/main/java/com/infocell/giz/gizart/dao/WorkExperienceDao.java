package com.infocell.giz.gizart.dao;

import java.util.List;

import com.infocell.giz.gizart.model.WorkExperience;

public interface WorkExperienceDao {

	void create(WorkExperience s);

	WorkExperience get(int id);

	WorkExperience getWithSid(String sid);

	List<WorkExperience> getList();

	void update(WorkExperience s);

	void delete(String id);
}
