package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.AlbumDao;
import com.infocell.giz.gizart.model.Album;

@Repository
@Transactional
public class AlbumDaoImpl extends AbstractDao<Integer, Album> implements AlbumDao {

	@Override
	public void create(Album s) {
		persist(s);

	}

	@Override
	public Album get(int id) {
		// TODO Auto-generated method stub
		return getByKey(id);
	}

	@Override
	public Album getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("sid", sid));
		return (Album) criteria.uniqueResult();
	}

	@Override
	public List<Album> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void delete(int id) {
		Album s = get(id);
		delete(s);
	}

}
