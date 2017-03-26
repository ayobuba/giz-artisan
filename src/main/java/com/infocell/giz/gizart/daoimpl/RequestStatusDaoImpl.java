package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.RequestStatusDao;
import com.infocell.giz.gizart.model.RequestStatus;

@Repository
@Transactional
public class RequestStatusDaoImpl extends AbstractDao<Integer, RequestStatus> implements RequestStatusDao {

	@Override
	public void create(RequestStatus s) {
		persist(s);

	}

	@Override
	public RequestStatus get(int id) {
		// TODO Auto-generated method stub
		return getByKey(id);
	}

	@Override
	public RequestStatus getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("name", sid));
		return (RequestStatus) criteria.uniqueResult();
	}

	@Override
	public List<RequestStatus> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void update(RequestStatus s) {
		update(s);

	}

	@Override
	public void delete(String id) {
		RequestStatus s = getWithSid(id);
		delete(s);

	}

}
