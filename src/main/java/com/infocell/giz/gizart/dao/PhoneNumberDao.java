package com.infocell.giz.gizart.dao;

import java.util.List;

import com.infocell.giz.gizart.model.PhoneNumber;

public interface PhoneNumberDao {

	void create(PhoneNumber s);

	PhoneNumber get(int id);

	PhoneNumber getWithSid(String sid);

	List<PhoneNumber> getList();

	void update(PhoneNumber s);

	void delete(String id);

}
