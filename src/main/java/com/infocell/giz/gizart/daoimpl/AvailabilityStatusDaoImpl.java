package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.AvailabilityStatusDao;
import com.infocell.giz.gizart.model.AvailabilityStatus;

@Repository
@Transactional
public class AvailabilityStatusDaoImpl extends AbstractDao<Integer, AvailabilityStatus>
		implements AvailabilityStatusDao {

	@Override
	public void create(AvailabilityStatus s) {
		persist(s);

	}

	@Override
	public AvailabilityStatus get(int id) {
		// TODO Auto-generated method stub
		return getByKey(id);
	}

	@Override
	public AvailabilityStatus getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("availability", sid));
		return (AvailabilityStatus) criteria.uniqueResult();
	}

	@Override
	public List<AvailabilityStatus> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void update(AvailabilityStatus s) {
		update(s);

	}

	@Override
	public void delete(String id) {
		AvailabilityStatus s = getWithSid(id);
		delete(s);
	}

}
