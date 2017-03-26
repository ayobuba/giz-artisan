package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.ServiceRequestMadeDao;
import com.infocell.giz.gizart.model.ServiceRequestMade;
import com.infocell.giz.gizart.service.ServiceRequestMadeService;

@Service
public class ServiceRequestMadeServiceImpl implements ServiceRequestMadeService {

	@Autowired
	private ServiceRequestMadeDao clientDao;

	@Override
	public void create(ServiceRequestMade s) {
		clientDao.create(s);
	}

	@Override
	public ServiceRequestMade get(int id) {
		// TODO Auto-generated method stub
		return clientDao.get(id);
	}

	@Override
	public ServiceRequestMade getWithSid(String sid) {
		// TODO Auto-generated method stub
		return clientDao.getWithSid(sid);
	}

	@Override
	public List<ServiceRequestMade> getList() {
		// TODO Auto-generated method stub
		return clientDao.getList();
	}

	@Override
	public void update(ServiceRequestMade s) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		clientDao.delete(id);
	}

	@Override
	public List<ServiceRequestMade> getPendingList() {
		// TODO Auto-generated method stub
		return clientDao.getPendingList();
	}

	@Override
	public List<ServiceRequestMade> getApprovedList() {
		// TODO Auto-generated method stub
		return clientDao.getApprovedList();
	}

	@Override
	public List<ServiceRequestMade> getDisapprovedList() {
		// TODO Auto-generated method stub
		return clientDao.getDisapprovedList();
	}

}
