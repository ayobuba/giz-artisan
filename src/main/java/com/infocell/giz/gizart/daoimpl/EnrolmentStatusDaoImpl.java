package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.EnrolmentStatusDao;
import com.infocell.giz.gizart.model.EnrolmentStatus;

@Repository
@Transactional
public class EnrolmentStatusDaoImpl extends AbstractDao<Integer, EnrolmentStatus> implements EnrolmentStatusDao {

	@Override
	public void update(EnrolmentStatus s) {
		update(s);

	}

	@Override
	public void create(EnrolmentStatus s) {
		persist(s);

	}

	@Override
	public EnrolmentStatus get(int id) {
		// TODO Auto-generated method stub
		return getByKey(id);
	}

	@Override
	public EnrolmentStatus getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("statusName", sid));
		return (EnrolmentStatus) criteria.uniqueResult();
	}

	@Override
	public List<EnrolmentStatus> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void delete(int id) {
		EnrolmentStatus s = get(id);
		delete(s);
	}

	@Override
	public List<EnrolmentStatus> getPendingList() {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("statusName", "Enrolled"));
		return criteria.list();
	}

	@Override
	public List<EnrolmentStatus> getInvitedList() {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("statusName", "Invited"));
		return criteria.list();
	}

	@Override
	public List<EnrolmentStatus> getAbsorbedList() {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("statusName", "Absorbed"));
		return criteria.list();
	}

}
