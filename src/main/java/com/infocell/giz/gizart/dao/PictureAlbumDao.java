package com.infocell.giz.gizart.dao;

import java.util.List;

import com.infocell.giz.gizart.model.PictureAlbum;

public interface PictureAlbumDao {

	void create(PictureAlbum s);

	PictureAlbum get(int id);

	PictureAlbum getWithSid(String sid);

	List<PictureAlbum> getList();

	void update(PictureAlbum s);

	void delete(int id);

}
