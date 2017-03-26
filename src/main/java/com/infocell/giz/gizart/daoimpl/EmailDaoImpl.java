package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.EmailDao;
import com.infocell.giz.gizart.model.Email;

@Repository
@Transactional
public class EmailDaoImpl extends AbstractDao<Integer, Email> implements EmailDao {

	@Override
	public void create(Email s) {
		persist(s);
	}

	@Override
	public Email get(int id) {
		return getByKey(id);
	}

	@Override
	public Email getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("sid", sid));
		return (Email) criteria.uniqueResult();
	}

	@Override
	public List<Email> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void update(Email s) {
		update(s);

	}

	@Override
	public void delete(String id) {
		Email s = getWithSid(id);
		delete(s);
	}

}
