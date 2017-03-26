package com.infocell.giz.gizart.service;

import java.util.List;

import com.infocell.giz.gizart.model.GalleryPicture;
import com.infocell.giz.gizart.model.PictureAlbum;

public interface GalleryPictureService {

	void create(GalleryPicture s);

	GalleryPicture get(int id);

	GalleryPicture getWithSid(String sid);

	List<GalleryPicture> getList();

	List<GalleryPicture> getListByAlbum(PictureAlbum n);

	void update(GalleryPicture s);

	void delete(int id);

}
