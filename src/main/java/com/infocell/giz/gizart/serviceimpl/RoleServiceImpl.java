package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.RoleDao;
import com.infocell.giz.gizart.model.Role;
import com.infocell.giz.gizart.service.RoleService;
import com.infocell.giz.gizart.service.Sid;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao roleDao;

	@Autowired
	private Sid sid;

	@Override
	public void create(Role s) {

		roleDao.create(s);
	}

	@Override
	public Role get(int id) {
		return roleDao.get(id);
	}

	@Override
	public Role getWithSid(String sid) {
		return roleDao.getWithSid(sid);
	}

	@Override
	public List<Role> getList() {
		return roleDao.getList();
	}

	@Override
	public void update(Role s) {
		roleDao.update(s);
	}

	@Override
	public void delete(String id) {
		roleDao.delete(id);
	}

}
