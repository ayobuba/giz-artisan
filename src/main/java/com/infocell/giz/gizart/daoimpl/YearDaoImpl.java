package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.YearDao;
import com.infocell.giz.gizart.model.Year;

@Repository
@Transactional
public class YearDaoImpl extends AbstractDao<Integer, Year> implements YearDao {

	@Override
	public void create(Year s) {
		persist(s);

	}

	@Override
	public Year get(int id) {
		return getByKey(id);
	}

	@Override
	public Year getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("sid", sid));
		return (Year) criteria.uniqueResult();
	}

	@Override
	public List<Year> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void update(Year s) {
		update(s);

	}

	@Override
	public void delete(String id) {
		Year s = getWithSid(id);
		delete(s);
	}

}
