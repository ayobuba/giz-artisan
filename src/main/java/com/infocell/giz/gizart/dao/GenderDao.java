package com.infocell.giz.gizart.dao;

import java.util.List;

import com.infocell.giz.gizart.model.Gender;

public interface GenderDao {

	void create(Gender s);

	Gender get(int id);

	Gender getWithSid(String sid);

	List<Gender> getList();

	void update(Gender s);

	void delete(String sid);

}
