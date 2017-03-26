package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.AdminDao;
import com.infocell.giz.gizart.model.Admin;
import com.infocell.giz.gizart.service.AdminService;
import com.infocell.giz.gizart.service.Sid;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDao adminDao;

	@Autowired
	private Sid sid;

	@Override
	public void create(Admin s) {

		adminDao.create(s);
	}

	@Override
	public Admin get(int id) {
		return adminDao.get(id);
	}

	@Override
	public Admin getWithSid(String sid) {
		return adminDao.getWithSid(sid);
	}

	@Override
	public List<Admin> getList() {
		return adminDao.getList();
	}

	@Override
	public void update(Admin s) {
		adminDao.update(s);
	}

	@Override
	public void delete(int id) {
		adminDao.delete(id);
	}

}
