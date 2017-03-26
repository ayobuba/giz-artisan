package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.WorkExperienceDao;
import com.infocell.giz.gizart.model.WorkExperience;

@Repository
@Transactional
public class WorkExperienceDaoImpl extends AbstractDao<Integer, WorkExperience> implements WorkExperienceDao {

	@Override
	public void create(WorkExperience s) {
		persist(s);

	}

	@Override
	public WorkExperience get(int id) {
		return getByKey(id);
	}

	@Override
	public WorkExperience getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("sid", sid));
		return (WorkExperience) criteria.uniqueResult();
	}

	@Override
	public List<WorkExperience> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void update(WorkExperience s) {
		update(s);

	}

	@Override
	public void delete(String id) {
		WorkExperience s = getWithSid(id);
		delete(s);
	}

}
