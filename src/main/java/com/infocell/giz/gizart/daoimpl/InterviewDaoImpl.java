package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.InterviewDao;
import com.infocell.giz.gizart.model.Enrolment;
import com.infocell.giz.gizart.model.Interview;

@Repository
@Transactional
public class InterviewDaoImpl extends AbstractDao<Integer, Interview> implements InterviewDao {

	@Override
	public void update(Interview s) {
		Interview i = get(s.getInterviewId());
		if (i != null) {
			System.out.println("inside update dao");
			i.setEnrolment(s.getEnrolment());

		}

	}

	@Override
	public void create(Interview s) {
		persist(s);

	}

	@Override
	public Interview get(int id) {
		// TODO Auto-generated method stub
		return getByKey(id);
	}

	@Override
	public Interview getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("sid", sid));
		return (Interview) criteria.uniqueResult();
	}

	@Override
	public List<Interview> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void delete(int id) {
		Interview s = get(id);
		delete(s);
	}

	@Override
	public Interview getWithEnrolment(Enrolment e) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("enrolment", e));
		return (Interview) criteria.uniqueResult();
	}

}
