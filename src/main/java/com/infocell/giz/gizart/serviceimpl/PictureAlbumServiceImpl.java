package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.PictureAlbumDao;
import com.infocell.giz.gizart.model.PictureAlbum;
import com.infocell.giz.gizart.service.PictureAlbumService;

@Service
public class PictureAlbumServiceImpl implements PictureAlbumService {

	@Autowired
	private PictureAlbumDao clientDao;

	@Override
	public void create(PictureAlbum s) {
		clientDao.create(s);
	}

	@Override
	public PictureAlbum get(int id) {
		// TODO Auto-generated method stub
		return clientDao.get(id);
	}

	@Override
	public PictureAlbum getWithSid(String sid) {
		// TODO Auto-generated method stub
		return clientDao.getWithSid(sid);
	}

	@Override
	public List<PictureAlbum> getList() {
		// TODO Auto-generated method stub
		return clientDao.getList();
	}

	@Override
	public void update(PictureAlbum s) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		clientDao.delete(id);
	}

}
