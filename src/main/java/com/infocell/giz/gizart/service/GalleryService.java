package com.infocell.giz.gizart.service;

import java.util.List;

import com.infocell.giz.gizart.model.GalleryPicture;

public interface GalleryService {

	void create(GalleryPicture s);

	GalleryPicture get(int id);

	GalleryPicture getWithSid(String sid);

	List<GalleryPicture> getList();

	void update(GalleryPicture s);

	void delete(String id);
}
