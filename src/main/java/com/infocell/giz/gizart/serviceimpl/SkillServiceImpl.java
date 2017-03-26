package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.SkillDao;
import com.infocell.giz.gizart.model.Skill;
import com.infocell.giz.gizart.service.Sid;
import com.infocell.giz.gizart.service.SkillService;

@Service
public class SkillServiceImpl implements SkillService {

	@Autowired
	private SkillDao skillDao;

	@Autowired
	private Sid sid;

	@Override
	public void create(Skill s) {

		skillDao.create(s);
	}

	@Override
	public Skill get(int id) {
		return skillDao.get(id);
	}

	@Override
	public Skill getWithSid(String sid) {
		return skillDao.getWithSid(sid);
	}

	@Override
	public List<Skill> getList() {
		return skillDao.getList();
	}

	@Override
	public void update(Skill s) {
		System.out.println("in skill service");
		skillDao.update(s);
	}

	@Override
	public void delete(int id) {
		skillDao.delete(id);
	}

}
