package com.infocell.giz.gizart.dao;

import java.util.List;

import com.infocell.giz.gizart.model.Qualification;

public interface QualificationDao {

	void create(Qualification s);

	Qualification get(int id);

	Qualification getWithSid(String sid);

	List<Qualification> getList();

	void update(Qualification s);

	void delete(String id);

}
