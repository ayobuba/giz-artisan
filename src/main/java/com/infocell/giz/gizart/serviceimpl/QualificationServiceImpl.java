package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.QualificationDao;
import com.infocell.giz.gizart.model.Qualification;
import com.infocell.giz.gizart.service.QualificationService;
import com.infocell.giz.gizart.service.Sid;

@Service
public class QualificationServiceImpl implements QualificationService {

	@Autowired
	private QualificationDao qualificationDao;

	@Autowired
	private Sid sid;

	@Override
	public void create(Qualification s) {

		qualificationDao.create(s);
	}

	@Override
	public Qualification get(int id) {
		// TODO Auto-generated method stub
		return qualificationDao.get(id);
	}

	@Override
	public Qualification getWithSid(String sid) {
		// TODO Auto-generated method stub
		return qualificationDao.getWithSid(sid);
	}

	@Override
	public List<Qualification> getList() {
		// TODO Auto-generated method stub
		return qualificationDao.getList();
	}

	@Override
	public void update(Qualification s) {
		qualificationDao.update(s);
	}

	@Override
	public void delete(String id) {
		qualificationDao.delete(id);
	}

}
