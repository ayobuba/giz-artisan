package com.infocell.giz.gizart.dao;

import java.util.List;

import com.infocell.giz.gizart.model.Admin;

public interface AdminDao {

	void create(Admin s);

	Admin get(int id);

	Admin getWithSid(String sid);

	List<Admin> getList();

	void update(Admin s);

	void delete(int id);

}
