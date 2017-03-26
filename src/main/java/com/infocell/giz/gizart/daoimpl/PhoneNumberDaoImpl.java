package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.PhoneNumberDao;
import com.infocell.giz.gizart.model.PhoneNumber;

@Repository
@Transactional
public class PhoneNumberDaoImpl extends AbstractDao<Integer, PhoneNumber> implements PhoneNumberDao {

	@Override
	public void create(PhoneNumber s) {
		persist(s);

	}

	@Override
	public PhoneNumber get(int id) {
		// TODO Auto-generated method stub
		return getByKey(id);
	}

	@Override
	public PhoneNumber getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("sid", sid));
		return (PhoneNumber) criteria.uniqueResult();
	}

	@Override
	public List<PhoneNumber> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void update(PhoneNumber s) {
		update(s);

	}

	@Override
	public void delete(String id) {
		PhoneNumber s = getWithSid(id);
		delete(s);
	}

}
