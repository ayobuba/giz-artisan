package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.GalleryPictureDao;
import com.infocell.giz.gizart.model.GalleryPicture;
import com.infocell.giz.gizart.model.PictureAlbum;
import com.infocell.giz.gizart.service.GalleryPictureService;

@Service
public class GalleryPictureServiceImpl implements GalleryPictureService {

	@Autowired
	private GalleryPictureDao clientDao;

	@Override
	public void create(GalleryPicture s) {
		clientDao.create(s);
	}

	@Override
	public GalleryPicture get(int id) {
		// TODO Auto-generated method stub
		return clientDao.get(id);
	}

	@Override
	public GalleryPicture getWithSid(String sid) {
		// TODO Auto-generated method stub
		return clientDao.getWithSid(sid);
	}

	@Override
	public List<GalleryPicture> getList() {
		// TODO Auto-generated method stub
		return clientDao.getList();
	}

	@Override
	public void update(GalleryPicture s) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		clientDao.delete(id);
	}

	@Override
	public List<GalleryPicture> getListByAlbum(PictureAlbum n) {
		// TODO Auto-generated method stub
		return clientDao.getListByAlbum(n);
	}

}
