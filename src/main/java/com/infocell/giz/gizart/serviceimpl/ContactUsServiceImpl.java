package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.ContactUsDao;
import com.infocell.giz.gizart.model.ContactUs;
import com.infocell.giz.gizart.service.ContactUsService;

@Service
public class ContactUsServiceImpl implements ContactUsService {

	@Autowired
	private ContactUsDao clientDao;

	@Override
	public void create(ContactUs s) {
		clientDao.create(s);
	}

	@Override
	public ContactUs get(int id) {
		// TODO Auto-generated method stub
		return clientDao.get(id);
	}

	@Override
	public ContactUs getWithSid(String sid) {
		// TODO Auto-generated method stub
		return clientDao.getWithSid(sid);
	}

	@Override
	public List<ContactUs> getList() {
		// TODO Auto-generated method stub
		return clientDao.getList();
	}

	@Override
	public void update(ContactUs s) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		clientDao.delete(id);
	}

}
