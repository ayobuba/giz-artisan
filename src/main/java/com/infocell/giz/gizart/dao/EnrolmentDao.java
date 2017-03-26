package com.infocell.giz.gizart.dao;

import java.util.List;

import com.infocell.giz.gizart.model.Enrolment;

public interface EnrolmentDao {

	void create(Enrolment s);

	Enrolment get(int id);

	Enrolment getWithSid(String sid);

	List<Enrolment> getList();

	List<Enrolment> getPendingList();

	List<Enrolment> getInvitedList();

	List<Enrolment> getAbsorbedList();

	void update(Enrolment s);

	void delete(int id);

}
