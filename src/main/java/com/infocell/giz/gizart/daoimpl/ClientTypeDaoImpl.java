package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.ClientTypeDao;
import com.infocell.giz.gizart.model.ClientType;

@Repository
@Transactional
public class ClientTypeDaoImpl extends AbstractDao<Integer, ClientType> implements ClientTypeDao {

	@Override
	public void create(ClientType s) {
		persist(s);

	}

	@Override
	public ClientType get(int id) {
		// TODO Auto-generated method stub
		return getByKey(id);
	}

	@Override
	public ClientType getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("clientTypeName", sid));
		return (ClientType) criteria.uniqueResult();
	}

	@Override
	public List<ClientType> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		ClientType s = get(id);
		delete(s);
	}

}
