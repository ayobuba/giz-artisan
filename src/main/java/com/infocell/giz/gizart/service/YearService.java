package com.infocell.giz.gizart.service;

import java.util.List;

import com.infocell.giz.gizart.model.Year;

public interface YearService {

	void create(Year s);

	Year get(int id);

	Year getWithSid(String sid);

	List<Year> getList();

	void update(Year s);

	void delete(String id);

}
