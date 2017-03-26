package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.ClientIndividualDao;
import com.infocell.giz.gizart.model.ClientIndividual;
import com.infocell.giz.gizart.service.ClientIndividualService;

@Service
public class ClientIndividualServiceImpl implements ClientIndividualService {

	@Autowired
	private ClientIndividualDao clientIndividualDao;

	@Override
	public void create(ClientIndividual s) {
		clientIndividualDao.create(s);
	}

	@Override
	public ClientIndividual get(int id) {
		// TODO Auto-generated method stub
		return clientIndividualDao.get(id);
	}

	@Override
	public ClientIndividual getWithSid(String sid) {
		// TODO Auto-generated method stub
		return clientIndividualDao.getWithSid(sid);
	}

	@Override
	public List<ClientIndividual> getList() {
		// TODO Auto-generated method stub
		return clientIndividualDao.getList();
	}

	@Override
	public void update(ClientIndividual s) {
		clientIndividualDao.update(s);
	}

	@Override
	public void delete(int id) {
		clientIndividualDao.delete(id);
	}

}
