package com.infocell.giz.gizart.dao;

import java.util.List;

import com.infocell.giz.gizart.model.NewsUpdate;

public interface NewsUpdateDao {

	void create(NewsUpdate s);

	NewsUpdate get(int id);

	NewsUpdate getWithSid(String sid);

	List<NewsUpdate> getList();

	void update(NewsUpdate s);

	void delete(int id);

}
