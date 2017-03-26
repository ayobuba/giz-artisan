package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.TitleDao;
import com.infocell.giz.gizart.model.Title;
import com.infocell.giz.gizart.service.Sid;
import com.infocell.giz.gizart.service.TitleService;

@Service
public class TitleServiceImpl implements TitleService {

	@Autowired
	private TitleDao titleDao;

	@Autowired
	private Sid sid;

	@Override
	public void create(Title s) {

		titleDao.create(s);
	}

	@Override
	public Title get(int id) {
		return titleDao.get(id);
	}

	@Override
	public Title getWithSid(String sid) {
		return titleDao.getWithSid(sid);
	}

	@Override
	public List<Title> getList() {
		return titleDao.getList();
	}

	@Override
	public void update(Title s) {
		titleDao.update(s);

	}

	@Override
	public void delete(String id) {
		titleDao.delete(id);

	}

}
