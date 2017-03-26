package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.CommentStatusDao;
import com.infocell.giz.gizart.model.CommentStatus;

@Repository
@Transactional
public class CommentStatusDaoImpl extends AbstractDao<Integer, CommentStatus> implements CommentStatusDao {

	@Override
	public void update(CommentStatus s) {
		update(s);

	}

	@Override
	public void create(CommentStatus s) {
		persist(s);

	}

	@Override
	public CommentStatus get(int id) {
		// TODO Auto-generated method stub
		return getByKey(id);
	}

	@Override
	public CommentStatus getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("statusName", sid));
		return (CommentStatus) criteria.uniqueResult();
	}

	@Override
	public List<CommentStatus> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void delete(int id) {
		CommentStatus s = get(id);
		delete(s);
	}

	@Override
	public List<CommentStatus> getApprovedList() {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("statusName", "Approved"));
		return criteria.list();
	}

	@Override
	public List<CommentStatus> getDisapprovedList() {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("statusName", "Disapproved"));
		return criteria.list();
	}

}
