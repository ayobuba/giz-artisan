package com.infocell.giz.gizart.service;

import java.util.List;

import com.infocell.giz.gizart.model.AvailabilityStatus;

public interface AvailabilityStatusService {
	void create(AvailabilityStatus s);

	AvailabilityStatus get(int id);

	AvailabilityStatus getWithSid(String sid);

	List<AvailabilityStatus> getList();

	void update(AvailabilityStatus s);

	void delete(String id);

}
