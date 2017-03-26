package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.ClientDao;
import com.infocell.giz.gizart.model.Client;

@Repository
@Transactional
public class ClientDaoImpl extends AbstractDao<Integer, Client> implements ClientDao {

	@Override
	public void update(Client s) {
		update(s);

	}

	@Override
	public void create(Client s) {
		persist(s);

	}

	@Override
	public Client get(int id) {
		// TODO Auto-generated method stub
		return getByKey(id);
	}

	@Override
	public Client getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("sid", sid));
		return (Client) criteria.uniqueResult();
	}

	@Override
	public List<Client> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void delete(int id) {
		Client s = get(id);
		delete(s);
	}

}
