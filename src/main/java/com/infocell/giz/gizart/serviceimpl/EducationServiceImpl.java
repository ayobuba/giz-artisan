package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.EducationDao;
import com.infocell.giz.gizart.model.Education;
import com.infocell.giz.gizart.service.EducationService;
import com.infocell.giz.gizart.service.Sid;

@Service
public class EducationServiceImpl implements EducationService {

	@Autowired
	private EducationDao educationDao;

	@Autowired
	private Sid sid;

	@Override
	public void create(Education s) {

		educationDao.create(s);
	}

	@Override
	public Education get(int id) {
		return educationDao.get(id);
	}

	@Override
	public Education getWithSid(String sid) {
		return educationDao.getWithSid(sid);
	}

	@Override
	public List<Education> getList() {
		return educationDao.getList();
	}

	@Override
	public void update(Education s) {
		educationDao.update(s);
	}

	@Override
	public void delete(String id) {
		educationDao.delete(id);
	}

}
