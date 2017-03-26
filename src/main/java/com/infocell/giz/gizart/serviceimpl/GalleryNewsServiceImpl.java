package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.GalleryNewsDao;
import com.infocell.giz.gizart.model.GalleryNews;
import com.infocell.giz.gizart.model.NewsAlbum;
import com.infocell.giz.gizart.service.GalleryNewsService;

@Service
public class GalleryNewsServiceImpl implements GalleryNewsService {

	@Autowired
	private GalleryNewsDao clientDao;

	@Override
	public void create(GalleryNews s) {
		clientDao.create(s);
	}

	@Override
	public GalleryNews get(int id) {
		// TODO Auto-generated method stub
		return clientDao.get(id);
	}

	@Override
	public GalleryNews getWithSid(String sid) {
		// TODO Auto-generated method stub
		return clientDao.getWithSid(sid);
	}

	@Override
	public List<GalleryNews> getList() {
		// TODO Auto-generated method stub
		return clientDao.getList();
	}

	@Override
	public void update(GalleryNews s) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		clientDao.delete(id);
	}

	@Override
	public List<GalleryNews> getListByAlbum(NewsAlbum n) {
		// TODO Auto-generated method stub
		return clientDao.getListByAlbum(n);
	}

}
