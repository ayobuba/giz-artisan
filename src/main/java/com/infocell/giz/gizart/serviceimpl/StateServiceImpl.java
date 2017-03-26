package com.infocell.giz.gizart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.giz.gizart.dao.StateDao;
import com.infocell.giz.gizart.model.State;
import com.infocell.giz.gizart.service.Sid;
import com.infocell.giz.gizart.service.StateService;

@Service
public class StateServiceImpl implements StateService {

	@Autowired
	private StateDao stateDao;

	@Autowired
	private Sid sid;

	@Override
	public void create(State s) {

		stateDao.create(s);
	}

	@Override
	public State get(int id) {
		return stateDao.get(id);
	}

	@Override
	public State getWithSid(String sid) {
		return stateDao.getWithSid(sid);
	}

	@Override
	public List<State> getList() {
		return stateDao.getList();
	}

	@Override
	public void update(State s) {
		stateDao.update(s);
	}

	@Override
	public void delete(String id) {
		stateDao.delete(id);
	}

}
