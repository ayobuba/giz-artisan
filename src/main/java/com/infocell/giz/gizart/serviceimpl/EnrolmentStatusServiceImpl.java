package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.EnrolmentStatusDao;
import com.infocell.giz.gizart.model.EnrolmentStatus;
import com.infocell.giz.gizart.service.EnrolmentStatusService;

@Service
public class EnrolmentStatusServiceImpl implements EnrolmentStatusService {

	@Autowired
	private EnrolmentStatusDao clientDao;

	@Override
	public void create(EnrolmentStatus s) {
		clientDao.create(s);
	}

	@Override
	public EnrolmentStatus get(int id) {
		// TODO Auto-generated method stub
		return clientDao.get(id);
	}

	@Override
	public EnrolmentStatus getWithSid(String sid) {
		// TODO Auto-generated method stub
		return clientDao.getWithSid(sid);
	}

	@Override
	public List<EnrolmentStatus> getList() {
		// TODO Auto-generated method stub
		return clientDao.getList();
	}

	@Override
	public void update(EnrolmentStatus s) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		clientDao.delete(id);
	}

	@Override
	public List<EnrolmentStatus> getPendingList() {
		// TODO Auto-generated method stub
		return clientDao.getPendingList();
	}

	@Override
	public List<EnrolmentStatus> getInvitedList() {
		// TODO Auto-generated method stub
		return clientDao.getInvitedList();
	}

	@Override
	public List<EnrolmentStatus> getAbsorbedList() {
		// TODO Auto-generated method stub
		return clientDao.getAbsorbedList();
	}

}
