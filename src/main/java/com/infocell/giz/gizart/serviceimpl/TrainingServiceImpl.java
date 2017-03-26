package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.TrainingDao;
import com.infocell.giz.gizart.model.Training;
import com.infocell.giz.gizart.service.Sid;
import com.infocell.giz.gizart.service.TrainingService;

@Service
public class TrainingServiceImpl implements TrainingService {

	@Autowired
	private TrainingDao trainingDao;

	@Autowired
	private Sid sid;

	@Override
	public void create(Training s) {

		trainingDao.create(s);
	}

	@Override
	public Training get(int id) {
		return trainingDao.get(id);
	}

	@Override
	public Training getWithSid(String sid) {
		return trainingDao.getWithSid(sid);
	}

	@Override
	public List<Training> getList() {
		return trainingDao.getList();
	}

	@Override
	public void update(Training s) {
		trainingDao.update(s);
	}

	@Override
	public void delete(String id) {
		trainingDao.delete(id);
	}

}
