package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.GalleryDao;
import com.infocell.giz.gizart.model.GalleryPicture;
import com.infocell.giz.gizart.service.GalleryService;
import com.infocell.giz.gizart.service.Sid;

@Service
public class GalleryServiceImpl implements GalleryService {

	@Autowired
	private GalleryDao galleryDao;

	@Autowired
	private Sid sid;

	@Override
	public void create(GalleryPicture s) {

		galleryDao.create(s);
	}

	@Override
	public GalleryPicture get(int id) {
		return galleryDao.get(id);
	}

	@Override
	public GalleryPicture getWithSid(String sid) {
		return galleryDao.getWithSid(sid);
	}

	@Override
	public List<GalleryPicture> getList() {
		return galleryDao.getList();
	}

	@Override
	public void update(GalleryPicture s) {
		galleryDao.update(s);
	}

	@Override
	public void delete(String id) {
		galleryDao.delete(id);
	}

}
