package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.LanguageDao;
import com.infocell.giz.gizart.model.Language;
import com.infocell.giz.gizart.service.Sid;

@Service
public class LanguageService implements com.infocell.giz.gizart.service.LanguageService {

	@Autowired
	private LanguageDao languageDao;

	@Autowired
	private Sid sid;

	@Override
	public void create(Language s) {

		languageDao.create(s);
	}

	@Override
	public Language get(int id) {
		return languageDao.get(id);
	}

	@Override
	public Language getWithSid(String sid) {
		return languageDao.getWithSid(sid);
	}

	@Override
	public List<Language> getList() {
		return languageDao.getList();
	}

	@Override
	public void update(Language s) {
		languageDao.update(s);
	}

	@Override
	public void delete(String id) {
		languageDao.delete(id);
	}

}
