package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.AlbumDao;
import com.infocell.giz.gizart.model.Album;
import com.infocell.giz.gizart.service.AlbumService;

@Service
public class AlbumServiceImpl implements AlbumService {

	@Autowired
	private AlbumDao albumDao;

	@Override
	public void create(Album s) {
		albumDao.create(s);
	}

	@Override
	public Album get(int id) {
		// TODO Auto-generated method stub
		return albumDao.get(id);
	}

	@Override
	public Album getWithSid(String sid) {
		// TODO Auto-generated method stub
		return albumDao.getWithSid(sid);
	}

	@Override
	public List<Album> getList() {
		// TODO Auto-generated method stub
		return albumDao.getList();
	}

	@Override
	public void update(Album s) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		albumDao.delete(id);
	}

}
