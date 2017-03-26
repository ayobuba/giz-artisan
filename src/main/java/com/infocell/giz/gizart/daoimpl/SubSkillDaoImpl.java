package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.SubSkillDao;
import com.infocell.giz.gizart.model.Skill;
import com.infocell.giz.gizart.model.SubSkill;
import com.infocell.giz.gizart.service.SkillService;

@Repository
@Transactional
public class SubSkillDaoImpl extends AbstractDao<Integer, SubSkill> implements SubSkillDao {

	@Autowired
	private SkillService skillService;

	@Override
	public void create(SubSkill s) {
		persist(s);
	}

	@Override
	public SubSkill get(int id) {
		// TODO Auto-generated method stub
		return getByKey(id);
	}

	@Override
	public SubSkill getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("sid", sid));
		return (SubSkill) criteria.uniqueResult();
	}

	@Override
	public List<SubSkill> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void update(SubSkill s) {
		update(s);

	}

	@Override
	public void delete(String id) {
		SubSkill s = getWithSid(id);
		delete(s);
	}

	@Override
	public List<SubSkill> getListFromSkill(Skill s) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("skill", skillService.getWithSid(s.getName())));
		return criteria.list();
	}

	@Override
	public List<SubSkill> getListFromSkill(int id) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("skill", skillService.get(id)));
		return criteria.list();
	}

}
