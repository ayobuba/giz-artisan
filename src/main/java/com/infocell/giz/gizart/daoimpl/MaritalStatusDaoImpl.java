package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.MaritalStatusDao;
import com.infocell.giz.gizart.model.MaritalStatus;

@Repository
@Transactional
public class MaritalStatusDaoImpl extends AbstractDao<Integer, MaritalStatus> implements MaritalStatusDao {

	@Override
	public void update(MaritalStatus s) {
		update(s);

	}

	@Override
	public void create(MaritalStatus s) {
		persist(s);

	}

	@Override
	public MaritalStatus get(int id) {
		// TODO Auto-generated method stub
		return getByKey(id);
	}

	@Override
	public MaritalStatus getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("sid", sid));
		return (MaritalStatus) criteria.uniqueResult();
	}

	@Override
	public List<MaritalStatus> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void delete(int id) {
		MaritalStatus s = get(id);
		delete(s);
	}

}
