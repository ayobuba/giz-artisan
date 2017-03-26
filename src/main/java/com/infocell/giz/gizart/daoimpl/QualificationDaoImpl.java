package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.QualificationDao;
import com.infocell.giz.gizart.model.Qualification;

@Repository
@Transactional
public class QualificationDaoImpl extends AbstractDao<Integer, Qualification> implements QualificationDao {

	@Override
	public void create(Qualification s) {
		persist(s);

	}

	@Override
	public Qualification get(int id) {
		return getByKey(id);
	}

	@Override
	public Qualification getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("sid", sid));
		return (Qualification) criteria.uniqueResult();
	}

	@Override
	public List<Qualification> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void update(Qualification s) {
		update(s);

	}

	@Override
	public void delete(String id) {
		Qualification s = getWithSid(id);
		delete(s);
	}

}
