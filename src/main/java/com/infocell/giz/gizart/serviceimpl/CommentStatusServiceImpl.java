package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.CommentStatusDao;
import com.infocell.giz.gizart.model.CommentStatus;
import com.infocell.giz.gizart.service.CommentStatusService;

@Service
public class CommentStatusServiceImpl implements CommentStatusService {

	@Autowired
	private CommentStatusDao clientDao;

	@Override
	public void create(CommentStatus s) {
		clientDao.create(s);
	}

	@Override
	public CommentStatus get(int id) {
		// TODO Auto-generated method stub
		return clientDao.get(id);
	}

	@Override
	public CommentStatus getWithSid(String sid) {
		// TODO Auto-generated method stub
		return clientDao.getWithSid(sid);
	}

	@Override
	public List<CommentStatus> getList() {
		// TODO Auto-generated method stub
		return clientDao.getList();
	}

	@Override
	public List<CommentStatus> getApprovedList() {
		// TODO Auto-generated method stub
		return clientDao.getApprovedList();
	}

	@Override
	public List<CommentStatus> getDisapprovedList() {
		// TODO Auto-generated method stub
		return clientDao.getDisapprovedList();
	}

	@Override
	public void update(CommentStatus s) {
		clientDao.update(s);
	}

	@Override
	public void delete(int id) {
		clientDao.delete(id);
	}

}
