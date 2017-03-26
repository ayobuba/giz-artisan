package com.infocell.giz.gizart.service;

import java.util.List;

import com.infocell.giz.gizart.model.ClientType;

public interface ClientTypeService {

	void create(ClientType s);

	ClientType get(int id);

	ClientType getWithSid(String sid);

	List<ClientType> getList();

	void update(ClientType s);

	void delete(int id);

}
