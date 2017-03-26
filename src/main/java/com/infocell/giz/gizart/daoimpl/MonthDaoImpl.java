package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.MonthDao;
import com.infocell.giz.gizart.model.Month;

@Repository
@Transactional
public class MonthDaoImpl extends AbstractDao<Integer, Month> implements MonthDao {

	@Override
	public void create(Month s) {
		persist(s);

	}

	@Override
	public Month get(int id) {
		// TODO Auto-generated method stub
		return getByKey(id);
	}

	@Override
	public Month getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("sid", sid));
		return (Month) criteria.uniqueResult();
	}

	@Override
	public List<Month> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void update(Month s) {
		update(s);

	}

	@Override
	public void delete(String id) {
		Month s = getWithSid(id);
		delete(s);
	}

}
