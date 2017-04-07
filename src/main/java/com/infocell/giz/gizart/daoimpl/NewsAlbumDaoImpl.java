package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.NewsAlbumDao;
import com.infocell.giz.gizart.model.NewsAlbum;

@Repository
@Transactional
public class NewsAlbumDaoImpl extends AbstractDao<Integer, NewsAlbum> implements NewsAlbumDao {

	@Override
	public void update(NewsAlbum s) {
		update(s);

	}

	@Override
	public void create(NewsAlbum s) {
		persist(s);

	}

	@Override
	public NewsAlbum get(int id) {
		// TODO Auto-generated method stub
		return getByKey(id);
	}

	@Override
	public NewsAlbum getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("albumTitle", sid));
		return (NewsAlbum) criteria.uniqueResult();
	}

	@Override
	public List<NewsAlbum> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void delete(int id) {
		NewsAlbum s = get(id);
		delete(s);
	}

}
