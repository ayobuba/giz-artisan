package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.RequestStatusDao;
import com.infocell.giz.gizart.model.RequestStatus;
import com.infocell.giz.gizart.service.RequestStatusService;
import com.infocell.giz.gizart.service.Sid;

@Service
public class RequestStatusServiceImpl implements RequestStatusService {

	@Autowired
	private RequestStatusDao requestStatusDao;

	@Autowired
	private Sid sid;

	@Override
	public void create(RequestStatus s) {

		requestStatusDao.create(s);
	}

	@Override
	public RequestStatus get(int id) {
		// TODO Auto-generated method stub
		return requestStatusDao.get(id);
	}

	@Override
	public RequestStatus getWithSid(String sid) {
		// TODO Auto-generated method stub
		return requestStatusDao.getWithSid(sid);
	}

	@Override
	public List<RequestStatus> getList() {
		// TODO Auto-generated method stub
		return requestStatusDao.getList();
	}

	@Override
	public void update(RequestStatus s) {
		requestStatusDao.update(s);
	}

	@Override
	public void delete(String id) {
		requestStatusDao.delete(id);
	}

}
