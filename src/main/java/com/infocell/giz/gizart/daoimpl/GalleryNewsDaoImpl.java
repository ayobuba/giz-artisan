package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.GalleryNewsDao;
import com.infocell.giz.gizart.model.GalleryNews;
import com.infocell.giz.gizart.model.NewsAlbum;

@Repository
@Transactional
public class GalleryNewsDaoImpl extends AbstractDao<Integer, GalleryNews> implements GalleryNewsDao {

	@Override
	public void update(GalleryNews s) {
		update(s);

	}

	@Override
	public void create(GalleryNews s) {
		persist(s);

	}

	@Override
	public GalleryNews get(int id) {
		// TODO Auto-generated method stub
		return getByKey(id);
	}

	@Override
	public GalleryNews getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("sid", sid));
		return (GalleryNews) criteria.uniqueResult();
	}

	@Override
	public List<GalleryNews> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void delete(int id) {
		GalleryNews s = get(id);
		delete(s);
	}

	@Override
	public List<GalleryNews> getListByAlbum(NewsAlbum n) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("newsAlbum", n));
		return criteria.list();
	}

}
