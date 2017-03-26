package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.CommentDao;
import com.infocell.giz.gizart.model.Comment;
import com.infocell.giz.gizart.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentDao commentDao;

	@Override
	public void create(Comment s) {
		commentDao.create(s);
	}

	@Override
	public Comment get(int id) {
		// TODO Auto-generated method stub
		return commentDao.get(id);
	}

	@Override
	public Comment getWithSid(String sid) {
		// TODO Auto-generated method stub
		return commentDao.getWithSid(sid);
	}

	@Override
	public List<Comment> getList() {
		// TODO Auto-generated method stub
		return commentDao.getList();
	}

	@Override
	public void update(Comment s) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		commentDao.delete(id);
	}

	@Override
	public List<Comment> getApprovedList() {
		// TODO Auto-generated method stub
		return commentDao.getApprovedList();
	}

	@Override
	public List<Comment> getDisapprovedList() {
		// TODO Auto-generated method stub
		return commentDao.getDisapprovedList();
	}

}
