package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.ExpertDao;
import com.infocell.giz.gizart.model.Expert;
import com.infocell.giz.gizart.model.SubSkill;
import com.infocell.giz.gizart.service.ExpertService;

@Service
public class ExpertServiceImpl implements ExpertService {

	@Autowired
	private ExpertDao clientDao;

	@Override
	public void create(Expert s) {
		clientDao.create(s);
	}

	@Override
	public Expert get(int id) {
		// TODO Auto-generated method stub
		return clientDao.get(id);
	}

	@Override
	public Expert getWithSid(String sid) {
		// TODO Auto-generated method stub
		return clientDao.getWithSid(sid);
	}

	@Override
	public List<Expert> getList() {
		// TODO Auto-generated method stub
		return clientDao.getList();
	}

	@Override
	public void update(Expert s) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		clientDao.delete(id);
	}

	@Override
	public List<Expert> getWithSkill(SubSkill s) {
		// TODO Auto-generated method stub
		return clientDao.getWithSkill(s);
	}

}
