package com.infocell.giz.gizart.dao;

import java.util.List;

import com.infocell.giz.gizart.model.Education;

public interface EducationDao {

	void create(Education s);

	Education get(int id);

	Education getWithSid(String sid);

	List<Education> getList();

	void update(Education s);

	void delete(String id);

}
