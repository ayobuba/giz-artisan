package com.infocell.giz.gizart.dao;

import java.util.List;

import com.infocell.giz.gizart.model.Language;

public interface LanguageDao {

	void create(Language s);

	Language get(int id);

	Language getWithSid(String sid);

	List<Language> getList();

	void update(Language s);

	void delete(String id);

}
