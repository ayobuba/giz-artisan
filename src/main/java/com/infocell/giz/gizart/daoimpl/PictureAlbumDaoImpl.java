package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.PictureAlbumDao;
import com.infocell.giz.gizart.model.PictureAlbum;

@Repository
@Transactional
public class PictureAlbumDaoImpl extends AbstractDao<Integer, PictureAlbum> implements PictureAlbumDao {

	@Override
	public void update(PictureAlbum s) {
		update(s);

	}

	@Override
	public void create(PictureAlbum s) {
		persist(s);

	}

	@Override
	public PictureAlbum get(int id) {
		// TODO Auto-generated method stub
		return getByKey(id);
	}

	@Override
	public PictureAlbum getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("sid", sid));
		return (PictureAlbum) criteria.uniqueResult();
	}

	@Override
	public List<PictureAlbum> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void delete(int id) {
		PictureAlbum s = get(id);
		delete(s);
	}

}
