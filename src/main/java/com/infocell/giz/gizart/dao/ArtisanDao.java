package com.infocell.giz.gizart.dao;

import java.util.List;

import com.infocell.giz.gizart.model.Artisan;

public interface ArtisanDao {

	void create(Artisan s);

	Artisan get(int id);

	Artisan getWithSid(String sid);

	List<Artisan> getList();

	void update(Artisan s);

	void delete(String id);

}
