package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.TitleDao;
import com.infocell.giz.gizart.model.Title;

@Repository
@Transactional
public class TitleDaoImpl extends AbstractDao<Integer, Title> implements TitleDao {

	@Override
	public void create(Title s) {
		persist(s);

	}

	@Override
	public Title get(int id) {
		return getByKey(id);
	}

	@Override
	public Title getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("sid", sid));
		return (Title) criteria.uniqueResult();
	}

	@Override
	public List<Title> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void delete(String id) {
		Title s = getWithSid(id);
		delete(s);
	}

	@Override
	public void update(Title s) {

		update(s);

	}

}
