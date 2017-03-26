package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.NewsUpdateDao;
import com.infocell.giz.gizart.model.NewsUpdate;

@Repository
@Transactional
public class NewsUpdateDaoImpl extends AbstractDao<Integer, NewsUpdate> implements NewsUpdateDao {

	@Override
	public void create(NewsUpdate s) {
		persist(s);

	}

	@Override
	public NewsUpdate get(int id) {
		// TODO Auto-generated method stub
		return getByKey(id);
	}

	@Override
	public NewsUpdate getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("sid", sid));
		return (NewsUpdate) criteria.uniqueResult();
	}

	@Override
	public List<NewsUpdate> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void delete(int id) {
		NewsUpdate s = get(id);
		delete(s);
	}

}
