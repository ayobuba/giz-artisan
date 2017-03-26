package com.infocell.giz.gizart.service;

import java.util.List;

import com.infocell.giz.gizart.model.NewsAlbum;

public interface NewsAlbumService {

	void create(NewsAlbum s);

	NewsAlbum get(int id);

	NewsAlbum getWithSid(String sid);

	List<NewsAlbum> getList();

	void update(NewsAlbum s);

	void delete(int id);

}
