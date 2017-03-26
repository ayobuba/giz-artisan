package com.infocell.giz.gizart.service;

import java.util.List;

import com.infocell.giz.gizart.model.EnrolmentStatus;

public interface EnrolmentStatusService {

	void create(EnrolmentStatus s);

	EnrolmentStatus get(int id);

	EnrolmentStatus getWithSid(String sid);

	List<EnrolmentStatus> getList();

	List<EnrolmentStatus> getPendingList();

	List<EnrolmentStatus> getInvitedList();

	List<EnrolmentStatus> getAbsorbedList();

	void update(EnrolmentStatus s);

	void delete(int id);

}
