package com.infocell.giz.gizart.dao;

import java.util.List;

import com.infocell.giz.gizart.model.Email;

public interface EmailDao {
	void create(Email s);

	Email get(int id);

	Email getWithSid(String sid);

	List<Email> getList();

	void update(Email s);

	void delete(String id);
}
