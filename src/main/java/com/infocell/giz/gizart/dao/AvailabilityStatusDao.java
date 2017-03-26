package com.infocell.giz.gizart.dao;

import java.util.List;

import com.infocell.giz.gizart.model.AvailabilityStatus;

public interface AvailabilityStatusDao {
	void create(AvailabilityStatus s);

	AvailabilityStatus get(int id);

	AvailabilityStatus getWithSid(String sid);

	List<AvailabilityStatus> getList();

	void update(AvailabilityStatus s);

	void delete(String id);

}
