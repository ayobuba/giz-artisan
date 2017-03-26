package com.infocell.giz.gizart.dao;

import java.util.List;

import com.infocell.giz.gizart.model.Expert;
import com.infocell.giz.gizart.model.Interview;
import com.infocell.giz.gizart.model.SubSkill;

public interface ExpertDao {

	void create(Expert s);

	Expert get(int id);

	Expert getWithSid(String sid);

	Expert getByInterview(Interview i);

	List<Expert> getList();

	List<Expert> getWithSkill(SubSkill s);

	void update(Expert s);

	void delete(int id);

}
