package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.ClientIndividualDao;
import com.infocell.giz.gizart.model.ClientIndividual;

@Repository
@Transactional
public class ClientIndividualDaoImpl extends AbstractDao<Integer, ClientIndividual> implements ClientIndividualDao {

	@Override
	public void update(ClientIndividual s) {
		update(s);

	}

	@Override
	public void delete(int id) {
		ClientIndividual s = get(id);
		delete(s);
	}

	@Override
	public void create(ClientIndividual s) {
		persist(s);

	}

	@Override
	public ClientIndividual get(int id) {
		// TODO Auto-generated method stub
		return getByKey(id);
	}

	@Override
	public ClientIndividual getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("sid", sid));
		return (ClientIndividual) criteria.uniqueResult();
	}

	@Override
	public List<ClientIndividual> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

}
