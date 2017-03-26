package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.MaritalStatusDao;
import com.infocell.giz.gizart.model.MaritalStatus;
import com.infocell.giz.gizart.service.MaritalStatusService;

@Service
public class MaritalStatusServiceImpl implements MaritalStatusService {

	@Autowired
	private MaritalStatusDao maritalStatusDao;

	@Override
	public void create(MaritalStatus s) {
		maritalStatusDao.create(s);
	}

	@Override
	public MaritalStatus get(int id) {
		// TODO Auto-generated method stub
		return maritalStatusDao.get(id);
	}

	@Override
	public MaritalStatus getWithSid(String sid) {
		// TODO Auto-generated method stub
		return maritalStatusDao.getWithSid(sid);
	}

	@Override
	public List<MaritalStatus> getList() {
		// TODO Auto-generated method stub
		return maritalStatusDao.getList();
	}

	@Override
	public void update(MaritalStatus s) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		maritalStatusDao.delete(id);
	}

}
