package com.infocell.giz.gizart.service;

import java.util.List;

import com.infocell.giz.gizart.model.Admin;

public interface AdminService {

	void create(Admin s);

	Admin get(int id);

	Admin getWithSid(String sid);

	List<Admin> getList();

	void update(Admin s);

	void delete(int id);

}
