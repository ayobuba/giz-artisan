package com.infocell.giz.gizart.dao;

import java.util.List;

import com.infocell.giz.gizart.model.MaritalStatus;

public interface MaritalStatusDao {

	void create(MaritalStatus s);

	MaritalStatus get(int id);

	MaritalStatus getWithSid(String sid);

	List<MaritalStatus> getList();

	void update(MaritalStatus s);

	void delete(int id);

}
