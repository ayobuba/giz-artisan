package com.infocell.giz.gizart.dao;

import java.util.List;

import com.infocell.giz.gizart.model.Lga;

public interface LgaDao {

	void create(Lga s);

	Lga get(int id);

	Lga getWithSid(String sid);

	List<Lga> getList();

	void update(Lga s);

	void delete(String id);

}
