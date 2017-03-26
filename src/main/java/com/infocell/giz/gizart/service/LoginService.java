package com.infocell.giz.gizart.service;

import java.util.List;

import com.infocell.giz.gizart.model.Login;

public interface LoginService {

	void create(Login s);

	Login get(int id);

	Login getWithSid(String username, String password);

	List<Login> getList();

	void update(Login s);

	void delete(int id);

}
