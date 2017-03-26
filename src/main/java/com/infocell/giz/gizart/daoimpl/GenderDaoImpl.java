package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.model.Gender;

@Repository
@Transactional
public class GenderDaoImpl extends AbstractDao<Integer, Gender> implements com.infocell.giz.gizart.dao.GenderDao {

	@Override
	public void create(Gender s) {
		persist(s);
	}

	@Override
	public Gender get(int id) {
		// TODO Auto-generated method stub
		return getByKey(id);
	}

	@Override
	public Gender getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("sid", sid));
		return (Gender) criteria.uniqueResult();
	}

	@Override
	public List<Gender> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void update(Gender s) {
		update(s);

	}

	@Override
	public void delete(String sid) {
		Gender s = getWithSid(sid);
		delete(s);
	}

}
