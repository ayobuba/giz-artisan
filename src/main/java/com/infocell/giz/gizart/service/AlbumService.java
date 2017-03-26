package com.infocell.giz.gizart.service;

import java.util.List;

import com.infocell.giz.gizart.model.Album;

public interface AlbumService {

	void create(Album s);

	Album get(int id);

	Album getWithSid(String sid);

	List<Album> getList();

	void update(Album s);

	void delete(int id);

}
