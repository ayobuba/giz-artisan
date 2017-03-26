package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.OrganizationDao;
import com.infocell.giz.gizart.model.Organization;
import com.infocell.giz.gizart.service.OrganizationService;

@Service
public class OrganizationServiceImpl implements OrganizationService {

	@Autowired
	private OrganizationDao organizationDao;

	@Override
	public void create(Organization s) {
		organizationDao.create(s);
	}

	@Override
	public Organization get(int id) {
		// TODO Auto-generated method stub
		return organizationDao.get(id);
	}

	@Override
	public Organization getWithSid(String sid) {
		// TODO Auto-generated method stub
		return organizationDao.getWithSid(sid);
	}

	@Override
	public List<Organization> getList() {
		// TODO Auto-generated method stub
		return organizationDao.getList();
	}

	@Override
	public void update(Organization s) {
		organizationDao.update(s);
	}

	@Override
	public void delete(int id) {
		organizationDao.delete(id);
	}

}
