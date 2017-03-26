package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.NewsAlbumDao;
import com.infocell.giz.gizart.model.NewsAlbum;
import com.infocell.giz.gizart.service.NewsAlbumService;

@Service
public class NewsAlbumServiceImpl implements NewsAlbumService {

	@Autowired
	private NewsAlbumDao clientDao;

	@Override
	public void create(NewsAlbum s) {
		clientDao.create(s);
	}

	@Override
	public NewsAlbum get(int id) {
		// TODO Auto-generated method stub
		return clientDao.get(id);
	}

	@Override
	public NewsAlbum getWithSid(String sid) {
		// TODO Auto-generated method stub
		return clientDao.getWithSid(sid);
	}

	@Override
	public List<NewsAlbum> getList() {
		// TODO Auto-generated method stub
		return clientDao.getList();
	}

	@Override
	public void update(NewsAlbum s) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		clientDao.delete(id);
	}

}
