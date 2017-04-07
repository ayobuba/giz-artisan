package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.SkillDao;
import com.infocell.giz.gizart.model.Skill;

@Repository
@Transactional
public class SkillDaoImpl extends AbstractDao<Integer, Skill> implements SkillDao {

	@Override
	public void create(Skill s) {

		persist(s);
	}

	@Override
	public Skill get(int id) {
		return getByKey(id);
	}

	@Override
	public Skill getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("name", sid));
		return (Skill) criteria.uniqueResult();
	}

	@Override
	public List<Skill> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void update(Skill s) {
		Query q = getSession().createQuery("from Skill where skillId = :skillId ");
		q.setParameter("skillId", s.getSkillId());
		Skill e = (Skill) q.list().get(0);
		e.setName(s.getName());
		getSession().update(e);
	}

	@Override
	public void delete(int id) {
		Skill s = get(id);
		delete(s);

	}

}
