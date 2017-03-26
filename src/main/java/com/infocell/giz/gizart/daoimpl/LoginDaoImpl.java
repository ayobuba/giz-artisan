package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.LoginDao;
import com.infocell.giz.gizart.model.Login;

@Repository
@Transactional
public class LoginDaoImpl extends AbstractDao<Integer, Login> implements LoginDao {

	@Override
	public void update(Login s) {
		update(s);

	}

	@Override
	public void create(Login s) {
		persist(s);

	}

	@Override
	public Login get(int id) {
		// TODO Auto-generated method stub
		return getByKey(id);
	}

	@Override
	public Login getWithSid(String username, String password) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("username", username));
		criteria.add(Restrictions.eq("password", password));
		return (Login) criteria.uniqueResult();
	}

	@Override
	public List<Login> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void delete(int id) {
		Login s = get(id);
		delete(s);
	}

}
