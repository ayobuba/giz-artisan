package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.EmailDao;
import com.infocell.giz.gizart.model.Email;
import com.infocell.giz.gizart.service.EmailService;
import com.infocell.giz.gizart.service.Sid;

import freemarker.template.Configuration;

@Service
public class EmailServiceImpl implements EmailService {

	@Autowired
	JavaMailSender javaMailSender;

	@Autowired
	Configuration freeMakerConfiguration;

	@Autowired
	private EmailDao emailDao;

	@Autowired
	private Sid sid;

	@Override
	public void create(Email s) {

		emailDao.create(s);
	}

	@Override
	public Email get(int id) {
		return emailDao.get(id);
	}

	@Override
	public Email getWithSid(String sid) {
		return emailDao.getWithSid(sid);
	}

	@Override
	public List<Email> getList() {
		return emailDao.getList();
	}

	@Override
	public void update(Email s) {
		emailDao.update(s);
	}

	@Override
	public void delete(String id) {
		emailDao.delete(id);
	}

	@Override
	public void sendEmail(Object object) {
		// TODO Auto-generated method stub

	}

}
