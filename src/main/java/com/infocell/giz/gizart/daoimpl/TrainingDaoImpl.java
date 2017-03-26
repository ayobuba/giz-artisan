package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.TrainingDao;
import com.infocell.giz.gizart.model.Training;

@Repository
@Transactional
public class TrainingDaoImpl extends AbstractDao<Integer, Training> implements TrainingDao {

	@Override
	public void create(Training s) {
		persist(s);

	}

	@Override
	public Training get(int id) {
		return getByKey(id);
	}

	@Override
	public Training getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("sid", sid));
		return (Training) criteria.uniqueResult();
	}

	@Override
	public List<Training> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void update(Training s) {
		update(s);

	}

	@Override
	public void delete(String id) {
		Training s = getWithSid(id);
		delete(s);
	}

}
