package com.infocell.giz.gizart.dao;

import java.util.List;

import com.infocell.giz.gizart.model.NextOfKin;

public interface NextOfKinDao {

	void create(NextOfKin s);

	NextOfKin get(int id);

	NextOfKin getWithSid(String sid);

	List<NextOfKin> getList();

	void update(NextOfKin s);

	void delete(int id);

}
