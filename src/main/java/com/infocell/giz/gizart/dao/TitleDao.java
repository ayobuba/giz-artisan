package com.infocell.giz.gizart.dao;

import java.util.List;

import com.infocell.giz.gizart.model.Title;

public interface TitleDao {

	void create(Title s);

	Title get(int id);

	Title getWithSid(String sid);

	List<Title> getList();

	void update(Title s);

	void delete(String id);

}
