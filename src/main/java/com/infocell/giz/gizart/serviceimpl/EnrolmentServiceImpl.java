package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.EnrolmentDao;
import com.infocell.giz.gizart.model.Enrolment;
import com.infocell.giz.gizart.service.EnrolmentService;

@Service
public class EnrolmentServiceImpl implements EnrolmentService {

	@Autowired
	private EnrolmentDao enrolmentDao;

	@Override
	public void create(Enrolment s) {
		enrolmentDao.create(s);
	}

	@Override
	public Enrolment get(int id) {
		// TODO Auto-generated method stub
		return enrolmentDao.get(id);
	}

	@Override
	public Enrolment getWithSid(String sid) {
		// TODO Auto-generated method stub
		return enrolmentDao.getWithSid(sid);
	}

	@Override
	public List<Enrolment> getList() {
		// TODO Auto-generated method stub
		return enrolmentDao.getList();
	}

	@Override
	public void update(Enrolment s) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		enrolmentDao.delete(id);
	}

	@Override
	public List<Enrolment> getPendingList() {
		// TODO Auto-generated method stub
		return enrolmentDao.getPendingList();
	}

	@Override
	public List<Enrolment> getInvitedList() {
		// TODO Auto-generated method stub
		return enrolmentDao.getInvitedList();
	}

	@Override
	public List<Enrolment> getAbsorbedList() {
		// TODO Auto-generated method stub
		return enrolmentDao.getAbsorbedList();
	}

}
