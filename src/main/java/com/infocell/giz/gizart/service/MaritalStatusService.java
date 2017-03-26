package com.infocell.giz.gizart.service;

import java.util.List;

import com.infocell.giz.gizart.model.MaritalStatus;

public interface MaritalStatusService {

	void create(MaritalStatus s);

	MaritalStatus get(int id);

	MaritalStatus getWithSid(String sid);

	List<MaritalStatus> getList();

	void update(MaritalStatus s);

	void delete(int id);

}
