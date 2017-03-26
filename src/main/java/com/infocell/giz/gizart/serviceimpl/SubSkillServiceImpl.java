package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.SubSkillDao;
import com.infocell.giz.gizart.model.Skill;
import com.infocell.giz.gizart.model.SubSkill;
import com.infocell.giz.gizart.service.Sid;
import com.infocell.giz.gizart.service.SubSkillService;

@Service
public class SubSkillServiceImpl implements SubSkillService {

	@Autowired
	private SubSkillDao subSkillDao;

	@Autowired
	private Sid sid;

	@Override
	public void create(SubSkill s) {

		subSkillDao.create(s);
	}

	@Override
	public SubSkill getWithSid(String sid) {
		return subSkillDao.getWithSid(sid);
	}

	@Override
	public List<SubSkill> getList() {
		return subSkillDao.getList();
	}

	@Override
	public void update(SubSkill s) {
		subSkillDao.update(s);
	}

	@Override
	public void delete(String id) {
		subSkillDao.delete(id);
	}

	@Override
	public List<SubSkill> getListFromSkill(Skill id) {
		return subSkillDao.getListFromSkill(id);
	}

	@Override
	public SubSkill get(int id) {
		return subSkillDao.get(id);
	}

	@Override
	public List<SubSkill> getListFromSkill(int id) {
		// TODO Auto-generated method stub
		return subSkillDao.getListFromSkill(id);
	}

}
