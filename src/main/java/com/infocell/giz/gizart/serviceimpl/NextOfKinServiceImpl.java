package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.NextOfKinDao;
import com.infocell.giz.gizart.model.NextOfKin;
import com.infocell.giz.gizart.service.NextOfKinService;

@Service
public class NextOfKinServiceImpl implements NextOfKinService {

	@Autowired
	private NextOfKinDao nextOfKinDao;

	@Override
	public void create(NextOfKin s) {
		nextOfKinDao.create(s);
	}

	@Override
	public NextOfKin get(int id) {
		// TODO Auto-generated method stub
		return nextOfKinDao.get(id);
	}

	@Override
	public NextOfKin getWithSid(String sid) {
		// TODO Auto-generated method stub
		return nextOfKinDao.getWithSid(sid);
	}

	@Override
	public List<NextOfKin> getList() {
		// TODO Auto-generated method stub
		return nextOfKinDao.getList();
	}

	@Override
	public void update(NextOfKin s) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		nextOfKinDao.delete(id);
	}

}
