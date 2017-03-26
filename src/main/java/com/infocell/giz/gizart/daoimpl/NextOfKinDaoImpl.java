package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.NextOfKinDao;
import com.infocell.giz.gizart.model.NextOfKin;

@Repository
@Transactional
public class NextOfKinDaoImpl extends AbstractDao<Integer, NextOfKin> implements NextOfKinDao {

	@Override
	public void update(NextOfKin s) {
		update(s);

	}

	@Override
	public void create(NextOfKin s) {
		persist(s);

	}

	@Override
	public NextOfKin get(int id) {
		// TODO Auto-generated method stub
		return getByKey(id);
	}

	@Override
	public NextOfKin getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("sid", sid));
		return (NextOfKin) criteria.uniqueResult();
	}

	@Override
	public List<NextOfKin> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void delete(int id) {
		NextOfKin s = get(id);
		delete(s);
	}

}
