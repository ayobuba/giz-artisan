package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.LgaDao;
import com.infocell.giz.gizart.model.Lga;
import com.infocell.giz.gizart.service.LgaService;
import com.infocell.giz.gizart.service.Sid;

@Service
public class LgaServiceImpl implements LgaService {

	@Autowired
	private LgaDao lgaDao;

	@Autowired
	private Sid sid;

	@Override
	public void create(Lga s) {

		lgaDao.create(s);
	}

	@Override
	public Lga get(int id) {
		return lgaDao.get(id);
	}

	@Override
	public Lga getWithSid(String sid) {
		return lgaDao.getWithSid(sid);
	}

	@Override
	public List<Lga> getList() {
		return lgaDao.getList();
	}

	@Override
	public void update(Lga s) {
		lgaDao.update(s);
	}

	@Override
	public void delete(String id) {
		lgaDao.delete(id);
	}

}
