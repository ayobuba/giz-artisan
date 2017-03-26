package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.model.Artisan;

@Repository
@Transactional
public class ArtisanDaoImpl extends AbstractDao<Integer, Artisan> implements com.infocell.giz.gizart.dao.ArtisanDao {

	@Override
	public void create(Artisan s) {
		persist(s);

	}

	@Override
	public Artisan get(int id) {
		return getByKey(id);
	}

	@Override
	public Artisan getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("sid", sid));
		return (Artisan) criteria.uniqueResult();
	}

	@Override
	public List<Artisan> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void update(Artisan s) {
		update(s);

	}

	@Override
	public void delete(String id) {
		Artisan s = getWithSid(id);
		delete(s);
	}

}
