package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.EnrolmentDao;
import com.infocell.giz.gizart.model.Enrolment;
import com.infocell.giz.gizart.service.EnrolmentStatusService;

@Repository
@Transactional
public class EnrolmentDaoImpl extends AbstractDao<Integer, Enrolment> implements EnrolmentDao {

	@Autowired
	private EnrolmentStatusService enrolmentStatusService;

	@Override
	public void update(Enrolment s) {
		Enrolment e = get(s.getEnrolmentId());
		e.setEnrolmentStatus(s.getEnrolmentStatus());

	}

	@Override
	public void create(Enrolment s) {
		persist(s);

	}

	@Override
	public Enrolment get(int id) {
		// TODO Auto-generated method stub
		return getByKey(id);
	}

	@Override
	public Enrolment getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("sid", sid));
		return (Enrolment) criteria.uniqueResult();
	}

	@Override
	public List<Enrolment> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void delete(int id) {
		Enrolment s = get(id);
		delete(s);
	}

	@Override
	public List<Enrolment> getPendingList() {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("enrolmentStatus", enrolmentStatusService.getWithSid("Enrolled")));
		return criteria.list();
	}

	@Override
	public List<Enrolment> getInvitedList() {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("enrolmentStatus", enrolmentStatusService.getWithSid("Invited")));
		return criteria.list();
	}

	@Override
	public List<Enrolment> getAbsorbedList() {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("enrolmentStatus", enrolmentStatusService.getWithSid("Absorbed")));
		return criteria.list();
	}

}
