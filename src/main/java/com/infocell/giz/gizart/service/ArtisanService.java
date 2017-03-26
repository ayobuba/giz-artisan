package com.infocell.giz.gizart.service;

import java.util.List;

import com.infocell.giz.gizart.model.Artisan;

public interface ArtisanService {

	void create(Artisan s);

	Artisan get(int id);

	Artisan getWithSid(String sid);

	List<Artisan> getList();

	void update(Artisan s);

	void delete(String id);

}
