package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.RatingDao;
import com.infocell.giz.gizart.model.Rating;
import com.infocell.giz.gizart.service.RatingService;
import com.infocell.giz.gizart.service.Sid;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingDao ratingDao;

	@Autowired
	private Sid sid;

	@Override
	public void create(Rating s) {
		ratingDao.create(s);
	}

	@Override
	public Rating get(int id) {
		return ratingDao.get(id);
	}

	@Override
	public Rating getWithSid(String sid) {
		return ratingDao.getWithSid(sid);
	}

	@Override
	public List<Rating> getList() {
		return ratingDao.getList();
	}

	@Override
	public void update(Rating s) {
		ratingDao.update(s);
	}

	@Override
	public void delete(String id) {
		ratingDao.delete(id);
	}

}
