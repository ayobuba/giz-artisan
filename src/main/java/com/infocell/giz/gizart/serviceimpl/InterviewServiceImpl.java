package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.InterviewDao;
import com.infocell.giz.gizart.model.Enrolment;
import com.infocell.giz.gizart.model.Interview;
import com.infocell.giz.gizart.service.InterviewService;

@Service
public class InterviewServiceImpl implements InterviewService {

	@Autowired
	private InterviewDao clientDao;

	@Override
	public void create(Interview s) {
		clientDao.create(s);
	}

	@Override
	public Interview get(int id) {
		// TODO Auto-generated method stub
		return clientDao.get(id);
	}

	@Override
	public Interview getWithSid(String sid) {
		// TODO Auto-generated method stub
		return clientDao.getWithSid(sid);
	}

	@Override
	public List<Interview> getList() {
		// TODO Auto-generated method stub
		return clientDao.getList();
	}

	@Override
	public void update(Interview s) {
		clientDao.update(s);
	}

	@Override
	public void delete(int id) {
		clientDao.delete(id);
	}

	@Override
	public Interview getWithEnrolment(Enrolment e) {
		// TODO Auto-generated method stub
		return clientDao.getWithEnrolment(e);
	}

}
