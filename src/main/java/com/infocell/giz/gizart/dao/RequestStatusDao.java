package com.infocell.giz.gizart.dao;

import java.util.List;

import com.infocell.giz.gizart.model.RequestStatus;

public interface RequestStatusDao {

	void create(RequestStatus s);

	RequestStatus get(int id);

	RequestStatus getWithSid(String sid);

	List<RequestStatus> getList();

	void update(RequestStatus s);

	void delete(String id);

}
