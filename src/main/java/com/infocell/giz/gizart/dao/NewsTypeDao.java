package com.infocell.giz.gizart.dao;

import java.util.List;

import com.infocell.giz.gizart.model.NewsType;

public interface NewsTypeDao {

	void create(NewsType s);

	NewsType get(int id);

	NewsType getWithSid(String sid);

	List<NewsType> getList();

	void update(NewsType s);

	void delete(int id);

}
