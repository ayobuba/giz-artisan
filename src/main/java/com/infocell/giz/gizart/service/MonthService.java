package com.infocell.giz.gizart.service;

import java.util.List;

import com.infocell.giz.gizart.model.Month;

public interface MonthService {

	void create(Month s);

	Month get(int id);

	Month getWithSid(String sid);

	List<Month> getList();

	void update(Month s);

	void delete(String id);

}
