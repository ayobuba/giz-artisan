package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.YearDao;
import com.infocell.giz.gizart.model.Year;
import com.infocell.giz.gizart.service.Sid;
import com.infocell.giz.gizart.service.YearService;

@Service
public class YearServiceImpl implements YearService {

	@Autowired
	private YearDao yearDao;

	@Autowired
	private Sid sid;

	@Override
	public void create(Year s) {

		yearDao.create(s);
	}

	@Override
	public Year get(int id) {
		return yearDao.get(id);
	}

	@Override
	public Year getWithSid(String sid) {
		return yearDao.getWithSid(sid);
	}

	@Override
	public List<Year> getList() {
		return yearDao.getList();
	}

	@Override
	public void update(Year s) {
		yearDao.update(s);
	}

	@Override
	public void delete(String id) {
		yearDao.delete(id);
	}

}
