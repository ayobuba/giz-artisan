package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.ArtisanDao;
import com.infocell.giz.gizart.model.Artisan;
import com.infocell.giz.gizart.service.ArtisanService;
import com.infocell.giz.gizart.service.Sid;

@Service
public class ArtisanServiceImpl implements ArtisanService {

	@Autowired
	private ArtisanDao artisanDao;

	@Autowired
	private Sid sid;

	@Override
	public void create(Artisan s) {

		artisanDao.create(s);
	}

	@Override
	public Artisan get(int id) {
		return artisanDao.get(id);
	}

	@Override
	public Artisan getWithSid(String sid) {
		return artisanDao.getWithSid(sid);
	}

	@Override
	public List<Artisan> getList() {
		return artisanDao.getList();
	}

	@Override
	public void update(Artisan s) {
		artisanDao.update(s);
	}

	@Override
	public void delete(String id) {
		artisanDao.delete(id);
	}

}
