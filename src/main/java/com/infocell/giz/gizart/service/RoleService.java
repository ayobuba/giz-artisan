package com.infocell.giz.gizart.service;

import java.util.List;

import com.infocell.giz.gizart.model.Role;

public interface RoleService {

	void create(Role s);

	Role get(int id);

	Role getWithSid(String sid);

	List<Role> getList();

	void update(Role s);

	void delete(String id);

}
