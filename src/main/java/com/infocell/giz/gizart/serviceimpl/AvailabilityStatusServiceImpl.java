package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.AvailabilityStatusDao;
import com.infocell.giz.gizart.model.AvailabilityStatus;
import com.infocell.giz.gizart.service.AvailabilityStatusService;
import com.infocell.giz.gizart.service.Sid;

@Service
public class AvailabilityStatusServiceImpl implements AvailabilityStatusService {

	@Autowired
	private AvailabilityStatusDao availabilityStatusDao;

	@Autowired
	private Sid sid;

	@Override
	public void create(AvailabilityStatus s) {

		availabilityStatusDao.create(s);
	}

	@Override
	public AvailabilityStatus get(int id) {
		return availabilityStatusDao.get(id);
	}

	@Override
	public AvailabilityStatus getWithSid(String sid) {
		return availabilityStatusDao.getWithSid(sid);
	}

	@Override
	public List<AvailabilityStatus> getList() {
		return availabilityStatusDao.getList();
	}

	@Override
	public void update(AvailabilityStatus s) {
		availabilityStatusDao.update(s);
	}

	@Override
	public void delete(String id) {
		availabilityStatusDao.delete(id);
	}

}
