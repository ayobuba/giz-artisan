package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.MonthDao;
import com.infocell.giz.gizart.model.Month;
import com.infocell.giz.gizart.service.MonthService;

@Service
public class MonthServiceImpl implements MonthService {

	@Autowired
	private MonthDao monthDao;

	@Override
	public void create(Month s) {
		monthDao.create(s);
	}

	@Override
	public Month get(int id) {
		return monthDao.get(id);
	}

	@Override
	public Month getWithSid(String sid) {
		return monthDao.getWithSid(sid);
	}

	@Override
	public List<Month> getList() {
		return monthDao.getList();
	}

	@Override
	public void update(Month s) {
		monthDao.update(s);
	}

	@Override
	public void delete(String id) {
		monthDao.delete(id);
	}

}
