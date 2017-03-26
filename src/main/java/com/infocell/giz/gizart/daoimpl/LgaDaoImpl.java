package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.LgaDao;
import com.infocell.giz.gizart.model.Lga;

@Repository
@Transactional
public class LgaDaoImpl extends AbstractDao<Integer, Lga> implements LgaDao {

	@Override
	public void create(Lga s) {

		persist(s);

	}

	@Override
	public Lga get(int id) {
		// TODO Auto-generated method stub
		return getByKey(id);
	}

	@Override
	public Lga getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("sid", sid));
		return (Lga) criteria.uniqueResult();
	}

	@Override
	public List<Lga> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void update(Lga s) {
		update(s);

	}

	@Override
	public void delete(String id) {
		Lga s = getWithSid(id);
		delete(s);
	}

}
