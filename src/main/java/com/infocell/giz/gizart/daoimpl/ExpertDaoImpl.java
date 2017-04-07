package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.ExpertDao;
import com.infocell.giz.gizart.model.AvailabilityStatus;
import com.infocell.giz.gizart.model.Expert;
import com.infocell.giz.gizart.model.Interview;
import com.infocell.giz.gizart.model.SubSkill;
import com.infocell.giz.gizart.service.AvailabilityStatusService;

@Repository
@Transactional
public class ExpertDaoImpl extends AbstractDao<Integer, Expert> implements ExpertDao {

	@Autowired
	private AvailabilityStatusService availabilityStatusService;

	@Override
	public void update(Expert s) {
		Query q = getSession().createQuery("from Expert where expertId = :expId ");
		q.setParameter("expId", s.getExpertId());
		Expert e = (Expert) q.list().get(0);
		e.setAvailabilityStatus(s.getAvailabilityStatus());
		getSession().update(e);

	}

	@Override
	public void create(Expert s) {
		persist(s);

	}

	@Override
	public Expert get(int id) {
		// TODO Auto-generated method stub
		return getByKey(id);
	}

	@Override
	public Expert getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("sid", sid));
		return (Expert) criteria.uniqueResult();
	}

	@Override
	public List<Expert> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void delete(int id) {
		Expert s = get(id);
		delete(s);
	}

	@Override
	public List<Expert> getWithSkill(SubSkill s) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("interview.enrolment.artisan.subSkill", s));
		return criteria.list();
	}

	@Override
	public Expert getByInterview(Interview i) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("interview", i));
		return (Expert) criteria.uniqueResult();
	}

	@Override
	public List<Expert> getWithSkillAndAvailable(SubSkill s, AvailabilityStatus a) {
		Criteria criteria = getSession().createCriteria(Expert.class).createAlias("interview", "i")
				.createAlias("i.enrolment", "e").createAlias("e.artisan", "a").createAlias("a.subSkill", "s")
				.add(Restrictions.eq("s.id", s.getId()));
		criteria.add(Restrictions.eq("availabilityStatus", a));
		return criteria.list();
	}

}
