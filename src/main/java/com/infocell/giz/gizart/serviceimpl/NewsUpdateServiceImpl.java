package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.NewsUpdateDao;
import com.infocell.giz.gizart.model.NewsUpdate;
import com.infocell.giz.gizart.service.NewsUpdateService;

@Service
public class NewsUpdateServiceImpl implements NewsUpdateService {

	@Autowired
	private NewsUpdateDao newsTypeDao;

	@Override
	public void create(NewsUpdate s) {
		newsTypeDao.create(s);
	}

	@Override
	public NewsUpdate get(int id) {
		// TODO Auto-generated method stub
		return newsTypeDao.get(id);
	}

	@Override
	public NewsUpdate getWithSid(String sid) {
		// TODO Auto-generated method stub
		return newsTypeDao.getWithSid(sid);
	}

	@Override
	public List<NewsUpdate> getList() {
		// TODO Auto-generated method stub
		return newsTypeDao.getList();
	}

	@Override
	public void update(NewsUpdate s) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		newsTypeDao.delete(id);
	}

}
