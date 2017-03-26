package com.infocell.giz.gizart.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infocell.giz.gizart.dao.AbstractDao;
import com.infocell.giz.gizart.dao.StateDao;
import com.infocell.giz.gizart.model.State;

@Repository
@Transactional
public class StateDaoImpl extends AbstractDao<Integer, State> implements StateDao {

	@Override
	public void create(State s) {
		persist(s);

	}

	@Override
	public State get(int id) {
		// TODO Auto-generated method stub
		return getByKey(id);
	}

	@Override
	public State getWithSid(String sid) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("sid", sid));
		return (State) criteria.uniqueResult();
	}

	@Override
	public List<State> getList() {
		Criteria criteria = createEntityCriteria();
		return criteria.list();
	}

	@Override
	public void update(State s) {
		update(s);

	}

	@Override
	public void delete(String id) {
		State s = getWithSid(id);
		delete(s);
	}

}
