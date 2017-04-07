package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.ServiceRequestMadeDao;
import com.infocell.giz.gizart.model.ClientIndividual;
import com.infocell.giz.gizart.model.RequestStatus;
import com.infocell.giz.gizart.model.ServiceRequestMade;
import com.infocell.giz.gizart.model.SubSkill;
import com.infocell.giz.gizart.service.RequestStatusService;
import com.infocell.giz.gizart.service.SubSkillService;

@Repository
@Transactional
public class ServiceRequestMadeDaoImpl extends AbstractDao<Integer, ServiceRequestMade>
		implements ServiceRequestMadeDao {

	@Autowired
	private RequestStatusService requestStatusService;

	@Autowired
	private SubSkillService subSkillService;

	@Override
	public void update(ServiceRequestMade s) {
		Query q = getSession().createQuery("from ServiceRequestMade where requestMadeId = :id ");
		q.setParameter("id", s.getRequestMadeId());
		ServiceRequestMade e = (ServiceRequestMade) q.list().get(0);
		e.setRequestStatus(s.getRequestStatus());
		e.setComment(s.getComment());
		e.setExpertList(s.getExpertList());

		getSession().update(e);

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

	@Override
	public List<ServiceRequestMade> getListByServiceAndApproved(SubSkill s, RequestStatus r) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("requestStatus", r));
		criteria.add(Restrictions.eq("subSkill", s));
		return criteria.list();
	}

	@Override
	public List<ServiceRequestMade> getListByClientIndividual(ClientIndividual s) {
		Criteria criteria = getSession().createCriteria(ServiceRequestMade.class).createAlias("client", "i")
				.createAlias("i.clientIndividual", "e")
				.add(Restrictions.eq("e.clientIndividualId", s.getClientIndividualId()));

		return criteria.list();
	}

}
