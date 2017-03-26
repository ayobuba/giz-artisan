package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.ServiceRequestMadeDao;
import com.infocell.giz.gizart.model.ServiceRequestMade;
import com.infocell.giz.gizart.service.RequestStatusService;

@Repository
@Transactional
public class ServiceRequestMadeDaoImpl extends AbstractDao<Integer, ServiceRequestMade>
		implements ServiceRequestMadeDao {

	@Autowired
	private RequestStatusService requestStatusService;

	@Override
	public void update(ServiceRequestMade s) {
		update(s);

	}

	@Override
	public void create(ServiceRequestMade s) {
		persist(s);

	}

	@Override
	public ServiceRequestMade get(int id) {
		// TODO Auto-generated method stub
		return getByKey(id);
	}

	@Override
	public ServiceRequestMade getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("sid", sid));
		return (ServiceRequestMade) criteria.uniqueResult();
	}

	@Override
	public List<ServiceRequestMade> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void delete(int id) {
		ServiceRequestMade s = get(id);
		delete(s);
	}

	@Override
	public List<ServiceRequestMade> getPendingList() {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("requestStatus", requestStatusService.getWithSid("Pending")));
		return criteria.list();
	}

	@Override
	public List<ServiceRequestMade> getApprovedList() {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("requestStatus", requestStatusService.getWithSid("Approved")));
		return criteria.list();
	}

	@Override
	public List<ServiceRequestMade> getDisapprovedList() {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("requestStatus", requestStatusService.getWithSid("Disapproved")));
		return criteria.list();
	}

}
