package com.infocell.giz.gizart.dao;

import java.util.List;

import com.infocell.giz.gizart.model.Enrolment;
import com.infocell.giz.gizart.model.Interview;

public interface InterviewDao {

	void create(Interview s);

	Interview get(int id);

	Interview getWithSid(String sid);

	List<Interview> getList();

	void update(Interview s);

	void delete(int id);

	Interview getWithEnrolment(Enrolment e);

}
