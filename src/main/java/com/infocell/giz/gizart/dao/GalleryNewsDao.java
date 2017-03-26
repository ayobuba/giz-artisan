package com.infocell.giz.gizart.dao;

import java.util.List;

import com.infocell.giz.gizart.model.GalleryNews;
import com.infocell.giz.gizart.model.NewsAlbum;

public interface GalleryNewsDao {

	void create(GalleryNews s);

	GalleryNews get(int id);

	GalleryNews getWithSid(String sid);

	List<GalleryNews> getList();

	List<GalleryNews> getListByAlbum(NewsAlbum n);

	void update(GalleryNews s);

	void delete(int id);

}
