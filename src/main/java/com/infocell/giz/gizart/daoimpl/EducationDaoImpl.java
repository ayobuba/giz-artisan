package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.EducationDao;
import com.infocell.giz.gizart.model.Education;

@Repository
@Transactional
public class EducationDaoImpl extends AbstractDao<Integer, Education> implements EducationDao {

	@Override
	public void create(Education s) {
		persist(s);

	}

	@Override
	public Education get(int id) {
		// TODO Auto-generated method stub
		return getByKey(id);

	}

	@Override
	public Education getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("sid", sid));
		return (Education) criteria.uniqueResult();
	}

	@Override
	public List<Education> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void update(Education s) {
		update(s);

	}

	@Override
	public void delete(String id) {
		Education s = getWithSid(id);
		delete(s);
	}

}
