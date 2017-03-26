package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.GalleryPictureDao;
import com.infocell.giz.gizart.model.GalleryPicture;
import com.infocell.giz.gizart.model.PictureAlbum;

@Repository
@Transactional
public class GalleryPictureDaoImpl extends AbstractDao<Integer, GalleryPicture> implements GalleryPictureDao {

	@Override
	public void update(GalleryPicture s) {
		update(s);

	}

	@Override
	public void create(GalleryPicture s) {
		persist(s);

	}

	@Override
	public GalleryPicture get(int id) {
		// TODO Auto-generated method stub
		return getByKey(id);
	}

	@Override
	public GalleryPicture getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("sid", sid));
		return (GalleryPicture) criteria.uniqueResult();
	}

	@Override
	public List<GalleryPicture> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void delete(int id) {
		GalleryPicture s = get(id);
		delete(s);
	}

	@Override
	public List<GalleryPicture> getListByAlbum(PictureAlbum n) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("pictureAlbum", n));
		return criteria.list();
	}

}
