package com.infocell.giz.gizart.service;

import java.util.List;

import com.infocell.giz.gizart.model.Client;

public interface ClientService {

	void create(Client s);

	Client get(int id);

	Client getWithSid(String sid);

	List<Client> getList();

	void update(Client s);

	void delete(int id);

}
