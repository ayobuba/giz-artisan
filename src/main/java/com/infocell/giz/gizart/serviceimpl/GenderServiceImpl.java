package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.GenderDao;
import com.infocell.giz.gizart.model.Gender;
import com.infocell.giz.gizart.service.GenderService;
import com.infocell.giz.gizart.service.Sid;

@Service
public class GenderServiceImpl implements GenderService {

	@Autowired
	private GenderDao genderDao;

	@Autowired
	private Sid sid;

	@Override
	public void create(Gender s) {

		genderDao.create(s);
	}

	@Override
	public Gender get(int id) {
		return genderDao.get(id);
	}

	@Override
	public Gender getWithSid(String sid) {
		return genderDao.getWithSid(sid);
	}

	@Override
	public List<Gender> getList() {
		return genderDao.getList();
	}

	@Override
	public void update(Gender s) {
		genderDao.update(s);
	}

	@Override
	public void delete(String sid) {
		genderDao.delete(sid);
	}

}
