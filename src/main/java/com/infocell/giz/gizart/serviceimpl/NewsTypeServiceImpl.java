package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.NewsTypeDao;
import com.infocell.giz.gizart.model.NewsType;
import com.infocell.giz.gizart.service.NewsTypeService;

@Service
public class NewsTypeServiceImpl implements NewsTypeService {

	@Autowired
	private NewsTypeDao newsTypeDao;

	@Override
	public void create(NewsType s) {
		newsTypeDao.create(s);
	}

	@Override
	public NewsType get(int id) {
		// TODO Auto-generated method stub
		return newsTypeDao.get(id);
	}

	@Override
	public NewsType getWithSid(String sid) {
		// TODO Auto-generated method stub
		return newsTypeDao.getWithSid(sid);
	}

	@Override
	public List<NewsType> getList() {
		// TODO Auto-generated method stub
		return newsTypeDao.getList();
	}

	@Override
	public void update(NewsType s) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		newsTypeDao.delete(id);
	}

}
