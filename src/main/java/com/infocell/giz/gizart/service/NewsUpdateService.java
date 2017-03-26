package com.infocell.giz.gizart.service;

import java.util.List;

import com.infocell.giz.gizart.model.NewsUpdate;

public interface NewsUpdateService {

	void create(NewsUpdate s);

	NewsUpdate get(int id);

	NewsUpdate getWithSid(String sid);

	List<NewsUpdate> getList();

	void update(NewsUpdate s);

	void delete(int id);

}
