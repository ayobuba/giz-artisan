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
		System.out.println("in skill dao");
		Query query = getSession().createQuery("update Skill set name = :name" + " where skill_id = :skill_id");
		query.setParameter("name", s.getName());
		query.setParameter("skill_id", s.getSkillId());
		int result = query.executeUpdate();
	}

	@Override
	public void delete(int id) {
		Skill s = get(id);
		delete(s);

	}

}
