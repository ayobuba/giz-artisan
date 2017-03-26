package com.infocell.giz.gizart.dao;

import java.util.List;

import com.infocell.giz.gizart.model.Month;

public interface MonthDao {

	void create(Month s);

	Month get(int id);

	Month getWithSid(String sid);

	List<Month> getList();

	void update(Month s);

	void delete(String id);

}
