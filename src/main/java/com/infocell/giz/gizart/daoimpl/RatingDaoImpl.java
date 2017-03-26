package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.RatingDao;
import com.infocell.giz.gizart.model.Rating;

@Repository
@Transactional
public class RatingDaoImpl extends AbstractDao<Integer, Rating> implements RatingDao {

	@Override
	public void create(Rating s) {
		persist(s);

	}

	@Override
	public Rating get(int id) {
		// TODO Auto-generated method stub
		return getByKey(id);
	}

	@Override
	public Rating getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("sid", sid));
		return (Rating) criteria.uniqueResult();
	}

	@Override
	public List<Rating> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void update(Rating s) {
		update(s);

	}

	@Override
	public void delete(String id) {
		Rating s = getWithSid(id);
		delete(s);
	}

}
