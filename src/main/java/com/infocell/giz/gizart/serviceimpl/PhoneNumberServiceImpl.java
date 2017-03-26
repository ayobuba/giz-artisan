package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.PhoneNumberDao;
import com.infocell.giz.gizart.model.PhoneNumber;
import com.infocell.giz.gizart.service.PhoneNumberService;

@Service
public class PhoneNumberServiceImpl implements PhoneNumberService {

	@Autowired
	private PhoneNumberDao phoneNumberDao;

	@Override
	public void create(PhoneNumber s) {
		phoneNumberDao.create(s);
	}

	@Override
	public PhoneNumber get(int id) {
		return phoneNumberDao.get(id);
	}

	@Override
	public PhoneNumber getWithSid(String sid) {
		return phoneNumberDao.getWithSid(sid);
	}

	@Override
	public List<PhoneNumber> getList() {
		return phoneNumberDao.getList();
	}

	@Override
	public void update(PhoneNumber s) {
		phoneNumberDao.update(s);
	}

	@Override
	public void delete(String id) {
		phoneNumberDao.delete(id);
	}

}
