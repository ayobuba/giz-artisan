package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.CommentDao;
import com.infocell.giz.gizart.model.Comment;
import com.infocell.giz.gizart.service.CommentStatusService;

@Repository
@Transactional
public class CommentDaoImpl extends AbstractDao<Integer, Comment> implements CommentDao {

	@Autowired
	private CommentStatusService commentStatusService;

	@Override
	public void create(Comment s) {
		persist(s);

	}

	@Override
	public Comment get(int id) {
		// TODO Auto-generated method stub
		return getByKey(id);
	}

	@Override
	public Comment getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("sid", sid));
		return (Comment) criteria.uniqueResult();
	}

	@Override
	public List<Comment> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		Comment s = get(id);
		delete(s);
	}

	@Override
	public List<Comment> getApprovedList() {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("commentStatus", commentStatusService.getWithSid("Approved")));
		return criteria.list();
	}

	@Override
	public List<Comment> getDisapprovedList() {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("commentStatus", commentStatusService.getWithSid("Disapproved")));
		return criteria.list();
	}

}
