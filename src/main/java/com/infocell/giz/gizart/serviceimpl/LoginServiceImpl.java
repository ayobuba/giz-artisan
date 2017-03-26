package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.LoginDao;
import com.infocell.giz.gizart.model.Login;
import com.infocell.giz.gizart.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDao clientDao;

	@Override
	public void create(Login s) {
		clientDao.create(s);
	}

	@Override
	public Login get(int id) {
		// TODO Auto-generated method stub
		return clientDao.get(id);
	}

	@Override
	public Login getWithSid(String username, String password) {
		// TODO Auto-generated method stub
		return clientDao.getWithSid(username, password);
	}

	@Override
	public List<Login> getList() {
		// TODO Auto-generated method stub
		return clientDao.getList();
	}

	@Override
	public void update(Login s) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		clientDao.delete(id);
	}

}
