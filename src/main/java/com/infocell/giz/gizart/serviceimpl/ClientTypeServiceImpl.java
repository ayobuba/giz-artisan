package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.ClientTypeDao;
import com.infocell.giz.gizart.model.ClientType;
import com.infocell.giz.gizart.service.ClientTypeService;

@Service
public class ClientTypeServiceImpl implements ClientTypeService {
	@Autowired
	private ClientTypeDao clientTypeDao;

	@Override
	public void create(ClientType s) {
		clientTypeDao.create(s);
	}

	@Override
	public ClientType get(int id) {
		// TODO Auto-generated method stub
		return clientTypeDao.get(id);
	}

	@Override
	public ClientType getWithSid(String sid) {
		// TODO Auto-generated method stub
		return clientTypeDao.getWithSid(sid);
	}

	@Override
	public List<ClientType> getList() {
		// TODO Auto-generated method stub
		return clientTypeDao.getList();
	}

	@Override
	public void update(ClientType s) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		clientTypeDao.delete(id);
	}

}
