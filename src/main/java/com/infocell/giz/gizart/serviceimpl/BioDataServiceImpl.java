package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.BioDataDao;
import com.infocell.giz.gizart.exceptions.NotFound;
import com.infocell.giz.gizart.model.BioData;
import com.infocell.giz.gizart.service.BioDataService;
import com.infocell.giz.gizart.service.Sid;

@Service
public class BioDataServiceImpl implements BioDataService {

	@Autowired
	private BioDataDao bioDataDao;

	@Autowired
	private Sid sid;

	@Override
	public void create(BioData s) {

		bioDataDao.create(s);
	}

	@Override
	public BioData get(int id) {
		return bioDataDao.get(id);
	}

	@Override
	public BioData getWithSid(String username, String pwd) throws NotFound {
		try {
			return bioDataDao.getWithSid(username, pwd);
		} catch (NotFound nf) {
			throw new NotFound();
		}
	}

	@Override
	public List<BioData> getList() {
		return bioDataDao.getList();
	}

	@Override
	public void update(BioData s) {
		bioDataDao.update(s);
	}

	@Override
	public void delete(int id) {
		bioDataDao.delete(id);
	}

}
