package com.infocell.giz.gizart.dao;

import java.util.List;

import com.infocell.giz.gizart.model.State;

public interface StateDao {
	void create(State s);

	State get(int id);

	State getWithSid(String sid);

	List<State> getList();

	void update(State s);

	void delete(String id);
}
