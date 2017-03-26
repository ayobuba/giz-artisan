package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.WorkExperienceDao;
import com.infocell.giz.gizart.model.WorkExperience;
import com.infocell.giz.gizart.service.Sid;
import com.infocell.giz.gizart.service.WorkExperienceService;

@Service
public class WorkExperienceServiceImpl implements WorkExperienceService {

	@Autowired
	private WorkExperienceDao workExperienceDao;

	@Autowired
	private Sid sid;

	@Override
	public void create(WorkExperience s) {

		workExperienceDao.create(s);
	}

	@Override
	public WorkExperience get(int id) {
		return workExperienceDao.get(id);
	}

	@Override
	public WorkExperience getWithSid(String sid) {
		return workExperienceDao.getWithSid(sid);
	}

	@Override
	public List<WorkExperience> getList() {
		return workExperienceDao.getList();
	}

	@Override
	public void update(WorkExperience s) {
		workExperienceDao.update(s);
	}

	@Override
	public void delete(String id) {
		workExperienceDao.delete(id);
	}

}
