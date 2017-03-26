package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.NewsTypeDao;
import com.infocell.giz.gizart.model.NewsType;

@Repository
@Transactional
public class NewsTypeDaoImpl extends AbstractDao<Integer, NewsType> implements NewsTypeDao {

	@Override
	public void create(NewsType s) {
		persist(s);

	}

	@Override
	public NewsType get(int id) {
		// TODO Auto-generated method stub
		return getByKey(id);
	}

	@Override
	public NewsType getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("sid", sid));
		return (NewsType) criteria.uniqueResult();
	}

	@Override
	public List<NewsType> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void delete(int id) {
		NewsType s = get(id);
		delete(s);
	}

}
